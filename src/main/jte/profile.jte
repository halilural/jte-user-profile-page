@import com.uralhalil.jte.demo.UserProfile

@param UserProfile model

<!DOCTYPE html>
<html lang="en">
<head>
    <title>User Profile Form</title>
</head>
<body>
<h2>Fill Your Profile Information</h2>
<form action="/profile" method="post">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" value="${model.getName()}" required minlength="2" maxlength="50"><br><br>

    <label for="surname">Surname:</label><br>
    <input type="text" id="surname" name="surname" value="${model.getSurname()}" required minlength="2"
           maxlength="50"><br><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" value="${model.getEmail()}" required><br><br>

    <button type="submit">Submit</button>
</form>
</body>
</html>
