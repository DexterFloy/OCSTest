package ocs.aqa.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Ocs_AthletesResponse_DTO {

	private String athlete_id;
	private String name;
	private String surname;
	private String dateOfBirth;
	private String bio;
	private Integer weight;
	private Integer height;
	private Integer photo_id;
	
}
