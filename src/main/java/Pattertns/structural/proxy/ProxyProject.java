package Pattertns.structural.proxy;

public class ProxyProject implements Download{
    private String url;
    private DownLoadFile file;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void download() {
        if (file == null){
            file = new DownLoadFile(url);
        }
        file.runDownload();
    }
}
