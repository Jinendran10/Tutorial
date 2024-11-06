import java.awt.*;
import java.awt.event.*;

public class FactorialApplet extends Applet {
    Label label;
    TextField textField;
    Button button;
    Label resultLabel;

    public void init() {
        label = new Label("Enter a number:");
        textField = new TextField(10);
        button = new Button("Calculate Factorial");
        resultLabel = new Label("Result: ");

        add(label);
        add(textField);
        add(button);
        add(resultLabel);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(textField.getText());
                long factorial = calculateFactorial(number);
                resultLabel.setText("Result: " + factorial);
            }
        });
    }

    private long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
