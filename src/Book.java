import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorNameAndSurname;
    private int publishingYear;
    public Book(String bookName, Author authorNameAndSurname, int publishingYear) {
        this.bookName = bookName;
        this.authorNameAndSurname = authorNameAndSurname;
        this.publishingYear = publishingYear;
    }
    public String getBookName() {
        return bookName;
    }

    public Author getAuthorNameAndSurname() {
        return authorNameAndSurname;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга автора " +  authorNameAndSurname.toString() + ", " + bookName+ ", выпущенная в " +publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && bookName.equals(book.bookName) && authorNameAndSurname.equals(book.authorNameAndSurname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorNameAndSurname, publishingYear);
    }
}
