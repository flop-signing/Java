package anonymousInnerClass;

public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            void show() {
                System.out.println("Inside show method");
            }
        };
        obj.show();
    }

    // here instantiaed the Abstract class through anonymous innner class.


}
