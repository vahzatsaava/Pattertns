package Pattertns.structural.adapter;

public class AdapterSystemToApp extends ApplicationO implements SystemO {
    @Override
    public void start() {
        startApp();
    }

    @Override
    public void stop() {
        stopApp();
    }

    @Override
    public void pause() {
        pauseApp();
    }
}
