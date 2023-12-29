public class Counter implements Runnable{
    String name;
    int n;

    public Counter (String string, int n) {
        name = string;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i <= n; i++) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            }catch (InterruptedException exception) {}
        }
        System.out.println(name + "Finished At" + n);
    }
}
class TestCounter {
    public static void main(String [] args) {

        Counter counter1 = new Counter("Counter1", 5);
        Thread c1 = new Thread(counter1);

        Counter counter2 = new Counter("Counter2", 5);
        Thread c2 = new Thread(counter2);

        c1.start();
        c2.start();
    }
}


//public class Counter extends Thread{
//
//    String name;
//    int n;
//
//    public Counter (String string, int n) {
//        name = string;
//        this.n = n;
//    }
//
//    public void run(){
//        for (int i = 1; i <= n; i++) {
//            System.out.println(name + " : " + i);
//            try {
//                sleep((int)(Math.random() * 1000));
//            } catch (InterruptedException e) {}
//        }
//        System.out.println(name + "\tFinished At " + n);
//    }
//}
//
//class CountTest {
//    public static void main(String [] args) {
//        Counter counter1 = new Counter("Counter1",3);
//        Counter counter2 = new Counter("Counter2", 5);
//
//        counter1.start();
//        counter2.start();
//    }
//}
