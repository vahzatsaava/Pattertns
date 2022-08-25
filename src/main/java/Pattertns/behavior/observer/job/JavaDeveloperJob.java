package Pattertns.behavior.observer.job;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJob implements Observed {
    private List<String> vacancies = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addVacancies(String vacancies) {
        this.vacancies.add(vacancies);
        notifyObserver();
    }

    public void removeVacancies(String vacancies) {
        this.vacancies.remove(vacancies);
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.vacancies);
        }
    }
}
