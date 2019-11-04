
/**
 * Given the temperature in either F, C or K, and then
 * convert that one temperature to the other two units using 
 * a conversion formula. Then the results are displayed 
 * in an organized manner.
 *
 * @author Haley Sanchez
 * @version 11/11/18
 * @period 1
 */
import java.util.Scanner;
public class TemperatureConversionTester
{
   public static void main (String [] args)
   {
      System.out.print("Enter temperature in F ");
      Scanner in = new Scanner(System.in);
      double a = in.nextDouble();
      TemperatureConversion h = new TemperatureConversion(a);
      h.givenF();
      System.out.println(h.last());
      System.out.print("Enter temperature in C ");
      double b = in.nextDouble();
      TemperatureConversion ha = new TemperatureConversion(b);
      ha.givenC();
      System.out.println(ha.last());
      System.out.print("Enter temperature in K ");
      double c = in.nextDouble();
      TemperatureConversion hal = new TemperatureConversion(c);
      hal.givenK();
      System.out.println(hal.last());
 }
}
