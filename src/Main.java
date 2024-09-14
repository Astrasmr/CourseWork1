import model.Employee;

public class Main {
    private static Employee[] workers = new Employee[10];

    public static void main(String[] args) {
        workers[0] = new Employee("Иван", "Иванов", 100000, 1);
        workers[1] = new Employee("Иван1", "Петров", 150000, 1);
        workers[2] = new Employee("Иван2", "Иванов", 200000, 1);
        workers[3] = new Employee("Иван3", "Иванов", 100000, 1);
        workers[4] = new Employee("Иван4", "Иванов", 100000, 1);
        workers[5] = new Employee("Иван5", "Иванов", 100000, 1);
        workers[6] = new Employee("Иван6", "Иванов", 99000, 1);
        workers[7] = new Employee("Иван7", "Иванов", 100003, 1);
        workers[8] = new Employee("Иван8", "Иванов", 100000, 1);
        workers[9] = new Employee("Иван9", "Иванов", 100000, 1);
        printAllWorkers();
        System.out.println(calculateSumSalary());
        System.out.println(findMinSalary());
        System.out.println(findMaxSalary());
        System.out.println(findAverageSalary());
        printAllWorkersNames();

    }

    public static void printAllWorkers() {
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
    }

    public static int calculateSumSalary() {
        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee minSalaryEmployee = workers[0];
        for (int i = 0; i < workers.length; i++) {
            if (minSalaryEmployee.getSalary() > workers[i].getSalary()) {
                minSalaryEmployee = workers[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalary() {
        Employee maxSalaryEmployee = workers[0];
        for (int i = 0; i < workers.length; i++) {
            if (maxSalaryEmployee.getSalary() < workers[i].getSalary()) {
                maxSalaryEmployee = workers[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static double findAverageSalary() {
        return (double) calculateSumSalary() / workers.length;
    }

    public static void printAllWorkersNames() {
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].getFullName());
        }
    }
}
