import java.awt.*;
import java.awt.event.*;

public class ParameterApplet extends Applet {
    Label label;
    TextField textField;
    Button button;
    Label resultLabel;

    public void init() {
        label = new Label("Result: ");
        textField = new TextField(10);
        button = new Button("Calculate");
        resultLabel = new Label("");

        add(label);
        add(textField);
        add(button);
        add(resultLabel);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = getParameter("name");
                int number = Integer.parseInt(getParameter("number"));
                int result = calculateResult(number);
                resultLabel.setText("Hello, " + name + "! Result: " + result);
            }
        });
    }

    private int calculateResult(int number) {
        return number * number;
    }
}
