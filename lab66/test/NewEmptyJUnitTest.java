/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static lab66.Lab66.carAssembly;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zain Asif
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        int a[][] = {{9, 5, 3, 2},{2, 2, 1, 4},{4,7,2,6}};
    int t[][] = {{0, 7, 4, 5},{0, 9, 2, 8},{7,5,0,2}};
    int e[] = {10, 12,9}, x[] = {18, 7,7};
  
    
      assertEquals(carAssembly(a, t, e, x),carAssembly(a, t, e, x));
    }
}
