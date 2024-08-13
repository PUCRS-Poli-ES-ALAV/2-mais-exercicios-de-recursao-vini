import java.util.ArrayList;

public class App{
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(2);
            add(4);
            add(6);
        }};
        int x = findBiggest(list);
        System.out.print(x);
    }
    
    public static int sum(int n){
        if(n == 0) return 0;
        if(n < 0) return -1;
        return n + sum(n - 1);
    }

    public static int nfibo(int n){
        if(n == 1 || n == 2) return 1;
        if(n < 1) return -1;
        return nfibo(n - 1) + nfibo(n - 2);
    }

    public static int sum_between(int a, int b){
        if(a < b) return b + sum_between(a, b - 1);
        if(a > b) return a + sum_between(a - 1, b);
        return a;
    }

    //deu errado
    public static boolean isPal(String s){
        if(s.length() == 1) return true;
        if(s.length() == 2 && s.charAt(0) == s.charAt(1)) return true;
        if(s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPal(s.substring(0, s.length() - 1));
    }

    public static String convBase2(int n){
        if(n == 0) return "0";
        if(n == 1) return "1";
        if(n < 0) return "erro";
        return convBase2(n / 2) + (n % 2);

    }

    public static int summy(ArrayList<Integer> arr){
        if(arr.size() == 0) return 0;
        return arr.remove(0) + summy(arr);
    }

    public static int findBiggest(ArrayList<Integer> ar) {
        if(ar.size() == 1) return ar.get(0);
        if(ar.get(0) >= ar.get(1)){
            ar.remove(1);
            return findBiggest(ar);
        }
        if(ar.get(0) <= ar.get(1)){
            ar.remove(0);
            return findBiggest(ar);
        }
        return -1;
    }
}
