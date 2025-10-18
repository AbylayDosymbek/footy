package footy;
public class basic_ticket implements ticket {
    private final int base_price;
    public basic_ticket(int base_price) {
        this.base_price = base_price;
    }
    public String details() {
        return "ticket";
    }
    public int price() {
        return base_price;
    }
}
