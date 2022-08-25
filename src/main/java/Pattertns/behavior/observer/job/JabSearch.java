package Pattertns.behavior.observer.job;

public class JabSearch {
    public static void main(String[] args) {
        JavaDeveloperJob javaDeveloperJob = new JavaDeveloperJob();
        javaDeveloperJob.addVacancies("First javaPos");
        javaDeveloperJob.addVacancies("Second javaPos");
        javaDeveloperJob.addVacancies("Third javaPos");


        Observer firstSubscriber = new Subscriber("Peter");
        Observer secondSubscriber = new Subscriber("Oleg");
        javaDeveloperJob.addObserver(firstSubscriber);
        javaDeveloperJob.addObserver(secondSubscriber);

        javaDeveloperJob.addVacancies("Four vacancies");
        javaDeveloperJob.removeVacancies("First javaPos");


    }
}
