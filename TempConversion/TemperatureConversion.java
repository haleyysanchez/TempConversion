
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
public class TemperatureConversion
{
    private double temp;
    private double conversion1;
    private double conversion2;
    private String con1;
    private String con2;
    private String temp1;
    public TemperatureConversion(double a)
    {
        temp = a;
    }
    public void givenF()
    {
        temp1 = Double.toString(temp) + " F";
        conversion1 = ((temp - 32)*(5.0/9.0));
        con1 = Double.toString(conversion1) + " C";
        //String con1 = "" + conversion1 + " C";
        conversion2 = ((temp - 32)*(5.0/9.0)) + 273.15;
        con2 = Double.toString(conversion2) + " K";
        //String con2 = "" + conversion2 + " K";
    }
    public void givenC()
    {
        temp1 = Double.toString(temp) + " C";
        //String temp1 = "" + temp + " C";
        conversion1 = (temp * (1.8)) + 32;
        con1 = Double.toString(conversion1) + " F";
        //String con1 = "" + conversion1 + " F";
        conversion2 = temp + 273.15;
        con2 = Double.toString(conversion2) + " K";
        //String con2 = "" + conversion2 + " K";
    }
    public void givenK()
    {
        temp1 = Double.toString(temp) + " K";
        //String temp1 = "" + temp + " K";
        conversion1 = (temp - 273.15)*(1.8) + 32;
        con1 = Double.toString(conversion1) + " F";
        //String con1 = "" + conversion1 + " F";
        conversion2 = temp - 273.15;
        con2 = Double.toString(conversion2) + " C";
        //String con2 = "" + conversion2 + " C";
    }
    public String last()
    {
        //return conversion1;
        return temp1 + " = " + con1 + "\n" + "" + temp1 + " = " + con2 ;
    }
}
