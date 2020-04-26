package edu.up.cs301threadslab;
import java.util.Random;

public class starThread extends Thread {
    StarAnimation star;
    public starThread(StarAnimation s) {
        star= s;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0; i<100; i--){
            try{
                Thread.sleep(40);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            int rand= new Random().nextInt(2);
            if(rand ==1){
                star.addStar();
            }else{
                star.removeStar();
            }
        }
    }
}
