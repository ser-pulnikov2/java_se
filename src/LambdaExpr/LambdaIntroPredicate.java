package LambdaExpr;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaIntroPredicate {
    public static void main(String[] args){
        class StringEmptyPredicate implements Predicate<String>{
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        }
        Predicate<String> isEmpty = new StringEmptyPredicate();
        Predicate<String> isEmpty2= new Predicate<String>(){
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };
        Predicate<String> isEmpty3= (String s) -> {return s.isEmpty();};


        List<String> names=new ArrayList<>();
        names.add("Joe");
        names.add("Jill");
        names.add("");
        //names.removeIf(isEmpty);
        names.removeIf((String s) -> {return s.isEmpty();});
        System.out.println(names);

        /*
        functional interfaces, annotation @FunctionalInterface
        interface Runnable {void run();}
        interface ActionListener { void actionPerformed(ActionEvent e);}
        interface Supplier<T> {T get();}
        interface Consumer<T> {void accept(T t);}
        interface Comparator<T> {int compare(T o1, T o2);}
         */
        /* lambda examples */
        Runnable runnable=()->{};
        ActionListener actionListener=(ActionEvent e)->{};
        Supplier<String> supplier=()->{return "";};
        Consumer<Point> consumer=(Point t)->{};
        Comparator<Rectangle> comparator=(Rectangle o1,Rectangle o2)->{return 0;};

    }
}


