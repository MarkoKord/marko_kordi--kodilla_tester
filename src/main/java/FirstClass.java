public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(400, 1100, 2020);
        System.out.println(notebook.weight + "g" + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkDetails();


        Notebook heavyNotebook = new Notebook(2000, 860, 2015);
        System.out.println(heavyNotebook.weight + "g" + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkDetails();


        Notebook oldNotebook = new Notebook(1500, 300, 2010);
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkDetails();

    }
}
