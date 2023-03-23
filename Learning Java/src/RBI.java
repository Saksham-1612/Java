abstract class Bank {
    abstract int getIntrestRate();
}
    class SBI extends Bank {
        int getIntrestRate() {
            return 7;
        }
    }

    class PNB extends Bank{
        int getIntrestRate()
        {
            return 8;
        }
    }

    class BOB extends Bank{
        int getIntrestRate()
        {
            return 9;
        }
    }
    class ICICI extends Bank{
        int getIntrestRate()
        {
            return 10;
        }
    }
    class UBI extends Bank {
        int getIntrestRate(){
            return 12;
        }
    }
public class RBI{
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank pnb = new PNB();
        Bank bob = new BOB();
        Bank icici = new ICICI();
        Bank ubi = new UBI();

        System.out.println("SBI Interest Rate: " + sbi.getIntrestRate());
        System.out.println("PNB Interest Rate: " + pnb.getIntrestRate());
        System.out.println("BOB Interest Rate: " + bob.getIntrestRate());
        System.out.println("ICICI Interest Rate: " + icici.getIntrestRate());
        System.out.println("UBI Interest Rate: " + ubi.getIntrestRate());
    }
}
