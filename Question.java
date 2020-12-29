import java.util.Scanner;
public class Question{
	void allQuizQuestion(){
		Scanner sc=new Scanner(System.in);
		int attempt=1;
		int count=0;
		System.out.println("-------------Quiz test------------\n");
		int array[]=new int[20];
		int ans[]={4,2,3,2,2,1,2,4,3,3,2,4,1,3,2,1,2,4,3,3};
		String arr[]={
			"Question-1.A train running at the speed of 60km/hr crosses a pole in 9 seconds. what is the length of the train ?\n1- 	120 meters\n2-	180 meters \n3- 	324 meters\n4- 	150 meters\n",
			"Question-2.A train 125 m long passes a man, running at 5 km/hr in the same direction in which the train is going, in 10 seconds. The speed of the train is:\n1- 	45 km/hr\n2- 	50 km/hr\n3- 	54 km/hr\n4- 	55 km/hr",
			"Question-3.The length of the bridge ,which a train 130 meters long and travelling at 45 km/hr can crosses in 30 sec is.: \n1- 	 200 meters\n2- 	225 meters \n3- 	245 meters\n4-	 250 meters\n",
			"Question-4.Two trains running in opposite directions cross a man standing on the platform in 27 seconds and 17 seconds respectively and they cross each other in 23 seconds. The ratio of their speeds is:\n1- 	1 : 3\n2- 	3 : 2\n3- 	3 : 4\n4- 	None of these",
			"Question-5.A train passes a station platform in 36 seconds and a man standing on the platform in 20 seconds. If the speed of the train is 54 km/hr, what is the length of the platform?\n1- 	120 m\n2- 	240 m\n3- 	300 m\n4- 	None of these",
			"Question-6.What is the average of first five multiples of 12?\n1.	36\n2.	38\n3.	40\n4.	42",
			"Question-7.A batsman scored 110 runs which included 3 boundaries and 8 sixes. What percent of his total score did he make by running between the wickets?\n1.	45%\n2.	500/11%\n3.	600/11%\n4.	55%",
			"Question-8.A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:\n1.	588 apples\n2.	600 apples\n3.	672 apples\n4.	700 apples",
			"Question-9.Two students appeared at an examination. One of them secured 9 marks more than the other and his marks was 56% of the sum of their marks. The marks obtained by them are:\n1.	39, 30\n2.	41, 32\n3.	42, 33\n4.	43, 34",
			"Question-10.What percentage of numbers from 1 to 70 have 1 or 9 in the unit's digit?\n1.	1\n2.	14\n3.	20\n4.	21",
			"Question-11.A person crosses a 600 m long street in 5 minutes. What is his speed in km per hour?\n1.	3.6\n2.	7.2\n3.	8.4\n4.	10",
			"Question-12.An aeroplane covers a certain distance at a speed of 240 kmph in 5 hours. To cover the same distance in 1 hours, it must travel at a speed of:\n1.	300 kmph\n2.	360 kmph\n3.	600 kmph\n4.	720 kmph",
			"Question-13.If a person walks at 14 km/hr instead of 10 km/hr, he would have walked 20 km more. The actual distance travelled by him is:\n1.	50 km\n2.	56 km\n3.	70 km\n4.	80 km",
			"Question-14.A train can travel 50% faster than a car. Both start from point A at the same time and reach point B 75 kms away from A at the same time. On the way, however, the train lost about 12.5 minutes while stopping at the stations. The speed of the car is:\n1.	100 kmph\n2.	110 kmph\n3.	120 kmph\n4.	130 kmph",
			"Question-15.Excluding stoppages, the speed of a bus is 54 kmph and including stoppages, it is 45 kmph. For how many minutes does the bus stop per hour?\n1.	9\n2.	10\n3.	12\n4.	20",
			"Question-16.What is the average of first five multiples of 12?\n1.	36\n2.	38\n3.	40\n4.	42",
			"Question-17.A batsman scored 110 runs which included 3 boundaries and 8 sixes. What percent of his total score did he make by running between the wickets?\n1.	45%\n2.	500/11%\n3.	600/11%\n4.	55%",
			"Question-18.A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:\n1.	588 apples\n2.	600 apples\n3.	672 apples\n4.	700 apples",
			"Question-19.Two students appeared at an examination. One of them secured 9 marks more than the other and his marks was 56% of the sum of their marks. The marks obtained by them are:\n1.	39, 30\n2.	41, 32\n3.	42, 33\n4.	43, 34",
			"Question-20.What percentage of numbers from 1 to 70 have 1 or 9 in the unit's digit?\n1.	1\n2.	14\n3.	20\n4.	21"
		};
		for (int i=0;i<arr.length ;i++ ) {
			System.out.println(arr[i]);
			System.out.println("your Answere : ");
			array[i]=sc.nextInt();
			if(i<19){
				attempt++;
				System.out.println("next Question enter 1 or you want to skip enter 2 ");
				int f=sc.nextInt();
				if(f==1){
		 	
				}
				if(f==2){
					i++;
				}
			}
			if(i==19){
				System.out.println("---------Successfully done----------");
			}
		}
		for(int k=0;k<array.length;k++){
			if(ans[k]==array[k]){
				//System.out.print(array[k]);
				count++;	
			}
		}
		/*for(int l=0;l<array.length;l++){
			System.out.print(array[l]+", ");
		}
		for(int w=0;w<arr.length;w++){
			System.out.print(ans[w]+", ");
		}*/
		System.out.println("--------------FINAL RESULT---------");
		System.out.println("you attempt "+attempt+" Question");
		System.out.println(count+" are correct ");
		int per=(count*100)/20;
		System.out.println("your percentage : "+per+" %");
		if(count==20){
			System.out.println("Excellent");
			System.out.println("attend second round");
		}else if(count<=19&&count>=15){
			System.out.println("very good");
			System.out.println("attend second round");
		}else if(count<=14&&count>=10){
			System.out.println("Good");
		}else{
			System.out.println("Bad");
		}
	}
}
