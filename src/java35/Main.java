package java35;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(15, 5, 2021);
        Date date2 = new Date(15, 9, 2030);
        Date date3 = new Date(15, 10, 2025);

        Athour athour = new Athour("lộc frontend", date);
        Athour athour2 = new Athour("lộc backend", date2);
        Athour athour3 = new Athour("lộc fullstack", date3);

        Book book = new Book("lập trình Frontend", 5000,2026, athour);
        Book book2 = new Book("lập trình Backend", 15000,2029, athour);
        Book book3 = new Book("lập trình Fullstack", 25000,2029, athour);

        book.inBook();
        book2.inBook();
        book3.inBook();

        System.out.println("compare year of publishing book1 and 3: " +book.checkSameYearOfPublication(book3));
        System.out.println("compare year of publishing book2 and 3: " +book2.checkSameYearOfPublication(book3));

        System.out.println("book 1 discount 10%: "+ book.priceAfterLowering(10));
        System.out.println("book 2 discount 20%: "+ book2.priceAfterLowering(20));
        System.out.println("book 1 discount 50%: "+ book3.priceAfterLowering(50));


    }
}
