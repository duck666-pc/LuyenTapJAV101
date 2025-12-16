<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
    <h1>Danh sách bài hát</h1>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Tên bài hát</th>
            <th>Tên tác giả</th>
            <th>Thời lượng</th>
            <th>Ngày sản xuất</th>
            <th>Giá</th>
            <th>ID ca sĩ</th>
            <th>Phát hành đĩa</th>
            <th>Ngày ra mắt</th>
        </tr>
        <c:forEach items="${bhl}" var="baihat">
            <td>${bhl.Id}</td>
            <td>${bhl.tenBaiHat}</td>
            <td>${bhl.tenTacGia}</td>
            <td>${bhl.thoiLuong}</td>
            <td>${bhl.ngaySanXuat}</td>
            <td>${bhl.gia}</td>
            <td>${bhl.caSiId}</td>
            <td>${bhl.phatHanhDia}</td>
            <td>${bhl.ngayRaMat}</td>
            <td class="action">
                <form action="/song-management/delete">
                    <a type="submit" class="btn btn-danger">Xoa</a>
                </form>

            </td>
        </c:forEach>
    </table>
</body>
</html>
