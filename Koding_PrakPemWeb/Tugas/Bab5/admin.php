<!DOCTYPE html>
<html lang="en">
<head>
    <title>Admin Panel - Web Digital Akuntansi</title>
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
            <h2>Admin Panel</h2>
            <button onclick="myFunction()">Admin</button>
            <p id="demo"></p>

        </section>
    </main>

    <script>
        function myFunction() {
          let text = "";
          let pil = confirm("apakah anda admin?");
          if (pil == true) {
            text = "Ya, Saya admin";
          } else {
            text = "Tidak";
          }
  
          document.getElementById("demo").innerHTML = text;
        }
      </script>
  
    <footer>
        <p>Hak Cipta &copy; 2024 Web Digital Akuntansi</p>
    </footer>
    </center>
</body>
</html>
