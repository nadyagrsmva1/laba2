public class rec4 {
    public static int fact(int n){
        int results;
        if (n==1)
            return 1;
        else {
            results=fact(n-1)*n;
            return results;
        }
    }
    public static void  main(String[] args) {
        System.out.println(fact(4));
    }
}
