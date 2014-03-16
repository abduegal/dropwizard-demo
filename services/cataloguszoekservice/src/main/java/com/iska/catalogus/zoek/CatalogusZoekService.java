package com.iska.catalogus.zoek;

import com.iska.catalogus.zoek.dao.CatalogusZoekDao;
import com.iska.catalogus.zoek.resource.CatalogusZoekResource;
import com.iska.shared.JDBIFactory;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created with IntelliJ IDEA.
 * User: AbdullahiE
 * Date: 16-3-14
 * Time: 13:49
 * To change this template use File | Settings | File Templates.
 */
public class CatalogusZoekService extends Service<CatalogusZoekConfig> {

    public static void main(String[] args) throws Exception {
        new CatalogusZoekService().run(args);
    }

    @Override
    public void initialize(Bootstrap<CatalogusZoekConfig> bootstrap) {
    }

    @Override
    public void run(CatalogusZoekConfig config, Environment environment) throws Exception {
        environment.addResource(
                new CatalogusZoekResource(JDBIFactory.create(CatalogusZoekDao.class, environment, config.getDatabase())));
    }
}
