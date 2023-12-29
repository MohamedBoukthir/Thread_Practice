// counter 1 will count 1 to 10 then counter 2 11 to 20 then counter 3 21 to 30
// when counter 1 count others will wait

public class AnotherCounterThread extends Thread{

    String name;
    int begin;
    int end;

    public AnotherCounterThread (String str, int begin, int end) {
        name = str;
        this.begin = begin;
        this.end = end;
    }

    public void run(){
        for (int i = begin; i <= end ; i++) {
            System.out.println(name + " : " + i);
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException exception){}
        }
        System.out.println(name + "\tArrive To\t" + end);
    }
}
class AnotherCounterThreadTest {
    public static void main(String [] args) {

        AnotherCounterThread counter1 = new AnotherCounterThread("Counter1",1,10);
        AnotherCounterThread counter2 = new AnotherCounterThread("Counter2",11,20);
        AnotherCounterThread counter3 = new AnotherCounterThread("Counter3",21,30);

        counter1.start();
        try {
            counter1.join();
        }catch (InterruptedException e) {}

        counter2.start();
        try {
            counter2.join();
        }catch (InterruptedException e) {}

        counter3.start();
        try {
            counter3.join();
        }catch (InterruptedException e) {}

    }
}

