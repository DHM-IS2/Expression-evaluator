import com.expression.evaluator.Expression;
import org.junit.Test;

public class ExpressionTest {

    @Test
    public void voidTree (){
        Expression expression = new Expression();
        assertEqual(0, expression.getSize());
    }
}
