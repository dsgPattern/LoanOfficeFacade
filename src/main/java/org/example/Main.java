package org.example;

import banking.Customer;
import banking.LoanOffice;

public class Main {
    public static void main(String[] args) {
        // you can't access Anaf, Bank or NegativeCreditHistory directly, because they are innaccesible outside their package
        // LoanOffice is our facade, that hides Bank, Anaf, NegativeCreditHistory interaction;
        // we don't care the order in which these 3 subsystems are called, nor the rules used to establish the loan

        Customer customer = new Customer("Client 1", 1);
        LoanOffice loanOffice = new LoanOffice();

        System.out.println("Is eligible: " + loanOffice.isEligibleForLoan(customer, 10000));
    }


}