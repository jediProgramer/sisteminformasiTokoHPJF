/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.erlanggstudio.sisteminformasitokohpjf.controller;

import com.erlanggstudio.sisteminformasitokohpjf.model.Product;
import java.util.List;

/**
 *
 * @author erlanga
 */
public interface ProductDAO {
    public void insert(Product product);
    public void update(Product product);
    public void delete(Product product);
    public Product getProduct(int productId);
    public List<Product> list();
    public List<Product> listByID(int productId);
}
