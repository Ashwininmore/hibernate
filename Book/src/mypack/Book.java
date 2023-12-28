package mypack;
import javax.persistence.*;
@Entity
@Table(name="Book123")
public class Book {
	@Id
	private int bid;
	@Column(name="Title")
	private String title;
	@Column(name="Price")
	private float price;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
