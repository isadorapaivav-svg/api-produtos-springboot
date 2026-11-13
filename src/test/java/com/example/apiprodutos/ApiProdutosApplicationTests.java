
package com.example.apiprodutos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ApiProdutosApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    private static final String AUTH =
            "Basic YWRtaW46QWRtaW5AMTIz";

    @Test
    void deveCadastrarProduto() throws Exception {
        mockMvc.perform(post("/api/produtos")
                .header("Authorization", AUTH)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"nome\":\"Mouse\",\"preco\":50,\"quantidade\":10}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("Mouse"));
    }

    @Test
    void deveListarProdutos() throws Exception {
        mockMvc.perform(get("/api/produtos")
                .header("Authorization", AUTH))
                .andExpect(status().isOk());
    }

    @Test
    void deveRejeitarProdutoInvalido() throws Exception {
        mockMvc.perform(post("/api/produtos")
                .header("Authorization", AUTH)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"nome\":\"\",\"preco\":-10,\"quantidade\":-1}"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.nome").exists())
                .andExpect(jsonPath("$.preco").exists())
                .andExpect(jsonPath("$.quantidade").exists());
    }
}
