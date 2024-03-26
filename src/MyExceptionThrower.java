import MyException;

public class MyExceptionThrower {
    
    void f() throws MyException{
        throw new MyException("Testing Throw error");
    }
}
