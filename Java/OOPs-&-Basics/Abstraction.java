abstract public class Abstraction {
    public void calc(){
        System.out.println("Calculating");
    }
    abstract public void end();
}

public class Child extends Abstraction{
    public void end(){
        System.out.println("ending");
    }

}

public class start{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.calc();
        c1.end();
    }
}

