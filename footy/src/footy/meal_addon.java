package footy;
public class meal_addon extends ticket_addon {
    private final int plus;
    public meal_addon(ticket inner, int plus) {
        super(inner);
        this.plus = plus;}
    public String details() {
        return inner.details() + " + meal";
    }
    public int price() {
        return inner.price() + plus;
    }}
