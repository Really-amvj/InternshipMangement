function isUserNameValid(){
    var userName = document.forms["SignUpValidation"]["username"].value;
    var userNameRegex = /^[a-zA-Z\-]+$/;
    var isValidUserName = userNameRegex.test(userName);

    if (userName == "" || !(isValidUserName)) {
        alert("Enter valid username");
        document.forms["SignUpValidation"]["username"].focus();
        document.forms["SignUpValidation"]["username"].select();
        return false;
    }
    return true;
}
function isPasswordValid(){
    var password = document.forms["SignUpValidation"]["password"].value;
    if (!password) {
        alert("Enter valid password");
        document.forms["SignUpValidation"]["password"].focus();
        document.forms["SignUpValidation"]["password"].select();
        return false;
    }
    return true;
}

function isAllInformationValid(){
   if(isUserNameValid() && isPasswordValid() && isEmailIdValid()){
      return true;
   }
   return false;
}
function isEmailIdValid(){
    var emailId = document.forms["SignUpValidation"]["Email-Id"].value;
    var emailIdRegex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    var isEmailIdValid = emailIdRegex.test(emailId);
    if (emailId == "" || !(isEmailIdValid)) {
        alert("Enter valid Email-id");
        document.forms["SignUpValidation"]["Email-Id"].focus();
        document.forms["SignUpValidation"]["Email-Id"].select();
        return false;
    }
    return true;
}
