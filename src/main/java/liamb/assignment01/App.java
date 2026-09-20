package liamb.assignment01;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private static int levelCounter = 1;
    private static String text1 = "I just wanted to drop by and say hello to everyone in the room.";
    private static String text2 = "We are looking at a situation where everything needs to be redone from scratch.";
    private static String text3 = "My head was about to explode when I heard the final project deadline.";
    private static String text4 = "It is just one of those days where nothing seems to go right.";
    private static String text5 = "At the end of the day, we all want the exact same positive result for the team.";
    private static String text6 = "It is not a huge deal if we miss the early morning bus.";

    @Override
    public void start(Stage stage) {
        //make a String list containing all text, so that the next button triggers
        //the next set of text to be displayed
        Label textCounter = new Label("1/6");
        
        Label statusLabel = new Label("Press a key");
        
        Button nextBtn = new Button("next");
        nextBtn.setDisable(true);
        
        Button resetBtn = new Button("reset");
        
        Label typeGuide = new Label(text1);
        TextField textField = new TextField();
        
        Button backtickBtn = new Button("~ `");

        Button btn1 = new Button("!\n1");
        Button btn2 = new Button("@\n2");
        Button btn3 = new Button("#\n3");
        Button btn4 = new Button("$\n4");
        Button btn5 = new Button("%\n5");
        Button btn6 = new Button("^\n6");
        Button btn7 = new Button("&\n7");
        Button btn8 = new Button("*\n8");
        Button btn9 = new Button("(\n9");
        Button btn0 = new Button(")\n0");
        
        Button minusBtn = new Button("_\n-");
        Button equalsBtn = new Button("+\n=");
        Button deleteBtn = new Button("delete");
        
        Button tabBtn = new Button("tab"); //only for formatting (useless)

        Button qBtn = new Button("Q");
        Button wBtn = new Button("W");
        Button eBtn = new Button("E");
        Button rBtn = new Button("R");
        Button tBtn = new Button("T");
        Button yBtn = new Button("Y");
        Button uBtn = new Button("U");
        Button iBtn = new Button("I");
        Button oBtn = new Button("O");
        Button pBtn = new Button("P");

        Button leftBracketBtn = new Button("{\n[");
        Button rightBracketBtn = new Button("}\n]");
        Button backslashBtn = new Button("|\n'\'");
        
        Button capsLockBtn = new Button("caps lock"); //only for formatting (useless)

        Button aBtn = new Button("A");
        Button sBtn = new Button("S");
        Button dBtn = new Button("D");
        Button fBtn = new Button("F");
        Button gBtn = new Button("G");
        Button hBtn = new Button("H");
        Button jBtn = new Button("J");
        Button kBtn = new Button("K");
        Button lBtn = new Button("L");

        Button semiColonBtn = new Button(":\n;");
        Button apostropheBtn = new Button("\"\n'");
        Button enterBtn = new Button("enter");

        Button leftShiftBtn = new Button("shift");

        Button zBtn = new Button("Z");
        Button xBtn = new Button("X");
        Button cBtn = new Button("C");
        Button vBtn = new Button("V");
        Button bBtn = new Button("B");
        Button nBtn = new Button("N");
        Button mBtn = new Button("M");
        
        Button commaBtn = new Button("<\n,");
        Button periodBtn = new Button(">\n.");
        Button forwardSlashBtn = new Button("?\n/");
        Button rightShiftBtn = new Button("shift");
                
        Button spacebarBtn = new Button("space");
        
        if (typeGuide.getText() == textField.getText()) {
            nextBtn.setDisable(false);
        }
        
        nextBtn.setOnAction(event -> {
            nextBtn.setDisable(true);
            //set typeGuide to next set
            if (textCounter.getText() != "6/6") {
                textCounter.setText(String.format("%d/6", ++levelCounter));
                textField.setText(""); // go to next text sample in list

            }
        });
        
        resetBtn.setOnAction(event -> {
            nextBtn.setDisable(true);
            typeGuide.setText(text1);
            textField.setText("");
            textCounter.setText("1/6"); 
            levelCounter = 1;   
        });
        
        HBox topRow = new HBox();
        topRow.getChildren().setAll(typeGuide, textCounter);
        
        HBox row1 = new HBox(5);
        row1.getChildren().setAll(backtickBtn, btn1, btn2, btn3,
                btn4, btn5, btn6, btn7, btn8, btn9, btn0, minusBtn, equalsBtn, deleteBtn);
        
        HBox row2 = new HBox(5);
        row2.getChildren().setAll(tabBtn, qBtn, wBtn, eBtn, rBtn, tBtn,
                yBtn, uBtn, iBtn, oBtn, pBtn, leftBracketBtn, rightBracketBtn, backslashBtn);
        
        HBox row3 = new HBox(5);
        row3.getChildren().setAll(capsLockBtn, aBtn, sBtn, dBtn, fBtn,
                gBtn, hBtn, jBtn, kBtn, lBtn, semiColonBtn, apostropheBtn, enterBtn);
        
        HBox row4 = new HBox(5);
        row4.getChildren().setAll(leftShiftBtn, zBtn, xBtn, cBtn, vBtn,
                bBtn, nBtn, mBtn, commaBtn, periodBtn, forwardSlashBtn, rightShiftBtn, spacebarBtn);
        
        HBox row5 = new HBox(5);
        row5.getChildren().setAll(spacebarBtn, nextBtn);
         
        VBox root = new VBox(5);
        root.getChildren().addAll(topRow, textField, row1, row2, row3, row4, row5, statusLabel);
        var scene = new Scene(root, 900, 400);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}