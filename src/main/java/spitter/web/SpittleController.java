package spitter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spitter.data.SpittleRepository;

@Controller
public class SpittleController {

	private SpittleRepository spittleRepository;

	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}

}
