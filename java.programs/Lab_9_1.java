public class Lab_9_1 {
    public static void main(String[] args) {
        good_moerning g1=new good_moerning();
        g1.start();
        try {
            g1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        good_Afternun g2=new good_Afternun();
        g2.start();
    }
    
}
class good_moerning extends Thread 
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
class good_Afternun extends Thread 
{
    public void run()
    {
    try{
       for (int i = 0; i <10; i++){
        System.out.println("Good Afternun");
        Thread.sleep(1000);
       }
        } 
    
    catch(Exception e){
      System.out.println(e);
    }
}
}
