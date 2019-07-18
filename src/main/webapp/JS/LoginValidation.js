function isUserNameValid(){
    var userName = document.forms["LoginValidation"]["loginusername"].value;
    if (userName == "" || ) {
        alert("Username doesn't match in our Database");
        document.forms["LoginValidation"]["username"].focus();
        document.forms["LoginValidation"]["username"].select();
        return false;
    }
    return true;
}
function isPasswordValid(){
    var password = document.forms["LoginValidation"]["loginpassword"].value;
    if (password == "") {
        alert("InCorrect Password");
        document.forms["LoginValidation"]["password"].focus();
        document.forms["LoginValidation"]["password"].select();
        return false;
    }
     return true;
}
function isLoginInformationValid(){
    if(isUserNameValid() && isPasswordValid()){
       return true;
    }
    return false;
}
