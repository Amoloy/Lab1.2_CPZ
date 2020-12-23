import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public final class Employee implements Comparable, Serializable {
    private final String fullName;
    private final Date birthday;
    private final int salary;
    private final int commission;

    public Employee (String fullName, Date birthday, int salary, int commission)
    {
        this.fullName = fullName;
        this.birthday = birthday;
        this.salary = salary;
        this.commission = commission;
    }

    public String getFullName ()
    {
        return this.fullName;
    }

    public Date getBirthday ()
    {
        return this.birthday;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getCommission() {
        return this.commission;
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash (fullName, birthday, salary, commission);
    }

    @Override
    public boolean equals (Object object)
    {
        if (this == object)
        {
            return true;
        } else if ((object == null) || (getClass () != object.getClass ()))
        {
            return false;
        }

        Employee employee = (Employee) object;
        return hashCode () == employee.hashCode ();
    }

    @Override
    public Employee clone () throws CloneNotSupportedException
    {
        return (Employee) super.clone ();
    }

    @Override
    public int compareTo (Object o)
    {
        Employee emp = (Employee) o;

        if (emp.equals (this)) { return 1; }
        return 0;
    }

}
