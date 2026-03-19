package org.example.testmvn.services;

//import org.example.testmvn.services.BonusService;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "150,5000,true",
//            "50,5000,false"
//    })
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void testCalcBonus(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();

        int actual = service.calcBonus(amount, isRegistered);
        Assertions.assertEquals(expected, actual);
    }

}

