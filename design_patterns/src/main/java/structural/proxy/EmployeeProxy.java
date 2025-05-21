package structural.proxy;

public class EmployeeProxy implements EmployeeDao {

    private final EmployeeDao employeeDao;

    public EmployeeProxy() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee employee) {
        if (client.equals("ADMIN")) {
            employeeDao.create(client, employee);
            return;
        }
        throw new RuntimeException("Access Denied");
    }

    @Override
    public void delete(String client, String name) {
        if (client.equals("ADMIN")) {
            employeeDao.delete(client, name);
            return;
        }
        throw new RuntimeException("Access Denied");
    }

    @Override
    public Employee get(String client, String name) {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDao.get(client, name);
        }
        throw new RuntimeException("Access Denied");
    }
}
