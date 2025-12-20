<!-- portfolio -->
<!-- slug: menu-makanan-java -->
<!-- title: Menu Makanan Java -->
<!-- description: Aplikasi menu makanan desktop sederhana yang dibangun dengan Java Swing dan NetBeans -->
<!-- image: https://github.com/user-attachments/assets/71d35019-b4d5-4067-b17d-4faa581f2d67 -->
<!-- tags: java, swing, netbeans, mysql, aplikasi-desktop, menu-makanan -->

# Aplikasi Menu Makanan (Food Menu Application)

<img width="1536" height="1024" alt="menu-makanan-java" src="https://github.com/user-attachments/assets/71d35019-b4d5-4067-b17d-4faa581f2d67" />

Aplikasi desktop manajemen menu makanan sederhana yang dibangun dengan Java Swing menggunakan NetBeans IDE. Aplikasi ini memungkinkan staf restoran untuk mengelola item menu makanan, kategori, dan harga melalui antarmuka grafis yang intuitif.

## 📋 Ringkasan

Ini adalah aplikasi menu makanan berbasis desktop yang dibuat selama perjalanan belajar Java saya. Proyek ini memberikan solusi lengkap untuk mengelola item menu restoran dengan fitur untuk menambah, mengedit, melihat, dan menghapus item makanan.

## ✨ Fitur

- **Manajemen Menu (CRUD)**
  - Menambah item makanan baru dengan detail lengkap.
  - Melihat semua item menu dalam format tabel.
  - Memperbarui informasi menu yang sudah ada.
  - Menghapus item menu dengan konfirmasi.

- **Manajemen Kategori**
  - Mengatur item makanan berdasarkan kategori.
  - Memfilter item menu berdasarkan kategori.
  - Pengurutan berdasarkan kategori.

- **Manajemen Harga**
  - Menetapkan dan memperbarui harga makanan.
  - Menampilkan harga dalam format mata uang.
  - Melacak perubahan harga.

- **Integrasi Database**
  - Database MySQL untuk persistensi data.
  - Penyimpanan data yang andal.
  - Optimasi query.

- **Antarmuka Ramah Pengguna**
  - GUI berbasis Swing yang bersih.
  - Navigasi yang intuitif.
  - Tampilan grid data dengan pengurutan.
  - Validasi formulir.

## 🛠️ Teknologi yang Digunakan

- **Java**: Bahasa pemrograman inti.
- **Swing**: Framework GUI.
- **NetBeans 8**: IDE untuk pengembangan.
- **MySQL**: Sistem manajemen database.
- **JDBC**: Konektivitas database.
- **JTable**: Komponen tampilan data.

## 📁 Struktur Proyek

```
menu_makanan_java/
├── src/
│   └── menu/
│       ├── Main.java          # Titik masuk aplikasi
│       ├── MenuForm.java      # UI formulir utama
│       ├── Database.java      # Koneksi database
│       └── FoodItem.java      # Model data
├── nbproject/                 # File proyek NetBeans
├── build/                     # Kelas terkompilasi
├── dist/                      # JAR yang dapat didistribusikan
├── build.xml                  # File Ant build
├── java_menu_makanan.sql     # Skema database
└── README.md
```

## 🚀 Memulai

### Prasyarat

- **JDK 8 atau lebih tinggi**.
- **NetBeans IDE 8+** (disarankan) atau IDE Java apa pun.
- **MySQL Server 5.7+**.
- **MySQL Connector/J** (driver JDBC).

### Setup Database

1. **Buat Database**
   
   Buka MySQL dan jalankan:
   ```sql
   CREATE DATABASE java_menu_makanan;
   ```

2. **Impor Skema**
   ```bash
   mysql -u root -p java_menu_makanan < java_menu_makanan.sql
   ```
   Atau impor melalui MySQLWorkbench/phpMyAdmin.

3. **Konfigurasi Koneksi**
   
   Perbarui kredensial database di `Database.java`:
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/java_menu_makanan";
   private static final String USER = "root";
   private static final String PASSWORD = "password_anda";
   ```

### Menjalankan dengan NetBeans

1. **Buka Proyek**
   - Jalankan NetBeans IDE.
   - File → Open Project.
   - Navigasi ke folder proyek.
   - Pilih dan buka.

2. **Tambah MySQL Connector**
   - Klik kanan pada "Libraries".
   - Add JAR/Folder.
   - Pilih `mysql-connector-java-x.x.x.jar`.

3. **Build Proyek**
   - Klik kanan pada proyek.
   - Pilih "Clean and Build".

4. **Jalankan Aplikasi**
   - Tekan F6 atau klik tombol Run.

### Menjalankan File JAR

Setelah proses build:
```bash
java -jar dist/menu_makanan_java.jar
```

## 💻 Panduan Penggunaan

### Menambah Item Menu

1. Klik tombol "Add New Item".
2. Isi formulir:
   - **Nama Makanan**: Nama hidangan.
   - **Kategori**: Pilih kategori (Appetizer, Main Course, Dessert, Beverage).
   - **Harga**: Masukkan harga dalam angka.
   - **Deskripsi**: Deskripsi singkat.
   - **Tersedia**: Centang jika tersedia saat ini.
3. Klik "Save".

### Melihat Menu

- Semua item menu ditampilkan di tabel utama.
- Kolom menunjukkan: ID, Nama, Kategori, Harga, Ketersediaan.
- Klik header kolom untuk mengurutkan.
- Gunakan kotak pencarian untuk memfilter item.

### Mengedit Item Menu

1. Pilih item dari tabel.
2. Klik tombol "Edit".
3. Ubah bidang sesuai kebutuhan.
4. Klik "Update" untuk menyimpan perubahan.

### Menghapus Item Menu

1. Pilih item dari tabel.
2. Klik tombol "Delete".
3. Konfirmasi penghapusan di dialog.

### Filter Berdasarkan Kategori

1. Pilih kategori dari dropdown.
2. Tabel akan memfilter secara otomatis.
3. Pilih "All" untuk menampilkan semua item.

## 🗄️ Skema Database

### Tabel Utama: `menu_items`

```sql
CREATE TABLE menu_items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    description TEXT,
    is_available BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

## 🐛 Pemecahan Masalah

**MySQL Connector Tidak Ditemukan**
- Unduh MySQL Connector/J dari situs resmi.
- Tambahkan ke pustaka proyek di NetBeans.

**Koneksi Database Gagal**
- Verifikasi MySQL sudah berjalan.
- Periksa kredensial di `Database.java`.
- Pastikan database sudah dibuat.

**NetBeans Tidak Mau Build**
- Bersihkan proyek terlebih dahulu (Shift+F11).
- Pastikan JDK terkonfigurasi dengan benar.

## 🚀 Peningkatan Masa Depan

Potensi pengembangan:
- Unggah gambar untuk item makanan.
- Sistem manajemen pesanan.
- Pelacakan penjualan dan laporan.
- Dukungan multi-bahasa.
- Fungsi cetak menu.

## 🎓 Hasil Pembelajaran

Proyek ini membantu saya mempelajari:
- Pengembangan GUI Java Swing.
- Desainer Formulir NetBeans.
- Integrasi database MySQL.
- Koneksi dan query JDBC.
- Operasi CRUD.
- Dasar-dasar pola MVC.
- Pemrograman berbasis event.

## 🤝 Kontribusi

Ini adalah proyek pendidikan. Saran dan perbaikan sangat diharapkan!

## 📄 Lisensi

Open source dan tersedia untuk tujuan pendidikan.

---

**Dibangun dengan NetBeans 8** ☕🍔  
Solusi manajemen menu makanan sederhana untuk belajar pengembangan desktop Java
