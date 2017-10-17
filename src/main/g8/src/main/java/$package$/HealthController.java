package $package$;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	private static final String NAME = "List Service";
	private static final String STATUS = "OK";

	@RequestMapping("/health")
	public Health getHealthCheck() {
		return getHealthResponse();
	}

	@RequestMapping("/$name$/health")
	public Health getServiceHealthCheck() {
		return getHealthResponse();
	}

	private Health getHealthResponse() {
		return new Health(NAME, STATUS);
	}
}
