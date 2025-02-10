public class Address {
    private int zipCode;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
}

enum MatchResult {
    LIVE,
    BAT_FIRST_WIN,
    FIELD_FIRST_WIN,
    DRAW,
    CANCELED
}

enum UmpireType {
    FIELD,
    RESERVED,
    THIRD_UMPIRE
}

enum WicketType {
    BOLD,
    CAUGHT,
    STUMPED,
    RUN_OUT,
    LBW,
    RETIRED_HURT,
    HIT_WICKET,
    OBSTRUCTING,
    HANDLING
}

enum BallType {
    NORMAL,
    WIDE,
    NO_BALL,
    WICKET
}

enum RunType {
    NORMAL,
    FOUR,
    SIX,
    LEG_BYE,
    BYE,
    NO_BALL,
    OVERTHROW
}

enum PlayingPosition {
    BATTING,
    BOULING,
    ALL_ROUNDER
}

public class Admin {
    public boolean addPlayer(Player player);
    public boolean addTeam(Team team);
    public boolean addMatch(Match match);
    public boolean addTournament(Tournament tournament);
    public boolean addStats(Stat stats);
    public boolean addNews(News news);
}

public class Player {
    private String name;
    private int age;
    private int country;
    private PlayerPosition position;
    private List<Team> teams;
    private PlayerStat stat;
}

public class Coach {
    private String name;
    private int age;
    private int country;
    private List<Team> teams;
}

public class Umpire {
    private String name;
    private int age;
    private int country;

    public boolean assignMatch(Match match);
}

public class Run {
    private int totalRuns;
    private RunType type;
    private Player scoredBy;
}

public class Ball {
    private Player balledBy;
    private Player playedBy;
    private BallType type;
    private List<Run> runs;
    private Wicket wicket;

    public boolean addCommentary(Commentary commentary);
}

public class Wicket {
    private WicketType type;
    private Player playerOut;
    private Player balledBy;
    private Player caughtBy;
    private Player runoutBy;
    private Player stumpedBy;
}

public class Over {
    private int number;
    private Player bowler;
    private int totalScore;
    private List<Ball> balls;

    public boolean addBall(Ball ball);
}

public class Innings {
    private Playing11 bowling;
    private Playing11 batting;
    private Date startTime;
    private Date endTime;
    private int totalScores;
    private int totalWickets;
    private List<Over> overs;

    public boolean addOver(Over over);
}

public abstract class Match {
    private Date startTime;
    private MatchResult result;
    private int totalOvers;
    private List<Playing11> teams;
    private List<Innings> innings;
    private Playing11 tossWin;
    private Map<Umpire, UmpireType> umpires;
    private Stadium stadium;
    private List<Commentator> commentators;
    private List<MatchStat> stats;

    public abstract boolean assignStadium(Stadium stadium);
    public abstract boolean assignUmpire(Umpire umpire);
}

public class T20 extends Match {
    public boolean assignStadium(Stadium stadium);
    public boolean assignUmpire(Umpire umpire);
}

public class Test extends Match {
    public boolean assignStadium(Stadium stadium);
    public boolean assignUmpire(Umpire umpire);
}

public class ODI extends Match {
    public boolean assignStadium(Stadium stadium);
    public boolean assignUmpire(Umpire umpire);
}

public class Team {
    private String name;
    private List<Player> players;
    private Coach coach;
    private List<News> news;
    private TeamStat stats;

    public boolean addSquad(TournamentSquad squad);
    public boolean addPlayer(Player player);
    public boolean addNews(News news);
}

public class TournamentSquad {
    private List<Player> players;
    private Tournament tournament;
    private List<TournamentStat> stats;

    public boolean addPlayer(Player player);
}

public class Playing11 {
    private List<Player> players;

    public boolean addPlayer(Player player);
}

public class Tournament {
    private Date startDate;
    private List<TournamentSquad> teams;
    private List<Match> matches;
    private PointsTable points;

    public boolean addTeam(TournamentSquad team);
    public boolean addMatch(Match match);
}

public class PointsTable {
    private HashMap<String, float> teamPoints;
    private HashMap<Team, MatchResult> matchResults;
    private Tournament tournament;
    private Date lastUpdated;
}

public class Stadium {
    private String name;
    private Address location;
    private int maxCapacity;
}

public class Commentator {
    private String name;

    public boolean assignMatch(Match match);
}

public class Commentary {
    private String text;
    private Date createdAt;
    private Commentator commentator;
}

public class News {
    private Date date;
    private String text;
    private List<byte> image;
    private Team team;
}

public abstract class Stat {
    public abstract boolean updateStats();
}

public class PlayerStat extends Stat {
    private int ranking;
    private int bestScore;
    private int bestWicketCount;
    private int totalMatchesPlayed;
    private int total100s;
    private int totalHattricks;

    public boolean updateStats();
}

public class MatchStat extends Stat {
    private double winPercentage;
    private Player topBatsman;
    private Player topBowler;

    public boolean updateStats();
}

public class TeamStat extends Stat {
    private int totalSixes;
    private int totalFours;
    private int totalReviews;

    public boolean updateStats();
}





