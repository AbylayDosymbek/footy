package footy;
public class vip_seat extends ticket_addon {
    private final int plus;
    public vip_seat(ticket inner, int plus) {
        super(inner);
        this.plus = plus;}
    public String details() {
        return inner.details() + " + vip seat";
    }
    public int price() {
        return inner.price() + plus;
    }}
