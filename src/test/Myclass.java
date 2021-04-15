package test;

public class Myclass {
    public boolean generateTrue(){
        return true;
    }
    public boolean generateFalse(){
        return false;
    }
    public int add(int a, int b) {return a+b;}
    public int negative(int input){
        return -(input);
    }
    public int inc(int input){
        int incValue = input;
        for(int i = 1; i<10000; i++){
            incValue = incValue + input;
            System.out.println(incValue);
        }
        return incValue;
    }
    }
