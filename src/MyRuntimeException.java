
public class MyRuntimeException {

    static void g() {
        throw new RuntimeException("from g() testing:");
    }

    /* static void f(){
        g();
    } */
    public static void main(String[] args) {
       MyExceptionRetry f = new MyExceptionRetry();
       f.f();
       
    }

}
