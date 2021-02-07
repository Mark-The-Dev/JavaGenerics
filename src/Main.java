public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer matt = new SoccerPlayer("Matt");

        Team buffaloBills = new Team("Buffalo Bills");
        buffaloBills.addPlayer(joe);
        buffaloBills.addPlayer(pat);
        buffaloBills.addPlayer(matt);
        System.out.println(buffaloBills.numPlayers());
    }

}
