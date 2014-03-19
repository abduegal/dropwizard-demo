package com.iska.catalogus.voegtoe;

import com.iska.catalogus.voegtoe.dao.ProductVoegtoeDao;
import com.iska.catalogus.voegtoe.resource.ProductVoegtoeResource;
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
public class ProductVoegtoeService extends Service<ProductVoegtoeConfig> {

    public static void main(String[] args) throws Exception {
        new ProductVoegtoeService().run(args);
    }

    @Override
    public void initialize(Bootstrap<ProductVoegtoeConfig> bootstrap) {
    }

    @Override
    public void run(ProductVoegtoeConfig config, Environment environment) throws Exception {
        environment.addResource(new ProductVoegtoeResource(
            JDBIFactory.create(ProductVoegtoeDao.class, environment, config.getDatabase())));
}
}
