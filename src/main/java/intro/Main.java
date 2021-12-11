package intro;

public class Main {

    public static void main(String[] args) {
        //procedural approach
        int  baseSalary = 30000;
        int overtimeHours = 10;
        int overtimeRate = 20;

        int totalWage =  baseSalary + (overtimeHours * overtimeRate);
        System.out.println("Total wage: " + totalWage);

        System.out.println("Total wage: " + getWage(baseSalary, overtimeHours, overtimeRate));

        Employee employee = new Employee(3000, 10, 20);
        System.out.println("Total wage: " + employee.getWage());

    }

    private static int getWage(int baseSalary, int overtimeHours, int overtimeRate ) {
        return  baseSalary + (overtimeHours * overtimeRate);
    }
}


class Employee {
    public int  baseSalary;
    int overtimeHours;
    int overtimeRate;

    public Employee(int baseSalary, int overtimeHours, int overtimeRate) {
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    /**
     * pagal rekomendacjas kiek f tu
     * @return
     */
    public int getWage() {
        return  baseSalary + (overtimeHours * overtimeRate);
    }
}