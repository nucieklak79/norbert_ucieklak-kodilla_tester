package org.kodilla;

public class Notebook {
    int weight, price, year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
    } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1000 && this.weight <= 1800) {
            System.out.println("This notebook is not to heavy.");
        } else if (this.weight > 1800) {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkParameters() {
        if (this.price < 1000 && this.year < 2010) {
            System.out.println("This notebook is cheap, but is very old.");
        } else if (this.price >= 1000 && this.year >= 2010) {
            System.out.println("This notebook is quite expensive, but is not to old.");
        } else if (this.price > 1400 && this.year > 2015) {
                    System.out.println("This notebook is expensive, but is new.");

        }
    }
}
