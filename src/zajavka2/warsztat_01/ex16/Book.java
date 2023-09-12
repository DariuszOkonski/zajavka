package zajavka2.warsztat_01.ex16;

public class Book implements Comparable<Book> {
    private int numberOfPages;
    private String title;

    public Book(int numberOfPages, String title) {
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book book) {
        int firstComparisonResult = this.title.compareTo(book.title);

        if(firstComparisonResult != 0) {
            return 0;
        }

        return this.numberOfPages - book.numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", title='" + title + '\'' +
                '}';
    }
}
