package extra;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		int cls = JOptionPane.showOptionDialog(null, "Pick a class...", "Own adventure", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Berserker", "Warlock", "Paladin" }, null);
		System.out.println(cls);
		if (cls == 0) {
			berserker();
		}
		if (cls == 1) {
			warlock();
		}
		if (cls == 2) {
			paladin();
		}

		int wl = JOptionPane.showOptionDialog(null, "A Challenger Approaches", "Own adventure", 0,
				JOptionPane.ERROR_MESSAGE, null, new String[] { "Brawl(0)", "Volley(1)", }, null);
		System.out.println(wl);

		int wls = wl + cls;
		if (wls == 1) {
			lose();
		} else {
			win();
		}
	}

	private static void warlock() {
		JOptionPane.showMessageDialog(null,
				"You chose: Warlock---> Note: You are a Long range character, don't DIVE IN HEAD-FIRST rather STAY BACK AND TAKE YOUR TIME");
	}

	private static void berserker() {
		JOptionPane.showMessageDialog(null,
				"You chose: Berserker---> Note: You are a short range character, don't STAY BACK AND TAKE YOUR TIME rather DIVE IN HEAD-FIRST");

	}

	private static void paladin() {

		JOptionPane.showMessageDialog(null,
				"You chose: Paladin---> Note: You are a versatile character, because you are a magic knight, you are essentially a god, this isn't even a challenge");

	}

	private static void lose() {
		JOptionPane.showMessageDialog(null, "You lose");

	}

	private static void win() {
		JOptionPane.showMessageDialog(null, "You win and are crowned champion!");
	}
}
