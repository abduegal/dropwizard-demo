package com.iska.catalogus.verwijder.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

public interface ProductVerwijderDao {

    @SqlUpdate("DELETE FROM Product WHERE id = :it")
    void deleteProduct(@Bind Long id);

}
