package Home007.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();
    private Collection<String> jobVacancies = new ArrayList<>();

    public void sendOffer(String companyName, int salary){
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary);
        }
    }

    public void sendVacancy(String companyName, String vacancyDescription){
        for (Observer observer : observers) {
            observer.receiveVacancy(companyName, vacancyDescription);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
