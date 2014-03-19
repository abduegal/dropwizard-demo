package com.iska.catalogus.zoek.resource;

import com.iska.catalogus.zoek.dao.ProductZoekDao;
import com.iska.shared.dto.Product;
import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: AbdullahiE
 * Date: 16-3-14
 * Time: 13:52
 * To change this template use File | Settings | File Templates.
 */
@Path("/product/zoek")
public class ProductZoekResource {

    private ProductZoekDao dao;

    public ProductZoekResource(ProductZoekDao dao) {
        this.dao = dao;
    }

    @GET
    @Produces("application/json")
    @Timed
    public List<Product> all() {
        return dao.getAlleProducten();
    }
}
