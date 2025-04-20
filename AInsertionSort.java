import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};

        for(int i=0; i<myNumbers.length-1; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(myNumbers[j]<myNumbers[j-1])
                {
                    int temp= myNumbers[j];
                    myNumbers[j]=myNumbers[j-1];
                    myNumbers[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(myNumbers));

    }
}
