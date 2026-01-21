class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[0];
    }
public void addBook(Book book) {
    Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i ++) {
        newBooks[i] = this.Books[i];
    }
    newBooks[newBooks.length - 1] = book;
    this.books = newBooks;
}
public void removeBook(String isbn) {
    int count = 0;
    for(int i = 0; i < this.books.length; i++) {
        if(!this.books[i].getISBN().equals(isbn)) {
            count++;
        }
    }
    Book[] newBooks = new Book[count];
    int index = 0;
    for(int i = 0; i < this.books.length; i ++) {
        if(!this.books[i].getISBN().equals(isbn)) {
            newBooks[index] = this.books[i];
            index++;
        }
    }
        this.books = newBooks;
    }
    public Book[] searchBook(String title) {
        int count = 0;
        for(int i = 0; i < this.books.length; i ++) {
            if(!this.books[i].getTitle().equals(title)) {
                count++;
            }
        }
        Book[] matches = new Book[count];
        int index = 0;
        for(int i = 0; i < this.books.length; i ++) {
            if(!this.books[i].getTitle().equals(title)) {
                matches[index] = this.books[i];
                index++;
            }
        }
        return matches;

    }
    public Book[] displayBooks() {
        return this.book;
    }
}