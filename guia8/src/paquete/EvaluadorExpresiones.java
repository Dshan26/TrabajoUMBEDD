package paquete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class EvaluadorExpresiones extends JFrame implements ActionListener {
    private final JTextArea inputTextArea;
    private final JTextArea outputTextArea;

    public EvaluadorExpresiones() {
        setTitle("Evaluador de Expresiones");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel para la entrada de la expresión
        JPanel inputPanel = new JPanel(new BorderLayout());
        JLabel inputLabel = new JLabel("Expresión:");
        inputTextArea = new JTextArea(5, 30);
        inputPanel.add(inputLabel, BorderLayout.NORTH);
        inputPanel.add(new JScrollPane(inputTextArea), BorderLayout.CENTER);

        // Panel para la salida de la evaluación
        JPanel outputPanel = new JPanel(new BorderLayout());
        JLabel outputLabel = new JLabel("Resultado:");
        outputTextArea = new JTextArea(5, 30);
        outputTextArea.setEditable(false);
        outputPanel.add(outputLabel, BorderLayout.NORTH);
        outputPanel.add(new JScrollPane(outputTextArea), BorderLayout.CENTER);

        // Botón para evaluar la expresión
        JButton evalButton = new JButton("Evaluar");
        evalButton.addActionListener(this);

        // Panel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(outputPanel, BorderLayout.CENTER);
        mainPanel.add(evalButton, BorderLayout.SOUTH);

        setContentPane(mainPanel);
        setVisible(true);
    }

    

    // Método para manejar el evento del botón
    public void actionPerformed(ActionEvent e) {
        EvaluaExpre es= new EvaluaExpre();

        String expresion = inputTextArea.getText();
        boolean balanceado = es.evaluarExpresion(expresion);
        if (balanceado) {
            outputTextArea.setText("La expresión está balanceada.");
        } else {
            outputTextArea.setText("La expresión no está balanceada.");
        }
    }

}
