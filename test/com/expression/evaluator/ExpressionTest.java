package com.expression.evaluator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionTest {

    @Test
    public void  withOneExpressionConstant(){
        Constant constant = new Constant(3);
        assertEquals(3.0, constant.evaluate(), 0);
    }

    @Test
    public void withThreeOneOperation(){
        Operation operation = new Operation('+', 3, 4);
        assertEquals(7.0, operation.evaluate(), 0);
    }

}
