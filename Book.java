public class Book {
    protected String title;
    protected String author;
    protected String publisher;
    protected String publishDate;
    String indent = "   ";

    public Book() {
        title = "The Hobbit";
        author = "J. R. R. Tolkien";
        publisher = "George Allen & Unwin";
        publishDate = "21 September 1937";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void PrintInfo() {
        System.out.println("Book Information: ");
        System.out.println(indent + "Book Title: "
                + title);

        System.out.println(indent + "Author: "
                + author);
        System.out.println(indent + "Publisher: "
                + publisher);
        System.out.println(indent + "Publication Date: "
                + publishDate);
    }
}
