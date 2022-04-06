class A{
    A(){
        System.out.println("Grand parent class acessed using super keyword !");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("parent class acessed using super keyword !");
    }
}

class C extends B{
    C(){
        super();
        System.out.println("child class !");
    }
}

class Super{
    public static void main(String[] args) {
        C ob = new C();
    }
}