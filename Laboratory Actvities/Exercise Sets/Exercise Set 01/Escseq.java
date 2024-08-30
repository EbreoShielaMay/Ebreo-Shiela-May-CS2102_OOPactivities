public class Escseq {
    public static void main (String[] args){
        int mcount = 5;

        for (int i = 1; i <= mcount; i++){
            int multiples = i*7;

            if (i%2 == 0){
                System.out.println("\t" + multiples);
            } else {
                System.out.println(multiples);
            }
        }
    }
}
