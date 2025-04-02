package CompanyAttendanceTracking;

public class Employee extends Attendance {
    String name;
    long phoneno;
    private int employeeId;
    boolean isLogin;

    Employee(String name, long num, int id) {
        this.employeeId = id;
        this.phoneno = num;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
