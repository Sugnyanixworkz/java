public class VowelCount
{
	public static void main(String args[])
{
char vowels[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','Y','Z'};
int count=1;
for(int index=0;index<vowels.length;index++)
{
	if(vowels[index]!='A'&&vowels[index]!='E'&&vowels[index]!='I'&&vowels[index]!='O'&&vowels[index]!='U')
{
System.out.println("Condition is true");
count++;
}
else
{
System.out.println("Condition is false");
}
}
System.out.println("Array element of vowels count is: " +count);
}
}

	
