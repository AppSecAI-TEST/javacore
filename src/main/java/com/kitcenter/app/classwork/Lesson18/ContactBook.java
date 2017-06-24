package com.kitcenter.app.classwork.Lesson18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContactBook {
    public Map fillList(){
        Map<Object, Object> contacts = new HashMap<>();
        HashSet<Object> aLastnames = new HashSet<>();
        HashSet<Object> bLastnames = new HashSet<>();

        aLastnames.add("Amares");
        aLastnames.add("Amires");
        aLastnames.add("Avalska");
        aLastnames.add("Alongo");
        aLastnames.add("Antarios");

        bLastnames.add("Bamares");
        bLastnames.add("Berso");
        bLastnames.add("Binartiz");
        bLastnames.add("Balest");
        bLastnames.add("Bongo");

        contacts.put("a", aLastnames);
        contacts.put("b", bLastnames);

        return contacts;
    }

    public Map fillContacts(){
        Map<Object, Object> contactBook = new HashMap<>();
        Map<Object, Object> contactsA = new HashMap<>();
        Map<Object, Object> contactsB = new HashMap<>();

        contactsA.put("Alaska", "066-741-88-99");
        contactsA.put("Ainka", "066-111-33-99");
        contactsA.put("Avares", "095-333-88-44");

        contactsB.put("Bilasko", "068-741-88-99");
        contactsB.put("Binari", "067-111-33-99");
        contactsB.put("Belladgio", "097-333-88-44");

        contactBook.put("a", contactsA);
        contactBook.put("b", contactsB);
        return contactBook;
    }
}
