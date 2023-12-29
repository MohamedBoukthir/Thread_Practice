// Work With Runnable Interface
public class CoureurApp implements Runnable{

    String name;

    CoureurApp (String string) {
        name = string;
    }

    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i * 100 + "\tmeter by : " + name);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            }catch (InterruptedException e) {}
        }
        System.out.println(name + "\tArrive.");
    }
}
class TestCoureurApp {
    public static void main(String [] args) {
        System.out.println("Pass To\t");

        CoureurApp mohamed = new CoureurApp("mohamed");
        Thread threadMohamed = new Thread(mohamed);

        CoureurApp anis = new CoureurApp("anis");
        Thread threadAnis = new Thread(anis);

        threadMohamed.start();
        threadAnis.start();
    }
}
