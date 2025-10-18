package footy;
public class turf_manager {
    private int last_height = 0;
    public void check_grass_height(int mm) {
        last_height = mm;
        if (mm < 20) {
            System.out.println("grass too short");
        } else if (mm > 30) {
            System.out.println("grass too long");
        } else {
            System.out.println("grass ok");}}
    public int last_height() {
        return last_height;
    }
}
