public static void main(String [] args)
{
int [] arr = {2,5,6,8,11};
int n = arr.length;
int target = 14;
for(int i =0; i < n ; i++)
{
for(int j =i+1; j <n ; j++)
{
if((arr[i]+arr[j])==target)
{
System.out.print(true);
break;

}  
  
                }  
                      
            }  
    }