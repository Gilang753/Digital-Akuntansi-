<?php
session_start();
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = $_POST['username'];
    $password = $_POST['password'];

    if ($username === 'Gilang' && $password === 'gilang123') {
        $_SESSION['username'] = $username;
        
        header('Location: index.php');
        exit();
    } else {
        $error = "Username atau password salah.";
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login - Web Digital Akuntansi</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <center>
    <header>
        <nav>
           <a href="index.html">Beranda</a>
           <a href="login.html">Masuk</a>
           <a href="register.html">Daftar</a>
           <a href="admin.html">Admin</a>
           <a href="kelola.html">Kelola</a>
           <a href="hasil-kelola.html">Hasil Kelola</a>
        </nav>
    </header>
    
    <main>
        <section>
            <h2>LOGIN</h2>
            <img src="Logo.jpeg" alt="logo Login" style="max-width: 20%; height: auto;">
            <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
                <label for="username">Username:</label><br>
                <input type="text" id="username" name="username" required><br>
                <label for="password">Password:</label><br>
                <input type="password" id="password" name="password" required><br>
                <input type="submit" value="Masuk">
            </form>
            <?php 
                if(isset($error)) {
                    echo "<p style='color:red;'>$error</p>";
                }
            ?>
        </section>
    </main>

    <footer>
        <p>Hak Cipta &copy; 2024 Web Digital Akuntansi</p>
    </footer>
    </center>
</body>
</html>
