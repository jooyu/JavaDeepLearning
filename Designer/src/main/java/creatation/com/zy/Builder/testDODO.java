package creatation.com.zy.Builder;

/**
 * 建造者模式
 * @author eaves.zhu
 *
 */
public class testDODO {

	public static void main(String[] args) {
		DoDoContact ddc = new DoDoContact.Builder("Ace").age(10)
                .address("beijing").build();
		System.out.println("name=" + ddc.getName() + "age =" + ddc.getAge()
                + "address" + ddc.getAddress());

		StringBuilder sb=new StringBuilder();
	}

}
