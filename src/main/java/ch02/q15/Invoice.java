package ch02.q15;

import java.util.ArrayList;

public class Invoice {

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Flour", 1, 2.50);
        invoice.addItem("Sugar", 2, 1.75);
        invoice.addItem("Chocolate", 4, 0.50);
        invoice.printTotal();
        invoice.addItem("Chocolate", 2, 0.50);
        invoice.print();
    }

    private static class Item { // Item is nested inside Invoice
        String description;
        int quantity;
        double unitPrice;
        double price() { return quantity * unitPrice; }

        public String toString() {
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        for(Item item : this.items){
            if (item.description.equals(description)){
                item.quantity += quantity;
                return;
            }
        }
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void removeItem(){

    }

    public void printTotal() {
        System.out.println("The invoice total is " + this.calculateTotal());
    }

    public double calculateTotal() {
        double total = 0;
        for(Item item : this.items) {
            total += (item.price());
        }
        return total;
    }

    public void print() {
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.price();
        }
        System.out.println(total);
    }
}