package edu.up.cs301threadslab;

public class animationThread extends Thread {
    AnimationView view;
    public animationThread(AnimationView v) {
        view= v;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0; i<100; i--){
            view.postInvalidate();
            try{
                Thread.sleep(3);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            }
        }
    }


