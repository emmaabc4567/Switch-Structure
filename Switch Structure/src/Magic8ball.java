import java.util.Scanner; 

public class Magic8ball
	{

		public static void main(String[] args)
		{
			runMagic8();
			playCards();
		}
		public static void runMagic8()
			{
				System.out.println("Ask your question.");
				Scanner userInput = new Scanner (System.in);
				String question = userInput.nextLine();
				int side1 = (int) (Math.random()*4)+1;
				int side2 = (int) (Math.random()*4)+1;
				int Number = side1 + side2;
				switch (Number)
				{
					case 2:
					case 4:
					case 7:
							{
								System.out.println("Don't count on it.");
								break;
							}
					case 3:
					case 5:
					case 6:
							{
								System.out.println("Cannot conclude at this time.");
								break;
							}
					case 8:
							{
								System.out.println("I see success in your future.");
							}
				}
			}
			public static void playCards()
			{
				System.out.println("Pick a number between 1-20.");
				Scanner userInput = new Scanner (System.in);
				int input = userInput.nextInt();
				switch (input)
				{
					case 1:
					case 2:
					case 4:
					case 5:
					case 6:
					case 10:
					case 12:
					case 14:
					case 18:
					case 20:
							{
								System.out.println("Congratulations! You win!");
								break;
							}
					case 8:
					case 16:
							{
								System.out.println("You lose.");
								break;
							}
					case 3:
					case 7:
					case 9:
					case 11:
					case 13:
					case 15:
					case 17:
					case 19:
							{
								System.out.println("You tie.");
								break;
							}
						
				}
			}

	}
