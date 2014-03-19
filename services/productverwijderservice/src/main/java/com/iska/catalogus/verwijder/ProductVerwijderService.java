package com.iska.catalogus.verwijder;

import com.iska.catalogus.verwijder.dao.ProductVerwijderDao;
import com.iska.catalogus.verwijder.resource.ProductVerwijderResource;
import com.iska.shared.JDBIFactory;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class ProductVerwijderService extends Service<ProductVerwijderConfig> {

    public static void main(String[] args) throws Exception {
        new ProductVerwijderService().run(args);
    }

    @Override
    public void initialize(Bootstrap<ProductVerwijderConfig> bootstrap) {

    }

    @Override
    public void run(ProductVerwijderConfig config, Environment environment) throws Exception {
        environment.addResource(new ProductVerwijderResource(
                JDBIFactory.create(ProductVerwijderDao.class, environment, config.getDatabase())));
    }
}
