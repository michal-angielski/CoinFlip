package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {
    @FXML
    public Label headsLabel;
    public Label tailsLabel;
    public Label mainLabel;
    public Label headToTail;

    //here works, declaration inside coinFlip() does not, why?
    private int tailCount = 0;
    private int headCount = 0;
    //private double ratio = 0;

    public void coinFlip() {

        Random random = new Random();

        int randomCoin = random.nextInt(2);
        if (randomCoin == 1) {
            //tail
            mainLabel.setText("Tail!");
            tailCount++;
            tailsLabel.setText("Tails: " + tailCount);
        } else {
            //head
            mainLabel.setText("Head!");
            headCount++;
            headsLabel.setText("Heads: " + headCount);
        }
        //ratio = (double) headCount / (double) tailCount;
        //headToTail.setText("H/T: " + Math.round(ratio * 100) / 100);
    }
}
