package footy;
public class scoreboard {
    private String title = "";
    private int time = 0;
    private int home = 0;
    private int away = 0;
    public void set_title(String title) {
        this.title = title;
    }
    public void set_time(int time) {
        this.time = time;
    }
    public void set_score(int home, int away) {
        this.home = home;
        this.away = away;}
    public void show() {
        System.out.println("[" + title + "] " + time + "' " + home + ":" + away);
    }}
