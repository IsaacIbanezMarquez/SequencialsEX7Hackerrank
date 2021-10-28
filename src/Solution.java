
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

/*  Al terrat de l'institut han instal·lat una antena WAN que dóna cobertura a tot el barri de Poblenou. Donada l'àrea total d'emissió d'aquesta antena (en forma de cercle), calcula a quants metres de l'institut pots estar per rebre senyal d'aquesta antena. Pista( àrea d'un cercle)

Input Format

S'entra un nombre decimal A amb l'àrea circular total de cobertura de l'antena (en m2)

Constraints

Considerem que el nombre d'entrada no pot ser negatiu.

Output Format

d: és un nombre enter que indica fins a on arriba la cobertura de l'antena respecte a l'institut.(m) Arrodoniu el resultat a l'enter més proper (Math.round())

Sample Input 0

500.0
Sample Output 0

13
Sample Input 1

125663.68
Sample Output 1

200

 */




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double area = sc.nextDouble();
        double radio = Math.sqrt(area/Math.PI);
        double resultado = Math.round(radio);

        System.out.println(Math.round(resultado));

    }

}
