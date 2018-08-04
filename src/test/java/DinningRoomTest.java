import RoomAndEnum.DinningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DinningRoomTest {
    DinningRoom dinningRoom_01;

    @Before
    public void before(){
        dinningRoom_01 = new DinningRoom(100, "Monroe", 0);
    }

    @Test
        public void hasCapacity(){
        assertEquals(100, dinningRoom_01.getCapacity());
    }
    @Test
    public void hasName(){
        assertEquals("Monroe", dinningRoom_01.getName() );
    }
    @Test
    public void hasRate(){
        assertEquals(0, dinningRoom_01.getRate(),0 );
    }
}
