import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    @Test
    void testAdd(){
        assertEquals(5, Box.add(2, 3));
    }

}