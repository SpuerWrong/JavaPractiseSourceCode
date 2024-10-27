package Thread;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.net.URL;
import java.io.File;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className Download
 * @package Thread
 * @description 下载器,练习Thread，实现多线程同步下载图片
 */
//线程类
public class Download extends Thread {

    private String url; //网络图片地址
    private String name;//保存的文件名

    public Download(String url, String name) {
        this.url = url;
        this.name = name;
    }
//下载图片线程的执行体。
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为："+name);
    }

    public static void main(String[] args) {
        Download download1 = new Download("https://zaizai123.cn/wp-content/uploads/2024/09/image-69.png","图片1");
        Download download2 = new Download("https://zaizai123.cn/wp-content/uploads/2024/09/image-68.png","图片2");
        Download download3 = new Download("https://zaizai123.cn/wp-content/uploads/2024/09/xnview.jpg","图片3");
        download1.start();
        download2.start();
        download3.start();

    }
}
    //下载器
    class WebDownloader {
    //下载方法
        public void downloader(String url, String name) {
            try {
                FileUtils.copyURLToFile(new URL(url), new File(name));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IO异常，downloader方法出现问题");
            }
        }
    }

