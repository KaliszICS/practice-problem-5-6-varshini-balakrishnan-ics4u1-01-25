class Book {
    private String title;
    private String author;
    private String ISBN;


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getISBN() {
        return this.ISBN;
    }
}