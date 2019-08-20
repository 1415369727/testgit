package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sun.text.resources.cldr.uz.FormatData_uz_Latn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main{


        class innner {
            int a=10;
             void fun(){
                 System.out.println("哈哈哈");
            }
        }
        static void fun1(){
           Main m=new Main();
          innner in= m.new innner();
            System.out.println(in.a);
            in.fun();
        }



    public static void main(String[] args) {
            fun1();
       /* Optional<String> op=Optional.of("bam");
        System.out.println( op.isPresent());
        System.out.println(  op.get());
        System.out.println(  op.orElse("fallback"));
        op.ifPresent((s)-> System.out.println(s.charAt(0)));*/
       /* List<String> names= Arrays.asList("peter","name","mike","xuekjs");
        names.sort((a,b)->a.compareTo(b));
        for (String aa:names
             ) {
            System.out.println(aa);
        }*/

    }
}
