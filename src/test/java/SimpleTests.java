import org.junit.jupiter.api.Test;

public class SimpleTests {
    @Test
    public void passedTest() {
        assert 2 + 2 == 4;
    }

    @Test
    public void failedTest() {
        assert 2 + 2 == 4;
    }
}
