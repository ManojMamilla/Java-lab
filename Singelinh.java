class A{
    void show(){
        System.out.println("Parent class method acessed using child class object...");
    }
}

class B extends A{
    void display(){
        System.out.println("Child class method...");
    }
}

class Singelinh {
    public static void main(String[] args) {
        B ob = new B();
        ob.display();
        ob.show();
    }
    
}