package Week6;

import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    public Library() {
        this.books = new ArrayList<Book>();
    }
    public void addBook(Book newBook){
        this.books.add(newBook);
    }
    public void printBooks(){
        for (Book book: this.books) {
            System.out.println(book);
        }
    }
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book : this.books) {
            if(book.title().contains(title.trim())){
                if(StringUtils.included(book.title(), title)) {
                    found.add(book);
                }
            }
            @@ -35,7 +35,7 @@ public ArrayList<Book> searchByPublisher(String publisher) {
                ArrayList<Book> found = new ArrayList<Book>();

                for (Book book : this.books) {
                    if(book.publisher().contains(publisher.trim())){
                        if(StringUtils.included(book.publisher(), publisher)){
                            found.add(book);
                        }
                    }

    public void searchByPublisher() {
    }