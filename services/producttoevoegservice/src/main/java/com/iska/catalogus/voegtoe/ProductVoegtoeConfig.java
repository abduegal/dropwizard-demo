package com.iska.catalogus.voegtoe;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.db.DatabaseConfiguration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: AbdullahiE
 * Date: 16-3-14
 * Time: 21:15
 * To change this template use File | Settings | File Templates.
 */
public class ProductVoegtoeConfig extends Configuration {

    @Valid
    @NotNull
    @JsonProperty
    private DatabaseConfiguration database = new DatabaseConfiguration();

    public DatabaseConfiguration getDatabase() {
        return database;
    }

}
