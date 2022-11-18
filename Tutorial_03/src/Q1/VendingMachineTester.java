package Q1;

public class VendingMachineTester
    {
        public static void main(String[] args)
        {
            Vending machine = new Vending(10);
            machine.fillCans(10); // fill up with ten cans
            machine.insertTokens();
            machine.insertTokens();
            System.out.print("Token count = ");
            System.out.println(machine.getCans());
            System.out.print("Can count = ");
            System.out.println(machine.getTokens());
        }
    }

