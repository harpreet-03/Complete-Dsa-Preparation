



public class param1 {
    public static int summ(int x, int y){     // formal parameters
        int sum= x+y;                         // in definition
        return sum;
    }
    public static void main(String[] args) {    // argurmnts or actual parameters
        int x = 1;                               //used during calling
        int y = 2;
        int sum = summ(x,y);
        System.out.println(sum);
    }
}
