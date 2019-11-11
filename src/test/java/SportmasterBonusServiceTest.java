import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterBonusServiceTest {

    @Test
    void calculatePointLess1000() {
        SportmasterBonusService bonus=new SportmasterBonusService();
        int result=bonus.calculatePoint(0,999);
        assertEquals(0,result);
    }
    @Test
    void calculatePointStandart() {
        SportmasterBonusService bonus=new SportmasterBonusService();
        int result=bonus.calculatePoint(1532,1000);
        assertEquals(50,result);
    }
    @Test
    void calculatePointStandartBound() {
        SportmasterBonusService bonus=new SportmasterBonusService();
        int result=bonus.calculatePoint(15000,1000);
        assertEquals(50,result);
    }
    @Test
    void calculatePointSilver() {
        SportmasterBonusService bonus=new SportmasterBonusService();
        int result=bonus.calculatePoint(20523,1000);
        assertEquals(70,result);
    }
    @Test
    void calculatePointSilverBound() {
        SportmasterBonusService bonus=new SportmasterBonusService();
        int result=bonus.calculatePoint(150000,1000);
        assertEquals(70,result);
    }
    @Test
    void calculatePointGold() {
        SportmasterBonusService bonus=new SportmasterBonusService();
        int result=bonus.calculatePoint(200132,1000);
        assertEquals(100,result);
    }

    @Test
    void chargeBonusLess1000() {
        SportmasterClient client=new SportmasterClient();
        SportmasterBonusService bonus=new SportmasterBonusService();
        int result=bonus.chargeBonus(client,999);
        assertEquals(0,result);
    }
    void chargeBonus() {
        SportmasterClient client=new SportmasterClient();
        SportmasterBonusService bonus=new SportmasterBonusService();
        bonus.chargeBonus(client,2000);
        int result=bonus.chargeBonus(client,1500);
        assertEquals(50,result);
    }
}