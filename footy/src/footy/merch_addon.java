package footy;
public class merch_addon extends ticket_addon {
    private final int plus;
    public merch_addon(ticket inner, int plus) {
        super(inner);
        this.plus = plus;}
    public String details() {
        return inner.details() + " + merch";
    }
    public int price() {
        return inner.price() + plus;
    }}
