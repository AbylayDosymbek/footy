package footy;
public abstract class ticket_addon implements ticket {
    protected final ticket inner;
    public ticket_addon(ticket inner) {
        this.inner = inner;
    }}
