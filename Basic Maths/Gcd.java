 public class Gcd {
    public static int calGCd(int a , int b){
        if (b==0) return a;
        while(b!= 0){
           int temp = b;
           b = a%b;
           a= temp; 
        }
        return a;
    }
    public static void main(String[] args) {
       System.out.println(calGCd(24, 36)); 
    }
}
