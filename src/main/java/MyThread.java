public class MyThread extends Thread {
    private int delay;
    ThreadGroup mainGroup;

    public MyThread(ThreadGroup mainGroup, int delay) {
        this.delay = delay;
        this.mainGroup = mainGroup;


    }

    @Override
    public void run() {


        try {

            while (!isInterrupted()) {
                Thread.sleep(delay);
                System.out.println("Всем привет! " + Thread.currentThread().getName() + " стартовал");
                Thread.sleep(delay);
                System.out.println("Всем привет! " + Thread.currentThread().getName() + " работает");
                Thread.sleep(delay);
                System.out.println("Всем пока! " + Thread.currentThread().getName() + " завершает работу");
                break;

            }
        } catch (InterruptedException err) {
            err.printStackTrace(System.out);

        } finally {

            System.out.printf("%s завершил работу\n", getName());


        }
        System.out.println("Закрываю потоки....");
    }

}

