package Pattertns.behavior.observer.example;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements NewsBox {
    private List<String> news = new ArrayList<>();
    private List<News> newsList = new ArrayList<>();

    public void addNewsInPaper(String news) {
        this.news.add(news);
        notifyNews();
    }

    public void removeNewsInPaper(String news) {
        this.news.remove(news);
        notifyNews();
    }

    @Override
    public void addNews(News news) {
        this.newsList.add(news);
    }

    @Override
    public void removeNews(News news) {
        this.newsList.add(news);
    }

    @Override
    public void notifyNews() {
        for (News news : newsList){
            news.event(this.news);
        }
    }
}
