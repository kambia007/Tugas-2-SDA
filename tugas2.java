package Tugas2;

import java.util.LinkedList;

public class tugas2 {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<String>();

        nama.add("T");
        nama.add("H");
        nama.add("O");
        nama.add("M");
        nama.add("A");
        nama.add("S");
        nama.add(" ");
        nama.add("N");
        nama.add("O");
        nama.add("B");
        nama.add("E");
        nama.add("L");
        nama.add(" ");
        nama.add("A");
        nama.add("S");
        nama.add("F");
        nama.add("A");
        nama.add("R");

        System.out.println("\n");
        System.out.println("Nama Saya: " + nama + " Ukuran: " + nama.size());

        //menambah karakter lain yang saya inginkan
        nama.addFirst(" ");
        nama.addFirst("S");
        nama.add(1, "I");
        nama.add(2, "R");
        System.out.println("\nSoal Nomor 1");
        System.out.println("Add Karakter yang diinginkan " + nama + " Ukuran: " + nama.size());

        //menyisipkan karakter lain yang saya inginkan
        nama.set(11, "I");
        nama.set(12, "R");
        nama.set(13, "O");
        nama.set(14, "N");
        nama.set(15, "S");
        nama.set(16, "I");
        nama.set(17, "D");
        nama.set(18, "E");
        System.out.println("\nSoal Nomor 2");
        System.out.println("Sisipkan Karakter yang diinginkan " + nama + " Ukuran: " + nama.size());

        //remove karakter yang saya inginkan
        nama.remove(19);
        nama.remove(19);
        nama.remove(19);
        nama.remove(0);
        nama.remove(0);
        nama.remove(0);
        nama.remove(0);
        System.out.println("\nSoal Nomor 3");
        System.out.println("Remove Karakter yang diinginkan " + nama + " Ukuran: " + nama.size());

        //buat fungsi push
        nama.push(" ");
        nama.push("G");
        nama.push("N");
        nama.push("I");
        nama.push("K");
        System.out.println("\nSoal Nomor 4");
        System.out.println("Fungsi PUSH " + nama + " Ukuran: " + nama.size());

        //buat fungsi pop
        nama.pop();
        nama.pop();
        nama.pop();
        nama.pop();
        nama.pop();
        System.out.println("\nSoal Nomor 4");
        System.out.println("Fungsi POP " + nama + " Ukuran: " + nama.size());
    }
}
