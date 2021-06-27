import java.util.Date;

public class Order {

	Client cli;
	Work wr;
	Date orderDate;

	public Order(Client cli,Work wr,Date now) {
		this.cli = cli;
		this.wr = wr;
		this.orderDate = now;
	}

}
