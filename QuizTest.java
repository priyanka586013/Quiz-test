import java.util.Scanner;
class QuizTest extends Question{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------------WELCOME-------------------");
		System.out.println();
		System.out.println("Enter 1 for quiz start \nEnter 2 for dont want to quiz \n ");
		int start=sc.nextInt();
		switch(start){
			case 1:
				Question q=new Question();
				q.allQuizQuestion();
				break;
			case 2:
				System.out.println("thanku so much");
				break;
			default:
				System.out.println("sorry you enter wrong no.  ");
				break;
		}
		

	}
}