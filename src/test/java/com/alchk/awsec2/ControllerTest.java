package com.alchk.awsec2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MainController.class)
public class ControllerTest {

    @MockBean
    private DummyJpaRepository dummyJpaRepository;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void test() throws Exception {

        Arrays.stream(applicationContext.getBeanDefinitionNames())
                        .forEach(System.out::println);

        Mockito.when(this.dummyJpaRepository.findAll()).thenReturn(List.of());

        this.mockMvc.perform(get("/main/dummy"))
                .andExpect(status().isNotFound());
    }
}
