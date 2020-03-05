/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana04.Trabajos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ario1
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double a = 3.0;
        double b = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 6.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of potencia method, of class Calculadora.
     */
    @Test
    public void testPotencia() {
        System.out.println("potencia");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.potencia(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RAIZCuadrada method, of class Calculadora.
     */
    @Test
    public void testRAIZCuadrada() {
        System.out.println("RAIZCuadrada");
        double a = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.RAIZCuadrada(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NumLetras method, of class Calculadora.
     */
    @Test
    public void testNumLetras() {
        System.out.println("NumLetras");
        String p = "";
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.NumLetras(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IngresoHoraMevotaMinutos method, of class Calculadora.
     */
    @Test
    public void testIngresoHoraMevotaMinutos() {
        System.out.println("IngresoHoraMevotaMinutos");
        int a = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.IngresoHoraMevotaMinutos(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeGrFahrenheitACelsios method, of class Calculadora.
     */
    @Test
    public void testDeGrFahrenheitACelsios() {
        System.out.println("DeGrFahrenheitACelsios");
        double f = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.DeGrFahrenheitACelsios(f);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mayorDeDosNumeros method, of class Calculadora.
     */
    @Test
    public void testMayorDeDosNumeros() {
        System.out.println("mayorDeDosNumeros");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.mayorDeDosNumeros(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MayorDeTresNumeros method, of class Calculadora.
     */
    @Test
    public void testMayorDeTresNumeros() {
        System.out.println("MayorDeTresNumeros");
        int a = 0;
        int b = 0;
        int c = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.MayorDeTresNumeros(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LetraEnUnaPosicion method, of class Calculadora.
     */
    @Test
    public void testLetraEnUnaPosicion() {
        System.out.println("LetraEnUnaPosicion");
        String p = "";
        int index = 0;
        Calculadora instance = new Calculadora();
        char expResult = ' ';
        char result = instance.LetraEnUnaPosicion(p, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
