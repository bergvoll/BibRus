package varelager;

import actors.Borrower;

/**
 * Created by andreas on 30.01.15.
 */
public class UnitBook extends UnitForLoan{
    private Book book;
    public final int MAX_LOAN_DUR = 14; //final vil si at den ikke kan endres senere

    //antall bøker i systemet vårt
    private static int antUnitBooks = 0;

    //antall bøker som er utlånt
    private static int antUnitBooksBorrowed = 0;


    public UnitBook(double dewey, int unitId, Book book) {
        super(dewey, unitId); //Disse sendes videre til UnitForLoan (må følge samme rekkefølge for hver verdi som i superklassen
        this.book = book;
        antUnitBooks++;
    }

    //antall bøker lånt
    @Override
    public void setLoanedTo(Borrower borrower) {
        super.setLoanedTo(borrower);
        antUnitBooksBorrowed++;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static int getAntUnitBooks() {
        return antUnitBooks;
    }

    public static int getAntUnitBooksBorrowed() {
        return antUnitBooksBorrowed;
    }

    public static int getAntUnitBooksAvailableForLoan() {
        return antUnitBooks - antUnitBooksBorrowed;
    }
}
