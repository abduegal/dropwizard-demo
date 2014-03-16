package com.iska.catalogus.zoek.resource;

import com.iska.catalogus.zoek.dao.CatalogusZoekDao;
import com.iska.shared.dto.Catalogus;
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
@Path("/catalogus/zoek")
public class CatalogusZoekResource {

    private CatalogusZoekDao dao;

    public CatalogusZoekResource(CatalogusZoekDao dao) {
        this.dao = dao;
    }

    @GET
    @Produces("application/json")
    @Timed
    public List<Catalogus> all() {
        return dao.getAlleCatalogussen();
    }
}
