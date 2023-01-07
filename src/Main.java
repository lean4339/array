import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int numeros [] =  {9,8,7,6,5,4,3,2,1,0};
        for(int i = 0; i < numeros.length; i ++){
            System.out.println(numeros[i]);
        }
        Arrays.sort(numeros);
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }



    }
}