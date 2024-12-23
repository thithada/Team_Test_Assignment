import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @Test
    void testConvertAgeToBuddhistEra() {
        assertEquals("2547", TextProcessor.convertAgeToBuddhistEra(20));
    }

    @Test
    void testConvertGradeToRank() {
        assertEquals("High Distinction", TextProcessor.convertGradeToRank("A"));
    }
}
