public class BonusMilesService {
    public int calculate(int cost) {
        int oneMile = 20;
        int freeMiles = (int) (cost/oneMile);
        return freeMiles;
    }

}
