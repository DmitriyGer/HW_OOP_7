package Home007.observer;

public class Master implements Observer{

    private String name;
    private int salary;

    public Master(String name){
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveVacancy(String companyName, String vacancyDescription) {
        System.out.printf("Специалист %s: Новая вакансия от компании %s (%s)\n", name, companyName, vacancyDescription);
    }
}
