package org.example;

import java.util.HashMap;
import java.util.Map;

class Niece {
    private String name;
    private int day;
    private int month;
    private Map<Uncle, String> presents;  // Change from List<String> to Map<Uncle, String>

    Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        presents = new HashMap<>();
    }
    boolean hasPresent(String description) {
        for (String present : presents.values()) {
            if (present.equals(description)) {
                return true;
            }
        }
        return false;
    }

    boolean hasPresentFrom(Uncle uncle) {
        return presents.containsKey(uncle);
    }

    void receivePresent(Uncle uncle, String description) {
        presents.put(uncle, description);
    }

    void listPresents() {
        if (presents.isEmpty()) {
            System.out.println(name + " has no presents.");
        } else {
            System.out.println(name + "'s Presents:");
            for (Map.Entry<Uncle, String> entry : presents.entrySet()) {
                System.out.println("- " + entry.getKey().getName() + ": " + entry.getValue());
            }
        }
    }

    int clearPresents() {
        int numRemoved = presents.size();
        presents.clear();
        return numRemoved;
    }

    String getName() {
        return name;
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Niece: " + name + " (Birthday: " + month + "/" + day + ")";
    }
}