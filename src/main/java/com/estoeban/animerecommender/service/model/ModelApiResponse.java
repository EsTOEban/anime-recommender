package com.estoeban.animerecommender.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import java.util.List;

@Data
public class ModelApiResponse {

    @JsonProperty("code")
    @ApiModelProperty(value = "")
    private String code;

    @JsonProperty("message")
    @ApiModelProperty(value = "")
    private String message;

    @JsonProperty("recommendations")
    @ApiModelProperty(value = "")
    @Valid
    private List<Anime> recommendations = null;

    public ModelApiResponse code(String code) {
        this.code = code;
        return this;
    }

    public ModelApiResponse message(String message) {
        this.message = message;
        return this;
    }

    public ModelApiResponse recommendations(List<Anime> recommendations) {
        this.recommendations = recommendations;
        return this;
    }

    public ModelApiResponse addRecommendationsItem(Anime recommendationsItem) {
        this.recommendations.add(recommendationsItem);
        return this;
    }

}

