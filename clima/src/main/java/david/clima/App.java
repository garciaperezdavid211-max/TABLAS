package david.clima;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = -2;
		System.out.print("Dale, empieza:");
		while (n != -1) {
			n = sc.nextInt();
			if (n != -1) {
				n = mayor(n);
				switch (n) {
				case 1:
					System.out.println("VERANO");
					break;
				case 2:
					System.out.println("INVIERNO");
					break;
				case 0:
					System.out.println("EMPATE");
					break;
				}
			}
		}
		System.out.println("Se ha acabado");
	}

	public static byte mayor(int n) {

		int v = 0; // verano
		int i = 0; // invierno
		Scanner sc = new Scanner(System.in);
		while (n != -1) {
			switch (n) {
			case 1:
				v++;
				break;
			case 2:
				i = i++;
				break;
			}
			n = sc.nextInt();
		}
		if (v < i) {
			return 1;
		} else if (i < v) {
			return 2;
		} else {
			return 0;
		}
	}

}
