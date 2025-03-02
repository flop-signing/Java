package anonymousInnerClass;

public class Main {

    public static void main(String[] args) {
        Anonymous obj=new Anonymous(){
            public void show(){
                System.out.println("Inside new show method");
            }
        };

        // now it's execute the Inside new show method. not the Anonymous Class show method.
        // and since it's have no name, this class is called anonymous class.
        obj.show();

    }
}
