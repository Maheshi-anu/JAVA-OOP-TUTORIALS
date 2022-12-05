import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        String river = "Mississippi";
//        String bigRiver = river.toLowerCase();
//        System.out.println(bigRiver);

        //String animal1 = "quick brown fox";
        //String animal2 = "lazy dog";
        //String article = "the";
        //String action = "jumps over";
        //String conLine = article.concat(" ").concat(animal1).concat(action).concat(animal2);
        //System.out.println(conLine);

        //String conLine = article + " " + animal1 + " " + action + " " + animal2;
        //System.out.println(conLine);

        //Rectangle r1 = new Rectangle(0, 0, 100, 50);
        //System.out.println(r1);

        //Rectangle r2 = new Rectangle(3, 6, 200, 60);
        //r2.grow(10,20);
        //System.out.println(r2);
        //Rectangle r3 = r1;
        //System.out.println(r3);

        //double n1 = 150;
        //double n2 = n1;
        //n2 = n2*20;
        //System.out.println(n1);
        //System.out.println(n2);

        boolean[] daysInTheYear = new boolean[365];

        int numOfPeople = 0;
        Random random = new Random();
        while(true){
            ++ numOfPeople;
            int birthday = random.nextInt(364);
            System.out.println(birthday);

            if (daysInTheYear[birthday]){
                break;
            }
            else {
                daysInTheYear[birthday] = true;
            }
        }
        System.out.println("Number of people: " + numOfPeople);
        System.out.println(Arrays.toString(daysInTheYear));


    }

    }