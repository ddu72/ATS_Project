/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 21:08:00 GMT 2023
 */

package smarthouse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;
import smarthouse.Periodo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Periodo_ESTest extends Periodo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Periodo periodo0 = new Periodo((LocalDate) null, (LocalDate) null);
      LocalDate localDate0 = periodo0.getInicio();
      assertNull(localDate0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Periodo periodo0 = new Periodo((LocalDate) null, (LocalDate) null);
      LocalDate localDate0 = periodo0.getFim();
      assertNull(localDate0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Periodo> linkedList0 = new LinkedList<Periodo>();
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Scanner scanner0 = new Scanner(charBuffer0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(423L);
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      linkedList0.add(periodo0);
      // Undeclared exception!
      try { 
        Periodo.escolherPeriodo(linkedList0, scanner0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\u0000\u0000\u0000\u0000\u0000\u0000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Periodo> linkedList0 = new LinkedList<Periodo>();
      LocalDate localDate0 = MockLocalDate.now();
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      linkedList0.add(periodo0);
      // Undeclared exception!
      try { 
        Periodo.escolherPeriodo(linkedList0, (Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("smarthouse.Periodo", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      Periodo periodo1 = new Periodo(localDate0, (LocalDate) null);
      // Undeclared exception!
      try { 
        periodo1.equals(periodo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("smarthouse.Periodo", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Periodo periodo0 = null;
      try {
        periodo0 = new Periodo((Periodo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("smarthouse.Periodo", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Periodo periodo0 = new Periodo((LocalDate) null, (LocalDate) null);
      Periodo periodo1 = new Periodo(periodo0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Month month0 = Month.MAY;
      LocalDate localDate0 = MockLocalDate.of(2762, month0, 1);
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      String string0 = periodo0.toString();
      assertEquals("Periodo de 2762-05-01 a 2762-05-01", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      Periodo periodo1 = new Periodo(localDate0, (LocalDate) null);
      boolean boolean0 = periodo0.equals(periodo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      Periodo periodo1 = new Periodo((LocalDate) null, localDate0);
      boolean boolean0 = periodo0.equals(periodo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      boolean boolean0 = periodo0.equals(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      boolean boolean0 = periodo0.equals(periodo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Month month0 = Month.MAY;
      LocalDate localDate0 = MockLocalDate.of(2762, month0, 1);
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      boolean boolean0 = periodo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Periodo> linkedList0 = new LinkedList<Periodo>();
      Periodo periodo0 = Periodo.escolherPeriodo(linkedList0, (Scanner) null);
      assertNull(periodo0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Periodo> linkedList0 = new LinkedList<Periodo>();
      LocalDate localDate0 = MockLocalDate.now();
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      linkedList0.add(periodo0);
      Scanner scanner0 = new Scanner("");
      // Undeclared exception!
      try { 
        Periodo.escolherPeriodo(linkedList0, scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      LocalDate localDate1 = periodo0.getInicio();
      assertSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Month month0 = Month.MAY;
      LocalDate localDate0 = MockLocalDate.of(2762, month0, 1);
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      LocalDate localDate1 = periodo0.getFim();
      assertSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      Periodo periodo1 = periodo0.clone();
      boolean boolean0 = periodo1.equals(periodo0);
      assertTrue(boolean0);
  }
}
