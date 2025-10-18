
package footy;
public class App {
    public static void main(String[] args) {
        matchday_facade match = new matchday_facade(
                new stadium_lights(),
                new security_team(),
                new scoreboard(),
                new turf_manager());
        match.start_match("kokshetau united", "astana city");
        ticket t = new basic_ticket(3000);
        t = new vip_seat(t, 1500);
        t = new meal_addon(t, 1200);
        t = new merch_addon(t, 800);
        System.out.println(t.details());
        System.out.println(t.price());
        match.end_match("kokshetau united", "astana city", 2, 1);
    }
}
