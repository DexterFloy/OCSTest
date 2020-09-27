package ocs.aqa.api;

import static ocs.aqa.api.utility.ValuesPropertiesHandling.getConfigProperties;
import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ocs.aqa.api.dto.Ocs_AthletesResponse_DTO;

public class Ocs_AthletesId_Test {
	private static Properties properties = getConfigProperties();
	private static WebTarget targetAPI;
	static Client client;
	private Ocs_AthletesResponse_DTO response;

	@BeforeClass
	public static void setup() {
		client = ClientBuilder.newClient();
	}

	@Before
	public void buildCall() {
		targetAPI = client.target(properties.getProperty("targetSite", "targetSite") + "/athletes/"
				+ properties.getProperty("ath_id", "ath_id"));
		response = targetAPI.request().get(Ocs_AthletesResponse_DTO.class);
	}

	@Test
	public void testOcsTest_AthletesId_Athlete_id() {
		assertNotNull(response.getAthlete_id());
	}

	@Test
	public void testOcsTest_AthletesId_Name() {
		assertNotNull(response.getName());
	}

	@Test
	public void testOcsTest_AthletesId_Surname() {
		assertNotNull(response.getSurname());
	}

	@Test
	public void testOcsTest_AthletesId_DateOfBirth() {
		assertNotNull(response.getDateOfBirth());
	}

	@Test
	public void testOcsTest_AthletesId_Bio() {
		assertNotNull(response.getBio());
	}

	@Test
	public void testOcsTest_AthletesId_Weight() {
		assertNotNull(response.getWeight());
	}

	@Test
	public void testOcsTest_AthletesId_Height() {
		assertNotNull(response.getHeight());
	}

	@Test
	public void testOcsTest_AthletesId_Photo_id() {
		assertNotNull(response.getPhoto_id());
	}
}
