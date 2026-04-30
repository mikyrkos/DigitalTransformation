package gr.aueb.dt.ch1;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(); //(0,0)
        Point p2 = new Point();
        Point p3 = new Point(10,20);

        User alice = new User (1,"Alice","Smith","alice","password", true);
        User bob = new User (2,"Bob","Johnson","bob","password",false);

        bob.setLastName("Dylan");
        bob.setPassword("newPassword");

        alice.setActive(false);

        System.out.println("Alice's last name is" + alice.getLastName());
        System.out.println("Bob's last name is" + bob.getLastName());
        System.out.println("Alice's password is" + alice.getPassword());
    }
}
