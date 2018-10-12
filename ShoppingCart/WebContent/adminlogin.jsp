<html>
<head>
<title>Sing up</title>

<meta charset="utf-8">

<style>



input[type=text], input[type=password] {
    width: 40%;
    padding: 12px 20px;
    margin: 8px 0;
    display: block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}


button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}


.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}


.cancelbtn,.signupbtn {
    float: left;
    width: 20%;
}


.container {
    padding: 16px;
}


.clear::after {
    content: "";
    clear: both;
    display: table;
}


@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
        width: 100%;
    }
}






</style>

<script type="text/javascript">
    function Validate() {
	alert("inside javascript");
        var password = document.getElementById("psw").value;
        var confirmPassword = document.getElementById("psw-repeat").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
</script>



</head>

<body style="background-color:white">


<h1  style="color:black;text-align:center;">Admin Login</h1>
<br /><br /><br />
<form action="AdminLogin" OnSubmit="return Validate();">
  <div class="container">
    <label><b>User Name</b></label>
    <input type="text" placeholder="Enter User Name" name="email" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <label><b>Confirm Password</b></label>
    <input type="password" placeholder="Confirm Password" name="psw-repeat" required>
    <input type="checkbox" checked="checked"> Remember me
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <div class="clear">
      <a href="#"><button type="button"  class="cancelbtn">Cancel</button></a>
      <button type="submit" class="signupbtn" >Sign Up</button>
    </div>
  </div>
</form>

</body>

</html>