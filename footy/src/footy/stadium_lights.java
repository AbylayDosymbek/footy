package footy;
public class stadium_lights {
    private boolean on = false;
    public void turn_on() {
        on = true;
        System.out.println("lights on");}
    public void turn_off() {
        on = false;
        System.out.println("lights off");}
    public boolean is_on() {
        return on;
    }}
