package TestFirstTask;

import primitive.DeclarationOfPrimitiveDataTypes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPrimitiveDataTypes {

    @Test
    public void testInitializeVariables() {

        DeclarationOfPrimitiveDataTypes myClass = new DeclarationOfPrimitiveDataTypes();
        myClass.aVoid();

        assertEquals(0, myClass.varint);
        assertEquals(0L, myClass.varlong);
        assertTrue(myClass.varboolean);
        assertEquals('0', myClass.varchar);
        assertEquals(0.0f, myClass.varfloat, 0);
        assertEquals(0.0d, myClass.vardouble, 0);
        assertEquals(0, myClass.varbyte);
        assertEquals(0, myClass.varshort);
    }

}
