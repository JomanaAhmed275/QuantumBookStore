package main;

import Books.*;
import main.*;

public class Main {
    public static void main(String[] args) {
        BookService store = new BookService(100);

        store.add_book(new PaperBook("Java", "P001", 2018, 200, 5));
        store.add_book(new EBook("Clean Code", "E001", 150, 2020, "PDF"));
        store.add_book(new ShowBook("Rare Book", "S001", 2015, 999));
        
        System.out.println("remove older book");
        store.remove_books(10, 2025);


        System.out.println("\n--- Buying PaperBook ---");
        try {
            store.buy("P001",2, "gomana@gmail.com", "Cairo");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Buying EBook ---");
        try {
            store.buy("E001", 1, "gomana@gmail.com", "Tanta");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Buying ShowBook ---");
        try {
            store.buy("S001", 1, "gomana@gmail.com", "");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Buying Not Found ---");
        try {
            store.buy("X999", 1, "gomana@gmail.com", "Giza");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}

