package io.opentelemetry.example.flight;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import java.util.concurrent.TimeUnit;
//import java.util.Date;

@RestController

public class FlightController {

	 private static final Logger LOGGER = LoggerFactory.getLogger(FlightController.class);

	private FlightService flightService;

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}

	@GetMapping("/flights")
    public List<Flight> greeting(@RequestParam(value = "origin", defaultValue = "India") String origin) {
    	LOGGER.info("Before Service Method Call");
//		try
//		{
//			System.out.println("Start of delay: "+ new Date());
//			// Delay for 7 seonds
//			TimeUnit.SECONDS.sleep(7);
//			System.out.println("End of delay: "+ new Date());
//		}
//		catch(InterruptedException ex)
//		{
//			ex.printStackTrace();
//		}
        return flightService.getFlights(origin);
    }

}
