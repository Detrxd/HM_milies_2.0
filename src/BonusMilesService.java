public class BonusMilesService {
    public int calculate(int cost) {
        int bonus = 20;
        int miles = cost/bonus;
        System.out.println(miles);
        return miles;
    }
}
