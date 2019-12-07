
 function showRegisterForm() {

    var elem = document.getElementById('showRegistrationForm');
    elem.style.visibility = 'visible';

    var elemUserName = document.getElementById('Username');
    elemUserName.disabled = true;

    var elemPassword = document.getElementById('Password');
    elemPassword.disabled = true;

    var elemLoginButton = document.getElementById('loginButton');
    elemLoginButton.disabled = true;
    
    let p1 = document.getElementById('registerFailed');
	 p1.setAttribute("hidden",true);
    let p2 = document.getElementById('registerSuccess');
	p2.setAttribute("hidden",true);
	 
}
 
 function showDialogBoxRegistration(){
	
	

 }