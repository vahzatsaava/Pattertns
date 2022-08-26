package Pattertns.behavior.observer.example;

public class NewsRunner {
    public static void main(String[] args) {
        NewsPaper paper = new NewsPaper();
        paper.addNewsInPaper("BBC");
        paper.addNewsInPaper("CNN");
        Customer customer1 = new Customer("Peter");
        Customer customer = new Customer("Stefan");
        paper.addNews(customer);
        paper.addNews(customer1);
        paper.addNewsInPaper("mmm");
    }
}
