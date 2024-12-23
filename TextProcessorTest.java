import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @Test
    void testConvertAgeToBuddhistEra() {
        assertEquals("2547", TextProcessor.convertAgeToBuddhistEra(20));
        assertEquals("2543", TextProcessor.convertAgeToBuddhistEra(24));
    }

    @Test
    void testConvertGradeToRank() {
        assertEquals("High Distinction", TextProcessor.convertGradeToRank("A"));
        assertEquals("Failed", TextProcessor.convertGradeToRank("F"));
    }
}
