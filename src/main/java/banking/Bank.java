package banking;

class Bank {

    public boolean hasSufficientFounds(Customer customer)
    {
        System.out.println("Check savings for "+customer.getName());
        return customer.getSavings()>0;
    }

    public double getCustomerSavings(Customer customer)
    {
        return 399;
    }
}
