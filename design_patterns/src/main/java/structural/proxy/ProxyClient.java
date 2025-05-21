package structural.proxy;

public class ProxyClient {

    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeProxy();
            employeeDao.create("USER", new Employee());
            System.out.println("Creation Successful");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
