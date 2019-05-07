package java0311;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable {

	private int num;
	private String name;
	private Date productDate;
	private int price;
	//Default Constructor - �Ű������� ���� ������
	public Item() {
		super();
	}
	public Item(int num, String name, Date productDate, int price) {
		super();
		this.num = num;
		this.name = name;
		this.productDate = productDate;
		this.price = price;
	}
	//������ �޼ҵ� : ��ü ���� ������ �ν��Ͻ� ������ ���� �������� ����
	//�޼ҵ带 ���ؼ� �����ϴ� ���� ���� ��
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//�ν��Ͻ� �������� ���� ������ Ȯ���ϱ� ���� �޼ҵ� - ������� ���� �޼ҵ�
	//����ϴ� �޼ҵ忡 �ν��Ͻ� �̸��� �����ϸ� �� �޼ҵ尡 ȣ��˴ϴ�.
	@Override
	public String toString() {
		return "Item [num=" + num + ", name=" + name + ", productDate=" + productDate + ", price=" + price + "]";
	}
	
	
	
 }
