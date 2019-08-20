package sample;

import java.util.ArrayList;
import java.util.List;

public class Teataaa {

    public static void main(String[] args) {
        List list=new ArrayList();
        List<Integer> cc=new ArrayList<>();
        cc.add(3);
        for (Integer dd:cc
             ) {
            System.out.println(dd);
        }
        list.add("zhangsan");
        for (Object aa:list
             ) {
            System.out.println(aa);
        }

        fun1(18);
    }


    public static void fun1(){
        int c=10;
        System.out.println(c);
    }
    public static void fun1(int a){
        System.out.println(a);
    }

}
