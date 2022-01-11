package OOP;

public class Player {
    private static int stamina;
    public static final int MAX_STAMINA=100;
    public static final int MIN_STAMINA=0;
    public static int countPlayers =0;

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        if (90 <= stamina && 100 >= stamina ){
        this.stamina = stamina;
        }
        if (countPlayers<6) {
            countPlayers++;
        }
    }

    public void run(){
        if(stamina==MIN_STAMINA) {
            countPlayers--;
        } else
            stamina--;
        if (stamina ==0)
            countPlayers--;
    }

    public static void info(){

        if (countPlayers<6)
            System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных мест");
        else
            System.out.println("На поле нет свободных мест");
    }

    public static void main(String[] args) {

        Player player1 = new Player(91);
        Player player2 = new Player(92);
        Player player3 = new Player(93);
        info();
        Player player4 = new Player(94);
        Player player5 = new Player(95);
        Player player6 = new Player(96);
        info();
        player1.run();

    }
}
