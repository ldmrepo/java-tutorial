import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.example.Calculator;

public class LamdaTest {
    private Calculator calculator = new Calculator();

    interface Plus {
        int operate(int a, int b);
    }

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void lamdaTest() {
        Plus plus = new Plus() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        assertEquals(2, plus.operate(1, 1));
    }

    @Test
    void lamdaTest2() {
        Plus plus = (a, b) -> a + b;
        assertEquals(2, plus.operate(1, 1));
    }

    @Test
    void ladmdaTest3() {
        Plus plus = (a, b) -> {
            int result = a + b;
            return result;
        };
        assertEquals(0, plus.operate(1, 1));
    }

    @Test
    void lamdaTest4() {
        assertEquals(2, operate((a, b) -> a + b, 1, 1));
        assertEquals(0, operate((a, b) -> a - b, 1, 1));
        assertEquals(1, operate((a, b) -> a * b, 1, 1));
    }

    private int operate(Plus plus, int a, int b) {
        return plus.operate(a, b);
    }
}
