class TablePrinter
{
    public void PrintTable(int n)
    {
        int i = 0;
        for(i=1; i<=10;i++)
        {
            System.out.println("Name : ", Thread.currentThread(),getName());
        }
    }
}
class Demo extends Thread
{
    public void run()
    {
    }   
}

class ThreadUserDefinedSyncronization
{
    public static void main(String A[])
    {
        TablePrinter tobj = new TablePrinter();
        tobj.PrintTable(5);
    }
       
}