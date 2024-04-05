public class Lab_9_2a {
    public static void main(String[] args) {
        even_number  g2= new even_number();
        Thread t2=new Thread(g2);
        t2.start();

        odd_number  g1= new odd_number();
        Thread t1=new Thread(g1);
        t1.start();
       
    }
    
}
class odd_number implements Runnable {
    public void run(){
        try{
            for(int i=0;i<20;i++){
                if(i%2!=0){
                    System.out.println("number is odd:"+i);
                    Thread.sleep(500);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    

}
class even_number implements Runnable{
    public void run(){
        try{
            for(int i=0;i<20;i++){
                if(i%2==0){
                    System.out.println("number is even:"+i);
                    Thread.sleep(400);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    

}