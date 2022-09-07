public class ProxyDesignPattern {

    public static void main(String[] args) {
        try {
            EmployeeDAO employeeDAO = new EmployeeDAOProxy();
            employeeDAO.create("ADMIN", new EmployeeDo());
            System.out.println("Operation successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
