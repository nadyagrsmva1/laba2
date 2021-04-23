public class rec5 {
    public static int f(int n){
        System.out.println("f(" + n + ")");
        if(n==0){
            System.out.println("0");
            return 0;
        }
        if(n==1){
            System.out.println("1");
            return 1;
        }
        return f(n-2)+f(n-1);
    }
    public static void  main(String[] args) {
        System.out.println(f(8));
    }

}
