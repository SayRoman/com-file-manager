public class Salary {
    private double salary;

    public Salary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((int) salary);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Salary other = (Salary) obj;
        if (salary != 0) {
            if (other.salary != 0)
                return false;
        } else if (salary == (other.salary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "salary=" + salary;
    }
}