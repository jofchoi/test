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
		System.out.println("�б��� �ٴմϴ�.");
	}
	else {
		System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
	}
	
	
	
	char gender = 'F';
		
		if(gender == 'F') {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
	int age = 60;
	int charge;
	 
		if(age<8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�.");
		}
		else if(age<14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if(age<20) {
			charge = 2500;
			System.out.println("�߰���л��Դϴ�.");
		}
		else if(age<60){
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		else {
			charge = 0;
			System.out.println("��ο���Դϴ�.");
		}
			System.out.println("������ "+charge+"�� �Դϴ�.");
		
		

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
		
		System.out.println(ranking +"�� �޴��� ������ " + medalcolor + "�Դϴ�.");
		
		
		
		String medal = "gold";
		
		switch(medal) {
		
		case "gold":
		System.out.println("�ݸ޴��Դϴ�.");
		break;
		case "silver":
		System.out.println("���޴��Դϴ�.");
		break;
		case "bronze":
		System.out.println("���޴��Դϴ�.");
		break;
		default:
		System.out.println("��޴��Դϴ�.");
		break;	
		}
		
			
		
		int floor = 2;
	
		switch(floor){
			case 1 : System.out.println("�౹�Դϴ�.");
			break;
			case 2 : System.out.println("�����ܰ��Դϴ�.");
			break;
			case 3 : System.out.println("�Ǻΰ��Դϴ�.");
			break;
			case 4 : System.out.println("ġ���Դϴ�.");
			break;
			case 5 : System.out.println("�ｺŬ���Դϴ�.");
			break;
		}
		
		
		
		int num =1;
		int sum =0;
		
		while(num <= 10) {
			
			sum += num;
			num++;
		}
		
		System.out.println("1���� 10�� ���� " + sum + "�Դϴ�." );
		
	
		
		int num = 1;
		int sum = 0;
		
		do{
			
			sum += num;
			num++;
			
		}
		
		while(num<=50);
			
			
			System.out.println("1~50������ ����" + sum + "�Դϴ�.");
		
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
