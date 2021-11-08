import com.fretron.Calculator
import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {
    @Test
    fun shouldMultiply2by2() {
        val calc = Calculator()
        val result = calc.parse("2 * 2")
        assertEquals(4,result)
    }

    @Test
    fun shouldDivide2by2(){
        val calc = Calculator()
        val result = calc.parse("2 / 2")
        assertEquals(1,result)
    }
}