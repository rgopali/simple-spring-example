package entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Seller {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	
	
	@OneToMany(targetEntity = Product.class, cascade= CascadeType.ALL)
	@JoinColumn(name ="sellerProduct_fk", referencedColumnName = "id")
	private List<Product> products;

}
