/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 22:15:59 GMT 2023
 */

package main.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import main.java.CasaInteligente;
import main.java.Comercializador;
import main.java.Parser;
import main.java.Simulador;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parser parser0 = new Parser("");
      parser0.simular((Simulador) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser((String) null);
      // Undeclared exception!
      try { 
        parser0.simular((Simulador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = new Parser("88!5F$B3Yl");
      // Undeclared exception!
      try { 
        parser0.parseLocalDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser("8");
      // Undeclared exception!
      try { 
        parser0.parseLocalDate("8");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Parser parser0 = new Parser(";!cdh,I$+O'q");
      try { 
        parser0.lerFicheiro(";!cdh,I$+O'q");
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser("P8K%)*gOa(*Mb_9 9");
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
  public void test07()  throws Throwable  {
      Parser parser0 = new Parser("");
      try { 
        parser0.lerFicheiro("");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = new Parser((String) null);
      // Undeclared exception!
      try { 
        parser0.eventoComercializador((Comercializador) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser parser0 = new Parser("| -> Escreve o novo comercializador no formato Nome, CustoDiarioKwh, FatorImpostos      |");
      CasaInteligente casaInteligente0 = new CasaInteligente();
      // Undeclared exception!
      try { 
        parser0.eventoCasa(casaInteligente0, ";", (Simulador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser parser0 = new Parser(" nac em dispositivos");
      CasaInteligente casaInteligente0 = new CasaInteligente();
      Simulador simulador0 = new Simulador(false);
      parser0.eventoCasa(casaInteligente0, " nac em dispositivos", simulador0);
      assertFalse(simulador0.getFaseInicial());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser parser0 = new Parser("alteraValorCusto");
      Comercializador comercializador0 = new Comercializador("alteraValorCusto", 1218L, 1218L);
      // Undeclared exception!
      try { 
        parser0.eventoComercializador(comercializador0, "alteraValorCusto");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser parser0 = new Parser("alteraValorDesconto");
      Comercializador comercializador0 = new Comercializador();
      // Undeclared exception!
      try { 
        parser0.eventoComercializador(comercializador0, "alteraValorDesconto");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("main.java.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parser parser0 = new Parser("O\teaVlmrfs9onto");
      Comercializador comercializador0 = new Comercializador();
      parser0.eventoComercializador(comercializador0, "O\teaVlmrfs9onto");
      assertEquals((-1.0), comercializador0.getCustoDiarioKwh(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = new Parser("O\teaVlmrfs9onto");
      // Undeclared exception!
      try { 
        parser0.parseLocalDate("O\teaVlmrfs9onto");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"O\teaVlmrfs9onto\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser parser0 = new Parser("O\teaVlmrfs9onto");
      Simulador simulador0 = parser0.parse();
      assertNull(simulador0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parser parser0 = new Parser("| 6. Sair                                                |");
      Comercializador comercializador0 = new Comercializador("| 6. Sair                                                |", (-1.0), (-604L));
      CasaInteligente casaInteligente0 = new CasaInteligente("| 6. Sair                                                |", (-2013572980), comercializador0);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      hashMap0.put("| 6. Sair                                                |", linkedList0);
      casaInteligente0.setLocations(hashMap0);
      Simulador simulador0 = new Simulador(true);
      // Undeclared exception!
      try { 
        parser0.eventoCasa(casaInteligente0, "| 6. Sair                                                |", simulador0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("main.java.Parser", e);
      }
  }
}