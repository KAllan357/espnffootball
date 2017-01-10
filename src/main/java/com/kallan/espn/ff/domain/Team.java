package com.kallan.espn.ff.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Team {

    private final String teamAbbrev;

    @JsonProperty
    private final String teamNickname;

    // Betcha this could parse into a URL object or something
    private final String logoUrl;

    @JsonCreator
    public Team(@JsonProperty("teamAbbrev") String teamAbbrev,
                @JsonProperty("teamNickname") String teamNickname,
                @JsonProperty("logoUrl") String logoUrl) {
        this.teamAbbrev = teamAbbrev;
        this.teamNickname = teamNickname;
        this.logoUrl = logoUrl;
    }

    public String getTeamAbbreviation() {
        return teamAbbrev;
    }

    public String getTeamNickname() {
        return teamNickname;
    }

    public String getLogoUrl() {
        return logoUrl;
    }
}
