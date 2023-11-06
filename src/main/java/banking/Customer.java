package banking;

public class Customer {
    private double _savings;
    private String _name;
    public Customer(String name, double savings){
        _name=name;
        _savings = savings;
    }

    public String getName()
    {
        return _name;
    }

    public double getSavings()
    {
        return _savings;
    }
}
