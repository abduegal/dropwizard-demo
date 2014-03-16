package com.iska.catalogus.voegtoe;

import com.iska.catalogus.voegtoe.dao.CatalogusVoegtoeDao;
import com.iska.catalogus.voegtoe.resource.CatalogusVoegtoeResource;
import com.iska.shared.JDBIFactory;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created with IntelliJ IDEA.
 * User: AbdullahiE
 * Date: 16-3-14
 * Time: 21:15
 * To change this template use File | Settings | File Templates.
 */
public class CatalogusVoegtoeService extends Service<CatalogusVoegtoeConfig> {

    public static void main(String[] args) throws Exception {
        new CatalogusVoegtoeService().run(args);
    }

    @Override
    public void initialize(Bootstrap<CatalogusVoegtoeConfig> bootstrap) {
    }

    @Override
    public void run(CatalogusVoegtoeConfig config, Environment environment) throws Exception {
        environment.addResource(new CatalogusVoegtoeResource(
                JDBIFactory.create(CatalogusVoegtoeDao.class, environment, config.getDatabase())));
    }
}
