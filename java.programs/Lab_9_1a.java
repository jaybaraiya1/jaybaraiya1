public class Lab_9_1a{
    public static void main(String[] args) {
        good_morning g1=new good_morning();
        Thread t1=new Thread(g1);
        t1.start();
        good_Afternoon g2=new good_Afternoon();
        Thread t2=new Thread(g2);
        t2.start();
    }
    
}
class good_morning implements Runnable 
{
    public void run()
    {
    try{
       for (int i = 0; i <10; i++){
        System.out.println("Good morning");
        Thread.sleep(1000);
       }
        } 
    
    catch(Exception e){
      System.out.println(e);
    }
}
}
class good_Afternoon implements Runnable 
{
    public void run()
    {
    try{
       for (int i = 0; i <10; i++){
        System.out.println("Good Afternoon");
        Thread.sleep(1000);
       }
        } 
    
    catch(Exception e){
      System.out.println(e);
    }
}
}
