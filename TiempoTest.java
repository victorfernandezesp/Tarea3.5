package eedTiempo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiempoTest {
  Tiempo pruebaTiempo;
  Tiempo pruebaTiempo2;
  Tiempo pruebaTiempo3;
  Tiempo pruebaTiempo4;
  Tiempo pruebaTiempo5;
  Tiempo pruebaTiempo6;

  @BeforeEach
  void setUp() throws Exception {
    pruebaTiempo = new Tiempo(10, 11, 12);
    pruebaTiempo2 = new Tiempo (23,12,34);
    pruebaTiempo3 = new Tiempo (12,12,12);
    pruebaTiempo4 = new Tiempo (21,12,34);
    
    pruebaTiempo5 = new Tiempo (10,12,10);
    pruebaTiempo6 = new Tiempo (10,12,10);
  }
  
  @Test
  void testTiempo() {
    assertDoesNotThrow(() -> {
      Tiempo pruebaTiempo = new Tiempo (23,12,34);
      assertEquals(23, pruebaTiempo.getHoras());
      assertEquals(12, pruebaTiempo.getMinutos());
      assertEquals(34, pruebaTiempo.getSegundos());

      pruebaTiempo = new Tiempo (12,12,12);
      assertEquals(12, pruebaTiempo.getHoras());
      assertEquals(12, pruebaTiempo.getMinutos());
      assertEquals(12, pruebaTiempo.getSegundos());
    });
  }

  @Test
  void testGetHoras() throws CantidadNegativaException {
      Tiempo pruebaTiempo4 = new Tiempo(21,12,34);
      assertEquals(21, pruebaTiempo4.getHoras() );
      
      try {
        pruebaTiempo3 = new Tiempo(-21,41,12);
      } catch (CantidadNegativaException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  }

  @Test
  void testGetMinutos() throws CantidadNegativaException {
    Tiempo pruebaTiempo4 = new Tiempo(21,12,34);
    assertEquals(12, pruebaTiempo4.getMinutos() );
    try {
      pruebaTiempo3 = new Tiempo(21,-41,12);
    } catch (CantidadNegativaException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }  

  @Test
  void testGetSegundos() throws CantidadNegativaException{
    
    Tiempo pruebaTiempo4 = new Tiempo(21,12,34);
    assertEquals(34, pruebaTiempo4.getSegundos() );
    
    try {
      pruebaTiempo3 = new Tiempo(21,41,-12);
    } catch (CantidadNegativaException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }

  @Test
  void testSumaTiempo() throws CantidadNegativaException {
      Tiempo pruebaTiempo5 = new Tiempo(10,12,10);
      Tiempo pruebaTiempo6 = new Tiempo(10,12,10);
      Tiempo pruebaTiempo7 = pruebaTiempo5.suma(pruebaTiempo6);
      assertEquals(20, pruebaTiempo7.getSegundos());
      assertEquals(24, pruebaTiempo7.getMinutos());
      assertEquals(20, pruebaTiempo7.getHoras());
  
  }

  @Test
  void testSumaIntIntInt() throws CantidadNegativaException {
    pruebaTiempo5 = new Tiempo(1,2,3);
    pruebaTiempo5.suma(3, 2, 1);
    assertEquals(4, pruebaTiempo5.getSegundos());
    assertEquals(4, pruebaTiempo5.getMinutos());
    assertEquals(4, pruebaTiempo5.getHoras());  }

}
