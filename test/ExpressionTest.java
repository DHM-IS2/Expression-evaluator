import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpressionTest {

    @Test
    public void  withOneExpressionConstant(){
        Constant constant = new Constant(3);
        assertEquals(3.0, constant.evaluate(), 0);
    }

    @Test
    public void withAddition(){
        Operation operation = new Addition(new Constant(3),new Constant(4));
        assertEquals(7.0, operation.evaluate(), 0);
    }
    @Test
    public void withSubtract(){
        Operation operation = new Subtraction(new Constant(5),new Constant(4));
        assertEquals(1.0, operation.evaluate(), 0);
    }
    @Test
    public void withMultiplication(){
        Operation operation = new Multiplication(new Constant(2),new Constant(4));
        assertEquals(8.0,operation.evaluate(),0);
    }
    @Test
    public void withDivision(){
        Operation operation = new Division(new Constant(9),new Constant(2));
        assertEquals(4.5,operation.evaluate(),0);
    }
    @Test
    public void withTwoOperations(){
        Operation operation2 = new Subtraction(new Constant(2),new Constant(1));
        Operation operation = new Addition(operation2 ,new Constant(5));
        assertEquals(6.0,operation.evaluate(),0);
    }
    @Test
    public void withThreeOperations(){
        Operation operation2 = new Subtraction(new Constant(2),new Constant(1));
        Operation operation3 = new Addition(new Constant(1),new Constant(3));
        Operation operation = new Subtraction(operation3 ,operation2);
        assertEquals(3.0,operation.evaluate(),0);
    }

}
