package com.iska.catalogus.verwijder.resource;

import com.iska.catalogus.verwijder.dao.ProductVerwijderDao;
import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/product/verwijder")
public class ProductVerwijderResource {

    private ProductVerwijderDao dao;

    public ProductVerwijderResource(ProductVerwijderDao dao) {
        this.dao = dao;
    }

    @DELETE
    @Path("{id}")
    @Timed
    public void verwijderProduct(@PathParam("id") Long productId) {
        dao.deleteProduct(productId);
    }
}
