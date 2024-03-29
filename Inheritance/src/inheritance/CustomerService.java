package inheritance;
public class CustomerService extends Customer {
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " kaydedildi.");
    }

    public void addMultiple(Customer[] customers) {
        for (Customer customer : customers) {
            add(customer);
        }
    }
}
