
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script> 
      *{
                margin: 0;
                padding: 0;
                
            }
            header{
               // background-image: url("2.jpg");
                height: 145vh;
                background-size: cover;
                background-position: center;
                background-color: blue;
            }
            .navbar{
                background: grey ;
                opacity: 0.5;
                height: 70px;
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
                    text-decoration:none;
                    color: white;
                    padding: 5px 10px;
                    font-family: sans-serif;
                    letter-spacing: 2px;
                    border: 1px solid grey;
                }
                .menu li a:hover{
                    background: #fff;
                    transition: .4s;
                    color: #000;
                }
                      
            
        
        </script>>
    </head>
    <body>
        <header>
           <div class="navbar">
                <img src="transparent.jpg" class="logo">
                <ul class="menu">
          <li><center><a href="eha.jsp"><h1>Electonic Health Assesment Form</h1></a></li>
          <li><center><a href=" "><h1>update detail</h1></a></li>
          <li><center><a href="doctorfetch.jsp "><h1>Search Doctor<h1></a></li>
          <li><center><a href=" "><h1>prescriptions</h1></a></li>
          <li><center><a href=" "><h1>Statstics</h1></a></li>
          <li><center><a href="logout"><h1>Logout</h1></a></li>
          
          
          </ul>
                </div>
          </header>
    </body>
</html>
