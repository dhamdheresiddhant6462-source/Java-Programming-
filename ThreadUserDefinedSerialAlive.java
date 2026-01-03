class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of:"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinSerialAlive
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

            System.out.println("is first thread Alive?"+dobj1.isAlive());

            dobj2.start();
            dobj2.join(); 
            System.out.println("is second thread Alive?"+dobj1.isAlive());

            System.out.println("End of First thread"); 
           
        }
        catch(InterruptedException aobj)
        {}
        System.out.println("End of main Thread");

    }
       
}