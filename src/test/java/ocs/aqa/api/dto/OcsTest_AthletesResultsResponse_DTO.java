package ocs.aqa.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class OcsTest_AthletesResultsResponse_DTO {	

	private String city;
	private Integer year;
	private Integer gold;
	private Integer silver;
	private Integer bronze;
	private Integer fourths;

}