import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numeriarray = {1,2,3,4,1,2,3,4};
        for(int numero : numeriarray){
            System.out.println(numero);
        }
        System.out.println();
        int[] numeriArrayNoDuplicati = rimuoviDuplicati(numeriarray);

        for(int numero : numeriArrayNoDuplicati){
            System.out.println(numero);
        }

    }
    public static int[] rimuoviDuplicati(int[] array){
        int[] result;
        HashSet<Integer> noDuplicati = new HashSet<>();
        for(int numero : array){
            noDuplicati.add(numero);
        }
        result = new int[noDuplicati.size()];

        int i = 0;
        for(int numero : noDuplicati){
            result[i] = numero;
            i++;
        }
        return result;
    }

}