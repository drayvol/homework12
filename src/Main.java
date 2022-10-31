public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Алан", "Милн");
        Book firstBook = new Book("Винни-Пух",firstAuthor, 1926);
        Book thirdBook = new Book("Винни-Пух",firstAuthor, 2000);

        System.out.println(firstBook.getBookName() +" " +firstAuthor.getAuthorName()+" "+firstAuthor.getAuthorSurname()+" " +firstBook.getPublishingYear());
        firstBook.setPublishingYear(2000);
        System.out.println(firstBook.getBookName() +" " +firstAuthor.getAuthorName()+" "+firstAuthor.getAuthorSurname()+" " +firstBook.getPublishingYear());
        Author secondAuthor = new Author("Джоан", "Роулинг");
        Book secondBook = new Book("Гарри Поттер",secondAuthor, 1997);
        System.out.println(secondBook.getBookName() +" " +secondAuthor.getAuthorName()+" "+secondAuthor.getAuthorSurname()+" " +secondBook.getPublishingYear());
        System.out.println(firstBook.toString());
        System.out.println(firstBook.toString() + " и "+ secondBook.toString() +" - это одинаковые книги? "+firstBook.equals(secondBook));
        System.out.println(firstBook.toString() + " и "+ thirdBook.toString() +" - это одинаковые книги? "+firstBook.equals(thirdBook));
        System.out.println("Hash код книги "+ firstBook.hashCode());
        System.out.println("Hash код книги "+ thirdBook.hashCode());
        System.out.println("Hash код автора " + firstAuthor.hashCode());

    }
}