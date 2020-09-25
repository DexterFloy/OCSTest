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

import ocs.aqa.api.dto.Ocs_AthletesResponse_DTO;

public class Ocs_GamesIdAthletes_Test {
	private static Properties properties = getConfigProperties();
	private static WebTarget targetAPI;
	static Client client;
	private List<Ocs_AthletesResponse_DTO> responseList;

	@BeforeClass
	public static void setup() {
		client = ClientBuilder.newClient();
	}

	@Before
	public void buildCall() {
		targetAPI = client.target(properties.getProperty("targetSite", "targetSite") + "/games/"
				+ properties.getProperty("gam_id", "gam_id") + "/athletes");
		responseList = targetAPI.request().get(new GenericType<List<Ocs_AthletesResponse_DTO>>() {
		});
	}

	@Test
	public void testOcsTest_GamesIdAthletes_Athlete_id() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getAthlete_id());
		}
	}

	@Test
	public void testOcsTest_GamesIdAthletes_Name() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getName());
		}
	}

	@Test
	public void testOcsTest_GamesIdAthletes_Surname() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getSurname());
		}
	}

	@Test
	public void testOcsTest_GamesIdAthletes_DateOfBirth() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getDateOfBirth());
		}
	}

	@Test
	public void testOcsTest_GamesIdAthletes_Bio() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getBio());
		}
	}

	@Test
	public void testOcsTest_GamesIdAthletes_Weight() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getWeight());
		}
	}

	@Test
	public void testOcsTest_GamesIdAthletes_Height() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getHeight());
		}
	}

	@Test
	public void testOcsTest_GamesIdAthletes_Photo_id() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getPhoto_id());
		}
	}
}
