package InterviewQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue qu1=new LinkedList<>();
    static Queue qu2=new LinkedList<>();
    public static void main(String[] args) {
        pushInQueue(1);
        pushInQueue(2);
        pushInQueue(3);
        pushInQueue(4);
        System.out.println("Queue:"+qu1);
    }
    public static void pushInQueue(int num){

        if(qu1.isEmpty()){
            qu1.add(num);
        }else{
            while(!qu1.isEmpty()){
                qu2.add(qu1.poll());
            }
            qu1.add(num);
            while (!qu2.isEmpty()){
                qu1.add(qu2.poll());
            }
        }
    }
}
