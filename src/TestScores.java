import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What was your test score?");
	int numbscore = Integer.parseInt(score);
	if (numbscore<=50) {
		JOptionPane.showMessageDialog(null, "You did not study for that test!");
	}
	else if ((numbscore>50 && numbscore<=75)) {
		JOptionPane.showMessageDialog(null, "Study harder next time!");
}
	else {
		JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
	}
}
}
