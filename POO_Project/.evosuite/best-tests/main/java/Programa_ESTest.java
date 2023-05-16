/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 22:23:31 GMT 2023
 */

package main.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Scanner;
import main.java.Programa;
import main.java.Simulador;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Programa_ESTest extends Programa_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Programa.guardarEstadoAtual(simulador0, "x1Rj'usOL-/,v=QVg");
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Programa.guardarEstadoAtual(simulador0, "");
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Scanner scanner0 = new Scanner("2");
      String string0 = Programa.escolherFicheiro("", scanner0);
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Scanner scanner0 = new Scanner("\n");
      String string0 = Programa.escolherFicheiro("", scanner0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Programa.main((String[]) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      Scanner scanner0 = new Scanner("");
      // Undeclared exception!
      try { 
        Programa.guardarEstadoAtual(simulador0, scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      // Undeclared exception!
      try { 
        Programa.guardarEstadoAtual(simulador0, (Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Programa", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Simulador simulador0 = new Simulador((LocalDate) null);
      // Undeclared exception!
      try { 
        Programa.guardarEstadoAtual(simulador0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      // Undeclared exception!
      try { 
        Programa.escolherFicheiro("", scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Scanner scanner0 = new Scanner("2");
      scanner0.close();
      // Undeclared exception!
      try { 
        Programa.escolherFicheiro("", scanner0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Programa.guardarEstadoAtual((Simulador) null, "'S=0-QrqIV");
      // Undeclared exception!
      try { 
        Programa.escolherFicheiro("", (Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Programa", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SystemInUtil.addInputLine("3F-z");
      Programa.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner("| 1. Avancar no tempo                              |");
      Programa.guardarEstadoAtual(simulador0, scanner0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Programa programa0 = new Programa();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Programa.guardarEstadoAtual((Simulador) null, "README.md");
      // Undeclared exception!
      try { 
        Programa.escolherFicheiro("", (Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Programa", e);
      }
  }
}
