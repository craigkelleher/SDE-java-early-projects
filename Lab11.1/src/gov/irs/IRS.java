/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package gov.irs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 *
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?
    //replace array with a collection of taxpayer
    //private TaxPayer[] payers = new TaxPayer[100];
    private final Collection<TaxPayer> payers = new ArrayList<>();
    //private int currentIndex = 0;  // for dealing with the array

    public void collectTaxes() {
        //for (int i = 0; i < currentIndex; i++) {
        //collection is an iterable, collection goes on right side
        for (TaxPayer payer : payers) {
            //getStandardDeduction was part of the taxpayer interface
            //double deduction = payers[i].getStandardDeduction();
            double deduction = payer.getStandardDeduction();
            System.out.printf("Tax payer's deduction is: %,.2f%n", deduction);
            //payers[i].payTaxes();
            payer.payTaxes();
            System.out.println();
        }
    }
    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer) {
        //payers[currentIndex++] = payer;
        //pass a reference to the payer instance.
        payers.add(payer);
    }
}