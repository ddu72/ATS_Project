/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 22:17:32 GMT 2023
 */

package main.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.time.chrono.MinguoDate;
import java.util.NoSuchElementException;
import java.util.Scanner;
import main.java.SmartDevice;
import main.java.SmartSpeaker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartSpeaker_ESTest extends SmartSpeaker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2115541612, "4j{wT_>", "l?shp]]L+Wz>");
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      smartSpeaker1.setVolume(6);
      boolean boolean0 = smartSpeaker1.equals(smartSpeaker0);
      assertEquals(6, smartSpeaker1.getVolume());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-3898), "4j{wT_>", "l?shp]]L+Wz>");
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      assertTrue(smartSpeaker1.equals((Object)smartSpeaker0));
      
      smartSpeaker0.setCustoInstalacao(756.0);
      boolean boolean0 = smartSpeaker1.equals(smartSpeaker0);
      assertFalse(smartSpeaker1.equals((Object)smartSpeaker0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 0, "", "", 5.0);
      smartSpeaker0.setVolume(0);
      assertEquals(5.0, smartSpeaker0.getConsumoDiario(), 0.01);
      assertEquals(0, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 0, "J$R2WseZh,$P", "J$R2WseZh,$P");
      assertEquals(0, smartSpeaker0.getVolume());
      
      smartSpeaker0.setVolume(100);
      assertEquals(100, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2507, "Qg,~#;", "+--------------------------------------------------+");
      int int0 = smartSpeaker0.getVolume();
      assertEquals(100, int0);
      assertEquals("+--------------------------------------------------+", smartSpeaker0.getRadio());
      assertEquals("Qg,~#;", smartSpeaker0.getMarca());
      assertEquals(5.5, smartSpeaker0.getConsumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 6, ", Tamanho: ", (String) null);
      String string0 = smartSpeaker0.getRadio();
      assertNull(string0);
      assertEquals(0.8, smartSpeaker0.getConsumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 3404, "3tQH~^]T=p5", "", (-1955.676122119));
      String string0 = smartSpeaker0.getRadio();
      assertEquals(100, smartSpeaker0.getVolume());
      assertEquals((-1955.676122119), smartSpeaker0.getConsumoDiario(), 0.01);
      assertEquals("", string0);
      assertEquals("3tQH~^]T=p5", smartSpeaker0.getMarca());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-979), (String) null, "2TBj2\"");
      String string0 = smartSpeaker0.getMarca();
      assertNull(string0);
      assertEquals(0.5, smartSpeaker0.getConsumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-1), "", "Fatura para a casa de ", (-935.66139972));
      String string0 = smartSpeaker0.getMarca();
      assertEquals("", string0);
      assertEquals((-935.66139972), smartSpeaker0.getConsumoDiario(), 0.01);
      assertEquals("Fatura para a casa de ", smartSpeaker0.getRadio());
      assertEquals(0, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-2118), "", "+--------------------------------------------------+");
      smartSpeaker0.volumeUp();
      smartSpeaker0.clone();
      assertEquals(1, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-2118), "", "+--------------------------------------------------+");
      smartSpeaker0.setCustoInstalacao((-2118));
      SmartSpeaker smartSpeaker1 = smartSpeaker0.clone();
      assertEquals(0, smartSpeaker1.getVolume());
      assertEquals("+--------------------------------------------------+", smartSpeaker1.getRadio());
      assertEquals(0.5, smartSpeaker1.getConsumoDiario(), 0.01);
      assertTrue(smartSpeaker1.equals((Object)smartSpeaker0));
      assertEquals("", smartSpeaker1.getMarca());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-2595), (String) null, (String) null, 0.0);
      SmartSpeaker smartSpeaker1 = smartSpeaker0.clone();
      assertEquals(0.0, smartSpeaker1.getConsumoDiario(), 0.01);
      assertEquals(0, smartSpeaker1.getVolume());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker();
      SmartSpeaker smartSpeaker1 = smartSpeaker0.clone();
      assertEquals(0, smartSpeaker1.getVolume());
      assertEquals("N/A", smartSpeaker1.getMarca());
      assertEquals("N/A", smartSpeaker1.getRadio());
      assertTrue(smartSpeaker1.equals((Object)smartSpeaker0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-4377L));
      // Undeclared exception!
      try { 
        SmartSpeaker.parse("j5T (o}&G", mockRandom0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"j5T (o}&G\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        SmartSpeaker.parse((String) null, mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.SmartSpeaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2, "Neutral", (String) null, 2);
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      // Undeclared exception!
      try { 
        smartSpeaker1.equals(smartSpeaker0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Scanner scanner0 = new Scanner("");
      // Undeclared exception!
      try { 
        SmartSpeaker.criarSmartSpeaker(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      Scanner scanner0 = new Scanner(socketChannel0);
      // Undeclared exception!
      try { 
        SmartSpeaker.criarSmartSpeaker(scanner0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = ',';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      Scanner scanner0 = new Scanner(charArrayReader0);
      // Undeclared exception!
      try { 
        SmartSpeaker.criarSmartSpeaker(scanner0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\u0000\u0000\u0000\u0000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        SmartSpeaker.criarSmartSpeaker((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.SmartSpeaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Scanner scanner0 = new Scanner("8K ");
      scanner0.close();
      // Undeclared exception!
      try { 
        SmartSpeaker.criarSmartSpeaker(scanner0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = null;
      try {
        smartSpeaker0 = new SmartSpeaker((SmartSpeaker) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.SmartDevice", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-2632), "OAD*+OJ'6w", "OAD*+OJ'6w", (-2415.063949849361));
      smartSpeaker0.getRadio();
      assertEquals((-2415.063949849361), smartSpeaker0.getConsumoDiario(), 0.01);
      assertEquals(0, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-979), (String) null, "2TBj2\"");
      smartSpeaker0.calcularConsumoDiario();
      assertEquals(0.5, smartSpeaker0.getConsumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker();
      String string0 = smartSpeaker0.getMarca();
      assertEquals("N/A", smartSpeaker0.getRadio());
      assertEquals("N/A", string0);
      assertEquals(0, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2, "Neutral", "Neutral", (-2877.370332359734));
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      assertTrue(smartSpeaker1.equals((Object)smartSpeaker0));
      
      smartSpeaker1.setRadio("u");
      boolean boolean0 = smartSpeaker1.equals(smartSpeaker0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker();
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      assertEquals("N/A", smartSpeaker1.getMarca());
      
      smartSpeaker1.setMarca("+--------------------------------------------------+\n");
      boolean boolean0 = smartSpeaker1.equals(smartSpeaker0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-3904), "4j{wT_>", "l?shp]]L+Wz>");
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      smartSpeaker1.setVolume(6);
      boolean boolean0 = smartSpeaker1.equals(smartSpeaker0);
      assertEquals(6, smartSpeaker1.getVolume());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-3904), "4j{wT_>", "l?shp]]L+Wz>");
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      assertTrue(smartSpeaker1.equals((Object)smartSpeaker0));
      
      smartSpeaker0.setID("l?shp]]L+Wz>");
      boolean boolean0 = smartSpeaker1.equals(smartSpeaker0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker();
      smartSpeaker0.setCustoInstalacao(4055.963371345087);
      SmartSpeaker smartSpeaker1 = new SmartSpeaker();
      boolean boolean0 = smartSpeaker0.equals(smartSpeaker1);
      assertFalse(smartSpeaker1.equals((Object)smartSpeaker0));
      assertEquals(0, smartSpeaker1.getVolume());
      assertFalse(boolean0);
      assertEquals("N/A", smartSpeaker1.getRadio());
      assertEquals("N/A", smartSpeaker1.getMarca());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2, "Neutral", "Neutral", 2);
      SmartSpeaker smartSpeaker1 = new SmartSpeaker();
      boolean boolean0 = smartSpeaker1.equals(smartSpeaker0);
      assertEquals(2.0, smartSpeaker0.getConsumoDiario(), 0.01);
      assertEquals("N/A", smartSpeaker1.getRadio());
      assertEquals(0, smartSpeaker1.getVolume());
      assertEquals(2, smartSpeaker0.getVolume());
      assertFalse(boolean0);
      assertEquals("N/A", smartSpeaker1.getMarca());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2, "N!eutFal", "bX", 2);
      SmartSpeaker smartSpeaker1 = new SmartSpeaker(smartSpeaker0);
      boolean boolean0 = smartSpeaker1.equals(smartSpeaker0);
      assertEquals(2, smartSpeaker0.getVolume());
      assertEquals("bX", smartSpeaker1.getRadio());
      assertEquals("N!eutFal", smartSpeaker1.getMarca());
      assertEquals(2, smartSpeaker1.getVolume());
      assertEquals(2.0, smartSpeaker1.getConsumoDiario(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-979), (String) null, "2TBj2\"");
      boolean boolean0 = smartSpeaker0.equals((Object) null);
      assertEquals(0.5, smartSpeaker0.getConsumoDiario(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2, "N!eutFal", "bX", 2);
      boolean boolean0 = smartSpeaker0.equals(smartSpeaker0);
      assertEquals("bX", smartSpeaker0.getRadio());
      assertTrue(boolean0);
      assertEquals("N!eutFal", smartSpeaker0.getMarca());
      assertEquals(2, smartSpeaker0.getVolume());
      assertEquals(2.0, smartSpeaker0.getConsumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.ON;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2, "N!eutFal", "bX", 2);
      MinguoDate minguoDate0 = MockMinguoDate.now();
      boolean boolean0 = smartSpeaker0.equals(minguoDate0);
      assertFalse(boolean0);
      assertEquals("bX", smartSpeaker0.getRadio());
      assertEquals("N!eutFal", smartSpeaker0.getMarca());
      assertEquals(2.0, smartSpeaker0.getConsumoDiario(), 0.01);
      assertEquals(2, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Scanner scanner0 = new Scanner("eur9al");
      // Undeclared exception!
      try { 
        SmartSpeaker.criarSmartSpeaker(scanner0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("main.java.SmartSpeaker", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2507, "Qg,~#;", "+--------------------------------------------------+");
      smartSpeaker0.volumeDown();
      assertEquals(99, smartSpeaker0.getVolume());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2507, "Qg,~#;", "+--------------------------------------------------+");
      smartSpeaker0.volumeUp();
      assertEquals(100, smartSpeaker0.getVolume());
      assertEquals("+--------------------------------------------------+", smartSpeaker0.getRadio());
      assertEquals("Qg,~#;", smartSpeaker0.getMarca());
      assertEquals(5.5, smartSpeaker0.getConsumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-2118), "", "+--------------------------------------------------+");
      smartSpeaker0.setVolume((-2118));
      assertEquals(0, smartSpeaker0.getVolume());
      assertEquals(0.5, smartSpeaker0.getConsumoDiario(), 0.01);
      assertEquals("+--------------------------------------------------+", smartSpeaker0.getRadio());
      assertEquals("", smartSpeaker0.getMarca());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-2632), "OAD*+OJ'6w", "OAD*+OJ'6w", (-2415.063949849361));
      int int0 = smartSpeaker0.getVolume();
      assertEquals((-2415.063949849361), smartSpeaker0.getConsumoDiario(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2507, "Qg,~#;", "+--------------------------------------------------+");
      smartSpeaker0.setVolume(1147);
      assertEquals(100, smartSpeaker0.getVolume());
      assertEquals("Qg,~#;", smartSpeaker0.getMarca());
      assertEquals("+--------------------------------------------------+", smartSpeaker0.getRadio());
      assertEquals(5.5, smartSpeaker0.getConsumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SmartSpeaker smartSpeaker0 = new SmartSpeaker();
      smartSpeaker0.volumeDown();
      assertEquals("N/A", smartSpeaker0.getMarca());
      assertEquals(0, smartSpeaker0.getVolume());
      assertEquals("N/A", smartSpeaker0.getRadio());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, (-979), (String) null, "2TBj2\"");
      String string0 = smartSpeaker0.toString();
      assertEquals("Coluna, id: , OFF, 0", string0);
      assertEquals(0.5, smartSpeaker0.getConsumoDiario(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 1, "$m60 ", "$m60 ");
      smartSpeaker0.volumeDown();
      assertEquals(0, smartSpeaker0.getVolume());
      assertEquals(0.55, smartSpeaker0.getConsumoDiario(), 0.01);
  }
}