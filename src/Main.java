public class Main {
    private static Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        employees[0] = new Employee("Попенин Евгений Дмитриевич", 1, 50000);
        employees[1] = new Employee("Копничев Дмитрий Сергеевич", 2, 60000);
        employees[2] = new Employee("Попенин Виталий Дмитриевич", 3, 70000);
        employees[3] = new Employee("Заулов Максим Олегович", 4, 40000);
        employees[4] = new Employee("Щукин Сергей Владимирович", 5, 75000);

        printAllEmployees();
        System.out.println("Сумма затрат на зарплаты: " + calculateTotalSalary());
        Employee minSalaryEmployee = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + (minSalaryEmployee != null ? minSalaryEmployee : "Не найден"));
        Employee maxSalaryEmployee = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: " + (maxSalaryEmployee != null ? maxSalaryEmployee : "Не найден"));
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        printAllFullNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static double calculateAverageSalary() {
        int count = 0;
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public static void printAllFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}