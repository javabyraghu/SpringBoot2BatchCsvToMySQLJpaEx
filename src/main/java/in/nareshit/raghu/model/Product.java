package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products_tab")
public class Product {
	
	@Id
	@Column(name="pid")
	private Integer prodId;

	@Column(name="pcode")
	private String prodCode;
	
	@Column(name="pcost")
	private Double prodCost;
	
	@Column(name="pgst")
	private Double prodGst;
	
	@Column(name="pdisc")
	private Double prodDisc;
}
