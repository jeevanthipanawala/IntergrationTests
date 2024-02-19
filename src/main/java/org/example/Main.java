package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hi welcome to calculator");

        }
        public int add(int a ,int b){return a+b;}
    public int sub(int a,int b){return a-b;}
    public int multi(int a,int b){return a*b;}
    public int division(int a,int b){return a/b;}

    public int modulus(int a,int b){return a % b;}

    public int squareroot(int a){return (int) Math.sqrt(a);}
    public int absoluteValue(int a){return (int) Math.abs(a);}

    public int maxValue(int a,int b){return Math.max(a,b);}
    public int minValue(int a,int b){return Math.min(a,b);}

    public int  rountvalue(float a){return (int) Math.round(a);}

    //Logarithm - Jeevanthi
    public  float Logarithm(float a)
    {
        return (float) Math.log(a);
    }





    }


