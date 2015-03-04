import org.junit.Test;


import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ExpressionTest {

    @Test
    public void  withOneExpressionConstant(){
        Constant constant = new Constant(3);
        assertEquals(3, constant.evaluate());
        assertTrue("Integer".equals(constant.type()));
    }

    @Test
    public void withIntegerIntegerAddition() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Operation operation = Addition.execute(new Constant(3), new Constant(4));
        assertEquals(7, operation.evaluate());
        assertTrue("Integer".equals(operation.type()));
    }
    @Test
    public void withIntegerDoubleAddition() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Operation operation = Addition.execute(new Constant(3), new Constant(4.5));
        assertEquals(7.5,operation.evaluate());
        assertTrue("Double".equals(operation.type()));
        //assertThat(operation.evaluate(),is(7.5));
    }
    /*
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
    @Test
    public void withDifferentTypes(){
        Operation operation1 = new Addition(new Constant(3), new Constant(2));
        assertTrue(Integer.class.isInstance(operation1.evaluate()));
    }

    }*/
}
