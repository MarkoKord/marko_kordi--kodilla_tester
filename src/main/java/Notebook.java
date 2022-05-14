public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This Notebook is very cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {

        if (this.weight < 600) {
            System.out.println("This notebook is light");
        } else if (this.weight > 600 && this.weight < 1600) {
            System.out.println("This notebook is not heavy");
        } else {
            System.out.println("This notebook is too heavy");

        }
    }

    public void checkDetails() {

        if (this.price > 860 & this.year > 2016) {
            System.out.println("Notebook with price more than 860 and produced after 2016");

        } else {
            if (this.price > 300 & this.year <= 2015) {
                System.out.println("Notebook with price more than 300 and produced before 2014");
            } else {
                System.out.println("Notebook with price less than 860 and produced before 2015");
            }
        }

    }
}













