package doit;

public class inte {

	public static void main(String[] args) {
		
		/*
		int num = 10;
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		
		num = -num;
		
		System.out.println(+num);
		*/
			
		/*
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double aveScore = totalScore / 2.0 ;
		System.out.println(aveScore);
		*/
		
		
		/*
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);
		
		
		int myAge = 27;
		boolean value = (myAge>25);
		System.out.println(myAge);
		
		
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 >0) && (num2 >0);
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
				
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2)< 10 );
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i+2)< 10 );
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		
		int num = 5;
		int i = 10;
		
		boolean value = ((num = num * 10)>45) && ((i=i-5)<10);
		
	System.out.println(value);
	System.out.println(num);
	System.out.println(i);
		
	
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge)? 'T':'F';
		
		System.out.println(ch);
		
		
		
		int num = 10;
		boolean isEven;
		isEven = (num % 2 == 0) ? true:false;
		
		System.out.println(isEven);
	
		
		
		
		int i = 10;
		if(i>11) {
			System.out.println("TRUE");
		}
		
		else {
			System.out.println("FALSE");
		
		}
		
	
	int i = 7;
	if(i>=8) {
		System.out.println("학교에 다닙니다.");
	}
	else {
		System.out.println("학교에 다니지 않습니다.");
	}
	
	
	
	char gender = 'F';
		
		if(gender == 'F') {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("남성입니다.");
		}
	int age = 60;
	int charge;
	 
		if(age<8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if(age<14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if(age<20) {
			charge = 2500;
			System.out.println("중고등학생입니다.");
		}
		else if(age<60){
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		else {
			charge = 0;
			System.out.println("경로우대입니다.");
		}
			System.out.println("입장료는 "+charge+"원 입니다.");
		
		

		int score =80;
		char grade = 'F';
				
		if(score<60) {
			System.out.println(grade);
		}
		else if(score<70) {
			grade = 'D';
			System.out.println(grade);
		}
		else if(score<80) {
			grade = 'C';
			System.out.println(grade);
		}
		else if(score<90) {
			grade = 'B';
			System.out.println(grade);
		}
		else {
			grade = 'A';
			System.out.println(grade);
		}
	
		


		int ranking = 1;
		char medalcolor;
		
		
		switch(ranking){

		case 1 : medalcolor = 'G';

			break;

		case 2 : medalcolor = 'S';

			break;

		case 3 : medalcolor ='B';

			break;

		default : medalcolor = 'A';
		
		}
		
		System.out.println(ranking +"등 메달의 색깔은 " + medalcolor + "입니다.");
		
		
		
		String medal = "gold";
		
		switch(medal) {
		
		case "gold":
		System.out.println("금메달입니다.");
		break;
		case "silver":
		System.out.println("은메달입니다.");
		break;
		case "bronze":
		System.out.println("동메달입니다.");
		break;
		default:
		System.out.println("노메달입니다.");
		break;	
		}
		
			
		
		int floor = 2;
	
		switch(floor){
			case 1 : System.out.println("약국입니다.");
			break;
			case 2 : System.out.println("정형외과입니다.");
			break;
			case 3 : System.out.println("피부과입니다.");
			break;
			case 4 : System.out.println("치과입니다.");
			break;
			case 5 : System.out.println("헬스클럽입니다.");
			break;
		}
		
		
		
		int num =1;
		int sum =0;
		
		while(num <= 10) {
			
			sum += num;
			num++;
		}
		
		System.out.println("1부터 10의 합은 " + sum + "입니다." );
		
	
		
		int num = 1;
		int sum = 0;
		
		do{
			
			sum += num;
			num++;
			
		}
		
		while(num<=50);
			
			
			System.out.println("1~50까지의 합은" + sum + "입니다.");
		
	int num;
	
	for(num=1; num<=10; num++)
	{
		System.out.println(num);
	}
		
		
		
	int i;
	int sum;
		
	for(i = 1, sum = 0; i <= 10; i++)
	{
		sum += i;
	}
		
	System.out.println("sum of 1~10 is " + sum);

	
		
	
	int i;
	String c = "hello";
	
	for(i = 1; i < 10; i++);
	{
		System.out.println(c + i);
	
	}
		
	*/	
		/*
		
	int dan;
	int times;
	
	for(dan = 2; dan <= 9; dan++) {
		
		for(times = 1; times <= 9; times++) {
			
			System.out.println(dan + "X" + times + "=" + dan*times);
			
		}
		
		System.out.println( );
	}
		
		
		*/
		
		int i;

		for(i = 1; i < 10; i++);
		{
			System.out.println("hello" + i);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
