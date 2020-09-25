package ocs.aqa.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class OcsTest_GamesResponse_DTO {

	private Integer game_id;
	private String city;
	private Integer year;
	
}
