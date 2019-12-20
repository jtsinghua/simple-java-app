package com.freetsinghua.simplejavaapp;

import com.freetsinghua.simplejavaapp.controller.StockController;
import com.freetsinghua.simplejavaapp.service.StockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

@WebMvcTest(controllers = {StockController.class})
public class SimpleJavaAppTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private StockService stockService;

    @Test
    void test() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get(
                        URI.create("http://localhost:8090/stock/fish/shake")))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
