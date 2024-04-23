import javax.print.attribute.SetOfIntegerSyntax;

public class variables {
    public static void main(String[] args) {
        // variables
        //Java is a Typed Language. We have to specify/Type what type of  
        // Datatype we're writing
        //Dataypes are of two types:
        //   >>>>    Primitive:
        // 1)byte   [1byte = 8bits]
        // 2)short   [2byte]
        // 3)char   [2bytes]
        // 4)boolean    [1byte]
        // 5)int    [4byte]
        // 6)long    [8 byte]
        // 7)float   [4 byte]
        // 8)double   [8 byte]



        // >>>> Non-Primitive:
        // String
        // List
        // Class
        // object
        // interface


// practice of Primitive dataypes:

       int a = 10;
       int b = 25;
       int sum  = a+b;
       int diff = a-b;
       int mul = a*b;
       System.out.println(sum);    //>>>35
       System.out.println(diff);    //-15
       System.out.println(mul);      //250




    // quiz: to calculate: x*y/x-y; x=10 y=5
    //NOTE: "*" > "/" > "%" > "+" > "-"    left ---> right

    int x = 10;
    int y = 5;
    int ans = (x*y) / (x-y);
    System.out.println(ans);   //10
    }
}
  