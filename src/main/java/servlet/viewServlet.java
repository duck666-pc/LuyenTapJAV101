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

@WebServlet (value = {"/playlists", "/song-management/playlists"})
public class viewServlet extends HttpServlet {
    private final BaiHatRepository repository = new BaiHatRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<BaiHat> baiHats = repository.getAll();
        req.setAttribute("baiHats", baiHats);
        req.getRequestDispatcher("/WEB-INF/views/views-baihat.jsp").forward(req, resp);
    }
}
