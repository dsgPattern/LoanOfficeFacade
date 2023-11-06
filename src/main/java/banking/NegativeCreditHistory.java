package banking;

import banking.Customer;

import java.util.ArrayList;

class NegativeCreditHistory {
    private ArrayList<Customer> _customers=new ArrayList<>();

    public boolean isCustomerInRecords(Customer customer){
        System.out.println("Check negative credit for "+customer.getName());
        return _customers.contains(customer);
    }

    public void addCustomer(Customer customer)
    {
        _customers.add(customer);
    }
}
