import java.io.*;

class Overload {
    int x;
    Overload(){
        System.out.println("constructor with out parameters");
        System.out.println("value of X :"+ this.x);
    }

    Overload(int x){
        this.x = x;
        System.out.println("constructor with one parameter");
        System.out.println("value of X :"+ this.x);
    }  
}

class Con_overloading{
    public static void main(String[] args) {
        System.out.println("----Constructor overloading----");
        Overload ob1 = new Overload();
        Overload ob2 = new Overload(10);
    }
}
