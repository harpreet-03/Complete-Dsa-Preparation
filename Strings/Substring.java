import java.util.*;
public class Substring {

    public static String subString(String s, int si, int ei){
        String substr="";
        for(int i=si; i<ei; i++){
            substr += s.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String s = "Helloworld";
        System.out.println(subString(s, 0, 5));//Hello


        //in built function to find substring
        System.out.println(s.substring(0, 5)); //hello
    }
}
