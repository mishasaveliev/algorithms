import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpressionSolverTest {

    @Test
    public void adds1and1(){
        assertEquals(2.0, ExpressionSolver.solve("1+1"), 0.01);
    }

    @Test
    public void split(){
        assertEquals(new String[] {"1","+","1"}, ExpressionSolver.split("1+1"));
    }

    @Test
    public void parentheses(){
        assertEquals(15.0, ExpressionSolver.solve("5*(1+2)"), 0.01);
    }

    @Test
    public void parenthesesThreeNumbers(){
        assertEquals(15.0, ExpressionSolver.solve("5*(1+1+1)"), 0.01);
    }
}
