package factorymethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IDCardFactoryTest {

	@Test
	void test() {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("ȫ�浿");
		Product card2 = factory.create("ȫ�浿");
		Product card3 = factory.create("ȫ�浿");
		
		card1.use();
		card2.use();
		card3.use();
	}

}
