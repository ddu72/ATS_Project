/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 22:22:28 GMT 2023
 */

package main.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import main.java.Comercializador;
import main.java.Fatura;
import main.java.SmartBulb;
import main.java.SmartDevice;
import main.java.SmartSpeaker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Comercializador_ESTest extends Comercializador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("s`w`}XLi=4(}%G$,", (-397.1), (-397.1));
      comercializador0.setFatorImpostos((-397.1));
      comercializador0.change();
      assertEquals((-397.1), comercializador0.getCustoDiarioKwh(), 0.01);
      assertEquals((-397.1), comercializador0.getFatorImpostos(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      comercializador0.setCustoDiarioKwh(283.906950293);
      comercializador0.change();
      assertEquals(283.906950293, comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      mockRandom0.nextGaussian();
      Comercializador comercializador0 = Comercializador.parse("", mockRandom0);
      assertEquals(1.2, comercializador0.getFatorImpostos(), 0.01);
      assertEquals(0.060000000000000005, comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      SmartBulb smartBulb0 = new SmartBulb(1925);
      double double0 = comercializador0.precoDiaPorDispositivo(smartBulb0);
      assertEquals("N/A", comercializador0.getNome());
      assertEquals(-0.0, double0, 0.01);
      assertEquals((-1.0), comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("-> ", 0.05, 5000000.0);
      SmartBulb smartBulb0 = new SmartBulb();
      double double0 = comercializador0.precoDiaPorDispositivo(smartBulb0);
      assertEquals(675000.1350000001, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      comercializador0.setFatorImpostos(0.0);
      assertEquals((-1.0), comercializador0.getFatorImpostos(), 0.01);
      
      comercializador0.change();
      SmartDevice.Modo smartDevice_Modo0 = SmartDevice.Modo.OFF;
      SmartSpeaker smartSpeaker0 = new SmartSpeaker(smartDevice_Modo0, 2159, "S3/4", "q/fD_0s&9LR");
      double double0 = comercializador0.precoDiaPorDispositivo(smartSpeaker0);
      assertEquals(0.0, comercializador0.getFatorImpostos(), 0.01);
      assertEquals((-4.95), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador((String) null, (-1518.9841719312024), (-1518.9841719312024));
      comercializador0.getNome();
      assertEquals((-1518.9841719312024), comercializador0.getCustoDiarioKwh(), 0.01);
      assertEquals((-1518.9841719312024), comercializador0.getFatorImpostos(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("", 1.0, (-2152.5));
      comercializador0.getNome();
      assertEquals((-2152.5), comercializador0.getFatorImpostos(), 0.01);
      assertEquals(1.0, comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = Comercializador.parse("=afChy1:{yA+ff:T", mockRandom0);
      comercializador0.setFaturasEmitidas((List<Fatura>) null);
      comercializador0.getFaturasEmitidas();
      assertEquals(0.05, comercializador0.getCustoDiarioKwh(), 0.01);
      assertEquals(1.1, comercializador0.getFatorImpostos(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      Fatura fatura0 = new Fatura("| -> Digite os novos valores do comercializador no formato CustoDiarioKwh, FatorImpostos    |", (LocalDate) null, (LocalDate) null, 1454.3653020276, 1454.3653020276);
      comercializador0.addFatura(fatura0);
      comercializador0.getFaturasEmitidas();
      assertEquals((-1.0), comercializador0.getFatorImpostos(), 0.01);
      assertEquals((-1.0), comercializador0.getCustoDiarioKwh(), 0.01);
      assertEquals("N/A", comercializador0.getNome());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("", (-1341.2993884194), (-1341.2993884194));
      double double0 = comercializador0.getFatorImpostos();
      assertEquals((-1341.2993884194), comercializador0.getCustoDiarioKwh(), 0.01);
      assertEquals((-1341.2993884194), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1L);
      Comercializador comercializador0 = new Comercializador("LV", 0.0, 0.0, mockRandom0);
      double double0 = comercializador0.getCustoDiarioKwh();
      assertEquals(0.0, comercializador0.getFatorImpostos(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      double double0 = comercializador0.getCustoDiarioKwh();
      assertEquals("N/A", comercializador0.getNome());
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), comercializador0.getFatorImpostos(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Comercializador> hashMap0 = new HashMap<String, Comercializador>();
      Scanner scanner0 = new Scanner("%.2f");
      MockRandom mockRandom0 = new MockRandom(0L);
      Comercializador comercializador0 = new Comercializador((String) null, (-3981.134186161825), (-3981.134186161825), mockRandom0);
      hashMap0.put("%.2f", comercializador0);
      Comercializador comercializador1 = Comercializador.escolherComercializador(hashMap0, scanner0);
      assertEquals((-3981.134186161825), comercializador1.getCustoDiarioKwh(), 0.01);
      assertNotNull(comercializador1);
      assertEquals((-3981.134186161825), comercializador1.getFatorImpostos(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("4ufo}PLQ;", 700.0, 0.0);
      Comercializador comercializador1 = comercializador0.clone();
      assertTrue(comercializador1.equals((Object)comercializador0));
      assertEquals(700.0, comercializador1.getCustoDiarioKwh(), 0.01);
      assertEquals(0.0, comercializador1.getFatorImpostos(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      Comercializador comercializador0 = new Comercializador("b_-7J*qpfG>4FZ5", 0.0, (-715.979843294), mockRandom0);
      Comercializador comercializador1 = comercializador0.clone();
      assertEquals(0.0, comercializador1.getCustoDiarioKwh(), 0.01);
      assertEquals((-715.979843294), comercializador1.getFatorImpostos(), 0.01);
      assertTrue(comercializador1.equals((Object)comercializador0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador((String) null, (-1518.9841719312024), (-1518.9841719312024));
      Comercializador comercializador1 = comercializador0.clone();
      assertEquals((-1518.9841719312024), comercializador1.getFatorImpostos(), 0.01);
      assertEquals((-1518.9841719312024), comercializador1.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("| -> Digite os novos valores do comercializador no formato CustoDiarioKwh, FatorImpostos    |", 3040.792739570217, 0.0);
      // Undeclared exception!
      try { 
        comercializador0.setFaturas((List<Fatura>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = Comercializador.parse("=afChy1:{yA+ff:T", mockRandom0);
      comercializador0.setFaturasEmitidas((List<Fatura>) null);
      // Undeclared exception!
      try { 
        comercializador0.printFaturas();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Comercializador.parse(",", (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Comercializador", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (-683));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Scanner scanner0 = new Scanner(bufferedInputStream0);
      // Undeclared exception!
      try { 
        comercializador0.mudarValores(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = Comercializador.parse("main.java.Periodo", mockRandom0);
      SocketChannel socketChannel0 = SocketChannel.open();
      Scanner scanner0 = new Scanner(socketChannel0);
      // Undeclared exception!
      try { 
        comercializador0.mudarValores(scanner0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("e*Tqcg\r%>JnVW", 2366.4634584, 4081.828);
      Scanner scanner0 = new Scanner("e*Tqcg\r%>JnVW");
      // Undeclared exception!
      try { 
        comercializador0.mudarValores(scanner0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = Comercializador.parse("=afChy1:{yA+ff:T", mockRandom0);
      // Undeclared exception!
      try { 
        comercializador0.mudarValores((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Comercializador", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("Camera, id: ", 198.85051, 283.906950293);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-88), (byte)111);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        comercializador0.mudarValores(scanner0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, Comercializador> hashMap0 = new HashMap<String, Comercializador>();
      Scanner scanner0 = new Scanner("");
      // Undeclared exception!
      try { 
        Comercializador.escolherComercializador(hashMap0, scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, Comercializador> hashMap0 = new HashMap<String, Comercializador>();
      DatagramChannel datagramChannel0 = DatagramChannel.open();
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        Comercializador.escolherComercializador(hashMap0, scanner0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<String, Comercializador> hashMap0 = new HashMap<String, Comercializador>();
      // Undeclared exception!
      try { 
        Comercializador.escolherComercializador(hashMap0, (Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Comercializador", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      LinkedList<Fatura> linkedList0 = new LinkedList<Fatura>();
      linkedList0.add((Fatura) null);
      comercializador0.setFaturasEmitidas(linkedList0);
      // Undeclared exception!
      try { 
        comercializador0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.ReferencePipeline$3$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Comercializador comercializador0 = null;
      try {
        comercializador0 = new Comercializador((Comercializador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Comercializador", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Comercializador comercializador0 = null;
      try {
        comercializador0 = new Comercializador("^!4Z.|v%", (-1.0), 0.0, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Formula", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = Comercializador.parse("CWTcD}Nxs\"ywo-E'5+j", mockRandom0);
      Comercializador comercializador1 = new Comercializador(comercializador0);
      assertTrue(comercializador1.equals((Object)comercializador0));
      assertEquals(1.1, comercializador1.getFatorImpostos(), 0.01);
      assertEquals(0.05, comercializador1.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("", (-1341.2993884194), (-1341.2993884194));
      comercializador0.setNome("8K1:D/GmQn");
      MockRandom mockRandom0 = new MockRandom(0L);
      Comercializador comercializador1 = Comercializador.parse("", mockRandom0);
      boolean boolean0 = comercializador0.equals(comercializador1);
      assertEquals(0.05, comercializador1.getCustoDiarioKwh(), 0.01);
      assertEquals(1.1, comercializador1.getFatorImpostos(), 0.01);
      assertEquals((-1341.2993884194), comercializador0.getCustoDiarioKwh(), 0.01);
      assertEquals((-1341.2993884194), comercializador0.getFatorImpostos(), 0.01);
      assertFalse(boolean0);
  }

  /*
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("", (-1341.2993884194), (-1341.2993884194));
      MockRandom mockRandom0 = new MockRandom(0L);
      Comercializador comercializador1 = Comercializador.parse("", mockRandom0);
      boolean boolean0 = comercializador0.equals(comercializador1);
      assertEquals(1.1, comercializador1.getFatorImpostos(), 0.01);
      assertEquals((-1341.2993884194), comercializador0.getCustoDiarioKwh(), 0.01);
      assertEquals((-1341.2993884194), comercializador0.getFatorImpostos(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.05, comercializador1.getCustoDiarioKwh(), 0.01);
  }
*/
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      boolean boolean0 = comercializador0.equals((Object) null);
      assertEquals((-1.0), comercializador0.getFatorImpostos(), 0.01);
      assertEquals("N/A", comercializador0.getNome());
      assertEquals((-1.0), comercializador0.getCustoDiarioKwh(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      boolean boolean0 = comercializador0.equals(comercializador0);
      assertEquals("N/A", comercializador0.getNome());
      assertTrue(boolean0);
      assertEquals((-1.0), comercializador0.getFatorImpostos(), 0.01);
      assertEquals((-1.0), comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = Comercializador.parse("=afChy1:{yA+ff:T", mockRandom0);
      boolean boolean0 = comercializador0.equals("=afChy1:{yA+ff:T (CustoKwh: 0.0500, Fator Impostos: 1.1000)");
      assertEquals(1.1, comercializador0.getFatorImpostos(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.05, comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      comercializador0.setFatorImpostos(0.0);
      assertEquals((-1.0), comercializador0.getFatorImpostos(), 0.01);
      
      comercializador0.change();
      double double0 = comercializador0.getFatorImpostos();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      comercializador0.setCustoDiarioKwh((-1883.0065616787556));
      comercializador0.change();
      assertEquals((-1883.0065616787556), comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, Comercializador> hashMap0 = new HashMap<String, Comercializador>();
      Scanner scanner0 = new Scanner("%.2f");
      Comercializador comercializador0 = new Comercializador("MQdg!w>7)em", 1.0, 1.0);
      hashMap0.put("%.2f", comercializador0);
      Comercializador comercializador1 = Comercializador.escolherComercializador(hashMap0, scanner0);
      assertEquals(1.0, comercializador1.getFatorImpostos(), 0.01);
      assertNotNull(comercializador1);
      assertEquals(1.0, comercializador1.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HashMap<String, Comercializador> hashMap0 = new HashMap<String, Comercializador>();
      Scanner scanner0 = new Scanner("lambda$formula1$d08c20f4$1");
      Comercializador comercializador0 = Comercializador.escolherComercializador(hashMap0, scanner0);
      assertNull(comercializador0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      HashMap<String, Comercializador> hashMap0 = new HashMap<String, Comercializador>();
      byte[] byteArray0 = new byte[4];
      hashMap0.put("main.java.Fatura", comercializador0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2514), 2145040811);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      Scanner scanner0 = new Scanner(pushbackInputStream0);
      // Undeclared exception!
      try { 
        Comercializador.escolherComercializador(hashMap0, scanner0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = Comercializador.parse("=afChy1:{yA+ff:T", mockRandom0);
      double double0 = comercializador0.getFatorImpostos();
      assertEquals(1.1, double0, 0.01);
      assertEquals(0.05, comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = Comercializador.parse("=afChy1:{yA+ff:T", mockRandom0);
      double double0 = comercializador0.getCustoDiarioKwh();
      assertEquals(1.1, comercializador0.getFatorImpostos(), 0.01);
      assertEquals(0.05, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("", (-1341.2993884194), (-1341.2993884194));
      comercializador0.printFaturas();
      assertEquals((-1341.2993884194), comercializador0.getFatorImpostos(), 0.01);
      assertEquals((-1341.2993884194), comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      String string0 = comercializador0.toString();
      assertEquals("N/A (CustoKwh: -1.0000, Fator Impostos: -1.0000)", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Comercializador comercializador0 = Comercializador.parse("=afChy1:{yA+ff:T", mockRandom0);
      comercializador0.getNome();
      assertEquals(1.1, comercializador0.getFatorImpostos(), 0.01);
      assertEquals(0.05, comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("Camera, id: ", 198.85051, 283.906950293);
      Comercializador comercializador1 = comercializador0.clone();
      assertEquals(283.906950293, comercializador1.getFatorImpostos(), 0.01);
      assertEquals(198.85051, comercializador1.getCustoDiarioKwh(), 0.01);
      assertTrue(comercializador1.equals((Object)comercializador0));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador();
      // Undeclared exception!
      try { 
        comercializador0.precoDiaPorDispositivo((SmartDevice) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Formula", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comercializador comercializador0 = new Comercializador("", (-1341.2993884194), (-1341.2993884194));
      List<Fatura> list0 = comercializador0.getFaturasEmitidas();
      comercializador0.setFaturas(list0);
      assertEquals((-1341.2993884194), comercializador0.getFatorImpostos(), 0.01);
      assertEquals((-1341.2993884194), comercializador0.getCustoDiarioKwh(), 0.01);
  }
}
