package inheritance;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        IndividualCustomer oguz = new IndividualCustomer();
        oguz.customerNumber = "1231";
        CorporateCustomer getir = new CorporateCustomer();
        getir.customerNumber = "0000";
        getir.companyName = "Getir";
        System.out.println(getir.companyName);
        CustomerService customerService = new CustomerService();

        Customer[] customers = { oguz, getir };
        customerService.addMultiple(customers);

        Customer customer = new Customer();
    }
}
