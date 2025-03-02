package interfaces;

public class Areas implements Area{
    @Override
    public void show() {
        System.out.println("In show method");
    }

    @Override
    public void config() {
        System.out.println("In config method");
    }
}
