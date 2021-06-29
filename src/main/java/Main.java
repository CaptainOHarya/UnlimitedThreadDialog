public class Main {

    public static void main(String[] args) throws Exception {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        System.out.println("Создаю потоки....");
        for (int i = 1; i < 5; i++) {
            MyThread myThread = new MyThread(mainGroup, 2500);
            myThread.setName("Поток " + i);
            if (i == 2 || i == 3 || i == 4) {
                myThread.setDaemon(true);

            }
            myThread.start();

            mainGroup.interrupt();

        }

    }

}
