/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 22:11:39 GMT 2023
 */

package main.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.CharBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.chrono.IsoChronology;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import main.java.CasaInteligente;
import main.java.Comercializador;
import main.java.Periodo;
import main.java.Simulador;
import main.java.SmartBulb;
import main.java.SmartDevice;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Simulador_ESTest extends Simulador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Simulador simulador0 = new Simulador(localDate0);
      simulador0.saltarDias((-1490));
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      simulador0.getCasa("5");
      assertFalse(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("| 3. Listar Dispositivos                           |");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      simulador0.createStatusFile("| 3. Listar Dispositivos                           |");
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Simulador simulador0 = Simulador.construirSimulador("nMPHT~M}$x=|lu");
      assertNull(simulador0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      boolean boolean0 = simulador0.getFaseInicial();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      MockRandom mockRandom0 = new MockRandom(2511L);
      Comercializador comercializador0 = new Comercializador("Jho-tyzsH", 0.0, (-307.3), mockRandom0);
      simulador0.addComercializador(comercializador0);
      simulador0.getComercializadores();
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      MockRandom mockRandom0 = new MockRandom((-716L));
      Comercializador comercializador0 = Comercializador.parse("F!9>FV", mockRandom0);
      CasaInteligente casaInteligente0 = new CasaInteligente("5", 450, comercializador0);
      simulador0.addCasa(casaInteligente0);
      simulador0.getCasasInteligentes();
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      Simulador simulador1 = simulador0.clone();
      assertFalse(simulador1.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      // Undeclared exception!
      try { 
        simulador0.startInterface((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      // Undeclared exception!
      try { 
        simulador0.setDispositivos((Map<String, SmartDevice>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      // Undeclared exception!
      try { 
        simulador0.setComercializadores((Map<String, Comercializador>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      // Undeclared exception!
      try { 
        simulador0.setCasasInteligentes((Map<Integer, CasaInteligente>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      Scanner scanner0 = new Scanner(pushbackInputStream0);
      // Undeclared exception!
      try { 
        simulador0.mudarValoresDeComercializador(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      // Undeclared exception!
      try { 
        simulador0.mudarValoresDeComercializador((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Comercializador", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      simulador0.getCasa((String) null);
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      Scanner scanner0 = new Scanner(datagramChannel0);
      Scanner scanner1 = scanner0.useRadix(3);
      Locale locale0 = Locale.ROOT;
      Scanner scanner2 = scanner1.useLocale(locale0);
      // Undeclared exception!
      try { 
        simulador0.mudarComercializadorDeCasa((CasaInteligente) null, scanner2);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      CasaInteligente casaInteligente0 = new CasaInteligente("`2Z2tE", (-3049), (Comercializador) null);
      // Undeclared exception!
      try { 
        simulador0.mudarComercializadorDeCasa(casaInteligente0, (Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Comercializador", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Simulador simulador0 = new Simulador((LocalDate) null);
      CasaInteligente casaInteligente0 = new CasaInteligente("74q(Yt", (-1584), (Comercializador) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(2);
      Scanner scanner0 = new Scanner(charBuffer0);
      casaInteligente0.escolherDivisao(scanner0);
      // Undeclared exception!
      try { 
        simulador0.ligarDesligarDispositivoDeCasa((CasaInteligente) null, scanner0);
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
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      Simulador simulador0 = new Simulador(localDate0);
      simulador0.getComercializadores();
      CasaInteligente casaInteligente0 = null;
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        simulador0.ligarDesligarDispositivoDeCasa((CasaInteligente) null, scanner0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      CasaInteligente casaInteligente0 = new CasaInteligente();
      // Undeclared exception!
      try { 
        simulador0.ligarDesligarDispositivoDeCasa(casaInteligente0, (Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.SmartDevice", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      Scanner scanner0 = new Scanner("");
      // Undeclared exception!
      try { 
        simulador0.gerirEntidades(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      // Undeclared exception!
      try { 
        simulador0.gerirEntidades((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      // Undeclared exception!
      try { 
        simulador0.gerirComercializadores((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(920L);
      Simulador simulador0 = new Simulador(localDate0);
      Scanner scanner0 = new Scanner(socketChannel0);
      // Undeclared exception!
      try { 
        simulador0.gerirCasa((CasaInteligente) null, scanner0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      CasaInteligente casaInteligente0 = new CasaInteligente();
      // Undeclared exception!
      try { 
        simulador0.gerirCasa(casaInteligente0, (Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.CasaInteligente", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner("]YNQ4+jQo6");
      // Undeclared exception!
      try { 
        simulador0.faseInicial(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      // Undeclared exception!
      try { 
        simulador0.faseInicial((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      StringReader stringReader0 = new StringReader("3");
      Scanner scanner0 = new Scanner(stringReader0);
      // Undeclared exception!
      try { 
        simulador0.criarDispositivo(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalDate localDate0 = MockLocalDate.now(zoneId0);
      Simulador simulador0 = new Simulador(localDate0);
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        simulador0.criarDispositivo(scanner0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      // Undeclared exception!
      try { 
        simulador0.criarDispositivo((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner("`'Z28E");
      scanner0.close();
      // Undeclared exception!
      try { 
        simulador0.criarDispositivo(scanner0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner(",g} Jx%WML-n(");
      // Undeclared exception!
      try { 
        simulador0.criarComercializador(scanner0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      // Undeclared exception!
      try { 
        simulador0.criarComercializador((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      Simulador simulador0 = new Simulador(localDate0);
      Scanner scanner0 = new Scanner("xPh|V");
      // Undeclared exception!
      try { 
        simulador0.criarComercializador(scanner0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      // Undeclared exception!
      try { 
        simulador0.createStatusFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Simulador.construirSimulador((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner("#}fy:");
      scanner0.next();
      // Undeclared exception!
      try { 
        simulador0.avancarTempo(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      // Undeclared exception!
      try { 
        simulador0.avancarTempo((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Simulador simulador0 = new Simulador((LocalDate) null);
      CasaInteligente casaInteligente0 = new CasaInteligente("74q(Yt", (-1584), (Comercializador) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(2);
      Scanner scanner0 = new Scanner(charBuffer0);
      simulador0.ligarDesligarDispositivoDeCasa(casaInteligente0, scanner0);
      // Undeclared exception!
      try { 
        simulador0.adicionarDivisaoACasa(casaInteligente0, scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      // Undeclared exception!
      try { 
        simulador0.adicionarDivisaoACasa((CasaInteligente) null, (Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner("i.)gWF>:");
      // Undeclared exception!
      try { 
        simulador0.adicionarDispositivoACasa((CasaInteligente) null, scanner0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      // Undeclared exception!
      try { 
        simulador0.addPeriodo((Periodo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      // Undeclared exception!
      try { 
        simulador0.addDispositivo((SmartDevice) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Simulador simulador0 = null;
      try {
        simulador0 = new Simulador((Simulador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Simulador simulador0 = new Simulador(localDate0);
      simulador0.saltarDias(0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Simulador simulador0 = new Simulador((LocalDate) null);
      Simulador simulador1 = new Simulador(simulador0);
      assertTrue(simulador1.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Simulador simulador0 = new Simulador((LocalDate) null);
      String string0 = simulador0.getNextId();
      assertTrue(simulador0.getFaseInicial());
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      Comercializador comercializador0 = new Comercializador("n*lC(eZj;m0hOrt?[", (-2168.183380725617), (-2168.183380725617));
      simulador0.addComercializador(comercializador0);
      simulador0.reset();
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      simulador0.printFaturas();
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      MockRandom mockRandom0 = new MockRandom((-716L));
      Comercializador comercializador0 = Comercializador.parse("F!9>FV", mockRandom0);
      simulador0.addComercializador(comercializador0);
      simulador0.createStatusFile("F!9>FV");
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      Comercializador comercializador0 = new Comercializador();
      CasaInteligente casaInteligente0 = new CasaInteligente((String) null, 2609, comercializador0);
      Scanner scanner0 = new Scanner("i.)gWF>:");
      simulador0.adicionarDivisaoACasa(casaInteligente0, scanner0);
      // Undeclared exception!
      try { 
        simulador0.gerirCasa(casaInteligente0, scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      StringReader stringReader0 = new StringReader("3");
      Scanner scanner0 = new Scanner(stringReader0);
      simulador0.adicionarDivisaoACasa((CasaInteligente) null, scanner0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Comercializador comercializador0 = new Comercializador();
      CasaInteligente casaInteligente0 = new CasaInteligente("m*#GmWwqT9[iNL", (-1501), comercializador0);
      simulador0.adicionarDispositivoACasa(casaInteligente0, (Scanner) null);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofYearDay(75, 75);
      Simulador simulador0 = new Simulador(localDate0);
      Scanner scanner0 = new Scanner("1");
      simulador0.gerirCasas(scanner0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner("`'Z28E");
      simulador0.gerirCasas(scanner0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      // Undeclared exception!
      try { 
        simulador0.gerirCasas((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      // Undeclared exception!
      try { 
        simulador0.gerirCasas((Scanner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      Scanner scanner0 = new Scanner(sequenceInputStream0);
      MockRandom mockRandom0 = new MockRandom((byte)2);
      Comercializador comercializador0 = new Comercializador("3.!2l}@F", (byte) (-6), (byte)2, mockRandom0);
      CasaInteligente casaInteligente0 = new CasaInteligente("| -> Nao conseguiu abrir/escrever ficheiro         |", (byte)2, comercializador0);
      simulador0.gerirCasa(casaInteligente0, scanner0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      Comercializador comercializador0 = new Comercializador();
      CasaInteligente casaInteligente0 = new CasaInteligente((String) null, 2609, comercializador0);
      Scanner scanner0 = new Scanner("i.)gWF>:");
      simulador0.gerirCasa(casaInteligente0, scanner0);
      assertFalse(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner("| -> Escolha um comercializador valido             |");
      simulador0.mudarComercializadorDeCasa((CasaInteligente) null, scanner0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      simulador0.mudarComercializadorDeCasa((Scanner) null);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      StringReader stringReader0 = new StringReader("3");
      Scanner scanner0 = new Scanner(stringReader0);
      simulador0.mudarValoresDeComercializador(scanner0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      Scanner scanner0 = new Scanner(sequenceInputStream0);
      simulador0.criarDispositivo(scanner0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      simulador0.criarCasa(scanner0);
      assertFalse(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      simulador0.listarDispositivos();
      assertFalse(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      simulador0.listarCasas();
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Simulador simulador0 = new Simulador(localDate0);
      simulador0.listarComercializadores();
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner("i.)gWF>:");
      simulador0.gerirComercializadores(scanner0);
      // Undeclared exception!
      try { 
        simulador0.mudarComercializadorDeCasa((CasaInteligente) null, scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      simulador0.gerirComercializadores(scanner0);
      assertFalse(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      simulador0.gerirEntidades(scanner0);
      // Undeclared exception!
      try { 
        simulador0.gerirComercializadores(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      char[] charArray0 = new char[6];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      Scanner scanner0 = new Scanner(charArrayReader0);
      simulador0.avancarTempo(scanner0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Scanner scanner0 = new Scanner("O modo do dispositivo que escolher sera trocado");
      // Undeclared exception!
      try { 
        simulador0.startInterface(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Simulador simulador0 = new Simulador(localDate0);
      simulador0.saltarDias(2);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Simulador simulador0 = Simulador.construirSimulador("");
      assertNull(simulador0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      // Undeclared exception!
      try { 
        simulador0.addComercializador((Comercializador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      simulador0.getData();
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      Scanner scanner0 = new Scanner("");
      // Undeclared exception!
      try { 
        simulador0.criarComercializador(scanner0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      Simulador simulador0 = new Simulador(localDate0);
      // Undeclared exception!
      try { 
        simulador0.addCasa((CasaInteligente) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Simulador", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Map<String, Comercializador> map0 = simulador0.getComercializadores();
      simulador0.setComercializadores(map0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      simulador0.getDispositivo("!!\u0000!2\u0003");
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      Map<String, SmartDevice> map0 = simulador0.getDispositivos();
      simulador0.setDispositivos(map0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Simulador simulador0 = new Simulador(localDate0);
      SmartBulb smartBulb0 = new SmartBulb();
      simulador0.addDispositivo(smartBulb0);
      assertEquals("1", smartBulb0.getID());
      
      simulador0.saltarDias(2);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Simulador simulador0 = new Simulador();
      Map<Integer, CasaInteligente> map0 = simulador0.getCasasInteligentes();
      simulador0.setCasasInteligentes(map0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Simulador simulador0 = new Simulador(true);
      simulador0.getComercializador("F!9>FV");
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Simulador simulador0 = new Simulador(localDate0);
      simulador0.saltarDias(localDate0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Simulador simulador0 = new Simulador(false);
      simulador0.setFaseInicial(false);
      assertFalse(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Periodo periodo0 = new Periodo(localDate0, localDate0);
      Simulador simulador0 = new Simulador();
      simulador0.addPeriodo(periodo0);
      assertTrue(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Simulador simulador0 = new Simulador(localDate0);
      Simulador simulador1 = simulador0.clone();
      assertTrue(simulador1.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      Simulador simulador0 = new Simulador(localDate0);
      boolean boolean0 = simulador0.getFaseInicial();
      assertTrue(boolean0);
  }
}