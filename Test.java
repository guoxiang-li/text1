package �������;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Test {

	
	public static void main(String[] args) throws FileNotFoundException {
		

		System.out.println("��������Ŀ������");
		Scanner reader=new Scanner(System.in);//������Ŀ����
		int geshu=reader.nextInt();
		
		System.out.println("�Ƿ��г˳���");//������Ŀ������
		System.out.println("1�����г˳���\t2�������˳���");
		Scanner sc=new Scanner(System.in);
		int chengchu=sc.nextInt();//
		
		System.out.println("��������Χ��");// ������Ŀ���ȡֵ��Χ
		System.out.println("1��100����\t2��1000����");
		Scanner scn=new Scanner(System.in);
		int fanwei=scn.nextInt();
		
		System.out.println("�Ƿ��и���");//������Ŀ�Ƿ��и���
		System.out.println("1�������и���\t2�����и���");
		Scanner scan=new Scanner(System.in);
		int fushu=scan.nextInt();
		PrintStream ps = new PrintStream("D:/result.txt");
		
		switch(chengchu){                //���û�Ҫ������������˳�����ʱ��ִ����������
		case 1:
		
			char a1[]=new char[4];                    //��������洢�ĸ������+-*/
			a1[0]='+';
			a1[1]='-';
			a1[2]='*';
			a1[3]='/';
			
			
			for(int i=0;i<geshu;i++){
				Random random1=new Random();
				int first1=random1.nextInt(100);              //������ɵ�һ��100���ڵ���
				int second1=random1.nextInt(100);             //������ɵڶ���100���ڵ���
				int yunsuanfu1=random1.nextInt(4);            //�������һ��4���ڵ�����������������������+-*/
				
				
				char b1= a1[yunsuanfu1];            
				int result1=0;                                //����result1�������洢������õ��Ľ��
				switch(b1){                                   //�ж����ɵ���ʲô���������������
				case '+':result1=first1+second1;break;
				case '-':result1=first1-second1;break;
				case '*':result1=first1*second1;break;
				case '/':result1=first1/second1;break;
				}
				
				
				
				if(fanwei==1){                                          //���û�Ҫ�����������100����ʱ
					if(result1>=100){                                   //�жϽ���Ƿ���100���ڣ�������ǣ��ٽ���һ��ѭ��
						i--;
					}
					else{

  //��������100���ڣ������
					}
				}
				else if(fanwei==2){                                    //���ͻ�Ҫ�����������1000����ʱ
					if(result1>=1000){                                  //�ж��Ƿ���1000���ڣ�������ǣ��ٽ���һ��ѭ��
						i--;
					}else{
						 System.setOut(ps);
						System.out.println(first1+" "+b1+second1+"=");  //��������1000���ڣ������
					}
				}
		
		
		}break;
		
			
			
			
		                                                        //���ͻ�Ҫ��������������˳�����ʱ��ִ����������
			case 2:   char a2[]=new char[2];                              //����һ������洢�����+-
			
			
					a2[0]='+';
					a2[1]='-';
					for(int j=0;j<geshu;j++){
						Random random2=new Random();
						int first2=random2.nextInt(100);                 //���ɵ�һ��100���ڵ������
						int second2=random2.nextInt(100);				 //���ɵڶ���100���ڵ������
						int yunsuanfu2=random2.nextInt(2);               //�������һ��2���ڵ���������������������
						char b2= a2[yunsuanfu2];
						int result2=0;                                   //����result2�������洢������
						switch(b2){                                      //�ж��������+����-
						case '+':result2=first2+second2;break;
						case '-':result2=first2-second2;break;
												}
						if(fanwei==1){                                    //���û�Ҫ�����������100����ʱ
							if(result2>=100){                             //�жϽ���Ƿ���100���ڣ�������ǣ��ٽ���һ��ѭ��
								j--;
							}else{                                        //��������100���ڣ������
								 System.setOut(ps);
							    System.out.println(first2+" "+b2+second2+"=");
							}
						}
						else if(fanwei==2){                              //���ͻ�Ҫ�����������1000����ʱ
							if(result2>=1000){                            //�ж��Ƿ���1000���ڣ�������ǣ��ٽ���һ��ѭ��
								j--;
							}else{       
								 System.setOut(ps);                        //��������1000���ڣ������
								System.out.println(first2+" "+b2+second2+"=");
							}
						}	
				   }
			   }
		   }                        
	   
   }
