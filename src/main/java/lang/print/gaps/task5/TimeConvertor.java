package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float seconds = minutes * 60;
        System.out.println(seconds);

        //Implement a program that will convert minutes to seconds and print it in console.
        // Implement program in the code snippet below:
        //where minutes - variable to be converted.
    }

    public static void main(String [] args){
        TimeConvertor t = new TimeConvertor();
        t.convert(6);
    }
}
