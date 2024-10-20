package org.example;

public class Main {
    public static void main(String[] args) {
       MyGenericsClass g = new MyGenericsClass();
       g.setMyVar(6);
       g.printValue();
    }

}
class MyGenericsClass<T> {
    private T myVar;
    void setMyVar(T i) {
        myVar = i;
    }
    void printValue(){

        System.out.println("The value of myVar is " + myVar);
    }
}