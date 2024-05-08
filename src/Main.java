import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Reader reader =new Reader();
    reader.fullName="Kurmanbek Abdullaev";
    reader.library="Kasym Tynystanov";
    reader.cardNumber=12345678910l;
    reader.dateOfBirth= LocalDate.of(2000,4,22);
    reader.phoneNumber=556660066;
        System.out.println("kancha kitep alasyz jana kartanyzdyn nomerin jazynyz");
    reader.getBook(scanner.nextInt(),scanner.nextLong());
        System.out.println("kancha kitep kaitardynyz jazynyz");
        reader.returnBook(scanner.nextInt());
    }
}