package gui;

import varelager.Unit;
import varelager.UnitBook;
import varelager.UnitForLoan;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by andreas on 04.02.15.
 */
public class MainFrame extends JFrame{

    public MainFrame (String title) {
        super(title);

        // sette layouttype
        setLayout(new BorderLayout());

        //lager panel
        JPanel unitPanel = new JPanel();
        JPanel unitForLoanPanel = new JPanel();
        JPanel unitBookPanel = new JPanel();

        //setter layouttype på panel
        unitPanel.setLayout(new BorderLayout());
        unitForLoanPanel.setLayout(new BorderLayout());
        unitBookPanel.setLayout(new BorderLayout());

        //lage knappekomponent for unit
        JButton nUnitsButton = new JButton("Antall Enheter");

        //lage knappekomponent for unitForLoan
        JButton nUnitsForLoanButton = new JButton("Antall Enheter For Lån");
        final JButton nUnitsForLoanBorrowedButton = new JButton("Antall Utlånte Enheter");
        JButton nUnitsAvailableForLoanButton = new JButton("Antall Tilgjengelige For Lån");

        //lage knappekomponent for unitBooks
        JButton nUnitBooksButton = new JButton("Antall Bøker");
        JButton nUnitBooksBorrowedButton = new JButton("Antall Utlånte Bøker");
        JButton nAvailableUnitBooksButton = new JButton("Antall Tilgjengelige Bøker For Lån");

        //setter størrelse på knapper
        //nUnitBooksButton.setPreferredSize(new Dimension(200,20));

        //sett knappekomponenter i respektive panel

        //unitpanel
        unitPanel.add(nUnitsButton, BorderLayout.CENTER);

        //unitForLoan panel
        unitForLoanPanel.add(nUnitsForLoanButton, BorderLayout.WEST);
        unitForLoanPanel.add(nUnitsForLoanBorrowedButton, BorderLayout.CENTER);
        unitForLoanPanel.add(nUnitsAvailableForLoanButton, BorderLayout.EAST);

        //unitBooks panel
        unitBookPanel.add(nUnitBooksButton, BorderLayout.WEST);
        unitBookPanel.add(nUnitBooksBorrowedButton, BorderLayout.CENTER);
        unitBookPanel.add(nAvailableUnitBooksButton, BorderLayout.EAST);

        //henter containerobjekt
        Container cont = getContentPane();

        //legger til panel i container
        cont.add(unitPanel, BorderLayout.NORTH);
        cont.add(unitForLoanPanel, BorderLayout.CENTER);
        cont.add(unitBookPanel, BorderLayout.SOUTH);

        //legger lyttere på knapper
        nUnitsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Antall enheter: " + Unit.getAntUnits());
            }
        });

        nUnitsForLoanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Antall låneenheter: " + UnitForLoan.getAntUnitsForLoan());
            }
        });

        nUnitsForLoanBorrowedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Antall lånte enheter: " + UnitForLoan.getAntUnitsForLoanBorrowed());
            }
        });

        nUnitsAvailableForLoanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Antall enheter tilgjengelig for lån: " + UnitForLoan.getAntUnitsAvailableForLoan());
            }
        });

        nUnitBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Antall bøker: " + UnitBook.getAntUnits());
            }
        });

        nUnitBooksBorrowedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Antall lånte bøker: " + UnitBook.getAntUnitBooksBorrowed());
            }
        });

        nAvailableUnitBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Antall bøker tilgjengelig for utlån: " + UnitBook.getAntUnitsAvailableForLoan());
            }
        });
    }

}
