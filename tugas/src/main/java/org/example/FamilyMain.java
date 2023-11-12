package org.example;

public class FamilyMain {
    public static void main(String[] args) {
        // Membuat keluarga
        Family family = new Family();

        // Menambahkan paman ke keluarga
        family.addUncle("Charlie");
        family.addUncle("Bill");
        family.addUncle("David");
        family.addUncle("Albert");

        // Menambahkan keponakan ke keluarga beserta tanggal lahir mereka
        family.addNiece("Amy", 10, 5); // May 10
        family.addNiece("Beatrice", 15, 8); // August 15
        family.addNiece("Claire", 20, 3); // March 20
        family.addNiece("Emily", 5, 11); // November 5

        // Menampilkan daftar paman dan keponakan
        System.out.println("List of Uncles:");
        family.listUncles();
        System.out.println("\nList of Nieces (Ordered by Birthday):");
        family.listNieces();

        // Paman Albert memilih hadiah untuk Amy
        Uncle albert = family.findUncle("Albert");
        Niece amy = family.findNiece("Amy");
        albert.addPresent(amy, "The Wonder of Computers");

        // Menampilkan hadiah yang diberikan oleh Paman Albert
        System.out.println("\nPresents Given by Uncle Albert:");
        albert.listPresents();

        // Paman Bill secara keliru memilih hadiah yang sama untuk Amy
        Uncle bill = family.findUncle("Bill");
        bill.addPresent(amy, "The Wonder of Computers"); // Should fail

        // Paman Bill memilih hadiah yang berbeda untuk Beatrice
        Niece beatrice = family.findNiece("Beatrice");
        bill.addPresent(beatrice, "A Beautiful Necklace");

        // Menampilkan hadiah yang diberikan oleh Paman Bill
        System.out.println("\nPresents Given by Uncle Bill:");
        bill.listPresents();

        // Menampilkan hadiah yang akan diterima oleh Amy
        System.out.println("\nPresents to be Received by Amy:");
        amy.listPresents();

        // Menghapus hadiah untuk Amy setelah ulang tahunnya
        amy.clearPresents();
        System.out.println("\nCleared presents for Amy after her birthday.");

        // Menampilkan hadiah yang akan diterima oleh Amy setelah dihapus
        System.out.println("\nPresents to be Received by Amy (After Clearing):");
        amy.listPresents();
    }
}
