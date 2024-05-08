import java.time.LocalDate;
import java.util.Date;

public class Reader {
    String fullName;
    String library;
    long cardNumber;
    LocalDate dateOfBirth;
    int phoneNumber;

    public Reader() {

    }

    public Reader(String fullName, String library, long cardNumber, LocalDate dateOfBirth, int phoneNumber) {
        this.fullName = fullName;
        this.library = library;
        this.cardNumber = cardNumber;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void getBook(int kolichstvoKnig, long cardNumber) {
        if (this.cardNumber == cardNumber) {
            System.out.println(fullName + " " + kolichstvoKnig + " kitep aldy");
        } else
            System.out.println("kartanyzdyn nomeri tuura emes");

    }

    public void returnBook(int kolichstvoKnig) {
        System.out.println(fullName + " " + kolichstvoKnig + " kitep kaitardy");


    }
}

