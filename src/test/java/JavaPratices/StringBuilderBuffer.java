package JavaPratices;

public class StringBuilderBuffer {

	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer("Parthasarathi");

		stringBuffer.append(" Ray");

		System.out.println("String Buffer : " + stringBuffer);

		StringBuilder stringBuilder = new StringBuilder("Sachin");

		stringBuilder.append(" Tendulker");

		System.out.println("String Builder : " + stringBuilder);


	}

}
