/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatikabilangan.bagi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fika.dwi
 */
public class BagiTest {
    
    public BagiTest() {
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

    /**
     * Test of getAngka method, of class Bagi.
     */
    @Test
    public void testGetAngka() {
        System.out.println("getAngka");
        int angka = 4;
        Bagi instance = new Bagi();
        double expResult = 1.0;
        double result = instance.getAngka(angka);
        assertEquals(expResult, result, 0.0);

    }
    
}
