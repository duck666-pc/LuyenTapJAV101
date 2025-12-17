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
        <c:forEach items="${baiHats}" var="baihat">
            <tr>
                <td>${baihat.id}</td>
                <td>${baihat.tenBaiHat}</td>
                <td>${baihat.tenTacGia}</td>
                <td>${baihat.thoiLuong}</td>
                <td>${baihat.ngaySanXuat}</td>
                <td>${baihat.gia}</td>
                <td>${baihat.caSiId}</td>
                <td>${baihat.phatHanhDia}</td>
                <td>${baihat.ngayRaMat}</td>
                <td class="action">
                    <a href="${pageContext.request.contextPath}/song-management/delete?id=${book.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
