import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Store st;
    public static Scanner scan = new Scanner(System.in);
    public static Scanner sc = new Scanner(System.in);
    public static List<Computer> stComputerProduct = new ArrayList<>();
    public static void main(String[] args) {

        String ch="";
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("1.Computer\n2.Printers\n3.Scanners\n\nChoose an option:");
            ch=scan.nextLine();
            switch (ch){
                case "1":
                    stComputer();
                    break;
                case "2":
                    stPrinters();
                    break;
                case "3":
                    stScanners();
                    break;
            }
        }while(ch!="");
    }
    private static void stProduct() {
        ProductName store = new ProductName();
        System.out.println("\nProductPrice:"+st.Price();
        System.out.println("ProductQuantity: "+st.quantity()+"\n");
        System.out.println("ProductValue: "+st.value()+"\n");
    }




    private static void ManageProduct() {
        String acc="";
        do{
            System.out.print("ProductName:");
            acc=scan.nextLine();
            if(acc.equals("")){
                for(Pr product:stProduct){
                    System.out.println(Pr);
                }
                return;
            }
            System.out.print("Product name");
            String name=scan.nextLine();
            System.out.print("Manufacturer ");
            String name=scan.nextLine();

            System.out.print("Version ");
            float bal=sc.nextFloat();
            stProduct.add(new st(price,quatity,value));
        }while(!pr.equals(""));
    }



    private static void opChooser() {
        String ch="";
        do{
            System.out.print("Choose a product:\n1.ProductName\n2.Manufacturer\n3.VersionNumber\n4");
            ch=scan.nextLine();
            switch (ch){
                case "1":
                    productName();
                    break;
                case "2":
                    manufacturer();
                    break;

                case "3":
                    Version();
                    break;

            }
        }while(!ch.equals(""));
    }



    private static void productName() {
    }
    private static void manufacturer() {
    }


    private static void version() {
    }

    public static void stVersion() {

    }
}
