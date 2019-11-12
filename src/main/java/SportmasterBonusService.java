public class SportmasterBonusService {
    public int calculatePoint(int totalCost,int cost)
    {
        int points=0;
        int standartBound=15001;
        int silverBound=150000;
        if(totalCost==0)
        {
            return points;
        }
        if(totalCost<standartBound){
            points=50;
            return points;
        }
        if(totalCost>silverBound){
            points=100;
            return points;
        }
        points=70;
        return points;
    }
    public int chargeBonus(SportmasterClient client,int cost){
        int point=calculatePoint(client.getTotalCost(),cost);
        client.increaseTotalCost(cost);
        int result=cost/1000*point;
        return result;
    }
}
