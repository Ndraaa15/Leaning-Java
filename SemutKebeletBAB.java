package HackerRank;

import java.util.*;

class bee implements Comparable<bee>{
    private String name;

    private int type;

    public bee (String name, int type){
        this.name = name;
        this.type = type;
    }

    public int compareTo(bee o){
        if (type < o.type ){
            return -1;
        } else if (type > o.type){
            return 1;
        }else {
            return 0;
        }
    }
    public String toString (){
        String result = "Name of bee is " + name + " placed in " + type;
        return result;
    }

}

public class SemutKebeletBAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int sum = sc.nextInt();
        PriorityQueue <bee> bab = new PriorityQueue<>();
        for (int i = 0; i < sum; i++) {
            String name = sc.next();
            String type = sc.next();
            int urutan = 0;
            if (type.equals("ratu")){
                urutan = 1;
            } else if (type.equals("pejantan")) {
                urutan = 2;
            } else if (type.equals("pekerja")) {
                urutan = 3;
            } else if (type.equals("preman")) {
                urutan = 4;
            }
            bab.add(new bee(name, urutan));
        }

        Iterator <bee> it = bab.iterator();
        while (it.hasNext()){
            System.out.println(bab.poll().toString());
        }

    }
}
