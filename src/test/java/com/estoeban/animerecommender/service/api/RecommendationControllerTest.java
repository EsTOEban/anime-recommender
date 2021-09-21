/**
 * Anime Recommender Service
 * This is a server for the Anime Recommender Application.  
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: estoeban@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.estoeban.animerecommender.service.api;

import com.estoeban.animerecommender.service.model.RecommendationRequest;
import org.junit.Test;
import org.junit.Before;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.List;


/**
 * Anime Recommender Service
 *
 * <p>This is a server for the Anime Recommender Application.  
 *
 * API tests for RecommendationApi 
 */
public class RecommendationControllerTest {


    private RecommendationController api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

    }

    
    /**
     * Fetch Recommendations for user
     *
     */
    @Test
    public void getRecommendationsTest() {
        RecommendationRequest body = null;
        //ModelApiResponse response = api.getRecommendations(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}