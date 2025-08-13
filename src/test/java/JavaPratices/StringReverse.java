package JavaPratices;

public class StringReverse {

	public static void main(String[] args) {

		String city[] = { "Cuttack", "Jajpur", "Bhubaneswar", "Rourkela", "Bhadrak", "Balasore" };

		for (int i = 0; i < city.length; i++) {

			if (city[i] == "Bhadrak") {

				String str = city[i];

				for (int j = str.length() - 1; j >= 0; j--) {

					System.out.println(str.charAt(j));

				}

			}

			else {

				System.out.println(city[i] + "");
			}

		}

	}

}
