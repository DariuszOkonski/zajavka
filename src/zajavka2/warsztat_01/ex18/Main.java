package zajavka2.warsztat_01.ex18;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Bartek", "Kowalczyk", 18, BigDecimal.valueOf(4321)));
        employeeList.add(new Employee("Karol", "Namysłowski", 21, BigDecimal.valueOf(3223)));
        employeeList.add(new Employee("Rałał", "Rubik", 26, BigDecimal.valueOf(3233)));
        employeeList.add(new Employee("Janek", "Dudnyk", 34, BigDecimal.valueOf(4213)));
        employeeList.add(new Employee("Ania", "Koryciński", 65, BigDecimal.valueOf(3233)));
        employeeList.add(new Employee("Kamila", "Namysłów", 21, BigDecimal.valueOf(3233)));
        employeeList.add(new Employee("Agnieszka", "Marek", 19, BigDecimal.valueOf(3345)));
        employeeList.add(new Employee("Karolina", "Kowalski", 21, BigDecimal.valueOf(6445)));
        employeeList.add(new Employee("Rafał", "Kowalczyk", 32, BigDecimal.valueOf(5335)));
        employeeList.add(new Employee("Kamila", "Marysieńczyk", 41, BigDecimal.valueOf(5553)));

        print(employeeList);
//        Collections.sort(employeeList);

        Comparator<Employee> employeeComparator = Comparator.<Employee, String>comparing(employee -> employee.getName()).reversed()
                .thenComparing((e1, e2) -> e2.getSurname().compareTo(e1.getSurname()))
                .thenComparing(employee -> employee.getAge())
                .thenComparing((e1, e2) -> e2.getSalary().compareTo(e1.getSalary()));

        Collections.sort(employeeList, employeeComparator.reversed());
        print(employeeList);

    }

    private static void print(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println("----------------------");
    }
}

