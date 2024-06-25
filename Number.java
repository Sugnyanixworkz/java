public class Number
{
	public static void main(String args[])
	{
	    short serNo[]={1,2,3,4,5};
		int number[]={100,200,300,400,500};
        String name[]={"John","Sha","Twinkle","Parinita"};
		byte age[]={10,20,30,45};
		long pop[]={274624234l,85384575342l,98493857l,38479305l};
		char gender[]={'M','F'};
		boolean acceptable[]={true,false};
		float hieght[]={ 5.1f,  5.2f,5.5f,5.3f,5.4f};
		double weight[] ={5,7,8,9,8,9};
		
		System.out.println("The serial numbers are");
		for(int s=0;s <serNo.length;s++)
		{
			System.out.println( +serNo[s]);
		}
		System.out.println("The total serial numbers are\n"+serNo.length);

		System.out.println("The numbers are");
		for(int index=0; index < number.length ;index++)
		{
			System.out.println(" "+number[index]);
		}
			System.out.println("There are "+number.length+ " numbers");
			
	    System.out.println("The names are");
        for (int num=0;num<name.length;num++)	
	    {
          System.out.println(" "+name[num]);
		}
          System.out.println("The total names are "+name.length);
	
	
	     System.out.println("The ages are");
	     for(int len=0;len<4;len++)
	    {
		  System.out.println(" "+age [len]);
	    }
	      System.out.println("The total ages are "+age.length);
	
	
	     System.out.println("The population of diff countries");
		 for(int p=0;p<4;p++)
		 {
			 System.out.println("  "+pop[p]);
		 }
	
	System.out.println("The total number of countries population"+pop.length);
	
	System.out.println("The age is acceptable that may be ");
	
	
	for(int a=0;a<acceptable.length;a++)
	{
		System.out.println(""+acceptable[a]);	
	
		}
		System.out.println("The possiblities of age to accept "+acceptable.length);


System.out.println("The height list is");
for(int h=0;    h < hieght.length; h++)
{
	System.out.println(" "+hieght[h]);
}

System.out.println("The number of hieghts are given"+hieght.length);

System.out.println("The list of genders");
for(int g=0;g<2;g++)
{
	
System.out.println(""+gender[g]);{
}
System.out.println("The total no. of genders are " + gender.length);

System.out.println("The weights are");

for (int w=0; w<weight.length ;w++)
{
	System.out.println(" "+weight[w]);
}
System.out.println("The number of weights are given" + weight.length);
	}
}}