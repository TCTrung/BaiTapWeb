<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<br/>

<form method="post" action ="/display-discount">
  <h4>Mô tả của sản phẩm</h4>
  <input type="text" name="Product Description" placeholder="Product Description"/>
  <h4>Giá niêm yết của sản phẩm</h4>
  <input type="text" name="price" placeholder="List Price"/>
  <h4>Tỷ lệ chiết khấu (phần trăm)</h4>
  <input type="text" name="percent" placeholder="Discount Percent"/>
  <br><br>
  <input type="submit" name="Tính chiết khấu" value="Calculate Discount">


</form>
</body>
</html>