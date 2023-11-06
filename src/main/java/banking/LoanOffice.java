package banking;

public class LoanOffice {

    public boolean isEligibleForLoan(Customer customer, double credit) {
        System.out.println("Check loan for " + customer.getName());
        //check subsystem Negative Credit
        NegativeCreditHistory creditHistory = new NegativeCreditHistory();
        if (creditHistory.isCustomerInRecords(customer)) {
            return false;
        }

        //check subsystem Anaf
        Anaf anaf = new Anaf();
        double salary = anaf.getPersonSalary(customer);

        //check subsystem Bank
        Bank bank = new Bank();
        if (bank.hasSufficientFounds(customer) && (bank.getCustomerSavings(customer) + salary * 12) > 2 * credit) {
            // client is eligible for a loan not higher than half of a 1 year salary combined with the amount of his savings
                return true;
        }
        return false;
    }
}
