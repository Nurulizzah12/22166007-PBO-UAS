/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package uas_soal_no2;

/**
Nama      : Nurul Izzah
Nim       : 22166007
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO 1
* Ujian Akhir Semester
 */
public class Uas_soal_no2 {
    public static class Employee {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void work() {
            System.out.println("Seorang karyawan sedang bekerja.");
        }
    }

    public static class Manager extends Employee {
        @Override
        public void work() {
            System.out.println("Seorang manajer sedang bekerja.");
        }
    }

    public static class Developer extends Employee {
        @Override
        public void work() {
            System.out.println("Seorang pengembang sedang bekerja.");
        }
    }

    public static class Designer extends Employee {
        @Override
        public void work() {
            System.out.println("Seorang desainer sedang bekerja.");
        }
    }

    public static void main(String[] args) {
        // Membuat objek-objek Employee
        Employee employee1 = new Manager();
        Employee employee2 = new Developer();
        Employee employee3 = new Designer();

        // Menjalankan metode work() untuk setiap objek Employee
        employee1.work();
        employee2.work();
        employee3.work();
    }

}
