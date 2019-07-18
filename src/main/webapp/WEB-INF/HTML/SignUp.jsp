<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title>Registration</title>
    <link rel="stylesheet" type="text/css" href="../CSS/SignUpStyle.css" />
</head>
<body>

<form name="SignUpValidation" action="/SignUp" method="post" class="signup" onsubmit="return isAllInformationValid()">
    <h1>SignUp</h1>
    <input type="text" name="username" placeholder="username">
    <input type="password" name="password" onclick="isUserNameValid()" placeholder="password">
    <input type="email" name="Email-Id" onclick="isPasswordValid()" placeholder="Email-Id">
    <input type="submit" name="submit" value="SignUp">
</form>
<script type="text/javascript" src="../JS/SignUpValidation.js"></script>

</body>
</html>
