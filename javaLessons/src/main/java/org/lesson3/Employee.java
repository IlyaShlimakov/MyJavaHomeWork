package org.lesson3;


public class Employee {

    String fio;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    Employee(String fio, String position, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void employeeInfo() {
        System.out.printf("ФИО: %s\tДолжность: %s\t Email:%s\t Номер телефона: %s\t Зарплата: %d\t Возраста: %d\n", fio, position, email, phoneNumber, salary, age);
    }


    public static void main(String[] args) {


        Employee[] arrayEmployee = new Employee[5];

        arrayEmployee[0] = new Employee("Петров Антон Антоныч", "Бухгалтер", "test1@test.ru", "+3751111111", 100, 53);
        arrayEmployee[1] = new Employee("Антонов Петр Петрович", "Сторитель", "test2@test.ru", "+3752222222", 100, 41);
        arrayEmployee[2] = new Employee("Сидоров Иван Иваныч", "Укладчик", "test3@test.ru", "+3753333333", 100, 10);
        arrayEmployee[3] = new Employee("Федоров Иван Денисович", "Оператор", "test4@test.ru", "+3754444444", 100, 42);
        arrayEmployee[4] = new Employee("Ходюков Роман Анатольевич", "Водитель", "test5@test.ru", "+3755555555", 100, 50);

        for (Employee employee : arrayEmployee) {
            if (employee.age > 40) {

                employee.employeeInfo();
            }
        }
    }
}
