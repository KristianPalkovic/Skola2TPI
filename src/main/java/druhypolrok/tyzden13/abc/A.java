package druhypolrok.tyzden13.abc;

public class A{
    private String a ="A";

    public void testA(){
        System.out.println("A trieda");

    }
}

class B{
    public String getB(){
        return b;
    }
    private String b = "B";

    private void testB(){
        System.out.println("B trieda");
    }
}

class C{

    void testC(){
        A a1 = new A();
        // String zobrazA = a1.a; nefunguje lebo a je private
        a1.testA();

        B b1 = new B();
        String zobrazB =b1.getB();
        // b1.testB; nefunguje lebo b je private
    }
}