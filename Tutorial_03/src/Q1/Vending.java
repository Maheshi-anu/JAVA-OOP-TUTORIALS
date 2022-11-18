package Q1;

public class Vending {
    private int cans;
    private int tokens;
    public int getCans(){
        return cans;
    }
    public Vending(int cans){

        this.cans = cans;
    }


    public int getTokens() {
        return tokens;
    }
    public void fillCans(int cans){
        this.cans += cans;
    }
    public void insertTokens(){
        this.tokens += 1;
        this.cans -= 1;
    }
}
