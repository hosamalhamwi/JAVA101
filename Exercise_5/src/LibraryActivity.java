public class LibraryActivity {
    public static void main(String[] args) {
        Author auth = new Author(1892 , "J.R.R. Tolkien" , 1973);
        Book bok = new Book("Fellowship of the Ring" , auth);

        bok.setPublisherName("George Allen & Unwin");
        bok.setPublishedYear(1954);

        System.out.println("Book Name : " + bok.getName());
        System.out.println("Published Year : " + bok.getPublishedYear());
        System.out.println("Author Name : " + bok.getAuthor().getName() + " Age : " + bok.getAuthor().Age());

    }
}
