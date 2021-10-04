package HomeWork5;

public class Person {

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private int salary;
    private int year;

    public Person(String name,
                  String secondName,
                  String surname,
                  String phone,
                  String position,
                  int salary,
                  int year) {

        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.year = year;
    }
    String getName() {
        return name;
    }
    String getSecondName() {
        return secondName;
    }
    String getSurname() {
        return surname;
    }
    String getPhone() {
        return phone;
    }
    String getPosition() {
        return position;
    }
    int getSalary() {
        return salary;
    }
    int getYear() {
        return year;
    }
    String getFullInfo() {
        return this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.position + ". Phone number: " +
                this.phone + ". Salary is " +
                this.getSalary() + " RU. " +
        this.getYear() +" years old. ";
    }



}
