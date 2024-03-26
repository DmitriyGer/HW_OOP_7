package Home007.observer;

public class Specialist implements Observer {

    private String name;

    private int expectedSalary;

    public Specialist(String name, int expectedSalary) {
        this.name = name;
        this.expectedSalary = expectedSalary;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        
        if (expectedSalary <= salary) {
            System.out.printf("%s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, companyName, salary);
            expectedSalary = salary;
        } else {
            System.out.printf("%s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, companyName, salary);
        }
    }

    @Override
    public void receiveVacancy(String companyName, String vacancyDescription) {
        System.out.printf("%s: Я ознакомлен со вакансией \"%s\" от компании %s\n",
                name, vacancyDescription, companyName);
    }
}
