package repository;

import connection.DbConnector;
import model.BaiHat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaiHatRepository {

    public int deleteById(int Id) {
        String sql = "DELETE FROM bai_hat WHERE id = ?";
        Connection connection = null;
        try {
            connection = DbConnector.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, Id);
            return stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public List<BaiHat> getAll() {
        List<BaiHat> bhl = new ArrayList<>();
        try {
            Connection connection = DbConnector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM bai_hat;");

            while (rs.next()){
                Integer Id = rs.getInt("id");
                String tenBaiHat = rs.getString("ten_bai_hat");
                String tenTacGia = rs.getString("ten_tac_gia");
                Integer thoiLuong = rs.getInt("thoi_luong");
                Date ngaySanXuat = rs.getDate("ngay_san_xuat");
                Float gia = rs.getFloat("gia");
                Integer caSiId = rs.getInt("ca_si_id");
                Boolean phatHanhDia = Boolean.valueOf(rs.getString("phat_hanh_dia"));
                Date ngayRaMat = rs.getDate("ngay_ra_mat");

                BaiHat BaiHat = new BaiHat(Id, tenBaiHat, tenTacGia, thoiLuong, ngaySanXuat, gia, caSiId, phatHanhDia, ngayRaMat);
                bhl.add(BaiHat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bhl;
    }
}
