import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String test = "gfdg";
        Integer inn = 5;
        List<Integer> list = new ArrayList<>();

        Cat<Integer> integerCat = new Cat<>();
        integerCat.setInfo(5);
        System.out.println(integerCat.getInfo());

        Cat<String> stringCat = new Cat<>();
        stringCat.setInfo("dskhfksw");
        System.out.println(stringCat.getInfo());

        Cat<MiniCat> miniCatCat = new Cat<>();
        MiniCat miniCat = new MiniCat();

        miniCatCat.setInfo(miniCat);
        miniCatCat.getInfo().test1();

    }


    public static <E extends TestInf> Integer getValue(E value) {
        System.out.println(value);
        return value.test();
    }



    public static void test(Cat cat) {
        if (cat instanceof Cat) {
            cat.test1();
        } else {
            System.out.println("Нас взломали");
        }
    }

}
