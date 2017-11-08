package come.greenfox.pkrisz0.guardians;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@EnableWebMvc
public class GuardianControlTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void guardiansGrootTranslatorTest() throws Exception {
        mockMvc.perform(get("/groot?message=srlthlerdtjelryho"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.translated", is("I am Groot!")));
    }

    @Test
    public void guardiansGrootTranslatorErrorTest() throws Exception {
        mockMvc.perform(get("/groot"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("I am Groot!")));
    }

    @Test
    public void guardiansYonduTest() throws Exception {
        mockMvc.perform(get("/yondu?distance=100.0&time=500"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.speed", is(0.2)));
    }

    @Test
    public void guardiansYonduInfinityTest() throws Exception {
        mockMvc.perform(get("/yondu?distance=100.0&time=0"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.speed", is("Infinity")));
    }

    @Test
    public void guardiansYonduErrorTest() throws Exception {
        mockMvc.perform(get("/yondu"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("When I picked you up as a kid, " +
                        "these boys wanted to eat you. They ain't never tasted Terran before. " +
                        "I saved your life! GIVE SOME PARAMETERS")));
    }

    @Test
    public void guardiansYonduErrorTimeTest() throws Exception {
        mockMvc.perform(get("/yondu?distance=100.0"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please add a value for time!")));
    }

    @Test
    public void guardiansYonduErrorDistanceTest() throws Exception {
        mockMvc.perform(get("/yondu?time=100.0"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please add a value for distance!")));
    }
}