package giorno3.epicode.util;


import java.util.Arrays;

public class MyArray {
    public int[] arr;

    public MyArray(int[] _arr) {
        this.arr = _arr;
    }
    public void consoleLog () {
        System.out.println(Arrays.toString(this.arr));
    }
    public int push(int el) {
        int[] newArr = new int[this.arr.length + 1];
        for(int i = 0; i < newArr.length; i++) {
            if(i < newArr.length -1) {
                newArr[i] = this.arr[i];
            } else {
                newArr[i] = el;
            }
        }
        this.arr = newArr;
        return el;
    }

    public int pop() {
        int[] newArr = new int[ this.arr.length -1 ];

        for(int i = 0; i < newArr.length; i++) {
                newArr[i] = this.arr[i];
        }
        this.arr = newArr;
        return this.arr[ this.arr.length - 1 ];
    }

    public int unShift(int el) {
        int[] newArr = new int[ this.arr.length + 1 ];

        for(int i = 0; i < newArr.length; i++) {
            if (i < 1) {
                newArr[i] = el;
            } else {
                newArr[i] = this.arr[i - 1];
            }

        }
        this.arr = newArr;
        return el;
    }
}
