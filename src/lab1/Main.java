package lab1;

public class Main {
    private static int semester = 2;
    private int instanceVar =3;
    public static void main(String[] args){
        int var = 2020;
        System.out.println("Atelierul Digital " + var);
        int a = 5;
        var = a>2?(a<4? 10 : 8) : 7;
        System.out.println("var= " + var);

        ControlFlow cf = new ControlFlow();
        System.out.println("result= " + cf.addManyTimes());

        int nr=6;
        cf.Autobox(nr);
    }
}
