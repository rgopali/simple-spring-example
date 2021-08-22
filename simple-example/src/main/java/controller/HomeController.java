package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.OrderRequest;
import entity.Seller;
import repository.ProductRepository;
import repository.SellerRepository;

@RestController
public class HomeController {
    @Autowired
    private SellerRepository sellerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Seller placeOrder(@RequestBody OrderRequest request){
       return sellerRepository.save(request.getSeller());
    }

    @GetMapping("/findAll")
    public List<Seller> findAll(){
        return sellerRepository.findAll();
    }

}






