/*For a  given String, convert each the first letter of each word to UPPERCASE
 for eg:
 old string = "hi i am harpreet";

 updated string = "Hi I Am Harpreet";

 */


 // we use [ .touppercase()  ]

public class ques_upp {

    public static String toUppercase(String s){
        String[] words = s.split(" "); // Split the input string into words
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) { // Check if the word is not empty
                char firstChar = Character.toUpperCase(word.charAt(0)); // Convert the first character to uppercase
                result += firstChar + word.substring(1) + " "; // Concatenate the modified word to the result
            }
        }

        return result.trim(); // Remove trailing space and return the result
    }

    public static void main(String[] args) {
        String s = "hi i am harpreet";
        String updatedString = toUppercase(s);
        System.out.println(updatedString); // Print the updated string
    }
    
}
