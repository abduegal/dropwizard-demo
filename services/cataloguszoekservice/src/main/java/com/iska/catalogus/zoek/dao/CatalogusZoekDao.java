package com.iska.catalogus.zoek.dao;

import com.iska.shared.dto.Catalogus;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: AbdullahiE
 * Date: 16-3-14
 * Time: 13:58
 * To change this template use File | Settings | File Templates.
 */
@RegisterMapper(Catalogus.CatalogusMapper.class)
public interface CatalogusZoekDao {

    @SqlQuery("SELECT * FROM Catalogus")
    List<Catalogus> getAlleCatalogussen();

    @SqlUpdate("INSERT INTO Catalogus (naam, verkoopprijs) values (:naam, :verkoopprijs)")
    int insert(@BindBean Catalogus catalogus);
}
