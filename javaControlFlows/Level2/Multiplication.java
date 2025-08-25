package java_control_flows.Level2;

public class Multiplication {

	public static void main(String[] args) {
		for (int i = 6; i <= 9; i++) {
            System.out.println("Table of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
		}
	}

}
