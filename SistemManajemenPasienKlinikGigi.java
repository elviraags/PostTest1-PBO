/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemmanajemenpasienklinikgigi;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SistemManajemenPasienKlinikGigi {

    static class Pasien {
        String nama;
        int umur;
        String layanan;

        Pasien(String nama, int umur, String layanan) {
            this.nama = nama;
            this.umur = umur;
            this.layanan = layanan;
        }
    }

    // 🔹 Daftar layanan
    static String pilihLayanan(Scanner scanner) {
        while (true) {
            System.out.println("\nPilih Layanan:");
            System.out.println("1. Tambal Gigi");
            System.out.println("2. Cabut Gigi");
            System.out.println("3. Scaling");
            System.out.println("4. Kontrol Behel");
            System.out.print("Pilih layanan (1-4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            return switch (pilihan) {
                case 1 -> "Tambal Gigi";
                case 2 -> "Cabut Gigi";
                case 3 -> "Scaling";
                case 4 -> "Kontrol Behel";
                default -> {
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    yield null;
                }
            };
        }
    }

    public static void main(String[] args) {
        ArrayList<Pasien> daftarPasien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistem Manajemen Pasien Klinik Gigi ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Lihat Pasien");
            System.out.println("3. Ubah Data Pasien");
            System.out.println("4. Hapus Pasien");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Nama Pasien: ");
                String nama = scanner.nextLine();
                System.out.print("Umur Pasien: ");
                int umur = scanner.nextInt();
                scanner.nextLine();
                String layanan = pilihLayanan(scanner);
                if (layanan != null) {
                    daftarPasien.add(new Pasien(nama, umur, layanan));
                    System.out.println("Pasien berhasil ditambahkan!");
                }
            } 
            else if (pilihan == 2) {
                System.out.println("\nDaftar Pasien:");
                if (daftarPasien.isEmpty()) {
                    System.out.println("Belum ada pasien.");
                } else {
                    for (int i = 0; i < daftarPasien.size(); i++) {
                        Pasien p = daftarPasien.get(i);
                        System.out.println((i+1) + ". " + p.nama + 
                                           " | Umur: " + p.umur + 
                                           " | Layanan: " + p.layanan);
                    }
                }
            } 
            else if (pilihan == 3) {
                System.out.print("Masukkan nomor pasien yang ingin diubah: ");
                int index = scanner.nextInt() - 1;
                scanner.nextLine();
                if (index >= 0 && index < daftarPasien.size()) {
                    Pasien p = daftarPasien.get(index);
                    System.out.print("Nama baru (" + p.nama + "): ");
                    p.nama = scanner.nextLine();
                    System.out.print("Umur baru (" + p.umur + "): ");
                    p.umur = scanner.nextInt();
                    scanner.nextLine();
                    String layananBaru = pilihLayanan(scanner);
                    if (layananBaru != null) {
                        p.layanan = layananBaru;
                        System.out.println("Data pasien berhasil diperbarui!");
                    }
                } else {
                    System.out.println("Pasien tidak ditemukan.");
                }
            } 
            else if (pilihan == 4) {
                System.out.print("Masukkan nomor pasien yang ingin dihapus: ");
                int index = scanner.nextInt() - 1;
                scanner.nextLine();
                if (index >= 0 && index < daftarPasien.size()) {
                    daftarPasien.remove(index);
                    System.out.println("Pasien berhasil dihapus!");
                } else {
                    System.out.println("Pasien tidak ditemukan.");
                }
            } 
            else if (pilihan == 5) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } 
            else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}