package org.example;

import java.util.ArrayList;
import java.util.List;

class Family {
    private List<Uncle> uncles;
    private List<Niece> nieces;

    public Family() {
        uncles = new ArrayList<>();
        nieces = new ArrayList<>();
    }

    public boolean addNiece(String name, int day, int month) {
        if (findNiece(name) != null) {
            return false; // Niece with the same name already exists
        }

        Niece niece = new Niece(name, day, month);
        nieces.add(niece);
        return true;
    }

    public boolean addUncle(String name) {
        if (findUncle(name) != null) {
            return false; // Uncle with the same name already exists
        }

        Uncle uncle = new Uncle(name);
        uncles.add(uncle);
        return true;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null; // Niece not found
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null; // Uncle not found
    }

    public void listNieces() {
        nieces.sort((n1, n2) -> {
            if (n1.getMonth() != n2.getMonth()) {
                return Integer.compare(n1.getMonth(), n2.getMonth());
            } else {
                return Integer.compare(n1.getDay(), n2.getDay());
            }
        });

        for (Niece niece : nieces) {
            System.out.println(niece);
        }
    }

    public void listUncles() {
        uncles.sort((u1, u2) -> u1.getName().compareToIgnoreCase(u2.getName()));
        for (Uncle uncle : uncles) {
            System.out.println(uncle);
        }
    }
}