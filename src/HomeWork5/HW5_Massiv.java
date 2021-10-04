package HomeWork5;

public class HW5_Massiv {

    public static void main(String[] args) {



        Person[] office = {
                new Person("Александр", "Александровч",
                        "АЛександров", "89210001002",
                        "PM", 80000, 25),
                new Person("Андрей", "Андреевич",
                        "Андреев", "89210000011",
                        "Fin", 70220, 55),
                new Person("Иван", "Иванович",
                        "Иванов", "89215553322",
                        "Fin", 45000, 39),
                new Person("Филипп", "Филиппович",
                        "Филиппов", "89214445566",
                        "Стажер", 20000, 22),
                new Person("Валерия", "Валерьевна",
                        "Валерьева", "89217778899",
                        "engineer", 60000, 41)
        };
        getAllPersonsInOffice(office);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        getOldPerson(office, 40);

    }

    private static void getOldPerson(Person[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getYear() > year) {
                System.out.println(office[i].getFullInfo());
            }
    }


    private static void getAllPersonsInOffice(Person[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }
}
