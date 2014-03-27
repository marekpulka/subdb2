package com.origamicode.subdb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeClassTest {

  @Test
  public void shouldAdd() {
    SomeClass a = new SomeClass();
    assertEquals(4, a.add(2, 2));
  }

}
