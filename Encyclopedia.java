public class Encyclopedia extends Book {
    private String edition;
    public int numOfPages;

    public Encyclopedia() {
        title = "The Illustrated Encyclopedia of the Universe";
        author = "Ian Ridpath";
        publisher = "Watson-Guptill";
        publishDate = "2001";
        edition = "2nd";
        numOfPages = 384;
    }

    @Override
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
            System.out.println(indent + "Edition: "
                    + edition);
            System.out.println(indent + "Number of pages: "
                    + numOfPages);
        }
}
