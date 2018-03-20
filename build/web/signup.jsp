<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
            function validation()
            {
             if(document.signup.number.value==""){
                alert("Mobile number can't be empty");
                document.signup.number.focus();
                
                return false;
             }
             var pwd=document.getElementById("pwd").value;
             var confpwd=document.getElementById("confpwd").value;
             if(document.signup.pwd.value=="")
             {
               alert("Password  can't be empty");
                document.signup.pwd.focus();
                
                return false;  
             }
             if(document.signup.confpwd.value=="")
             {
               alert("Confirm Password  can't be empty");
                document.signup.confpwd.focus();
                
                return false;  
             }
             if(pwd != confpwd)
             {
               alert("Passwords do not match");
                document.signup.pwd.focus();
                
                return false;   
             }
             var email=document.getElementById("email").value;
             if(email.indexOf('@')<=0)
             {
                 alert("Enter valid Email-Id");
                // document.getElementById("email").innerHTML="invalid @ position";
                 return false;
             }
             return true;
            }
            
            
            
        </script>
        <style>
             body{
               margin: 0;
               padding: 0;
               background: url(3.jpg);
               background-size: cover;
               background-position: center;
               font-family: sans-serif;
           }
                .loginbox{
                    width: 440px;
                    height: 900px;
                    background: black;
                    color: #fff;
                    opacity: 0.7;
                    top:9%;
                    left: 38%;
                    position: relative;
                    box-sizing: border-box;
                    padding: 70px 30px; 
                      }
                      .avatar{
                          width: 100px;
                          height: 100px;
                          border-radius: 50%;
                          position: absolute;
                          top: -50px;
                          left: 160px;
                      }
                      h1{
                          margin: 0;
                          padding: 0 0 20px;
                          text-align: center;
                          font-size: 5opx;
                      }
                      .loginbox p{
                          margin: 0;
                          padding: 0;
                          font-weight: bold;
                      }
                      .loginbox input{
                          width: 310px;
                          margin-bottom: 20px;
                          }
                          .loginbox input[type="text"], input[type="password"]{
                              border: none;
                              border-bottom: 1px solid #fff;
                              background: transparent;
                              outline: none;
                              height: 40px;
                              color: #fff;
                              font-size: 16px;
                          }
                          .loginbox input[type="submit"]{
                              border: none;
                              outline: none;
                              height: 40px;
                              background: #fb2525;
                              color: #fff;
                              font-size: 18px;
                              border-radius: 20px;
                          }
                          .loginbox input[type="submit"]:hover{
                              cursor: pointer;
                              background: #ffc107;
                              color: #000;
                          }
                          .loginbox a{
                              text-decoration: none;
                              font-size: 12px;
                              line-height: 20px;
                              color: darkgrey;
                          }
                          .loginbox a:hover{
                              color: #ffc107;
                          }
       
        </style>
    </head>
    
    <body>
        <div class="loginbox">
             <img src="avater.png" class="avatar"></img>
            <h1>Let's Start</h1>
        <form action="signupdemo" method="Post" name="signup" onsubmit="return validation()">
<p>Mobile Number</p>  <input type="text" name="number" id="number"/>
<p>Password</p>   <input type="password" name="pwd" id="pwd"/>
<p>Confirm Password</p>   <input type="password" name="confpwd" id="confpwd"/> 
<p>Name</p><input type="text" name="name"/>
<p>City</p><input type="text" name="city"/>
<p>State</p><input type="text" name="state"/>
<p>Email</p><input type="text" name="email" id="email"/>
<p>User Type:</p><br>
<p align="left">Patient<input type="radio" name="user_type" value="patient" required>Doctor<input type="radio" name="user_type" value="doctor" required>
             <input type="submit" value="Sign Up"/></p>
             <a href="login.jsp">Already Have an Account?</a>
   </form>
   </div>
    </body>
    </html>