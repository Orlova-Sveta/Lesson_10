public class Cat<T> extends Animal {
    T info;
    public void test1() {
        System.out.println("Это я, кошечка");
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
