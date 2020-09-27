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

import ocs.aqa.api.dto.OcsTest_GamesResponse_DTO;

public class Ocs_Games_Test {
	private static Properties properties = getConfigProperties();
	private static WebTarget targetAPI;
	static Client client;
	private List<OcsTest_GamesResponse_DTO> responseList;

	@BeforeClass
	public static void setup() {
		client = ClientBuilder.newClient();
	}

	@Before
	public void buildCall() {
		targetAPI = client.target(properties.getProperty("targetSite", "targetSite") + "/games");
		responseList = targetAPI.request().get(new GenericType<List<OcsTest_GamesResponse_DTO>>() {
		});
	}

	@Test
	public void testOcsTest_Games_Game_id() {
		for (OcsTest_GamesResponse_DTO response : responseList) {
			assertNotNull(response.getGame_id());
		}
	}

	@Test
	public void testOcsTest_Games_City() {
		for (OcsTest_GamesResponse_DTO response : responseList) {
			assertNotNull(response.getCity());
		}
	}

	@Test
	public void testOcsTest_Games_Year() {
		for (OcsTest_GamesResponse_DTO response : responseList) {
			assertNotNull(response.getYear());
		}
	}

}
