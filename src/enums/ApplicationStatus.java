package enums;

public class ApplicationStatus {

    public static void main(String[] args) {
       /* Status status = Status.Success;
        System.out.println(status.ordinal());

        // Test with if else

        if (status == Status.Success) {
            System.out.println("Success");
        } else if (status == Status.Pending) {
            System.out.println("Pending");
        } else if (status == Status.Failed) {
            System.out.println("Failed");
        } else {
            System.out.println("Unknown");
        }

        // so we can do the same thing with Switch

        switch (status) {
            case Success:
                System.out.println("Success");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            default:
                System.out.println("Unknown");
        }

    }}*/

        Laptop laptop=Laptop.Mackbok;
        System.out.println(laptop+" : "+laptop.getPrice());
    }
}
