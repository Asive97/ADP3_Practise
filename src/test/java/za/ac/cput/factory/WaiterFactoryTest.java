package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.Waiter;

import static org.junit.jupiter.api.Assertions.*;

class WaiterFactoryTest {

    Waiter waiter = WaiterFactory.createWaiter("Asive");
    Waiter waiter2 = waiter;

    @Test
    void testIdentity(){
        assertSame(waiter,waiter2);

    }
    @Test
    void testEquality()
    {
        assertEquals(waiter,waiter2);
    }
    @Test
    @Disabled
    @DisplayName("This method should not run")
    void testDisabled()
    {
        fail("this test method should be disabled");

    }
    @Test
    @Timeout(5)
    public void timeoutTest() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Test will passed with in the time");
    }

}