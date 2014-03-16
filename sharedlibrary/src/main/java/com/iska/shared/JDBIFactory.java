package com.iska.shared;

import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.db.DatabaseConfiguration;
import com.yammer.dropwizard.jdbi.DBIFactory;
import org.skife.jdbi.v2.DBI;

/**
 * Created with IntelliJ IDEA.
 * User: AbdullahiE
 * Date: 16-3-14
 * Time: 14:07
 * To change this template use File | Settings | File Templates.
 */
public final class JDBIFactory {

    public static <T> T create(Class<T> clazz,
                               Environment environment,
                               DatabaseConfiguration database) throws ClassNotFoundException{
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, database, "mysql");
        return jdbi.onDemand(clazz);
    }

}
