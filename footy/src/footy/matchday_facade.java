//adjsj
package footy;
public class matchday_facade {
    private final stadium_lights lights;
    private final security_team security;
    private final scoreboard board;
    private final turf_manager turf;
    public matchday_facade(stadium_lights lights, security_team security, scoreboard board, turf_manager turf) {
        this.lights = lights;
        this.security = security;
        this.board = board;
        this.turf = turf;}
    public void start_match(String home, String away) {
        lights.turn_on();
        security.open_gates();
        turf.check_grass_height(24);
        board.set_title(home + " vs " + away);
        board.set_time(0);
        board.set_score(0, 0);
        board.show();}
    public void end_match(String home, String away, int home_goals, int away_goals) {
        board.set_score(home_goals, away_goals);
        board.set_time(90);
        board.show();
        security.close_gates();
        lights.turn_off();}}
