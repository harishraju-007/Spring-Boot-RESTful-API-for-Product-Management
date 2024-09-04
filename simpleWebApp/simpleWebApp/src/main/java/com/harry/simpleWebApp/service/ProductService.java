package com.harry.simpleWebApp.service;

import com.harry.simpleWebApp.model.Product;
import com.harry.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(12, "Oppo F21 pro", 23000),
//            new Product(13, "Nothing 2a", 24000),
//            new Product(14, "HP ProBook", 40000)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
//        Product toShow = new Product(0, "No Item", 0);
//        for(Product i : products){
//            if(i.getProdId() == prodId){
//                toShow = i;
//                break;
//            }
//        }
//        return toShow;
//        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {

//        int index = 0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId() == prod.getProdId()){
//                index = i;
//                break;
//            }
//        }
//        products.set(index, prod);
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
//        Product prod = null;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId() == prodId){
//                products.remove(products.get(i));
//                break;
//            }
//        }
//        System.out.println("Deleted");
        repo.deleteById(prodId);
    }
}
