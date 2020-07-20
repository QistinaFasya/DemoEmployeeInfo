package sg.edu.rp.c346.id18015170.demoemployeeinfo;

public class EmployeeInfo {
    private String Name;
    private String Title;
    private int Salary;

    public EmployeeInfo(String name, String title, int salary) {
        Name = name;
        Title = title;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public String getTitle() {
        return Title;
    }

    public int getSalary() {
        return Salary;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
