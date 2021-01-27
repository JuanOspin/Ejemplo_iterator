import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        //Leer números que se clasificaran
        Scanner br =new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int x = br.nextInt();
        System.out.println("Ingrese un número:");
        int y = br.nextInt();
        System.out.println("Ingrese un número:");
        int z = br.nextInt();
        System.out.println("Ingrese un número:");
        int w = br.nextInt();
        //Guardar números en arrays
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(x);
        numbers.add(y);
        numbers.add(z);
        numbers.add(w);
        //Usar el iterator para leer los números
        Iterator<Integer> it = numbers.iterator();
        //borrar numero mayores a 10
        while(it.hasNext()) {
            Integer i = it.next();
            if(i >= 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
