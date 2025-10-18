package footy;
public class security_team {
    private boolean gates_open = false;
    public void open_gates() {
        gates_open = true;
        System.out.println("gates open");}
    public void close_gates() {
        gates_open = false;
        System.out.println("gates closed");}
    public boolean gates_state() {
        return gates_open;
    }}
