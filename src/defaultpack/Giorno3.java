package defaultpack;
import week1_day3.Class1;
import week1_day3.animals.Dog;
import giorno3.epicode.util.MyArray;

public class Giorno3 {
     public static void main(String[] args) {
        MyArray arr = new MyArray(new int[] {2, 3, 4, 5});
        arr.push(6);
        arr.consoleLog();
        arr.pop();
        arr.consoleLog();
        arr.unShift(44);
        arr.consoleLog();
    }


}
