package ru.geekbrains.lesson5;

public class Employee {
    private String Name;
    private String Second_Name;
    private String Third_Name;
    private String Position;
    private String Email;
    private String Tel_Number;
    private double Salary;
    private int Age;

    public Employee(String name, String surname, String third_Name, String position, String email, String tel_Number, double salary, int age) {
        Name = name;
        Second_Name = surname;
        Third_Name = third_Name;
        Position = position;
        Email = email;
        Tel_Number = tel_Number;
        Salary = salary;
        Age = age;
    }

    protected void Print_Data() {
        System.out.printf("Name: %s \t Second name: %s \t Third name: %s \t Position: %s \t Email: %s \t Phone: %s \t Salary: %s \t Age: %s", Name, Second_Name, Third_Name, Position, Email, Tel_Number, Salary, Age);
        System.out.println();
    }

    protected void Print_Data_by_Age(int age) {
        if(Age > age) {
            Print_Data();
        }
    }
}
