public class Main {

    public static void main(String[] args){
        BonusMilesService service = new BonusMilesService();
        int Miles = service.mil(10000);
        System.out.println("Начисленных миль: " + Miles);

    }

}