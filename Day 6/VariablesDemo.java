package Day6;

public class VariablesDemo {
    int instanceValue = 10;
    static int staticValue = 20;

    public static void main(String[] args) {
        VariablesDemo demo = new VariablesDemo();
        demo.showValues();
    }

    void showValues() {
        int localValue = 30;
        System.out.println("Instance variable: " + instanceValue);
        System.out.println("Static variable: " + staticValue);
        System.out.println("Local variable: " + localValue);
    }
}
