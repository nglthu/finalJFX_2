public class Retry {
    
    boolean fileIsOpen = false;

    public void f(){
        System.out.println("test retry"+fileIsOpen);
        try {
            if (fileIsOpen) {
                System.out.println("File is opened");
            } else {
                fileIsOpen = true;
                //g();
                MyExceptionRetry g = new MyExceptionRetry();
                g.g();
                fileIsOpen = false;
               
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fileIsOpen = false;
            System.out.println("done");
            System.out.println("File status" + fileIsOpen);
        }

    }
}
