package princesspeach;

// @author 210
import javax.swing.JFrame;

public class PrincesMain {

    public static void main(String[] args) throws InterruptedException{
        JFrame zio = new JFrame("mi princesa Peach");

        zio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PrincessPeach peach = new PrincessPeach();

        zio.add(peach);
        zio.setSize(1024, 700);
        zio.setVisible(true);
        zio.setResizable(false);
        
        while (true) {
			peach.parpadeo();
			peach.repaint();
			Thread.sleep(100);
		}
        
    }
}