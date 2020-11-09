import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.Random;

public class GuessingGame implements ActionListener {
  JTextField field;
  JButton guess;
  JButton playAgain;
  JLabel prompt, highOrLow, answer;
  Random r = new Random();

GuessingGame() {
  int randomInt = r.nextInt(100) + 1;
  JFrame frame = new JFrame("Guessing Game"); 
  frame.setLayout(new FlowLayout()); 
  frame.setSize(240, 120); 

  field = new JTextField(10); 
  field.setActionCommand("myTF"); 

  guess = new JButton("Button"); 
  playAgain = new JButton("Play Again"); 


  field.addActionListener(this); 
  guess.addActionListener(this); 
  playAgain.addActionListener(this); 

  prompt = new JLabel("Enter your guess: "); 
  highOrLow = new JLabel(""); 
  answer = new JLabel("hi"); 
  frame.add(prompt); 
  frame.add(field); 
  frame.add(guess); 
  frame.add(playAgain); 
  frame.add(highOrLow); 
  frame.add(answer); 

  frame.setVisible(true); 
}


 public void actionPerformed(ActionEvent ae) { 
    if(ae.getActionCommand().equals("guess")) { 
        int userGuess = Integer.parseInt(field.getText()); 
        if(userGuess == randomInt) {
          answer.setText("You got it!");
        }
        else if(userGuess > randomInt) {
          answer.setText("Too High!");
        }
        else if (userGuess < randomInt) {
          answer.setText("Too Low!");
        }
    }

    else if (ae.getActionCommand().equals("playAgain")) {
        randomInt = r.nextInt(100) + 1;
        prompt = new JLabel("Enter your guess: "); 
        highOrLow = new JLabel(""); 
        answer = new JLabel(""); 
        field = new JTextField(10); 
        
  }
 }
}











