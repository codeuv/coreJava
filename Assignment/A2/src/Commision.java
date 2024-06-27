import java.util.Scanner;

public class Commision {
    private String name ;
    private String phone ;
    private String address ;
    private int sales_amount;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public void setSales_amount(int sales_amount) {
        this.sales_amount = sales_amount;
    }

    public void set_data(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = in.nextLine();
        System.out.print("Enter phone: ");
        this.phone = in.next();
        in.nextLine();
        System.out.print("Enter address: ");
        this.address = in.nextLine();
        System.out.print("Enter SalesAmount: ");
        this.sales_amount = in.nextInt();
    }

    @Override
    public String toString() {
        return "Commision{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", phone='" + phone + '\'' +
                ", sales_amount=" + sales_amount +
                '}';
    }

    public float calculateCommision(){
        int percent = 0 ;
        if (this.sales_amount >= 100000) {
            percent = 10 ;
        }else if (this.sales_amount >= 50000) {
            percent = 5 ;
        }if(this.sales_amount >= 30000){
            percent = 3 ;
        }else{
            percent = 0 ;
        }

        return (this.sales_amount / 100) * percent;
    }
}
