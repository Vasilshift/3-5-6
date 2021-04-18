import java.util.Arrays;
public class AsciiCharSequence implements CharSequence {
    byte[] arr = new byte[127];
    public AsciiCharSequence(byte[] arr){  //Конструктор класса
        this.arr = arr;
    }
    byte [] arr1 = arr;
    //CharSequence arr2 = new byte[];
    public static void main(String[] args) {

    }
    @Override
    public int lenght() {
        return arr.length;
    }

    @Override
    public char charAt() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return (char) arr[index];
    }

    @Override
    public void subSequence() {

    }
    @Override
    public String toString() {
        return Arrays.toString(arr);
        //return arr1.toString();
    }
}
