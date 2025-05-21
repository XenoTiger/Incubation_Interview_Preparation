package structural.proxy;

public interface EmployeeDao {

    void create(String client, Employee employee);
    void delete(String client, String name);
    Employee get(String client, String name);
}
