public class MallRunner
{
public static void main(String args[])
{
System.out.println(" b4 post increment"+Mall.id);
Mall.id++;
System.out.println(" After post increment" +Mall.id);


System.out.println(" b4 post decrement" +Mall.id);
Mall.id--;
System.out.println(" After post decrement" +Mall.id);

}
}