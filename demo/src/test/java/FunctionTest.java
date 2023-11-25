import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

/**
 * 함수형 인터페이스 테스트
 * 함수형 인터페이스는 하나의 추상 메소드만을 가지는 인터페이스를 말한다.
 * 함수형 인터페이스는 @FunctionalInterface 어노테이션을 사용하여 명시적으로 표현할 수 있다.
 * 함수형 인터페이스는 람다식을 사용하기 위해 존재한다.
 * 함수형 인터페이스는 자바에서 제공하는 함수형 인터페이스와 개발자가 직접 만든 함수형 인터페이스로 나뉜다.
 * 자바에서 제공하는 함수형 인터페이스는 java.util.function 패키지에 있다.
 * 자바에서 제공하는 함수형 인터페이스는 크게 5가지 종류가 있다.
 * 1. Consumer<T> : T 타입을 받아서 아무값도 리턴하지 않는다.
 * 2. Supplier<T> : T 타입의 값을 제공한다.
 * 3. Function<T, R> : T 타입을 받아서 R 타입을 리턴한다.
 * 4. Predicate<T> : T 타입을 받아서 boolean을 리턴한다.
 * 5. Operator<T> : T 타입을 받아서 T 타입을 리턴한다.
 * 람다식은 함수형 인터페이스의 추상 메소드를 구현하는 코드를 간결하게 표현하는 것이다.
 * 함다식 사용을 위한 함수형 인테페이스 조건
 * 추상 메소드가 1개인 인터페이스여야 한다.
 * static 메소드나 default 메소드가 있어도 된다.
 **/
public class FunctionTest {
    @Test
    public void 입력값만_있는_경우() {
        // Consumer<T> : T 타입을 받아서 아무값도 리턴하지 않는다.
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(3);
    }

    @Test
    public void 출력값만_있는_경우() {
        // Supplier<T> : T 타입의 값을 제공한다.
        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());
    }

    @Test
    public void 입력값과_출력값이_있는_경우() {
        // Function<T, R> : T 타입을 받아서 R 타입을 리턴한다.
        Function<Integer, Integer> function = (x) -> x * 2;
        System.out.println(function.apply(3));
    }

    @Test
    public void 입력값을_받아서_참_또는_거짓을_리턴하는_경우() {
        // Predicate<T> : T 타입을 받아서 boolean을 리턴한다.
        Predicate<Integer> predicate = (x) -> x > 0;
        System.out.println(predicate.test(3));
    }
}
