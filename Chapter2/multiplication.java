public class multiplication
{
    public static void main(String []args)
    {
        //第一排
        int i,j,k;
        System.out.print("    |");
        for(i = 1;i < 13;i++)
        {
            // System.out.print("\t"+i);
            System.out.printf("%4d",i);
        }
        System.out.print("\n");

        //第二排
        System.out.print("----+");
        for(i = 0;i <48;i++)
        {
            System.out.print("-");
        }
        System.out.print("\n");

        //后12排
        for(i = 1;i < 13;i++)
        {
            System.out.printf("%4d",i);
            System.out.print("|");
            for(j = 0;j < i - 1;j++)
            {
                System.out.print("    ");
            }
            for(k = i;k < 13;k++)
            {
                System.out.printf("%4d",i*k);
            }
            System.out.print("\n");
        }
    }
}