import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(20);
        pq.add(40);
        pq.add(33);
        pq.add(57);
        pq.add(10);
        pq.add(67);
        System.out.println(pq.peek());
        pq.remove();
        //Output->10

        System.out.println(pq.peek());
        pq.remove();
        //Output->20
        



    }

}