public class Main {

    public static void main(String[] args) throws Exception {

        CustomerService customerService = new CustomerService();
        customerService.addGoodExample(new DatabaseLogger());
        customerService.addGoodExample(new EmailLogger());

    }
}
