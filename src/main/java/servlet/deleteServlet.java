package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.BaiHat;
import repository.BaiHatRepository;

import java.io.IOException;
import java.util.List;

@WebServlet (name = "delete", urlPatterns = {"/song-management/delete"})
public class deleteServlet extends HttpServlet {
    private final BaiHatRepository repository = new BaiHatRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String IdParam = req.getParameter("id");
        if (IdParam != null) {
            try {
                int id = Integer.parseInt(IdParam);
                repository.deleteById(id);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        resp.sendRedirect(req.getContextPath() + "/playlists");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String IdParam = req.getParameter("id");
        if (IdParam != null) {
            try {
                int id = Integer.parseInt(IdParam);
                int result = repository.deleteById(id);
                if (result > 0) {
                    req.getSession().setAttribute("message", "Xoa thanh cong");
                } else {
                    req.getSession().setAttribute("error", "Xoa that bai");
                }
            } catch (NumberFormatException e) {
                req.getSession().setAttribute("error", "Co van de voi ID");
            }
        }
        resp.sendRedirect(req.getContextPath() + "/playlists");
    }
}
