/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatikabilangan.pangkat;

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
public class PangkatTest {
    
    public PangkatTest() {
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
     * Test of getAngka method, of class Pangkat.
     */
    @Test
    public void testGetAngka() {
        System.out.println("getAngka");
        int angka = 5;
        Pangkat instance = new Pangkat();
        double expResult = 3125.0;
        double result = instance.getAngka(angka);
        assertEquals(expResult, result, 0.0);

    }
    
}
