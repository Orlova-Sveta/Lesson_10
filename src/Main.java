import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Wildcard - это особая конструкция, которая позволяет изменить логику Generics
        // и сделать их не только инвариантными,
        // но и ковариантными и контравариантными.
        // Для этого используется конструкция ? extends или ? super
        List<Integer> i = Arrays.asList(1,2,3,4);
        List<? extends Number> n = i; // как реализация ковариантности

        List<Number> n2 = new ArrayList<>();
        List<? super Integer> i2  = i; // как реализация контравариантными


        /**
         * The Get and Put Principle или PECS (Producer Extends Consumer Super)
         * Это означает, что ценой удобства Generics мы платим ограничением
         * на вставку или добавление элементов
         *
         * extends - данный модификатор для дженерика означит,
         * что данный тип являетcя producer.
         * Данный элемент продюсирует свои данные (предоставляет) но не изменяет или добавляет их
         *
         * super - данный модификатор создаёт Consumer, который является неким читателем.
         * Он получает данные, но не отдаёт их
         */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(13);
        integerList.add(18);

        System.out.println(integerList.get(2));

        List<? extends Number> numbers = Arrays.asList(3,5,6,8,4);
        System.out.println(numbers.get(3));
        numbers.add(3); // Пример типичной ошибки с Producer.
        // Он может говорить о своих данных, но новые не получает


    }



    public static void test(Cat cat) {
        if (cat instanceof Cat) {
            cat.test1();
        } else {
            System.out.println("Нас взломали");
        }
    }

}
