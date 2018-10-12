

<html>
<head>
<title>Register</title>

<style>

.container{




}
form {
  margin:0 auto;
  width:300px
}
input {
  margin-bottom:3px;
  padding:10px;
  width: 100%;
  border:1px solid #CCC
}
button {
  padding:10px
  
  
}
label {
  cursor:pointer
}
#form-switch {
  display:none
}
#register-form {
  display:none
}
#form-switch:checked~#register-form {
  display:block
}
#form-switch:checked~#login-form {
  display:none
}
</style>
<head>

<body>




<h1 style="margin-top:100px;color:black;font-size:30px;text-align:center;">Register</h1><br /><br />


<div class="container" style="margin-top:50px;">

<input type='checkbox' id='form-switch'>
<form id='login-form' action="" method='post'>
  <input type="text" placeholder="Username" required>
  <input type="password" placeholder="Password" required>
  <button type='submit' style="background-color:#33ccff;color:black;width:100px;">Login</button>
  <label for='form-switch'><span style="color:green;">Register</span></label>
</form>
<form id='register-form' action="" method='post'>
  <input type="text" placeholder="Username" required>
  <input type="email" placeholder="Email" required>
  <input type="password" placeholder="Password" required>
  <input type="password" placeholder="Re Password" required>
  <button type='submit' style="background-color:#33ccff;color:black;width:80px;">Register</button>
  <label for='form-switch' style="color:green;">Already Member ? Sign In Now..</label>
</form>
</div>
</body>
</html>