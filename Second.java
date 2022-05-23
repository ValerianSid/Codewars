public class Second {

    public static void main(String[] args) {
       int a = 4;
       int b = 17;
       int count = 0;
       for (int i = b; i >= a; i--){
           if(!Integer.toString(i).contains("5")){
               count = count + 1;
           }
       }
        System.out.println(count);
    }
}
