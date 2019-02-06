public static void main(String[] args) {
	
void CheckDuplicatesBruteForce(int A[], int n)
{
int i = 0, j=0;
for(i = 0; i < n; i++)
{
for(j = i+1; j < n; j++)
{
if(A[i] == A[j]) {
System.out.println(“Duplicates exist: ” + A*i);
return; 
}
}
}
System.out.println(“No duplicates in given array.”);
}
}