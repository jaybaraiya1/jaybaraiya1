public class Lab_9_2 {
    public static void main(String[] args) {
        even_nuber  g2= new even_nuber();
        g2.start();

        odd_nuber  g1= new odd_nuber();
        g1.start();
       
    }
    
}
class odd_nuber extends Thread{
    public void run(){
        try{
            for(int i=0;i<20;i++){
                if(i%2!=0){
                    System.out.println("number is odd:"+i);
                    Thread.sleep(5000);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    

}
class even_nuber extends Thread{
    public void run(){
        try{
            for(int i=0;i<20;i++){
                if(i%2==0){
                    System.out.println("number is even:"+i);
                    Thread.sleep(4500);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    

}