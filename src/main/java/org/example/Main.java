package org.example;

//Simple Calculator (Integer Operations) for Continuous Integration Demonstration
public class Main {
    public static void main(String[] args) {

        System.out.println("Hi welcome to calculator");

        }


        public int Add(int param1,int param2)
        {
           return (param1+param2);
        }

        public int Substract(int param1,int param2)
        {
            return (param1-param2);
        }

        public int Multiply(int param1,int param2)
        {
            return (param1* param2);
        }

        public int Divide(int param1,int param2)
        {
            return (param1/param2);
        }
        public int modulus(int a,int b){return a % b;}

    public int squareroot(int a){return (int) Math.sqrt(a);}
    public int absoluteValue(int a){return (int) Math.abs(a);}

    public int maxValue(int a,int b){return Math.max(a,b);}
    public int minValue(int a,int b){return Math.min(a,b);}

    public int  rountvalue(float a){return (int) Math.round(a);}
    }


