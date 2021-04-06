package coding.questions.dailybyte;

public class P002_ValidatePalindrome {


    // O(n) time, O(1) space
    public boolean validatePalindrome(String toValidate){
        int length = toValidate.length() -1;
        int pointer = 0;
        while(pointer < length){
            while(!Character.isLetterOrDigit(toValidate.charAt(pointer))){
                pointer++;
            }
            while(!Character.isLetterOrDigit(toValidate.charAt(length))){
                length--;
            }
            if(Character.toLowerCase(toValidate.charAt(pointer)) == Character.toLowerCase(toValidate.charAt(length))){
                pointer++;
                length--;
            }else{
                return false;
            }
        }
        return true;
    }
}
