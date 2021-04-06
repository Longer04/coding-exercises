package coding.questions.dailybyte;

public class P001_ReverseString {

    public void reverseString(final String data){
        int length = data.length();
        char[] reversed = new char[length];
        for(int i = 0; i < length; i++){
            reversed[i] = data.charAt(length - i - 1);
        }
        System.out.println(new String(reversed));
    }
}
