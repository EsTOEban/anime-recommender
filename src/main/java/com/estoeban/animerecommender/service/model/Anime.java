package com.estoeban.animerecommender.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Anime {

    @JsonProperty("animeId")
    @ApiModelProperty(value = "")
    private String animeId;

    @JsonProperty("description")
    @ApiModelProperty(value = "")
    private String description;
}

