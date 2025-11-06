public class Employee {
    String lastName;
    String firstName;
    String jobTitle;
    String department;
    double annualSalary;
    double estimatedAnnualMinusFurloughs;

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
    public setLastName(String lastName) {
        this.lastName = lastName;
    }
    public setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public setDepartment(String department) {
        this.department = department;
    }
    public setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public setEstimatedAnnualMinusFurloughs(double estMinusFurloughs) {
        this.estimatedAnnualMinusFurloughs = estMinusFurloughs;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + department + ")";
    }
}
