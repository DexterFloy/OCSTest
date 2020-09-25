package ocs.aqa.api;

import static ocs.aqa.api.utility.ValuesPropertiesHandling.getConfigProperties;
import static org.junit.Assert.assertNotNull;

import java.util.Properties;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ocs.aqa.api.dto.Ocs_AthletesResponse_DTO;

public class Ocs_Athletes_Test {

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
		targetAPI = client.target(properties.getProperty("targetSite", "targetSite") + "/athletes");
		responseList = targetAPI.request().get(new GenericType<List<Ocs_AthletesResponse_DTO>>() {
		});
	}

	@Test
	public void testOcsTest_Athletes_Athlete_id() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getAthlete_id());
		}
	}

	@Test
	public void testOcsTest_Athletes_Name() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getName());
		}
	}

	@Test
	public void testOcsTest_Athletes_Surname() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getSurname());
		}
	}

	@Test
	public void testOcsTest_Athletes_DateOfBirth() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getDateOfBirth());
		}
	}

	@Test
	public void testOcsTest_Athletes_Bio() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getBio());
		}
	}

	@Test
	public void testOcsTest_Athletes_Weight() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getWeight());
		}
	}

	@Test
	public void testOcsTest_Athletes_Height() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getHeight());
		}
	}

	@Test
	public void testOcsTest_Athletes_Photo_id() {
		for (Ocs_AthletesResponse_DTO response : responseList) {
			assertNotNull(response.getPhoto_id());
		}
	}
}