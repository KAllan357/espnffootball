package com.kallan.espn.ff.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TeamTest {

    @Test
    public void testSerialization() {

        String json = "{\"teamAbbrev\": \"TEST\", \"teamNickname\": \"LA Galaxy\", \"logoUrl\": \"http://www.waringcreek.com/images/WCG.jpg\"}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            Team testTeam = mapper.readValue(json, Team.class);
            assertEquals("LA Galaxy", testTeam.getTeamNickname());
        } catch (IOException e) {
            fail(e.toString());
        }
    }
}
