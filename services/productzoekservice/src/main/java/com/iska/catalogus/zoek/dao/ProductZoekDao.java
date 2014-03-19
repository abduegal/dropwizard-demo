package com.iska.catalogus.zoek.dao;

import com.iska.shared.dto.Product;
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
@RegisterMapper(Product.ProductMapper.class)
public interface ProductZoekDao {

    @SqlQuery("SELECT * FROM Product")
    List<Product> getAlleProducten();
}
