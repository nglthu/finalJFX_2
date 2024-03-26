
import MyException;


public class MyExceptionRetry {

    static int i = 0;

    void g() throws MyException {

        System.out.println("test g() in My exception retry");

    }

    public void f() {
        try {
            g();

        } catch (Exception e) {
            
            
            System.out.println("Caught exception" + i);
            
            i++;
            
            f();
        }
    }

    void g() throws MyException {
       
        if (i < 3) {
            throw new MyException();
        } else {
            System.out.println("g() is working now");
        }
    }

}
