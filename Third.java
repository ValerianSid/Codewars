public class Third {
    // Два варианта

    public static void main(String[] args) {
       int x = 30;
       int y = 12;
       int divisor = 1;
       /*for (int i = 1; i <= x && i <= y; i++){
           if (x % i == 0 && y % i == 0) {
               divisor = i;
           }
       } */
        while (y != 0){
            int replace = x % y;
            x = y;
            y = replace;
        }
        divisor = x;
        System.out.println(divisor);
    }
}
