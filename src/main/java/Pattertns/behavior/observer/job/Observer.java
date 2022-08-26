package Pattertns.behavior.observer.job;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
