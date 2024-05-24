public class BookTest {
    public static void main(String[] args) {
        Author a1 = new Author("Лев Толстой", "M", "leo_1828@mail.ru");
        Author a2 = new Author("Николай", "M", "gogol@google.com");
        a2.setName("Николай Гоголь");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a2.getEmail());
        Book b1 = new Book("Война и мир", a1, 1763);
        b1.setYear(1863);
        System.out.println(b1);
        System.out.println(a1.getName() + ": " + b1.getName());
    }
}
