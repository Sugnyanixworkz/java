public class ConsonantsCount
{
public static void main(String args[])
{
char consonants[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','Y','Z'};
int count=0;
for(int index=0;index<consonants.length;index++)
{
if(consonants[index]!='A'&&consonants[index]!='E'&&consonants[index]!='I'&&consonants[index]!='O'&&consonants[index]!='U')
{
System.out.println("Condition is true");
count++;
}
else
{
System.out.println("Condition is false");
}
}
System.out.println("Array element of vowels count is: "+count);
}
}
