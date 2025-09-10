# **POST TEST 1**

# **Sistem Manajemen Pasien Klinik Gigi**

Program ini merupakan program sederhana berbasis Java untuk mengelola data pasien di klinik gigi. Data pasien disimpan dalam ArrayList, sehingga jumlah pasien dapat bertambah atau berkurang sesuai kebutuhan. Aplikasi ini menyediakan menu untuk menambah pasien baru, melihat daftar pasien, mengubah data pasien, dan menghapus pasien dari daftar.

<img width="594" height="169" alt="image" src="https://github.com/user-attachments/assets/d32d7d97-a46f-4603-b463-d0456ad924b0" />

menggunakan ArrayList untuk menyimpan data pasien yang jumlahnya bisa berubah-ubah seperti tambah atau hapus
Ini import untuk class Scanner, memakai agar program bisa menerima input dari user
SistemManajemenPasienKlinikGigi adalah class utama atau program inti
Pasien adalah class khusus untuk menyimpan data pasien.

<img width="730" height="307" alt="image" src="https://github.com/user-attachments/assets/941c8140-f28d-41e9-bdf2-384b0369485d" />

merupakan atribut dari pasien yang berisi nama, umur, dan layanan

**Pasien(String nama, int umur, String layanan) {**

Ini adalah method khusus yang dipanggil saat objek dibuat dan data akan dikirim saat bikin pasien baru.

**static String pilihLayanan(Scanner scanner)**

static method ini bisa dipanggil langsung tanpa membuat object.
String nilai yang dikembalikan adalah teks yang di buat sebelumnya seperti Tambal Gigi, Cabut Gigi, scaling, dan kontrol behel
pilihLayanan adalah nama methodnya
penggunaan Scanner scanner untuk menerima parameter scanner supaya bisa membaca input user.

**Menggunakan switch expression untuk memilih layanan**

Kalau user pilih 1 return "Tambal Gigi".
Kalau pilih 2 return "Cabut Gigi".
Kalau pilih 3 return "Scaling".
Kalau pilih 4 return "Kontrol Behel".
Kalau pilih selain 1–4 tampilkan error "Pilihan tidak valid, coba lagi." dan return null.

<img width="965" height="394" alt="image" src="https://github.com/user-attachments/assets/f61fa105-d70e-478c-888e-941337ce0ae2" />

while (true) → membuat menu berjalan terus sampai user memilih keluar.

Menampilkan daftar menu:
1. Tambah Pasien untuk menambahkan data pasien baru.
2. Lihat Pasien menampilkan seluruh pasien yang tersimpan.
3. Ubah Data Pasien mengedit data pasien tertentu.
4. Hapus Pasien menghapus pasien dari daftar.
5. Keluar menghentikan program.
int pilihan = scanner.nextInt(); untuk membaca angka yang dimasukkan user dari inputan pilihan menu di atas.

<img width="885" height="623" alt="image" src="https://github.com/user-attachments/assets/be4525ad-9491-46c3-bebf-9de9ae0e90c4" />

Program minta input nama pasien, umur, dan disimpan ke variabel umur dan nama pasien.
Memanggil method pilihLayanan(scanner) user memilih layanan yang tersedia seoerti Tambal Gigi, Cabut Gigi, scaling, dan kontrol behel
Kalau layanan != null untuk membuat objek baru Pasien dan kemudian di tambahkan ke daftarPasien (ArrayList).

<img width="860" height="537" alt="image" src="https://github.com/user-attachments/assets/64d69deb-27ca-4c66-97c9-325b4d57d002" />

Menampilkan daftar pasien dulu, kemudian user pilih nomor pasien yang mau diubah. Kalau nomor valid maka akan minta input nama baru, umur baru, dan layanan baru.
Data di-replace dengan daftarPasien.set(index, new Pasien(...)). Konfirmasi "Data pasien berhasil diubah!".

<img width="885" height="616" alt="image" src="https://github.com/user-attachments/assets/333015c0-0f29-4b10-8598-75a9c474e8ba" />

Menampilkan daftar pasien. kemudian user pilih nomor pasien yang mau dihapus. Kalau nomor valid hapus dengan daftarPasien.remove(index).
Konfirmasi "Pasien berhasil dihapus!".

<img width="475" height="419" alt="image" src="https://github.com/user-attachments/assets/8facb08d-4d38-44fd-9ebc-37c2b2c4d440" />

disini diminta untuk memilih menu, saya memilih meni 1 untuk menambahkan data pasien, dengan meminta untuk measukkan nama, umur, dan pilihan layanan, kemudian paisen berhasil di tambahkan

<img width="524" height="246" alt="image" src="https://github.com/user-attachments/assets/b4aee733-f6fe-4253-90e2-ae36656b3676" />

memilih menu nomor 2 untuk melihat data pasien yang terdaftar

<img width="513" height="256" alt="image" src="https://github.com/user-attachments/assets/53dcb3fc-267d-4672-88f7-2c5a93004ea2" />

memilih menu no 3 untuk mengubah data pasien juka ada kesalahan input data, diminta untuk memasukkan ulangn nama, umur, dan layanan

<img width="528" height="494" alt="image" src="https://github.com/user-attachments/assets/54a8bf28-6b61-4095-89ca-416192e39530" />

memilih menu no 4 untuk menghapus data pasien jika di perlukan.
