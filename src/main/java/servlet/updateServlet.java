package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.BaiHat;
import repository.BaiHatRepository;

import java.io.IOException;
import java.util.Date;

@WebServlet (name = "delete", urlPatterns = {"/song-management/delete"})
public class updateServlet extends HttpServlet {
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
        req.setCharacterEncoding("UTF-8");
        String IdParam = req.getParameter("id");
        String tenBaiHat = req.getParameter("ten_bai_hat");
        String tenTacGia = req.getParameter("ten_tac_gia");
        String thoiLuongParam = req.getParameter("thoi_luong");
        String ngaySanXuatParam = req.getParameter("ngay_san_xuat");
        String giaParam = req.getParameter("gia");
        String caSiIdParam = req.getParameter("ca_si_id");
        String phatHanhDiaParam = req.getParameter("phat_hanh_dia");
        String ngayRaMatParam = req.getParameter("ngay_ra_mat");
        if (IdParam != null) {
            try {
                int id = Integer.parseInt(IdParam);
                int thoiLuong = Integer.parseInt(thoiLuongParam);
                Date ngaySanXuat = ();
                BaiHat bh = new BaiHat();

                int result = repository.updateById(bh);
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
