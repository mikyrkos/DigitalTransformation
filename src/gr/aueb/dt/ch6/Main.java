package gr.aueb.dt.ch6;

public class Main {

    public static void main(String[] args) {


        doPrint(new IPrintable){
            @Override
            public void doPrint() {
                System.out.println("Hello from the anonymous class!");
            }
        };
        public static void doPrint( IPrintable printable){
            printable.print();

        }
    }
}
