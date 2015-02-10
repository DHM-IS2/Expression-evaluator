import org.junit.Test;

import java.beans.PropertyVetoException;

import static org.junit.Assert.assertEquals;

public class ExpressionTest {

    @Test
    public void  withOneExpressionConstant(){
        Constant constant = new Constant(3);
        assertEquals(3.0, constant.evaluate(), 0);
    }

    @Test       //propuesta de nombre(withOneOperation)
    public void withThreeOneOperation(){
        Operation operation = new Operation('+', new Constant(3),new Constant(4));
        assertEquals(7.0, operation.evaluate(), 0);
    }
    @Test
    public void withTwoOperations(){
        Operation operation2 = new Operation('-',new Constant(2),new Constant(1));
        Operation operation = new Operation('+', operation2 ,new Constant(5));
        assertEquals(6.0,operation.evaluate(),0);
    }
    @Test
    public void withThreeOperations(){
        Operation operation2 = new Operation('-',new Constant(2),new Constant(1));
        Operation operation3 = new Operation('+',new Constant(1),new Constant(3));
        Operation operation = new Operation('-', operation3 ,operation2);
        assertEquals(3.0,operation.evaluate(),0);
    }

}
