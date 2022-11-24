package com.recipe.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.recipe.rapidApi.DataItem;
import org.junit.Test;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {
    @Test
    public void testapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://rapidapi.com/Hrishi1999/api/recipesapi2");

        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        //System.out.println("name: " + response);

        ObjectMapper mapper = new ObjectMapper();
        DataItem recipes = mapper.readValue(response, DataItem.class);
        assertEquals("Oven Baked Rice", recipes.getName());
    }
}
