package spitter.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception {
		//given
		HomeController controller = new HomeController();
		MockMvc mvcMock = standaloneSetup(controller).build();

		//when
		ResultActions result = mvcMock.perform(get("/"));

		//then
		result.andExpect(view().name("home"));
	}

}
