import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToArabianTests {
    @Test
    public void smallNumberBeforeBig1() {
      assertEquals(4, RomanToArabian.convertRomanToArabian("iv"));
    }
    @Test
    public void smallNumberBeforeBig1_1() {
        assertEquals(3, RomanToArabian.convertRomanToArabian("iiv"));

    }
    @Test
    public void smallNumberBeforeBig2() {
        assertEquals(9, RomanToArabian.convertRomanToArabian("ix"));
    }
    @Test
    public void smallNumberBeforeBig2_1() {
        assertEquals(8, RomanToArabian.convertRomanToArabian("iix"));
    }
    @Test
    public void smallNumberBeforeBig3() {
        assertEquals(40, RomanToArabian.convertRomanToArabian("xl"));
    }
    @Test
    public void smallNumberBeforeBig4() {
        assertEquals(400, RomanToArabian.convertRomanToArabian("cd"));
    }
    @Test
    public void smallNumberBeforeBig5() {
        assertEquals(900, RomanToArabian.convertRomanToArabian("cm"));
    }


    @Test
    public void smallNumberAfterBig1() {
        assertEquals(6, RomanToArabian.convertRomanToArabian("vi"));
    }
    @Test
    public void smallNumberAfterBig1_1() {
        assertEquals(7, RomanToArabian.convertRomanToArabian("vii"));

    }
    @Test
    public void smallNumberAfterBig2() {
        assertEquals(11, RomanToArabian.convertRomanToArabian("xi"));
    }
    @Test
    public void smallNumberAfterBig2_1() {
        assertEquals(12, RomanToArabian.convertRomanToArabian("xii"));
    }
    @Test
    public void smallNumberAfterBig3() {
        assertEquals(60, RomanToArabian.convertRomanToArabian("lx"));
    }
    @Test
    public void smallNumberAfterBig4() {
        assertEquals(600, RomanToArabian.convertRomanToArabian("dc"));
    }
    @Test
    public void smallNumberAfterBig5() {
        assertEquals(1100, RomanToArabian.convertRomanToArabian("mc"));
    }



}
