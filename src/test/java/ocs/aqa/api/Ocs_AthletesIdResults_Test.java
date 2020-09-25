package ocs.aqa.api;

import static ocs.aqa.api.utility.ValuesPropertiesHandling.getConfigProperties;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ocs.aqa.api.dto.OcsTest_AthletesResultsResponse_DTO;

public class Ocs_AthletesIdResults_Test {
	private static Properties properties = getConfigProperties();
	private static WebTarget targetAPI;
	List<OcsTest_AthletesResultsResponse_DTO> responseList;
	static Client client;

	@BeforeClass
	public static void setup() {
		client = ClientBuilder.newClient();
	}

	@Before
	public void buildCall() {
		targetAPI = client.target(properties.getProperty("targetSite", "targetSite") + "/athletes/"
				+ properties.getProperty("ath_id", "ath_id") + "/results");
		responseList = targetAPI.request().get(new GenericType<List<OcsTest_AthletesResultsResponse_DTO>>() {
		});
	}

	@Test
	public void testOcsTest_AthletesIdResults_City() {
		for (OcsTest_AthletesResultsResponse_DTO response : responseList) {
			assertNotNull(response.getCity());
		}
	}

	@Test
	public void testOcsTest_AthletesIdResults_Year() {
		for (OcsTest_AthletesResultsResponse_DTO response : responseList) {
			assertNotNull(response.getYear());
		}
	}

	@Test
	public void testOcsTest_AthletesIdResults_Gold() {
		for (OcsTest_AthletesResultsResponse_DTO response : responseList) {
			assertNotNull(response.getGold());
		}
	}

	@Test
	public void testOcsTest_AthletesIdResults_Silver() {
		for (OcsTest_AthletesResultsResponse_DTO response : responseList) {
			assertNotNull(response.getSilver());
		}
	}

	@Test
	public void testOcsTest_AthletesIdResults_Bronze() {
		for (OcsTest_AthletesResultsResponse_DTO response : responseList) {
			assertNotNull(response.getBronze());
		}
	}

	@Test
	public void testOcsTest_AthletesIdResults_Fourths() {
		for (OcsTest_AthletesResultsResponse_DTO response : responseList) {
			assertNotNull(response.getFourths());
		}
	}
}
