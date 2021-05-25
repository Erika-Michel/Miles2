public class BonusMilesService {
    public int calculate(int ticketInKopecks) {
        int kopecksProMile = 2000;
        int miles = ticketInKopecks / kopecksProMile;
        return miles;
    }
}
