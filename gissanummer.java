import javax.swing.*;
import java.io.*;
import java.util.*;

public class gissanummer {
	public static void main(String[] args) {

		int slump = (int) (Math.random() * 100);
		System.out.println("Randomizer - Requires input of value less than 101");

		Scanner sc = new Scanner(System.in);

		int gissat = sc.nextInt();

		if(gissat == slump) {
			System.out.println("You won!");
		}

			else if(gissat == 69) {
				System.out.println("( ͡° ͜ʖ ͡°)");
			}
				else if(gissat > 1000) {
					System.out.println("SYSTEM OVERLOAD, EMERGENCY SHUTDOWN INITIATED");
				}

		else {
			if(gissat > 100) {
				System.out.println("Limit exceeded. Manual reboot required");
			}

			else if(gissat > slump) {
				System.out.println("You've guessed " + gissat + ", which was too high");
				System.out.println("The right answer was " + slump);
			}

			else if(gissat < slump) {
				System.out.println("You've guessed " + gissat + ", which was too low");
				System.out.println("The right answer was " + slump);
			}
		}
	}
}