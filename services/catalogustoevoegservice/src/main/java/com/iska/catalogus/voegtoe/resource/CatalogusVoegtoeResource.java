package com.iska.catalogus.voegtoe.resource;

import com.iska.catalogus.voegtoe.dao.CatalogusVoegtoeDao;
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
@Path("/catalogus/voegtoe")
public class CatalogusVoegtoeResource {

    private CatalogusVoegtoeDao dao;

    public CatalogusVoegtoeResource(CatalogusVoegtoeDao dao) {
        this.dao = dao;
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Timed
    public int voegCatalogusToe(Catalogus catalogus) {
        return dao.insert(catalogus);
    }
}
