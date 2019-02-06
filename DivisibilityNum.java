class DivisibilityNum
{
public static void main(String[] args)
{
System.out.println(" Numbers are divisible by 3 :");

for(int i = 0; i < 100; i++)
{
if( i % 3 == 0)
System.out.print(i +", ");
}
System.out.println("\n Numbers are divisible by 5 :");

for(int i = 0; i < 100; i++)
{
if( i % 5 == 0)
System.out.print( i +", ");
}

System.out.println("\n nummbers are divisible by 3 and 5 both :");
for(int i = 0; i < 100; i++)
{
if( i % 3 == 0 && i % 5 == 0)

System.out.print( i +", ");
}
System.out.print("\n");
}
}