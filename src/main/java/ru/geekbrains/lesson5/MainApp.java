package ru.geekbrains.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "Ivanov", "Ivanovich", "Engineer", "Ivanovich75@gmail.com", "3-300-30-30", 150000, 46);
        employees[1] = new Employee("Abay", "Abiev", "Abayuly", "Manager", "Abay90@gmail.com", "2-200-10-30", 120000, 31);
        employees[2] = new Employee("Alexandr", "Alexandrov", "Alexandrovich", "Accountant", "Alex85@gmail.com", "2-100-34-33", 180000, 36);
        employees[3] = new Employee("Lucas", "Lutic", "Ludovic", "Programmer", "Ludovic91@gmail.com", "3-200-00-01", 190000, 30);
        employees[4] = new Employee("Olaf", "Ozhealiyasim", "Farbadiduh", "Content Creator", "Olalaf95@gmail.com", "3-150-10-10", 120000, 26);

        employees[4].Print_Data();

        int age = 40;
        for (int i = 0; i < employees.length; i++) {
            employees[i].Print_Data_by_Age(age);
        }
    }
}
