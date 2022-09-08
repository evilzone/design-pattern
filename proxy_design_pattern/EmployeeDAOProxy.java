public class EmployeeDAOProxy implements EmployeeDAO {

    EmployeeDAO employeeDaoObj;

    EmployeeDAOProxy() {
        employeeDaoObj = new EmployeeDAOImpl();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDaoObj.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeID) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDaoObj.delete(client, employeeID);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int employeeID) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")) {
            return employeeDaoObj.get(client, employeeID);
        }
        throw new Exception("Access Denied");
    }
}
