package factorymethod;

public class IDCard implements Product{
	
	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner + "�� ī�带 ����ϴ�");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner+"�� ī�带 ����մϴ�.");
	}

	public String getOwner() {
		return owner;
	}

}