package lang.print.gaps.task5;

public class NumberDivider {
   void divide(int toBeDivided) {
       float a = (toBeDivided / 5f);
       System.out.println(a);
    }

    public static void main(String [] args){
        NumberDivider n = new NumberDivider();
        n.divide(19);
    }

    //Create a program that will perform simple division of numbers,
    // you will be given a number and your task will be
    // to create a program that divides a number by 5 and print correct result:
    //where toBeDivided - variable to be divided.
}
