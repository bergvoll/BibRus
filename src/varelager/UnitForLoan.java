package varelager;
import actors.*;
import java.util.Date;

/**
 * Created by andreas on 30.01.15.
 */
public class UnitForLoan extends Unit{
    private Date loanStart;
    private Date loanDue;
    private Borrower loanedTo;

    //antall lånbare enheter i systemet
    private static int antUnitsForLoan = 0;

    //antall lånbare enheter som er utlånt
    private static int antUnitsForLoanBorrowed = 0;

    //vi må ha en konstruktør når vi bruker arv (dewey og unitId sendes til Unit-klassen)
    public UnitForLoan(double dewey, int unitId) {
        super(dewey, unitId); //disse sendes videre til Unit-klassen
        antUnitsForLoan++; // øker antallet units for loan når objektet opprettes
    }

    public void setLoanedTo(Borrower loanedTo) {
        this.loanedTo = loanedTo;
        antUnitsForLoanBorrowed++;
    }

    public Date getLoanStart() {
        return loanStart;
    }

    public void setLoanStart(Date loanStart) {
        this.loanStart = loanStart;
    }

    public Date getLoanDue() {
        return loanDue;
    }

    public void setLoanDue(Date loanDue) {
        this.loanDue = loanDue;
    }

    public Borrower getLoanedTo() {
        return loanedTo;
    }

    public static int getAntUnitsForLoan() {
        return antUnitsForLoan;
    }

    public static int getAntUnitsForLoanBorrowed() {
        return antUnitsForLoanBorrowed;
    }

    public static int getAntUnitsAvailableForLoan() {
        return antUnitsForLoan - antUnitsForLoanBorrowed;
    }
}
