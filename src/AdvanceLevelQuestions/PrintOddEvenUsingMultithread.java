package AdvanceLevelQuestions;

public class PrintOddEvenUsingMultithread {
    public static void main(String[] args) {
        SharedPrinter sharedPrinter=new SharedPrinter();
        int max=10;
        Thread t1=new Thread(new EvenThread(sharedPrinter,max));
        Thread t2=new Thread(new OddThread(sharedPrinter,max));

        t1.start();
        t2.start();
    }
}

class SharedPrinter extends Thread{
    private boolean isOdd=true;
    public synchronized void printOdd(int number){
        while (!isOdd){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Odd: "+number);
        isOdd=false;
        notify();
    }

    public synchronized void printEven(int number){
        while(isOdd){
            try{
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Even: "+number);
        isOdd=true;
        notify();
    }
}

class OddThread implements Runnable{
    private SharedPrinter sharedPrinter;
    int max;

    public OddThread(SharedPrinter sharedPrinter,int max){
        this.sharedPrinter=sharedPrinter;
        this.max=max;
    }

    @Override
    public void run() {
        for(int i=1;i<=max;i+=2){
            sharedPrinter.printOdd(i);
        }
    }
}

class EvenThread implements Runnable{
    private SharedPrinter sharedPrinter;
    int max;

    public EvenThread(SharedPrinter sharedPrinter,int max){
        this.sharedPrinter=sharedPrinter;
        this.max=max;
    }

    @Override
    public void run() {
        for(int i=2;i<=max;i+=2){
            sharedPrinter.printEven(i);
        }
    }
}