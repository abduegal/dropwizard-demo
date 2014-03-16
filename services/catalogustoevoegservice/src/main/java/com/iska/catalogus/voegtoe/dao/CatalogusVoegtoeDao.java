package com.iska.catalogus.voegtoe.dao;

import com.iska.shared.dto.Catalogus;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

/**
 * Created with IntelliJ IDEA.
 * User: AbdullahiE
 * Date: 16-3-14
 * Time: 13:58
 * To change this template use File | Settings | File Templates.
 */
@RegisterMapper(Catalogus.CatalogusMapper.class)
public interface CatalogusVoegtoeDao {

    @SqlUpdate("INSERT INTO Catalogus (naam, verkoopprijs) values (:naam, :verkoopprijs)")
    int insert(@BindBean Catalogus catalogus);
}
