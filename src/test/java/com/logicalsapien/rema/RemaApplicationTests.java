package com.logicalsapien.rema;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RemaApplicationTests {

  @Test
  void contextLoads() {
    RemaApplication.main(new String[] {});
    assertThat(true).isTrue();
  }

}
