public class prime2 {

    public static boolean isprime(int n){
        // boolean isprime = true ;
        for(int i = 2; i<=n-1 ; i++){
            if(n%i ==0){
                // isprime = false;
                // break;

                //or 
                return false;
            }
        }
        // return isprime ;
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println(isprime(10));
    }
}
