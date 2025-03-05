//"Test.java"
class Test
{
public static void main(String[] args)
{
     int[] arr=new int[]{12,34,54,22};
        int smallestVal=arr[0];
         int largestVal=arr[0];
         for(int i=0;i<arr.length;i++)
         {
            // for(int j=i+1;j<arr.length;j++)
             {
                      if(arr[i]<smallestVal)
                       {
                        smallestVal=arr[i];
                         }
                     else if(arr[i]>largestVal)
                      {
                          largestVal=arr[i];
                      }
             }
             
         }
              System.out.println(smallestVal);
              System.out.println(largestVal);
}
}
