package Customer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MemberShipManagerTest {
    static MemberShipManager memberShipManager = new MemberShipManager();

    @Test
    void getMemberShip() {
        assertNull(memberShipManager.getMemberShip("30360"));
    }

    @Test
    void isMember() {
        assertFalse(memberShipManager.isMember("30360"));
    }
}