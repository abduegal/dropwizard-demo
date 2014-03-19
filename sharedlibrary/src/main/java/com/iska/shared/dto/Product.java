package com.iska.shared.dto;

import org.skife.jdbi.v2.BeanMapper;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: AbdullahiE
 * Date: 16-3-14
 * Time: 13:52
 * To change this template use File | Settings | File Templates.
 */
public class Product {

    private int id;
    private String naam;
    private BigDecimal verkoopprijs;
    private int voorraad = 0;

    public Product(int id, String naam, BigDecimal verkoopprijs, int voorraad) {
        this.id = id;
        this.naam = naam;
        this.verkoopprijs = verkoopprijs;
        this.voorraad = voorraad;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public BigDecimal getVerkoopprijs() {
        return verkoopprijs;
    }

    public void setVerkoopprijs(BigDecimal verkoopprijs) {
        this.verkoopprijs = verkoopprijs;
    }

    public int getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(int voorraad) {
        this.voorraad = voorraad;
    }

    public static class ProductMapper extends BeanMapper<Product> {

        public ProductMapper() {
            super(Product.class);
        }
    }
}
