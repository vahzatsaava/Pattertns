package Pattertns.behavior.observer.example;

public interface NewsBox {
    void addNews(News news);
    void removeNews(News news);
    void notifyNews();
}
