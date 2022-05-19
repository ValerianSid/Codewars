public class Main {
    // Найти количество пар чисел
    static int [] numbers = {1000, 1000};
    static int [] indexNumberDublicat = new int[numbers.length];

    public static void main(String[] args) {
        int indexDublicat = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (!repeat(i)) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        indexNumberDublicat[indexDublicat] = i;
                        indexNumberDublicat[indexDublicat + 1] = j;
                        indexDublicat = indexDublicat + 2;
                        count = count + 1;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
    static boolean repeat(int a){
        for (int i = 0; i < indexNumberDublicat.length && a != 0; i++){
            if ( a == indexNumberDublicat[i]){
                return true;
            }
        }
        return false;
    }
}