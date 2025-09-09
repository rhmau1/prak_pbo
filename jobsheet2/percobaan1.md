# 📌 Studi Kasus 1 – Data Karyawan

## 1. Class Diagram

```
+----------------------+
|      Karyawan        |
+----------------------+
| - idKaryawan: String |
| - nama: String       |
| - jenisKelamin: String|
| - jabatan: String    |
| - gaji: double       |
+----------------------+
| + tampilData(): void |
| + lihatGaji(): void  |
+----------------------+
```

---

## 2. Class yang bisa dibuat

Dari studi kasus, cukup **1 class utama**, yaitu:

- **Class Karyawan**

---

## 3. Atribut dan Tipe Data

**Class Karyawan**

- `idKaryawan : String`
- `nama : String`
- `jenisKelamin : String`
- `jabatan : String`
- `gaji : double`

---

## 4. Method-method

**Class Karyawan**

- `tampilData() : void` → menampilkan semua data pribadi karyawan.
- `lihatGaji() : void` → menampilkan gaji karyawan.
