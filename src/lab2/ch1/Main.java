package lab2.ch1;

public class Main {
    public static void main(String[] args){
        Fighter f1 = new Fighter(10, 100, "Dark Fighter");
        Fighter f2 = new Fighter(12, 105, "Angel Fighter");
        Fighter f3 = new Fighter(10, 100, "Dark Fighter");

        if(f1.equals(f3)){
                System.out.println("f1=f3");
        }else {
            System.out.println("f1!=f3");
        }

        BoxingMatch bm = new BoxingMatch(f1,f2);
        System.out.println("f1 vs f2 = " + bm.fight());

    }
}
