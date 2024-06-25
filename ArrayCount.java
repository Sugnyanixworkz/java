public class ArrayCount
{
public  static void main(String args[])
{
int countNo[]={10,21,31,45,56,67,76,86,92,120};
int evenCount =0;
int oddCount =0;
System.out.println("Count of even and odd count");

for(int index=0;index<countNo.length;index++)
{
if(countNo[index]%2==0)
{
System.out.println("count of even "+evenCount);
evenCount++;
}
else
{
System.out.println("count of odd"+oddCount);
oddCount++;

}
System.out.println("total number of even count"+evenCount);
System.out.println("total number of odd count" +oddCount);
}
}}