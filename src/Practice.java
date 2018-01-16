import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class Practice extends JFrame {

	private static int DEFAULT_SIZE = 20;
	private static int FRAME_HEIGHT = 500;
	private static int FRAME_WIDTH = 500;

	public String difficultyLevel;
	public String problemType;


	private int correct =0;
	private int incorrect = 0;
	private int numberOfAttempts =0;
	int timesCorrect = 0;
	int timesInCorrect = 0;


	String correctMessage = "Good Job! Correct";
	JTextField check = new JTextField(correctMessage); 
	JTextField equal = new JTextField();
	JTextField firstNumberLabel = new JTextField();
	JTextField resultJtext = new JTextField();
	JTextField secondNumberLabel = new JTextField();
	JTextField sign = new JTextField();
	JTextField cor = new JTextField("Correct:");
	JTextField inCor = new JTextField("Incorrect:");
	JTextField attempt = new JTextField("Attempt:");
	JTextField attemptNumber = new JTextField();

	private int firstNumber, secondNumber, correctResult;
	

	Font font1 = new Font("SansSerif", Font.BOLD, 20);
	ButtonGroup radioGroupP = new ButtonGroup();


	JLabel label;
	JPanel mathTutorPanel;

	private String numberEntered;

	private Random randomNumber;
	


	JTextField right = new JTextField();
	JTextField wrong = new JTextField();



	private JRadioButton easyAddition = new JRadioButton("Easy - Addition"); 
	private JRadioButton easySubtraction = new JRadioButton("Easy - Subtraction");
	private JRadioButton easyMultiplication = new JRadioButton("Easy - Multiplication");
	private JRadioButton easyDivision = new JRadioButton("Easy - Division");


	private JRadioButton moderateAddition = new JRadioButton("Moderate-Addition");
	private JRadioButton moderateSubtraction = new JRadioButton("Moderate-Subtraction");
	private JRadioButton moderateMultiplication = new JRadioButton("Moderate-Multiplication");
	private JRadioButton moderateDivision = new JRadioButton("Moderate-Division");


	private JRadioButton difficultAddition = new JRadioButton("Difficult-Addition");
	private JRadioButton difficultSubtraction = new JRadioButton("Difficult-Subtraction");
	private JRadioButton difficultMultiplication = new JRadioButton("Difficult-Multiplication");
	private JRadioButton difficultDivision = new JRadioButton("Difficult-Division");


	private JRadioButton easy = new JRadioButton("Easy");
	private JRadioButton Medium = new JRadioButton("Moderate");
	private JRadioButton difficult = new JRadioButton("Difficult");


	public Practice(){	



		creatDifficultyLevel();


	}
	public void creatDifficultyLevel(){


		mathTutorPanel = new JPanel();
		mathTutorPanel.setLayout(null);
		mathTutorPanel.add(easyAddition);
		mathTutorPanel.add(easySubtraction);
		mathTutorPanel.add(easyMultiplication);
		mathTutorPanel.add(easyDivision);
		easyAddition.setBounds(5,20,170,40);
		easySubtraction.setBounds(5,50,170,40);
		easyMultiplication.setBounds(5, 80, 170, 40);
		easyDivision.setBounds(5, 110, 170, 40);


		mathTutorPanel.add(easy);
		mathTutorPanel.add(Medium);
		mathTutorPanel.add(difficult);

		mathTutorPanel.add(cor);
		mathTutorPanel.add(inCor);
		mathTutorPanel.add(attempt);
		mathTutorPanel.add(attemptNumber);


		mathTutorPanel.add(right);
		mathTutorPanel.add(wrong);
		right.setBounds(300, 200, 90, 40);
		wrong.setBounds(300, 240, 90, 40);
		attemptNumber.setBounds(300, 160, 90, 40);

		right.setEditable(false);
		wrong.setEditable(false);
		attemptNumber.setEditable(false);

		cor.setBounds(215, 200, 90, 40);
		inCor.setBounds(215, 240, 90, 40);
		attempt.setBounds(215, 160, 90, 40);
		cor.setEditable(false);
		inCor.setEditable(false);
		attempt.setEditable(false);


		easy.setBounds(185, 40, 90, 40);
		Medium.setBounds(285, 40, 90, 40);
		difficult.setBounds(400, 40, 90, 40);

		ButtonGroup level = new ButtonGroup();

		level.add(easy);
		level.add(Medium);
		level.add(difficult);
		easy.setSelected(true);



		ButtonGroup radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(easyAddition);
		radioButtonGroup.add(easySubtraction);
		radioButtonGroup.add(easyMultiplication);
		radioButtonGroup.add(easyDivision);
		setContentPane(mathTutorPanel);






		mathTutorPanel.add(moderateAddition);
		mathTutorPanel.add(moderateSubtraction);
		mathTutorPanel.add(moderateMultiplication);
		mathTutorPanel.add(moderateDivision);
		moderateAddition.setBounds(5,20,170,40);
		moderateSubtraction.setBounds(5,50,170,40);
		moderateMultiplication.setBounds(5, 80, 200, 40);
		moderateDivision.setBounds(5, 110, 170, 40);


		ButtonGroup radioGroupModerate = new ButtonGroup();
		radioGroupModerate.add(moderateAddition);
		radioGroupModerate.add(moderateSubtraction);
		radioGroupModerate.add(moderateMultiplication);
		radioGroupModerate.add(moderateDivision);

		moderateAddition.setVisible(false);
		moderateSubtraction.setVisible(false);
		moderateMultiplication.setVisible(false);
		moderateDivision.setVisible(false);

		check.setFont(font1);

		mathTutorPanel.add(difficultAddition);
		mathTutorPanel.add(difficultSubtraction);
		mathTutorPanel.add(difficultMultiplication);
		mathTutorPanel.add(difficultDivision);
		difficultAddition.setBounds(5,20,170,40);
		difficultSubtraction.setBounds(5,50,170,40);
		difficultMultiplication.setBounds(5, 80, 200, 40);
		difficultDivision.setBounds(5, 110, 170, 40);


		ButtonGroup radioGroupDifficult = new ButtonGroup();
		radioGroupDifficult.add(difficultAddition);
		radioGroupDifficult.add(difficultSubtraction);
		radioGroupDifficult.add(difficultMultiplication);
		radioGroupDifficult.add(difficultDivision);

		difficultAddition.setVisible(false);
		difficultSubtraction.setVisible(false);
		difficultMultiplication.setVisible(false);
		difficultDivision.setVisible(false);




		setSize(FRAME_WIDTH	, FRAME_HEIGHT);


		String message = "Select practice problem level and type ";
		label = new JLabel(message);


		label.setBounds(120, 0, 405, 40);
		firstNumberLabel.setBounds(215, 90, 70	, 35);
		secondNumberLabel.setBounds(305, 90, 70, 35);
		sign.setBounds(285, 90, 20, 35);
		resultJtext.setBounds(390, 90, 70, 35);    
		check.setBounds(215, 120, 240, 40);
		equal.setBounds(373, 90, 20, 35);


		firstNumberLabel.setFont(font1);
		secondNumberLabel.setFont(font1);
		resultJtext.setFont(font1);

		check.setVisible(false);
		check.setEditable(false);
		firstNumberLabel.setEditable(false);
		secondNumberLabel.setEditable(false);
		sign.setEditable(false);
		equal.setEditable(false);



		equal.setText("=");
		mathTutorPanel.add(label);
		add(check);
		sign.setText("+");

		add(firstNumberLabel);
		add(secondNumberLabel);
		add(equal);
		add(sign);
		add(resultJtext);
		label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));



		easy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				repaint();
				difficultyLevel = "easy";


				moderateAddition.setVisible(false);
				moderateSubtraction.setVisible(false);
				moderateMultiplication.setVisible(false);
				moderateDivision.setVisible(false);


				difficultAddition.setVisible(false);
				difficultSubtraction.setVisible(false);
				difficultMultiplication.setVisible(false);
				difficultDivision.setVisible(false);


				easyAddition.setVisible(true);
				easySubtraction.setVisible(true);
				easyMultiplication.setVisible(true);
				easyDivision.setVisible(true);

				mathTutorPanel.setBackground(Color.CYAN);




			}
		});

		Medium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				repaint();
				difficultyLevel = "Medium";

				difficultAddition.setVisible(false);
				difficultSubtraction.setVisible(false);
				difficultMultiplication.setVisible(false);
				difficultDivision.setVisible(false);


				easyAddition.setVisible(false);
				easySubtraction.setVisible(false);
				easyMultiplication.setVisible(false);
				easyDivision.setVisible(false);

				moderateAddition.setVisible(true);
				moderateSubtraction.setVisible(true);
				moderateMultiplication.setVisible(true);
				moderateDivision.setVisible(true);
				mathTutorPanel.setBackground(Color.yellow);

			}
		});

		difficult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				repaint();
				difficultyLevel = "difficult";
				difficultAddition.setVisible(true);
				difficultSubtraction.setVisible(true);
				difficultMultiplication.setVisible(true);
				difficultDivision.setVisible(true);


				easyAddition.setVisible(false);
				easySubtraction.setVisible(false);
				easyMultiplication.setVisible(false);
				easyDivision.setVisible(false);

				moderateAddition.setVisible(false);
				moderateSubtraction.setVisible(false);
				moderateMultiplication.setVisible(false);
				moderateDivision.setVisible(false);
				mathTutorPanel.setBackground(Color.ORANGE);

			}
		});

		easyAddition.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				repaint();

				problemType = "Easy addition";

				label.setText("Add the two numbers");
				sign.setText("+");
				System.out.println("this is from addition");						
				randomNumber = new Random();

				firstNumber  = randomNumber.nextInt(50)+1;
				secondNumber = randomNumber.nextInt(50)+1;
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber + secondNumber;
				System.out.print(correctResult);

			}

		});
		easySubtraction.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				problemType = "Easy Subtraction";

				repaint();
				label.setText("Subtract the smaller number from the bigger one");
				sign.setText("-");

				randomNumber = new Random();
				do{
					firstNumber  = randomNumber.nextInt(50)+1;
					secondNumber = randomNumber.nextInt(50)+1;
				}while(firstNumber<=secondNumber);
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber - secondNumber;
				System.out.print(correctResult);

			}
		});
		easyMultiplication.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				problemType = "easyMultiplication";

				label.setText("Multiply the two numbers");
				sign.setText("x");
				System.out.println("this is from addition");						
				randomNumber = new Random();

				firstNumber  = randomNumber.nextInt(12)+1;
				secondNumber = randomNumber.nextInt(12)+1;
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber * secondNumber;
				System.out.print(correctResult);

			}

		});
		easyDivision.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				problemType = "easyDivision";

				label.setFont(font1);
				label.setText("Divide the two numbers");
				sign.setText("÷");
				System.out.println("this is from addition");						
				randomNumber = new Random();

				do{
					firstNumber  = randomNumber.nextInt(12)+1;
					secondNumber = randomNumber.nextInt(12)+1;
				}while(firstNumber<=secondNumber);
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber / secondNumber;
				System.out.print(correctResult);

			}
		});
		moderateAddition.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();

				label.setText("Add the two numbers");
				sign.setText("+");
				System.out.println("this is from addition");						
				randomNumber = new Random();

				firstNumber  = randomNumber.nextInt(90)+10;
				secondNumber = randomNumber.nextInt(90)+10;
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber + secondNumber;
				System.out.print(correctResult);


			}
		});

		moderateSubtraction.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				label.setText("Subtract the smaller number from the bigger one");
				sign.setText("-");

				randomNumber = new Random();
				do{
					firstNumber  = randomNumber.nextInt(90)+10;
					secondNumber = randomNumber.nextInt(90)+10;
				}while(firstNumber<=secondNumber);
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber - secondNumber;
				System.out.print(correctResult);



			}
		});
		moderateMultiplication.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				label.setText("Multiply the two numbers");
				sign.setText("x");
				System.out.println("this is from addition");						
				randomNumber = new Random();

				firstNumber  = randomNumber.nextInt(40)+10;
				secondNumber = randomNumber.nextInt(40)+10;
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber * secondNumber;
				System.out.print(correctResult);


			}
		});
		moderateDivision.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				label.setFont(font1);
				label.setText("Divide the two numbers");
				sign.setText("÷");
				System.out.println("this is from addition");						
				randomNumber = new Random();

				do{
					firstNumber  = randomNumber.nextInt(40)+10;
					secondNumber = randomNumber.nextInt(40)+10;
				}while(firstNumber<=secondNumber);
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber / secondNumber;
				System.out.print(correctResult);


			}
		});

		difficultAddition.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				repaint();

				label.setText("Add the two numbers");
				sign.setText("+");
				System.out.println("this is from addition");						
				randomNumber = new Random();

				firstNumber  = randomNumber.nextInt(900)+100;
				secondNumber = randomNumber.nextInt(900)+100;
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber + secondNumber;
				System.out.print(correctResult);



			}
		});
		difficultSubtraction.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				repaint();
				label.setText("Subtract the smaller number from the bigger one");
				sign.setText("-");

				randomNumber = new Random();
				do{
					firstNumber  = randomNumber.nextInt(900)+100;
					secondNumber = randomNumber.nextInt(900)+100;
				}while(firstNumber<=secondNumber);
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber - secondNumber;
				System.out.print(correctResult);



			}
		});
		difficultMultiplication.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				repaint();
				label.setText("Multiply the two numbers");
				sign.setText("x");
				System.out.println("this is from addition");						
				randomNumber = new Random();

				firstNumber  = randomNumber.nextInt(990)+110;
				secondNumber = randomNumber.nextInt(990)+110;
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber * secondNumber;
				System.out.print(correctResult);


			}
		});
		difficultDivision.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				repaint();
				label.setFont(font1);
				label.setText("Divide the two numbers");
				sign.setText("÷");
				System.out.println("this is from addition");						
				randomNumber = new Random();

				do{
					firstNumber  = randomNumber.nextInt(990)+110;
					secondNumber = randomNumber.nextInt(990)+110;
				}while(firstNumber<=secondNumber);
				String one =Integer.toString(firstNumber);
				String two = Integer.toString(secondNumber);
				firstNumberLabel.setText(one);
				secondNumberLabel.setText(two);
				correctResult = firstNumber / secondNumber;
				System.out.print(correctResult);





			}
		});	

		resultJtext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numberOfAttempts++;
				attemptNumber.setText(Integer.toString(numberOfAttempts));
				numberEntered = resultJtext.getText();


				if(numberEntered.toString() == null || numberEntered.toString().length() ==0 || numberEntered.toString().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter a number first");
					check.setVisible(false);
				}

				else if (numberEntered.equals(Integer.toString(correctResult))){

					check.setVisible(true);
					resultJtext.setBackground(Color.red);
					check.setBackground(Color.ORANGE);
					check.setText("Good Job! Correct");
					correct++;
				}
				else if (!numberEntered.equals(Integer.toString(correctResult))){
					check.setVisible(true);
					check.setText("Incorrect");
					check.setBackground(Color.blue);
					resultJtext.setBackground(Color.white);
					incorrect++;

				}
				right.setText(Integer.toString(correct));
				wrong.setText(Integer.toString(incorrect));

			}
		});

	}

	public void repaint(){		
		firstNumberLabel.setText("");
		secondNumberLabel.setText("");
		sign.setText("");
		equal.setText("");
		resultJtext.setText("");

		resultJtext.setBackground(Color.white);
		check.setBackground(Color.white);
		check.setText("");		
	}
}




