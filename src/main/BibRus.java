package main;
import actors.*;
import gui.MainFrame;
import varelager.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by andreas on 30.01.15.
 */
public class BibRus {
    public static void main(String[] args) {

        ArrayList<Author> authorList = new ArrayList<Author>();
        authorList.add(new Author("Andreas", "Bergvoll"));
        authorList.add(new Author("Jo", "Nesbø"));
        authorList.add(new Author("Annelen Bredholt", "Nilsen"));

        ArrayList<Publisher> publisherList = new ArrayList<Publisher>();
        publisherList.add(new Publisher("Gyldendal"));
        publisherList.add(new Publisher("Damm"));

        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("123-456-789", "Politi", authorList.get(1), publisherList.get(1)));
        bookList.add(new Book("789-456-123", "Snømannen", authorList.get(1), publisherList.get(1)));
        bookList.add(new Book("123-789-456", "Nerdehimmelen", authorList.get(2), publisherList.get(0)));

        ArrayList<UnitBook> UnitBookList = new ArrayList<UnitBook>();
        UnitBookList.add(new UnitBook(123.345, 1, bookList.get(0)));
        UnitBookList.add(new UnitBook(123.345, 2, bookList.get(0)));
        UnitBookList.add(new UnitBook(345.123, 3, bookList.get(1)));
        UnitBookList.add(new UnitBook(321.543, 4, bookList.get(2)));
        UnitBookList.add(new UnitBook(321.543, 5, bookList.get(2)));
        UnitBookList.add(new UnitBook(321.543, 6, bookList.get(2)));

        Borrower ingvar = new Borrower();

        UnitBookList.get(4).setLoanedTo(ingvar);

        //starter gui
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mFrame = new MainFrame("Books R' Us");
                //lukk programmet når vi lukker vinduet
                mFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                //setter størrelse på vinduet
                mFrame.setSize(new Dimension(600,110));
                //skal ikke kunne resizes
                mFrame.setResizable(false);
                //sørger for at vinduet faktisk vises
                mFrame.setVisible(true);
            }
        });
    }
}
