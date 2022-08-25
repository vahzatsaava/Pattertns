package Pattertns.structural.proxy;

public class RunProxy {
    public static void main(String[] args) {
        Download download = new ProxyProject("www.javarush.ru");
        download.download();
    }
}
