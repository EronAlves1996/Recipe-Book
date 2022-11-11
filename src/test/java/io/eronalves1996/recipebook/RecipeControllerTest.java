package io.eronalves1996.recipebook;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(RecipesController.class)
public class RecipeControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void testHome() throws Exception {
    mockMvc.perform(get("/"))
        .andExpect(status().isOk())
        .andExpect(view().name("home"))
        .andExpect(content().string(
            containsString("Livro de Receitas")))
        .andExpect(content().string(containsStringIgnoringCase("Delicioso Bolo de Maracujá")))
        .andExpect(content().string(containsStringIgnoringCase("Delicioso Frango Caramelizado")));
  }

  @Test
  public void testChicken() throws Exception {
    mockMvc.perform(get("/chicken"))
        .andExpect(status().isOk())
        .andExpect(view().name("chicken"))
        .andExpect(content().string(containsString("Frango Caramelizado")))
        .andExpect(content().string(containsStringIgnoringCase(
            "Mexa com uma escumadeira apenas uma vez para misturar os ingredientes e deixe até o frango ficar bem dourado.")));            
  }

  @Test
  public void testCake() throws Exception {
    mockMvc.perform(get("/cake"))
    .andExpect(status().isOk())
    .andExpect(view().name("cake"))
    .andExpect(content().string(containsString("Bolo de Maracujá")));
  }

}
