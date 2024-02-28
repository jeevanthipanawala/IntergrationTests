import static java.lang.Math.*;

//Simple Calculator (Integer Operations) for Continuous Integration Demonstration
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to calculator");

        }

        /*** Add Two Integers ***/
        public int Add(int param1,int param2)
        {
           return (param1+param2);
        }

        /*** Substract Two Integers ***/
        public int Substract(int param1,int param2)
        {
            return (param1-param2);
        }

        /*** Multiply Two Integers ***/
        public int Multiply(int param1,int param2)
        {
            return (param1* param2);
        }

        /*** Divide one Integer by another Integer ***/
        public int Divide(int param1,int param2)
        {
            return (param1/param2);
        }


        /*** Get the maximum value ***/
        public int MaxValue(int param1,int param2)
        {
            return max(param1,param2);
        }

        /*** Calculate Modulus ***/
        public int Modulus(int param1,int param2)
        {

            return (param1%param2);
        }

        /*** Get the squareroot ***/
        public double Squareroot(int param1)
        {
            return sqrt(param1);
        }

        /*** Get Absolute Value ***/
        public int AbsoluteValue(int param1)
        {
            return abs(param1);
        }

        /*** Get the minimum value ***/
        public int MinValue(int param1,int param2)
        {
            return min(param1,param2);
        }

        /*** Round a float to an integer ***/
        public int RoundValue(float param1)
        {
            return round(param1);
        }
    }


