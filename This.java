import java.io.*;
import java.util.*;

class Show{
    int x;
    Show(){
        this(1000);
        System.out.println("default constuctor");
        System.out.println("x :" + x);
    }

    void get(int x){
        System.out.println("instance variable before this assigned:" + this.x);
        System.out.println("local variable :" + x);

        this.x = x;     //assiging value to instance variable

        System.out.println("instance variable after this assigned:" + this.x);
        System.out.println("local variable :" + x);
    }
    Show(int x){
        this.x = x;
    }
}

class This{
    public static void main(String[] args) {
        Show s = new Show();
        s.get(100);
    }
}