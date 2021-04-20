import java.util.Arrays;
public class AsciiCharSequence implements CharSequence {
    //byte[] arr = new byte[127];
    private byte[] arr;
    //byte[] arr1 = arr;
    public static void main(String[] args) {
        //byte[] arr = new byte[127];
    }
    public AsciiCharSequence(byte[] arr){
        this.arr = arr.clone();
    }
    @Override
    public int lenght() {

        return arr.length;
    }
    @Override
    public char charAt(int index) {
        return (char) arr[index];
    }
    @Override
    public AsciiCharSequence subSequence(int start, int end){  //Переопределение subSequence()
        return new AsciiCharSequence(Arrays.copyOfRange(arr, start, end));
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(arr.length);
        for(int i = 0; i < arr.length; i++ ){
            result.append((char)arr[i]);
        }
        return result.toString();
    }

}
