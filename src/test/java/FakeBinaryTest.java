import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakeBinaryTest {

    @Test
    public void testConvertToBinary(){
        //Given

        String imputNumber = "92842995812386";

        //Then

        String actual = FakeBinary.convertString();

        //When

        assertEquals("",actual);
    }


}