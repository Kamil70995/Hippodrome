import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hippodrome {

    private static List<Horse> horses = new ArrayList<>();
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
            return horses;
        }

    public void run() throws InterruptedException {
        for(int i=0; i < 100; i++)
        {
            move();
            print();
            Thread.sleep(250);
        }
    }

    public void move()
    {
        for(int i=0; i < horses.size(); i++)
        {
            horses.get(i).move();
        }
    }

    public void print()
     {
         for(int i=0; i < horses.size(); i++)
         {
             horses.get(i).print();
         }
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
     }

     public Horse getWinner()
     {
         double max = 0;
         Horse winner = null;
         for(int i = 0; i < horses.size(); i++)
         {
             if(horses.get(i).getDistance() >= max)
             {
                 max = horses.get(i).getDistance();
                 winner = horses.get(i);
             }
         }
         return winner;
     }
     public void printWinner()
     {
       //  Horse horse = getWinner();
         System.out.println("Winner is " + getWinner().getName() + "!");
     }


    public static void main(String[] args) throws InterruptedException {

        game = new Hippodrome(new ArrayList<>());
        Horse horse1 = new Horse("BestHorse", 3, 0);
        Horse horse2 = new Horse("MiddleHorse", 3, 0);
        Horse horse3 = new Horse("WorstHorse", 3, 0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game.run();
        game.printWinner();
    }
}


