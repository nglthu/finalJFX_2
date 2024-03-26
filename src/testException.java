public class testException {
     public static void main(String[] args) {
        MyExceptionThrower t = new MyExceptionThrower();
        try {
            t.f();
        }
        
        catch(MyException e){
                e.printStackTrace();
            

        } 
        finally {
            System.out.println("Done");
        }
    
    } 

    //shift option A

    
}
