public class Employee {
    String lastName;
    String firstName;
    String jobTitle;
    String department;
    double annualSalary;
    double estimatedAnnualMinusFurloughs;

    //No-argument constructor
    public Employee() {
        this.lastName = "";
        this.firstName = "";
        this.jobTitle = "";
        this.department = "";
        this.annualSalary = 0.0;
        this.estimatedAnnualMinusFurloughs = 0.0;
    }

    //Parameterized constructor
    public Employee(String lastName, String firstName, String jobTitle,
                    String department, double annualSalary, double estMinusFurloughs) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.annualSalary = annualSalary;
        this.estimatedAnnualMinusFurloughs = estMinusFurloughs;
    }

    //Getters
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public String getDepartment() {
        return department;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public double getEstimatedAnnualMinusFurloughs() {
        return estimatedAnnualMinusFurloughs;
    }

    //Setters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public void setEstimatedAnnualMinusFurloughs(double estMinusFurloughs) {
        this.estimatedAnnualMinusFurloughs = estMinusFurloughs;
    }

    //equals() method to compare two Employee objects based on lastName, firstName, and department
    public boolean equals(Employee emp) {
        if (this.firstName.equals(emp.getFirstName()) && this.lastName.equals(emp.getLastName())
                && this.department.equals(emp.getDepartment())) {
            return true;
        }
        return false;
    }

    //hashCode method 

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + department + ")";
    }
}
