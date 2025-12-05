<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>


<body>
    <h1 style="background-color: aquamarine;color: red;text-align: center;font-size: 75px;">WELCOME TO REGISTRAION PAGE
    </h1>

    <hr>

    <br>


    <div align="center">

        <form action="register" method="post">

            <table border="1px">


                <tbody>
      
                    <tr>
                        <td>
                            <label>First Name :</label>
                        </td>
                        <td>
                            <input type="text" name="firstName" placeholder="Enter First Name Here" required>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <label>Last Name :</label>
                        </td>
                        <td>
                            <input type="text" name="lastName" placeholder="Enter Last Name Here" required>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <label>Contact Number :</label>
                        </td>
                        <td>
                            <input type="text" name="mobileNo" pattern="[789][0-9]{9}"
                                placeholder="Enter Contact No Here" required>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <label>Email ID :</label>
                        </td>
                        <td>
                            <input type="email" name="emailId" pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}"
                                placeholder="Enter Email Id Here" required>
                        </td>
                    </tr>


                    <tr>
                        <td>
                            <label>Date Of Birth :</label>
                        </td>
                        <td>
                            <input type="date" name="birthDate" max="2025-06-04" min="1900-01-01" required>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <label>Select Gender :</label>
                        </td>
                        <td>
                            <input type="radio" name="gender" value="Male">Male
                            <input type="radio" name="gender" value="FeMale">Female
                        </td>
                    </tr>

					<tr>
                        <td>
                            <label>User Name :</label>
                        </td>
                        <td>
                            <input type="text" name="userName" placeholder="Enter User Name Here" required>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <label>Password :</label>
                        </td>
                        <td>
                            <input type="password" name="password" placeholder="Enter Password Here" required>
                        </td>
                    </tr>
                   
                   
                    <tr>
                        <td>
                            <input style="background-color: blue;" type="submit" value="REGISTER" name="submit">
                        </td>
                        <td>
                            <input style="background-color: red;" type="reset">
                        </td>

                    </tr>

                </tbody>
            </table>




        </form>

    </div>
</body>

</html>