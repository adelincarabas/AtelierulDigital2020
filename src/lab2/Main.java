package lab2;

public class Main {

    public static void  main(String[] args){
        Example example = new Example();

        int b = 5;
        int result = example.calculate(b);
        System.out.println("result = " + result);

        Example e = new Example();
        example.incrementA(e);
        System.out.println(e.getA());
    }
}
