package com.cognizant.spring_learn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringLearnApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetCountryException() throws Exception {
        mvc.perform(get("/country/az")).andExpect(status().isNotFound()).andExpect(jsonPath("$.message").value("Country not found"))
            .andExpect(jsonPath("$.status").value(404)).andExpect(jsonPath("$.path").value("/country/az"));
    }


}
