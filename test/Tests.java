
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import testquadraticequation.QuadraticEquation;


public class Tests {
    
    QuadraticEquation qe;
    
    public Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testRootNumber(){
        qe = new QuadraticEquation(2.0, 3.0, 4.0);
        int expValue = 0;
        int actualValue = qe.rootNumber();
        Assert.assertEquals(expValue, actualValue);
    }
    
    @Test
    public void testCalculateDiscriminant(){
        qe = new QuadraticEquation(2.0, 6.0, 3.0);
        Assert.assertEquals(12.0, qe.calculateDiscriminant(), 0.0);
    }
}
