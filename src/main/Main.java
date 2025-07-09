package main;

import Books.*;
import shipping.serviceshipping;

public class Main {
    public static void main(String[] args) {
        BookService store = new BookService(10);

        store.add_book(new PaperBook("Java", "P001", 2018, 200, 5));
        store.add_book(new EBook("Clean Code", "A001", 150, 2020, "PDF"));
        store.add_book(new ShowBook("Rare Book", "S001", 2021, 999));
        System.out.println("remove older book" );
        store.remove_books(12, 2024);
        System.out.println("--------------");
        System.out.println("  buying PaperBook  ");
        serviceshipping.buy(store.findBookbyisbn("P001"), 2, "gomana@gmail.com", "Cairo");
        System.out.println("----------------");
        System.out.println("  buying EBook  ");
        serviceshipping.buy(store.findBookbyisbn("A001"), 1, "gomana@gmail.com", "tanta");
        System.out.println("---------------");
        System.out.println("  buying ShowBooK  ");
        serviceshipping.buy(store.findBookbyisbn("S001"), 1, "gomana@gmail.com", "");
        System.out.println("-----------------");
        System.out.println("  buying book not found  ");
        serviceshipping.buy(store.findBookbyisbn("X999"), 1, "gomana@gmail.com", "Giza");
    }
}

