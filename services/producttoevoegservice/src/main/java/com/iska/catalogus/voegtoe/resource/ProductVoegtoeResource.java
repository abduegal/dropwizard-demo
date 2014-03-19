package com.iska.catalogus.voegtoe.resource;

import com.iska.catalogus.voegtoe.dao.ProductVoegtoeDao;
import com.iska.shared.dto.Product;
import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.*;

/**
 * Created with IntelliJ IDEA.
 * User: AbdullahiE
 * Date: 16-3-14
 * Time: 13:52
 * To change this template use File | Settings | File Templates.
 */
@Path("/product/voegtoe")
public class ProductVoegtoeResource {

    private ProductVoegtoeDao dao;

    public ProductVoegtoeResource(ProductVoegtoeDao dao) {
        this.dao = dao;
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Timed
    public int voegProductToe(Product product) {
        return dao.insert(product);
    }
}
