//code to demonstrate thread scheduling
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of:"+Thread.currentThread().getName());
        int i = 0;
        for(i =1; i<=5; i++);
    }
}

class ThreadUserDefinedJoinSleep
{
    public static void main(String A[])
    {
        System.out.println("Inside main Thread");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj1.setName("Second");
         try
        {
            dobj1.start();
            dobj1.join(); 
            System.out.println("End of First thread");

            

            dobj2.start();
            dobj2.join(); 
            

            System.out.println("End of Second thread"); 
           
        }
        catch(InterruptedException aobj)
        {}
        System.out.println("End of main Thread");

    }
       
}