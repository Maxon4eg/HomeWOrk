package org.example;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OksanaAppTest {
    private Oksana oksanaApp;

    @BeforeClass
    public void setupOksanaTests() {
        oksanaApp = new Oksana();
        System.out.println("before class ");
    }

    @Test(dataProvider = "speedDataProvider")
    public void testSpeedMethod(int speed, boolean isBirthday, int expectedResult) {
        System.out.println("speed tests ");
        int actualResult = oksanaApp.caughtSpeeding(speed, isBirthday);
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCigarParty() {
        System.out.println("cigar party tests ");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class ");
    }

    @DataProvider(name = "speedDataProvider")
    public Object[][] speedDataProvider() {
        return new Object[][]{
                {60, false, 0},
                {65, false, 1},
                {65, true, 0}

        };

    }


}
