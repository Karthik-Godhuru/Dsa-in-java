public class duplicate
{
  public static void main(String[] args)
  {
    int [] arr={1,1,2,2,3,3,4,4,5,5};
     int n=arr.length;
     int i =0;
     int j=1;
     while(j<n)
     {
       if(arr[j]!=arr[i])
       {
         i++;
         arr[i]=arr[j];
       }
       j++;
     }
     int k=i+1;
     System.out.println(" number of unique element"+k);
     System.out.println("result: "); 
   for(int x=0;x<k;x++)
  {
    System.out.print(arr[x]+"  "); 
  }
   }
 }