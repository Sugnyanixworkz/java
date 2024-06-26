public class TopCompanies
{
public static void main (String args[])
{
String compName[]={"Intuit","Cisco","Adobe","Infosys","Wipro"};
long compCount[]={265263123l,2716666617l,9900128192l,31212332l}; 
char gen[]={'M','F'};

System.out.println("The company names");
for(int index=0;index<compName.length;index++)
{
System.out.println("  " +compName[index]);
}

System.out.println("The company workers count");
for(int index=0;index<compCount.length;index++)
{
System.out.println("  " +compCount[index]);
}

System.out.println("The company takes only ");
for(int index=0;index<gen.length;index++)
{
System.out.println("  " +gen[index]);
}

}}