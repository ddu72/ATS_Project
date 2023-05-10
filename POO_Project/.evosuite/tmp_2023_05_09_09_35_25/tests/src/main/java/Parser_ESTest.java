/*
 * This file was automatically generated by EvoSuite
 * Tue May 09 08:42:27 GMT 2023
 */

package src.main.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import src.main.java.CasaInteligente;
import src.main.java.Comercializador;
import src.main.java.Parser;
import src.main.java.Simulador;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parser parser0 = new Parser("Uv?2r");
      MockRandom mockRandom0 = new MockRandom(385L);
      Comercializador comercializador0 = new Comercializador("GX=O\"nU|>.p(,I", 0.5, 0.5, mockRandom0);
      CasaInteligente casaInteligente0 = new CasaInteligente("", 1709, comercializador0);
      Simulador simulador0 = new Simulador();
      parser0.eventoCasa(casaInteligente0, "GX=O\"nU|>.p(,I", simulador0);
      assertEquals(1709, casaInteligente0.getNif());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser("");
      parser0.simular((Simulador) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser((String) null);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      Simulador simulador0 = new Simulador(localDate0);
      // Undeclared exception!
      try { 
        parser0.simular(simulador0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser("| -> Escolha uma opcao                                   |");
      // Undeclared exception!
      try { 
        parser0.parseLocalDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parser parser0 = new Parser("6");
      // Undeclared exception!
      try { 
        parser0.parseLocalDate("6");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("src.main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = new Parser((String) null);
      // Undeclared exception!
      try { 
        parser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser("0Bw;=]K?");
      try { 
        parser0.lerFicheiro("0Bw;=]K?");
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = new Parser("");
      // Undeclared exception!
      try { 
        parser0.lerFicheiro((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = new Parser("");
      try { 
        parser0.lerFicheiro("");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser parser0 = new Parser((String) null);
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = new Comercializador((String) null, 0.0, 0.0, mockRandom0);
      // Undeclared exception!
      try { 
        parser0.eventoComercializador(comercializador0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser parser0 = new Parser("");
      Month month0 = Month.AUGUST;
      LocalDate localDate0 = MockLocalDate.of(1, month0, 1);
      Simulador simulador0 = new Simulador(localDate0);
      // Undeclared exception!
      try { 
        parser0.eventoCasa((CasaInteligente) null, "", simulador0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser parser0 = new Parser("U>?2r");
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = new Comercializador("U>?2r", 1709, 1709, mockRandom0);
      CasaInteligente casaInteligente0 = new CasaInteligente("U>?2r", 1709, comercializador0);
      casaInteligente0.addRoom("U>?2r");
      Simulador simulador0 = new Simulador();
      // Undeclared exception!
      try { 
        parser0.eventoCasa(casaInteligente0, "U>?2r", simulador0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("src.main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser parser0 = new Parser("or#DaV~o2E");
      Comercializador comercializador0 = new Comercializador();
      // Undeclared exception!
      try { 
        parser0.eventoComercializador(comercializador0, "alteraValorCusto");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("src.main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parser parser0 = new Parser((String) null);
      Comercializador comercializador0 = new Comercializador((String) null, 0.0, 0.0);
      // Undeclared exception!
      try { 
        parser0.eventoComercializador(comercializador0, "alteraValorDesconto");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("src.main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser("seItAlOff");
      Comercializador comercializador0 = new Comercializador();
      parser0.eventoComercializador(comercializador0, ":^}/kE{[JTi]Znk`lpV");
      assertEquals((-1.0), comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = new Parser("");
      // Undeclared exception!
      try { 
        parser0.parseLocalDate("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parser parser0 = new Parser("");
      Simulador simulador0 = parser0.parse();
      assertNull(simulador0);
  }
}