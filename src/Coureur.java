// Work With java.lang.Thread

public class Coureur extends Thread{

    String name;
    Coureur (String string) {
        name = string;
    }

    public void run(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i * 100 + " meter by\t" + name);
            try {
                sleep((int)(Math.random()* 1000));
            }catch (InterruptedException e){}
        }
        System.out.println(name + " Arrive!\t");
    }
}
class CoureurTest {
    public static void main(String [] args) {
        System.out.println("Pass To : ");

        Coureur hama = new Coureur("hama");
        Coureur anis = new Coureur("anis");

        hama.start();
        anis.start();
    }
}

