public class Author {
    private String name;
    private String country;

    public Author(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author: " +"\n"+
                "Name: "+ name +"\n"+
                "Country: " + country;
    }
}

class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book:" + "\n"+
                "Title: " +title + "\n" +
                "Author: "+ author+"\n"+
                "publicationYear: "+publicationYear;
    }
}

class Library {
    private Book[] books;
    private int maxSize;
    private int currentSize;

    public Library(int maxSize) {
        this.maxSize = maxSize;
        this.books = new Book[maxSize];
        this.currentSize = 0;
    }

    public void addBook(Book book) {
        if (currentSize < maxSize) {
            books[currentSize++] = book;
            System.out.println("Book added to the library: " + book);
        } else {
            System.out.println("Error: Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(books[i]);
        }
    }


    public static void main(String[] args) {
        Library library = new Library(13);

        Author author1 = new Author("John Doe", "USA");
        Book book1 = new Book("The Book Title", author1, 2022);

        Author author2 = new Author("Jane Smith", "UK");
        Book book2 = new Book("Another Title", author2, 2019);

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}