package com.estoeban.animerecommender.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RecommendationRequest {

    @JsonProperty("animeId")
    @ApiModelProperty(value = "")
    private String animeId;

    @JsonProperty("degreesOfSeparation")
    @ApiModelProperty(value = "")
    private Integer degreesOfSeparation;

}

