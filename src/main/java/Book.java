public class Book {               //gdy wpisuje new to zawsze oznacza to że tworze obiekt

    // zadeklarowane zmienne typu String (tekstowe), są prywatne żeby ich nie zmieniac
    private String author;
    private String title;


    private  Book(String author, String title) {                         //prywatny konstruktor przyjmuacy 2 stringi (author i title)
        this.author = author;
        this.title = title;

    }
    public  static Book of(String author, String title){        //utworzenie metody statycznej zwracającej obiekt typu Book
        return new Book(author, title);                         // utwórzenie i zwrocenie obiektu typu Book






    }


}













