package HOMEWORK;

public class Mixed_operations {
    public static void main(String [] args){

        //Numerical Datatype
       byte a =-5;
       byte b = 8;
       byte c = 6;
       byte d = (byte) (a+b*c);

       short e = 55;
       short f = 9;
       short g = 9;
       short h;
        h = (short) ((e+f)% 9);


        byte i = 20;
        byte j = -3;
        byte k = 5;
        byte l = 8;
        byte m = (byte) (i+j*k/l);


        byte n = 5;
        byte o = 15;
        byte p = 3;
        byte q = 2;
        byte r = 8;
        byte s = 3;
        byte t = (byte) (n+o/p*q-r%s);






        System.out.println(d);
        System.out.println(h);
        System.out.println(m);
        System.out.println(t);


    }
}
