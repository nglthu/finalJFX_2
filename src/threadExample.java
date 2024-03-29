public class threadExample extends Thread{
    public static int count = 0 ;
    public static void main(String[] args) {
        
       
        threadExample threadExp = new threadExample();
        threadExp.start();
        while (threadExp.isAlive()){
            System.out.println("running...");
        }
        System.out.println("count "+ count);
        count ++;
        System.out.println("count after ++"+count);
 
    }
    public  void run(){//overriden run method of thread
        count ++;
    }
   
}