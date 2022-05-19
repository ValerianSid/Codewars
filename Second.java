public class Second {

    public static void main(String[] args) {
       int a = 1;
       int b = 9;
       int z = b;
       int count = 0;
       int[] newarr = new int [b - a + 1];
       for (int i = 0; i <= b - a; i ++){
           newarr[i] = z;
           z = z - 1;
       }
       for (int j = 0; j < newarr.length; j++){
           System.out.println(newarr[j]);
       }
    }
}
