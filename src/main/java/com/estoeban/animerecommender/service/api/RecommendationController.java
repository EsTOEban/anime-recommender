package com.estoeban.animerecommender.service.api;

import com.estoeban.animerecommender.service.model.ModelApiResponse;
import com.estoeban.animerecommender.service.model.RecommendationRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Anime Recommender Service
 *
 * <p>This is a server for the Anime Recommender Application.
 */
@RestController
@RequestMapping("/recommendations")
@Api(value = "/", description = "")
public class RecommendationController {

    /**
     * Fetch Recommendations for user
     */
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Fetch Recommendations for user", tags = {"Recommendation"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ModelApiResponse.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found")})
    ModelApiResponse getRecommendations(RecommendationRequest body) {
        return new ModelApiResponse();
    }
}

