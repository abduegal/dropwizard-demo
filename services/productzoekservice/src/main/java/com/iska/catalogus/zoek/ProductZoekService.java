package com.iska.catalogus.zoek;

import com.iska.catalogus.zoek.dao.ProductZoekDao;
import com.iska.catalogus.zoek.resource.ProductZoekResource;
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
public class ProductZoekService extends Service<ProductZoekConfig> {

    public static void main(String[] args) throws Exception {
        new ProductZoekService().run(args);
    }

    @Override
    public void initialize(Bootstrap<ProductZoekConfig> bootstrap) {
    }

    @Override
    public void run(ProductZoekConfig config, Environment environment) throws Exception {
        environment.addResource(new ProductZoekResource(
                JDBIFactory.create(ProductZoekDao.class, environment, config.getDatabase())));
    }
}
