<!DOCTYPE html>
<html lang="en">
<head>
    <title>Kelola Keuangan - Web Digital Akuntansi</title>
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
            <h1>Kelola Keuangan</h1>            
            <h3>Tambah Catatan Keuangan</h3>
            <button onclick="window.location.href='kelola-entry.html'">Tambah Catatan Keuangan</button>
            
            <h3>Edit atau Hapus Catatan Keuangan</h3>
            <button>Edit</button>
            <button onclick="confirmDelete()">Hapus</button> 
            
            <h3>Filter dan Pencarian</h3>
            <input type="text" placeholder="Cari catatan keuangan">
        </section>
    </main>

    <footer>
        <p>Hak Cipta &copy; 2024 Web Digital Akuntansi</p>
    </footer>
    </center>

    <script>
    function confirmDelete() {
        let text = "";
          let pil = confirm("Apakah Anda yakin ingin menghapus catatan keuangan ini?");
          if (pil == true) {
            text = "Catatan telah dihapus";
          } else {
            text = "Tidak ada Catatan yang dihapus";
          }
    }
    </script>
</body>
</html>
