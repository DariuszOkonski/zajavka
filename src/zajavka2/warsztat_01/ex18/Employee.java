package zajavka2.warsztat_01.ex18;

import java.math.BigDecimal;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String name;
    private String surname;
    private int age;

    private BigDecimal salary;

    public Employee(String name, String surname, int age, BigDecimal salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {

        return Comparator.<Employee, String>comparing(e -> e.name)
                .thenComparing((e1, e2) -> e2.surname.compareTo(e1.surname))
                .thenComparingInt(e -> e.age)
                .thenComparing((e1, e2) -> e2.salary.compareTo(e1.salary))
                .compare(this, employee);


//        int nameComparisonResult = this.name.compareTo(employee.name);
//        if(nameComparisonResult != 0) {
//            return nameComparisonResult;
//        }
//
//        int surnameComparisonResult = employee.surname.compareTo(this.surname);
//        if(surnameComparisonResult != 0) {
//            return surnameComparisonResult;
//        }
//
//        int ageComparisonResult = this.age - employee.age;
//        if(ageComparisonResult != 0) {
//            return ageComparisonResult;
//        }
//
//        return employee.salary.compareTo(this.salary);
    }
}
