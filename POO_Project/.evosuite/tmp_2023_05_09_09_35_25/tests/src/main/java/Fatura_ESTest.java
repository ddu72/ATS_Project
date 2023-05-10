/*
 * This file was automatically generated by EvoSuite
 * Tue May 09 08:52:32 GMT 2023
 */

package src.main.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;
import src.main.java.Fatura;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Fatura_ESTest extends Fatura_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalDate localDate0 = MockLocalDate.from(localDateTime0);
      Fatura fatura0 = new Fatura("", localDate0, localDate0, (-96.57709), (-96.57709));
      Fatura fatura1 = new Fatura(fatura0);
      assertEquals((-96.57709), fatura1.getConsumo(), 0.01);
      assertEquals((-96.57709), fatura1.getCusto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Fatura fatura0 = new Fatura((String) null, localDate0, localDate0, 0.0, 0.0);
      fatura0.getNome();
      assertEquals(0.0, fatura0.getCusto(), 0.01);
      assertEquals(0.0, fatura0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalDate localDate0 = MockLocalDate.from(localDateTime0);
      Fatura fatura0 = new Fatura("", localDate0, localDate0, (-96.57709), (-96.57709));
      fatura0.getNome();
      assertEquals((-96.57709), fatura0.getCusto(), 0.01);
      assertEquals((-96.57709), fatura0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.of(0, 0, 0);
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      Fatura fatura0 = new Fatura("", localDate0, localDate0, (-1.0), 0);
      double double0 = fatura0.getCusto();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1.0), fatura0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fatura fatura0 = new Fatura((String) null, (LocalDate) null, (LocalDate) null, (-1534.76), (-21.0));
      double double0 = fatura0.getCusto();
      assertEquals((-1534.76), fatura0.getConsumo(), 0.01);
      assertEquals((-21.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Fatura fatura0 = new Fatura((String) null, localDate0, localDate0, 0.0, 0.0);
      double double0 = fatura0.getConsumo();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, fatura0.getCusto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.of(0, 0, 0);
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      Fatura fatura0 = new Fatura("", localDate0, localDate0, (-1.0), 0);
      double double0 = fatura0.getConsumo();
      assertEquals(0.0, fatura0.getCusto(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Fatura fatura0 = new Fatura("w/VB_cr>3Nc)xl#!C", localDate0, localDate0, 0.0, 0.0);
      Fatura fatura1 = fatura0.clone();
      assertEquals(0.0, fatura1.getConsumo(), 0.01);
      assertEquals(0.0, fatura1.getCusto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalDate localDate0 = MockLocalDate.from(localDateTime0);
      Fatura fatura0 = new Fatura("", localDate0, localDate0, (-96.57709), (-96.57709));
      Fatura fatura1 = fatura0.clone();
      assertEquals((-96.57709), fatura1.getCusto(), 0.01);
      assertEquals((-96.57709), fatura1.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Fatura fatura0 = null;
      try {
        fatura0 = new Fatura((Fatura) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("src.main.java.Fatura", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Fatura fatura0 = new Fatura("X@PtkR#jP9j@wn>E%7", (LocalDate) null, (LocalDate) null, 304.0, 304.0);
      fatura0.getPeriodo();
      assertEquals(304.0, fatura0.getConsumo(), 0.01);
      assertEquals(304.0, fatura0.getCusto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Fatura fatura0 = new Fatura("X@PtkR#jP9j@wn>E%7", (LocalDate) null, (LocalDate) null, 304.0, 304.0);
      fatura0.getNome();
      assertEquals(304.0, fatura0.getCusto(), 0.01);
      assertEquals(304.0, fatura0.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Fatura fatura0 = new Fatura("X@PtkR#jP9j@wn>E%7", (LocalDate) null, (LocalDate) null, 304.0, 304.0);
      double double0 = fatura0.getCusto();
      assertEquals(304.0, fatura0.getConsumo(), 0.01);
      assertEquals(304.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Fatura fatura0 = new Fatura("X@PtkR#jP9j@wn>E%7", (LocalDate) null, (LocalDate) null, 304.0, 304.0);
      String string0 = fatura0.toString();
      assertEquals("\nFatura para a casa de X@PtkR#jP9j@wn>E%7\nPeriodo de null a null\nConsumo: 304.0000Kwh, Custo: 304.0000\n", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Fatura fatura0 = new Fatura("X@PtkR#jP9j@wn>E%7", (LocalDate) null, (LocalDate) null, 304.0, 304.0);
      double double0 = fatura0.getConsumo();
      assertEquals(304.0, fatura0.getCusto(), 0.01);
      assertEquals(304.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Fatura fatura0 = new Fatura("X@PtkR#jP9j@wn>E%7", (LocalDate) null, (LocalDate) null, 304.0, 304.0);
      Fatura fatura1 = fatura0.clone();
      assertEquals(304.0, fatura1.getCusto(), 0.01);
      assertEquals(304.0, fatura1.getConsumo(), 0.01);
  }
}