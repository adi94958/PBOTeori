package org.example;

import java.util.HashMap;
import java.util.Map;

class Uncle {
    private String name;
    private Map<Niece, String> presents;

    Uncle(String name) {
        this.name = name;
        presents = new HashMap<>();
    }

    boolean addPresent(Niece recipient, String description) {
        if (presents.containsKey(recipient) || recipient.hasPresent(description)) {
            return false; // Each niece receives something different, and uncles give something different to each niece
        }

        presents.put(recipient, description);
        recipient.receivePresent(this, description);
        return true;
    }

    void listPresents() {
        for (Map.Entry<Niece, String> entry : presents.entrySet()) {
            System.out.println(name + " is giving " + entry.getValue() + " to " + entry.getKey());
        }
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Uncle: " + name;
    }
}