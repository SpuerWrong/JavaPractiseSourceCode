package Thread;

/**
 * @author 王丽杰
 * @date 2024/10/26
 * @className TestThread
 * @package Thread
 * @description 继承Thread类，重写run()方法，调用start开始线程
 */
public class TestThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码"+i);
        }
    }
    public static void main(String[] args){
        TestThread testThread = new TestThread();
        testThread.start();//调用start()方法开始线程
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }
}
