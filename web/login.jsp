<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
           /* *{
                margin: 0;
                padding: 0;
            }
            header{
                background-image: url(pic.jpeg);
                height: 100vh;
                background-size:cover;
                background-position: center;
               
            }
            .navbar{
                background: rgb(0,0,0,0.5);
                height: 80px;
                }
                .logo{
                    margin: 10px 50px;
                    height: 60px;
                }
                .menu{
                    float: right;
                    list-style: none;
                    margin: 20px;
                }
                .menu li{
                    display: inline-block;
                    margin: 10px 5px;
                }
                .menu li a{
                    text-decoration: none;
                    color:white;
                    padding: 5px 10px;
                    font-family: sans-serif;
                    letter-spacing: 2px;
                    border: 1px solid #fff;
                }
                .menu li a:hover{
                    background: #fff;
                    transition: .4s;
                    color: #000;
                } */ 
           body{
               margin: 0;
               padding: 0;
               background: url("3.jpg");
               background-size: cover;
               background-position: center;
               font-family: sans-serif;
           }
                .loginbox{
                    width: 440px;
                    height: 550px;
                    background: black;
                    opacity: 0.7;
                    color: #fff;
                    top:10%;
                    left: 38%;
                    position: relative;
                    box-sizing: border-box;
                    padding: 70px 30px; 
                      }
                      .avatar{
                          width: 100px;
                          height: 100px;
                          border-radius: 50%;
                          position: absolute ;
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
                          .loginbox input[type="number"], input[type="password"]{
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
            <h1>You are Ready Now !</h1>
        <form action="logindemo" method="post">
<p>Mobile Number</p> <input type="number" name="number" required placeholder="Mobile Number"/>
<p>Password</p> <input type="password" name="pwd" required  placeholder="Enter Password"/>
<p>User Type:</p><br>
<p align="left">Patient<input type="radio" name="user_type" value="patient" required >Doctor<input type="radio" name="user_type" value="doctor" required>
    <input type="submit" value="Login"/> <br>
                          <a href="signup.jsp">Don't Have an Account?</a><br/>
        </form>
        </div>
    </body>
</html>
