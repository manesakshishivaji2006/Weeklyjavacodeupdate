class StaticDemo {

    static int count;

    // Static Block
    static {
        count = 0;
        System.out.println("Static Block Executed");
    }

    StaticDemo() {
        count++;
    }

    // Static Method
    static void showCount() {
        System.out.println("Number of Objects Created: " + count);
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        StaticDemo.showCount();
    }
}