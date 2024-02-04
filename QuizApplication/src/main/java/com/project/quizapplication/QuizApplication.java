package com.project.quizapplication;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class Questions {

    public static int[] answers = {0, 2, 2, 1, 1, 2, 1, 1, 3, 2};
    public static String[][] questions = {
        {"What is the phenomenon where particles exhibit interconnected behavior regardless of distance?", "Entanglement", "Superposition", "Quantum Tunneling", "Wave-Particle Duality"},
        {"What is the time complexity of the quicksort algorithm in the worst case?", "O(log n)", "O(n)", "O(n^2)", "O(n log n)"},
        {"Which compound is known as the 'king of organic compounds'?", "Methane", "Ethanol", "Benzene", "Ethylene"},
        {"What does the term 'backpropagation' refer to in neural networks?", "Forward movement of weights", "Learning from mistakes and adjusting weights", "Activation of hidden layers", "Network initialization process"},
        {"Who wrote the philosophical work 'Thus Spoke Zarathustra'?", "Immanuel Kant", "Friedrich Nietzsche", "Jean-Jacques Rousseau", "Karl Marx"},
        {"What is the primary function of the lymphatic system?", "Pumping blood", "Digesting food", "Fighting infections", "Regulating body temperature"},
        {"What is the name of the theory that describes the origin of the universe from a hot, dense state?", "String Theory", "Big Bang Theory", "Dark Matter Theory", "Quantum Gravity Theory"},
        {"What is the concept of 'opportunity cost' in economics?", "The cost of producing an additional unit", "The cost of forgoing the next best alternative", "The total cost of production", "The cost of raw materials"},
        {"Who wrote the political treatise 'The Leviathan'?", "John Locke", "Thomas Hobbes", "Jean-Jacques Rousseau", "Karl Marx"},
        {"What is the main contributor to the greenhouse effect?", "Carbon monoxide", "Methane", "Ozone", "Carbon dioxide"}
    };

}

public class QuizApplication extends JFrame implements ActionListener {

    JLabel label;
    JRadioButton radioButton[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];

    QuizApplication(String s) {
        super(s);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            radioButton[i] = new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }

        btnNext = new JButton("Next");
        btnResult = new JButton("Result");
        btnResult.setVisible(false);
        btnNext.addActionListener(this);
        btnResult.addActionListener(this);
        add(btnNext);
        add(btnResult);
        setData();
        label.setBounds(30, 40, 450, 20);
        radioButton[0].setBounds(50, 80, 450, 20);
        radioButton[1].setBounds(50, 110, 450, 20);
        radioButton[2].setBounds(50, 140, 450, 20);
        radioButton[3].setBounds(50, 170, 450, 20);
        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    void setData() {
        radioButton[4].setSelected(true);
        label.setText(Questions.questions[current][0]);
        radioButton[0].setText(Questions.questions[current][1]);
        radioButton[1].setText(Questions.questions[current][2]);
        radioButton[2].setText(Questions.questions[current][3]);
        radioButton[3].setText(Questions.questions[current][4]);
        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButton[j].setBounds(50, 80 + i, 500, 20);
        }
    }

    int getSelectedCheckBoxIndex() {

        for (int i = 0; i < 4; i++) {
            if (radioButton[i].isSelected()) {
                return i;
            }
        }
        return -999;
    }

    boolean checkAns() {
        int selectedIndex = getSelectedCheckBoxIndex();
        return selectedIndex == Questions.answers[current];
    }

    public static void main(String[] args) {

        new QuizApplication("Simple Quiz Application");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            if (checkAns()) {
                count++;
            }
            current++;
            setData();
            if (current == 9) {
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (checkAns()) {
                count++;
            }
            current++;
            JOptionPane.showMessageDialog(this, "You Got " + count + " Answers Correct");
            System.exit(0);
        }
    }
}
