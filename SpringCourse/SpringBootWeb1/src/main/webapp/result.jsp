<%@page language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
    <div class="box">
        <h2>Output Is In The Console</h2>
        <!--<h4 style="margin-top: 20px">Result is: <%= session.getAttribute("result") %><h4>-->
        <h4 style="margin-top: 20px">Result is: ${result}<h4>
    </div>
</body>
</html>