package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {

}
