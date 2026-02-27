

public class MainLibrary {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling", 101);
        Member m = new Member("Sakshi", 1);

        b.displayBook();
        m.displayMember();
    }
}