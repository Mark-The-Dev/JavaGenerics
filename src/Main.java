public class Main {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer matt = new SoccerPlayer("Matt");

        Team<FootballPlayer> buffaloBills = new Team<>("Buffalo Bills");
        buffaloBills.addPlayer(joe);
//        buffaloBills.addPlayer(pat);
//        buffaloBills.addPlayer(matt);

        Team<BaseballPlayer> baseballTeam = new Team<>("chicago cubs");
        baseballTeam.addPlayer(pat);

        //Fixed by extending T in Team class to extend player.
        Team<SoccerPlayer> fixedTeam = new Team<>("Soccer Team");
        fixedTeam.addPlayer(matt);



        System.out.println(buffaloBills.numPlayers());
    }

}
