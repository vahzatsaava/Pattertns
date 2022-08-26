package Pattertns.structural.proxy;

public class DownLoadFile implements Download{
    private String url;

    public DownLoadFile(String url) {
        this.url = url;
        runDownload();
    }
    public void runDownload(){
        System.out.println("Start of Download " + url);
    }

    @Override
    public void download() {
        System.out.println("Running download " + url );
    }
}
