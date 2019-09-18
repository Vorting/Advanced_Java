package shildt.edition5.chapter8.book.bookpackext;

public class ProtectedDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginner's Guide",
                "Schildt", 2007, "Osborne/McGraw-Hill");
        books[1] = new ExtBook("Java: The Complete Reference",
                "Schildt", 2007, "Osborne/McGraw-Hill");
        books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003,
                "Osborne/McGraw-Hill");
        books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
            System.out.println("Showing all books by Schildt.");

            for (int j = 0; j < books.length; j++) {
                if (books[j].getAuthor() == "Schildt") {
//                    books[0].title = "test title"; // Error: access denied!
                }
            }
        }

    }
}
