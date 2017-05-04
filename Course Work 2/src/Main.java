import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int M1I1,M2I1,M3I1,M4I1,M5I1,M6I1,MI1R,MI2R,MI3R; //variables for marks
	public static int M1I2,M2I2,M3I2,M4I2,M5I2,M6I2;
	public static int M1I3,M2I3,M3I3,M4I3,M5I3,M6I3;
	public static int total,credit1,credit2,credit3,con,min,count,count2; //con=condoned ,min=minimum ,count and count2 for count retakes and resits
	public static int avg1,avg2,avg3,avg4,avg5,avg6,L5avg1,L5avg2,L5avg3,L5avg4,L5avg5,L5avg6,L4avgR,L6avg1,L6avg2,
	L6avg3,L6avg4,L6avg5,L6avg6,L5avgR;//variables for average
	public static String l4m1Rep,l4m2Rep,l4m3Rep,l4m4Rep,l4m5Rep,l4m6Rep,l4m7Rep,l4m8Rep,l4m9Rep,l4m10Rep,l4m11Rep,
	l4m12Rep,l4m13Rep,l4m14Rep,l4m15Rep,l4m16Rep,l4m17Rep,l4m18Rep,l5m1Rep,l5m2Rep,l5m3Rep,l5m4Rep,l5m5Rep,l5m6Rep,l5m7Rep,l5m8Rep,
	l5m9Rep,l5m10Rep,l5m11Rep,l5m12Rep,l5m13Rep,l5m14Rep,l5m15Rep,l5m16Rep,l5m17Rep,l5m18Rep,l5m19Rep,l5m20Rep,l5m21Rep,l6m1Rep,l6m2Rep,l6m3Rep,
	l6m4Rep,l6m5Rep,l6m6Rep,l6m7Rep,l6m8Rep,l6m9Rep,l6m10Rep,l6m11Rep,l6m12Rep,l6m13Rep,l6m14Rep,l6m15Rep,l6m16Rep,l6m17Rep,l6m18Rep,l6m19Rep,
	l6m20Rep,l6m21Rep,award1,award2,award3,award4,award5,award6,award7,award8,award9,award10,award11,award12,award13,award14,award15,award16;
	// variables for write to text file


	public static void main(String[] args) {
		System.out.println(" **    **  ***    **  ******  **       **  ********  ********  ********  ******  ********  **    ** ");
	    System.out.println(" **    **  ** *   **    **     **     **   **        **    **  **          **       **      **  ** ");
		System.out.println(" **    **  **  *  **    **      **   **    ********  ** **     ********    **       **       **** ");
		System.out.println(" **    **  **   * **    **       ** **     **        **  **          **    **       **        ** ");
		System.out.println("  ******   **    ***  ******      ***      ********  **    **  ********  ******     **        ** ");
		System.out.println(" ------------------------------------------------------------------------------------------------ ");
		System.out.println("                  ********  ********     ********    **    **  ********    ********  ******   ");
	    System.out.println("                  **    **  **           **          **    **  **          **          **     ");
		System.out.println("                  **    **  ********     **  ******  **    **  **  ******  ********    **     ");
		System.out.println("                  **    **  **           **  **  **  **    **  **  **  **        **    **     ");
		System.out.println("                  ********  **           ********     ******   ********    ********  ******   ");
		System.out.println("                  --------------------------------------------------------------------------");
		
		int num;
		do{
			credit1=0;credit2=0;credit3=0;
			con=0;L4avgR=0;L5avgR=0;
			count=0;count2=0;
			l4m1Rep=null;l4m2Rep=null;l4m3Rep=null;l4m4Rep=null;l4m5Rep=null;l4m6Rep=null;l4m7Rep=null;l4m8Rep=null;l4m9Rep=null;l4m10Rep=null;
			l4m11Rep=null;l4m12Rep=null;l4m13Rep=null;l4m14Rep=null;l4m15Rep=null;l4m16Rep=null;l4m16Rep=null;l4m17Rep=null;l4m18Rep=null;
			l5m1Rep=null;l5m2Rep=null;l5m3Rep=null;l5m4Rep=null;l5m5Rep=null;l5m6Rep=null;l5m7Rep=null;l5m8Rep=null;l5m9Rep=null;l5m10Rep=null;
			l5m11Rep=null;l5m12Rep=null;l5m13Rep=null;l5m14Rep=null;l5m15Rep=null;l5m16Rep=null;l5m16Rep=null;l5m17Rep=null;l5m18Rep=null;
			l5m19Rep=null;l5m20Rep=null;l5m21Rep=null;
			l6m1Rep=null;l6m2Rep=null;l6m3Rep=null;l6m4Rep=null;l6m5Rep=null;l6m6Rep=null;l6m7Rep=null;l6m8Rep=null;l6m9Rep=null;l6m10Rep=null;
			l6m11Rep=null;l6m12Rep=null;l6m13Rep=null;l6m14Rep=null;l6m15Rep=null;l6m16Rep=null;l6m16Rep=null;l6m17Rep=null;l6m18Rep=null;
			l6m19Rep=null;l6m20Rep=null;l6m21Rep=null;
			award1=null;award2=null;award3=null;award4=null;award5=null;award6=null;award7=null;award8=null;award9=null;award10=null;award11=null;
			award12=null;award13=null;award14=null;award15=null;award16=null;//set default value
        //Add a student
		System.out.println("");
		Scanner sc=new Scanner(System.in);
		File stu = new File ("Student.txt");
		System.out.println("Enter Student Name and Id:-");
		String name = sc.next();
		int id =sc.nextInt();
		Student S1 =new Student(name,id);
		try {
			FileOutputStream fos = new FileOutputStream(stu); //student file
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(S1);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("---Level 04---");
		System.out.println("");
		File file = new File ("Level04.txt");//level04 marks file
		
		//module 01
		System.out.println("Module 1:-");
		int [] M1ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			M1ict [i]=sc.nextInt();
			M1I1=M1ict[0];
			M1I2=M1ict[1];
			M1I3=M1ict[2];
		}
	    total=M1I1+M1I2+M1I3;
	    avg1=total/3;
		Marks M1 =new Marks(avg1);
		
		//Module 02
		System.out.println("Module 2:-");
		int [] M2ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			M2ict [i]=sc.nextInt();
			M2I1=M2ict[0];
			M2I2=M2ict[1];
			M2I3=M2ict[2];
		}
	    total=M2I1+M2I2+M2I3;
	    avg2=total/3;
		Marks M2 =new Marks(avg2);
		
		//Module 03
		System.out.println("Module 3:-");
		int [] M3ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			M3ict [i]=sc.nextInt();
			M3I1=M3ict[0];
			M3I2=M3ict[1];
			M3I3=M3ict[2];
		}
	    total=M3I1+M3I2+M3I3;
	    avg3=total/3;
		Marks M3 =new Marks(avg3);
		
		//Module 04
		System.out.println("Module 4:-");
		int [] M4ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			M4ict [i]=sc.nextInt();
			M4I1=M4ict[0];
			M4I2=M4ict[1];
			M4I3=M4ict[2];
		}
	    total=M4I1+M4I2+M4I3;
	    avg4=total/3;
		Marks M4 =new Marks(avg4);
		
		//Module 05
		System.out.println("Module 5:-");
		int [] M5ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			M5ict [i]=sc.nextInt();
			M5I1=M5ict[0];
			M5I2=M5ict[1];
			M5I3=M5ict[2];
		}
	    total=M5I1+M5I2+M5I3;
	    avg5=total/3;
		Marks M5 =new Marks(avg5);
		
		//Module 06
		System.out.println("Module 6:-");
		int [] M6ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			M6ict [i]=sc.nextInt();
			M6I1=M6ict[0];
			M6I2=M6ict[1];
			M6I3=M6ict[2];
		}
	    total=M6I1+M6I2+M6I3;
	    avg6=total/3;
		Marks M6 =new Marks(avg6);
		
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(M1);
			oos.writeObject(M2);
			oos.writeObject(M3);
			oos.writeObject(M4);
			oos.writeObject(M5);
			oos.writeObject(M6);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				Marks T1 = (Marks)ois.readObject();
				Marks T2 = (Marks)ois.readObject();
				Marks T3 = (Marks)ois.readObject();
				Marks T4 = (Marks)ois.readObject();
				Marks T5 = (Marks)ois.readObject();
				Marks T6 = (Marks)ois.readObject();
				
				File level04 = new File("Level4 Status.txt");//level 4 status text file
				PrintWriter pw=null;
				FileWriter fw=null;
				try {
					fw=new FileWriter(level04);
					pw=new PrintWriter(fw,true); 
					
				
				//Module 01
				System.out.println("Module 1:-");
				System.out.println(T1);
			
				if (avg1 >= 40&&avg1<=100 && (M1I1 < 40 || M1I2 < 40 || M1I3 < 40)) {
					System.out.println("PASS");
					System.out.println("CONDONED");
					pw.println("Module 01:-"+avg1+" PASS-CONDONED");
					con=con+20;
				} else if (avg1 >= 40&&avg1<=100) {
					System.out.println("PASS");
					pw.println("Module 01:-"+avg1+" PASS");
					credit1=credit1+20;
				} else if (avg1 >= 30&&avg1<=100) {
					System.out.println("RESIT");
					System.out.println("CONDONED");
					pw.println("Module 01:-"+avg1+" RESIT-CONDONED");
					con=con+20;
				} else if (avg1 < 30) {
					System.out.println("RETAKE");
					pw.println("Module 01:-"+avg1+" RETAKE");
					System.out.println("");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 02
				System.out.println("Module 2:-");
				System.out.println(T2);
			
				if (avg2 >= 40&&avg2<=100 && (M2I1 < 40 || M2I2 < 40 || M2I3 < 40)) {
					System.out.println("PASS");
					System.out.println("CONDONED");
					pw.println("Module 02:-"+avg2+" PASS-CONDONED");
					con=con+20;
				} else if (avg2 >= 40&&avg2<=100) {
					System.out.println("PASS");
					pw.println("Module 02:-"+avg2+" PASS");
					credit1=credit1+20;
				} else if (avg2 >= 30&&avg2<=100) {
					System.out.println("RESIT");
					System.out.println("CONDONED");
					pw.println("Module 02:-"+avg2+" RESIT-CONDONED");
					con=con+20;
				} else if (avg2 < 30) {
					System.out.println("RETAKE");
					pw.println("Module 02:-"+avg2+" RETAKE");
					System.out.println("");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 03
				System.out.println("Module 3:-");
				System.out.println(T3);
			
				if (avg3 >= 40&&avg3<=100 && (M3I1 < 40 || M3I2 < 40 || M3I3 < 40)) {
					System.out.println("PASS");
					System.out.println("CONDONED");
					pw.println("Module 03:-"+avg3+" PASS-CONDONED");
					con=con+20;
				} else if (avg3 >= 40&&avg3<=100) {
					System.out.println("PASS");
					pw.println("Module 03:-"+avg3+" PASS");
					credit1=credit1+20;
				} else if (avg3 >= 30&&avg3<=100) {
					System.out.println("RESIT");
					System.out.println("CONDONED");
					pw.println("Module 03:-"+avg3+" RESIT-CONDONED");
					con=con+20;
				} else if (avg3 < 30) {
					System.out.println("RETAKE");
					pw.println("Module 03:-"+avg3+" RETAKE");
					System.out.println("");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 04
				System.out.println("Module 4:-");
				System.out.println(T4);
			
				if (avg4 >= 40&&avg4<=100 && (M4I1 < 40 || M4I2 < 40 || M4I3 < 40)) {
					System.out.println("PASS");
					System.out.println("CONDONED");
					pw.println("Module 04:-"+avg4+" PASS-CONDONED");
					con=con+20;
				} else if (avg4 >= 40&&avg4<=100) {
					System.out.println("PASS");
					pw.println("Module 04:-"+avg4+" PASS");
					credit1=credit1+20;
				} else if (avg4 >= 30&&avg4<=100) {
					System.out.println("RESIT");
					System.out.println("CONDONED");
					pw.println("Module 04:-"+avg4+" RESIT-CONDONED");
					con=con+20;
				} else if (avg4 < 30) {
					System.out.println("RETAKE");
					pw.println("Module 04:-"+avg4+" RETAKE");
					System.out.println("");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 05
				System.out.println("Module 5:-");
				System.out.println(T5);
			
				if (avg5 >= 40&&avg5<=100 && (M5I1 < 40 || M5I2 < 40 || M5I3 < 40)) {
					System.out.println("PASS");
					System.out.println("CONDONED");
					pw.println("Module 05:-"+avg5+" PASS-CONDONED");
					con=con+20;
				} else if (avg5 >= 40&&avg5<=100) {
					System.out.println("PASS");
					pw.println("Module 05:-"+avg5+" PASS");
					credit1=credit1+20;
				} else if (avg5 >= 30&&avg5<=100) {
					System.out.println("RESIT");
					System.out.println("CONDONED");
					pw.println("Module 05:-"+avg5+" RESIT-CONDONED");
					con=con+20;
				} else if (avg5 < 30) {
					System.out.println("RETAKE");
					pw.println("Module 05:-"+avg5+" RETAKE");
					System.out.println("");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 06
				System.out.println("Module 6:-");
				System.out.println(T6);
			
				if (avg6 >= 40&&avg6<=100 && (M6I1 < 40 || M6I2 < 40 || M6I3 < 40)) {
					System.out.println("PASS");
					System.out.println("CONDONED");
					pw.println("Module 06:-"+avg6+" PASS-CONDONED");
					con=con+20;
				} else if (avg6 >= 40&&avg6<=100) {
					System.out.println("PASS");
					pw.println("Module 06:-"+avg6+" PASS");
					credit1=credit1+20;
				} else if (avg6 >= 30&&avg6<=100) {
					System.out.println("RESIT");
					System.out.println("CONDONED");
					pw.println("Module 06:-"+avg6+" RESIT-CONDONED");
					con=con+20;
				} else if (avg6 < 30) {
					System.out.println("RETAKE");
					pw.println("Module 06:-"+avg6+" RETAKE");
					System.out.println("");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
                   } catch (IOException e) {
					
					e.printStackTrace();
				   }finally{
					pw.close();
				   }
				
				System.out.println("");
				if(con<=40){
					credit1=credit1+con;
					System.out.println("Credits = "+credit1);
				}else{
					credit1=credit1+40;
					System.out.println("Credits = "+credit1);
				}
				
				if (credit1>120){
					System.out.println("Invalid");
				}else if (credit1 == 120) {
					System.out.println("You are eligible for move to the Level-05");
				} else if (credit1 == 100) {
					System.out.println("You are eligible for move to the Level-05 "
							+ "but you have to RETAKE your failure Module");
				} else if (credit1 < 100) {
					System.out.println("You are not eligible for move to the Level-05");
				}
			
				try {
					Scanner sc2 =new Scanner(level04);//read from level 4 status text file
					 l4m1Rep = sc2.next();
					 l4m2Rep = sc2.next();
					 l4m3Rep = sc2.next();
					 l4m4Rep = sc2.next();
					 l4m5Rep = sc2.next();
					 l4m6Rep = sc2.next();
					 l4m7Rep = sc2.next();
					 l4m8Rep = sc2.next();
					 l4m9Rep = sc2.next();
					 l4m10Rep = sc2.next();
					 l4m11Rep = sc2.next();
					 l4m12Rep = sc2.next();
					 l4m13Rep = sc2.next();
					 l4m14Rep = sc2.next();
					 l4m15Rep = sc2.next();
					 l4m16Rep = sc2.next();
					 l4m17Rep = sc2.next();
					 l4m18Rep = sc2.next();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("");//CerHE menu
		System.out.println("Choose Your Career:-");
		System.out.println("(1)Continue");
		System.out.println("(2)Exit with CerHE");
		int cerhe=sc.nextInt();
		if(cerhe==1){
	
		//Level 05
		if(credit1>=100){
		System.out.println("");
		System.out.println("---Level 05---");
		System.out.println("");
        File file2 = new File ("Level05.txt");//level05 marks file
		
		//module 01
		System.out.println("Module 1:-");
		int [] L5M1ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			L5M1ict [i]=sc.nextInt();
			M1I1=L5M1ict[0];
			M1I2=L5M1ict[1];
			M1I3=L5M1ict[2];
		}
	    total=M1I1+M1I2+M1I3;
	    L5avg1=total/3;
		Marks2 L5M1 =new Marks2(L5avg1);
		
		//Module 02
		System.out.println("Module 2:-");
		int [] L5M2ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			L5M2ict [i]=sc.nextInt();
			M2I1=L5M2ict[0];
			M2I2=L5M2ict[1];
			M2I3=L5M2ict[2];
		}
	    total=M2I1+M2I2+M2I3;
	    L5avg2=total/3;
		Marks2 L5M2 =new Marks2(L5avg2);
		
		//Module 03
		System.out.println("Module 3:-");
		int [] L5M3ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			L5M3ict [i]=sc.nextInt();
			M3I1=L5M3ict[0];
			M3I2=L5M3ict[1];
			M3I3=L5M3ict[2];
		}
	    total=M3I1+M3I2+M3I3;
	    L5avg3=total/3;
		Marks2 L5M3 =new Marks2(L5avg3);
		
		//Module 04
		System.out.println("Module 4:-");
		int [] L5M4ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			L5M4ict [i]=sc.nextInt();
			M4I1=L5M4ict[0];
			M4I2=L5M4ict[1];
			M4I3=L5M4ict[2];
		}
	    total=M4I1+M4I2+M4I3;
	    L5avg4=total/3;
		Marks2 L5M4 =new Marks2(L5avg4);
		
		//Module 05
		System.out.println("Module 5:-");
		int [] L5M5ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			L5M5ict [i]=sc.nextInt();
			M5I1=L5M5ict[0];
			M5I2=L5M5ict[1];
			M5I3=L5M5ict[2];
		}
	    total=M5I1+M5I2+M5I3;
	    L5avg5=total/3;
		Marks2 L5M5 =new Marks2(L5avg5);
		
		//Module 06
		System.out.println("Module 6:-");
		int [] L5M6ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			L5M6ict [i]=sc.nextInt();
			M6I1=L5M6ict[0];
			M6I2=L5M6ict[1];
			M6I3=L5M6ict[2];
		}
	    total=M6I1+M6I2+M6I3;
	    L5avg6=total/3;
		Marks2 L5M6 =new Marks2(L5avg6);
		
		//Retake
		if (credit1==100){
		System.out.println("Leve 04 RETAKE Module :-");
		int [] L4RM1ict=new int[3];
		for (int i =0; i<3;i++){
			System.out.print("ICT"+(i+1)+" : ");
			L4RM1ict [i]=sc.nextInt();
			MI1R=L4RM1ict[0];
			MI2R=L4RM1ict[1];
			MI3R=L4RM1ict[2];
		}
	    total=MI1R+MI2R+MI3R;
	    L4avgR=total/3;
	    if(L4avgR>=40){
	    	L4avgR=40;
	    }
			
		}
	
		Marks2 L4RM =new Marks2(L4avgR);
		
		
		try {
			FileOutputStream fos = new FileOutputStream(file2);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(L5M1);
			oos.writeObject(L5M2);
			oos.writeObject(L5M3);
			oos.writeObject(L5M4);
			oos.writeObject(L5M5);
			oos.writeObject(L5M6);
			oos.writeObject(L4RM);
			oos.flush();
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream fis2;
		try {
			fis2 = new FileInputStream(file2);
			ObjectInputStream ois = new ObjectInputStream(fis2);
			try {
				Marks2 T1 = (Marks2)ois.readObject();
				Marks2 T2 = (Marks2)ois.readObject();
				Marks2 T3 = (Marks2)ois.readObject();
				Marks2 T4 = (Marks2)ois.readObject();
				Marks2 T5 = (Marks2)ois.readObject();
				Marks2 T6 = (Marks2)ois.readObject();
				Marks2 T7 = (Marks2)ois.readObject();
				
				File level05 = new File("Level5 Status.txt");//level 5 status text file
				PrintWriter pw=null;
				FileWriter fw=null;
				try {
					fw=new FileWriter(level05);
					pw=new PrintWriter(fw,true); // true Stands for auto flush
					

				//Module 01
				System.out.println("Module 1:-");
				System.out.println(T1);
			
				if (L5avg1 >= 40&&L5avg1<=100 && (M1I1 < 40 || M1I2 < 40 || M1I3 < 40)) {
					System.out.println("RESIT");
					pw.println("Module 01:-"+L5avg1+" RESIT");
					count2=count2+1;
				} else if (L5avg1 >= 40&&L5avg1<=100) {
					System.out.println("PASS");
					pw.println("Module 01:-"+L5avg1+" PASS");
					credit2=credit2+20;
				} else if (L5avg1 >= 30&&L5avg1<=100) {
					System.out.println("RESIT");
					pw.println("Module 01:-"+L5avg1+" RESIT");
					count2=count2+1;
				} else if (L5avg1 < 30) {
					System.out.println("RETAKE");
					System.out.println("");
					pw.println("Module 01:-"+L5avg1+" RETAKE");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 02
				System.out.println("Module 2:-");
				System.out.println(T2);
			
				if (L5avg2 >= 40&&L5avg2<=100 && (M2I1 < 40 || M2I2 < 40 || M2I3 < 40)) {
					System.out.println("RESIT");
					pw.println("Module 02:-"+L5avg2+" RESIT");
					count2=count2+1;
				} else if (L5avg2 >= 40&&L5avg2<=100) {
					System.out.println("PASS");
					pw.println("Module 02:-"+L5avg2+" PASS");
					credit2=credit2+20;
				} else if (L5avg2 >= 30&&L5avg2<=100) {
					System.out.println("RESIT");
					pw.println("Module 02:-"+L5avg2+" RESIT");
					count2=count2+1;
				
				} else if (L5avg2 < 30) {
					System.out.println("RETAKE");
					System.out.println("");
					pw.println("Module 02:-"+L5avg2+" RETAKE");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 03
				System.out.println("Module 3:-");
				System.out.println(T3);
			
				if (L5avg3 >= 40&&L5avg3<=100 && (M3I1 < 40 || M3I2 < 40 || M3I3 < 40)) {
					System.out.println("RESIT");
					pw.println("Module 03:-"+L5avg3+" RESIT");
					count2=count2+1;
				} else if (L5avg3 >= 40&&L5avg3<=100) {
					System.out.println("PASS");
					pw.println("Module 03:-"+L5avg3+" PASS");
					credit2=credit2+20;
				} else if (L5avg3 >= 30&&L5avg3<=100) {
					System.out.println("RESIT");
					pw.println("Module 03:-"+L5avg3+" RESIT");
					count2=count2+1;
				} else if (L5avg3 < 30) {
					System.out.println("RETAKE");
					System.out.println("");
					pw.println("Module 03:-"+L5avg3+" RETAKE");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 04
				System.out.println("Module 4:-");
				System.out.println(T4);
			
				if (L5avg4 >= 40&&L5avg4<=100 && (M4I1 < 40 || M4I2 < 40 || M4I3 < 40)) {
					System.out.println("RESIT");
					pw.println("Module 04:-"+L5avg4+" RESIT");
					count2=count2+1;
				} else if (L5avg4 >= 40&&L5avg4<=100) {
					System.out.println("PASS");
					pw.println("Module 04:-"+L5avg4+" PASS");
					credit2=credit2+20;
				} else if (L5avg4 >= 30&&L5avg4<=100) {
					System.out.println("RESIT");
					pw.println("Module 04:-"+L5avg4+" RESIT");
					count2=count2+1;
				} else if (L5avg4 < 30) {
					System.out.println("RETAKE");
					System.out.println("");
					pw.println("Module 04:-"+L5avg4+" RETAKE");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 05
				System.out.println("Module 5:-");
				System.out.println(T5);
			
				if (L5avg5 >= 40&&L5avg5<=100 && (M5I1 < 40 || M5I2 < 40 || M5I3 < 40)) {
					System.out.println("RESIT");
					pw.println("Module 05:-"+L5avg5+" RESIT");
					count2=count2+1;
				} else if (L5avg5 >= 40&&L5avg5<=100) {
					System.out.println("PASS");
					pw.println("Module 05:-"+L5avg5+" PASS");
					credit2=credit2+20;
				} else if (L5avg5 >= 30&&L5avg5<=100) {
					System.out.println("RESIT");
					pw.println("Module 05:-"+L5avg5+" RESIT");
					count2=count2+1;
				} else if (L5avg5 < 30) {
					System.out.println("RETAKE");
					System.out.println("");
					pw.println("Module 05:-"+L5avg5+" RETAKE");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Module 06
				System.out.println("Module 6:-");
				System.out.println(T6);
			
				if (L5avg6 >= 40&&L5avg6<=100 && (M6I1 < 40 || M6I2 < 40 || M6I3 < 40)) {
					System.out.println("RESIT");
					pw.println("Module 06:-"+L5avg6+" RESIT");
					count2=count2+1;
				} else if (L5avg6 >= 40&&L5avg6<=100) {
					System.out.println("PASS");
					pw.println("Module 06:-"+L5avg6+" PASS");
					credit2=credit2+20;
				} else if (L5avg6 >= 30&&L5avg6<=100) {
					System.out.println("RESIT");
					pw.println("Module 06:-"+L5avg6+" RESIT");
					count2=count2+1;
				} else if (L5avg6 < 30) {
					System.out.println("RETAKE");
					System.out.println("");
					pw.println("Module 06:-"+L5avg6+" RETAKE");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				
				//Retake Module
				if(L4avgR>0){
				System.out.println("Level 04 RETAKE Module:-");
				System.out.println(T7);
			
				if (L4avgR >= 40&&L4avgR<=100 && (MI1R < 40 || MI2R < 40 || MI3R < 40)) {
					System.out.println("RESIT");
					pw.println("Re Module:-"+L4avgR+" RESIT");
					count2=count2+1;
				} else if (L4avgR >= 40&&L4avgR<=100) {
					System.out.println("PASS");
					pw.println("Re Module:-"+L4avgR+" PASS");
					credit2=credit2+20;
				} else if (L4avgR >= 30&&L4avgR<=100) {
					System.out.println("RESIT");
					pw.println("Re Module:-"+L4avgR+" RESIT");
					count2=count2+1;
				} else if (L4avgR < 30) {
					System.out.println("RETAKE");
					System.out.println("");
					pw.println("Re Module:-"+L4avgR+" RETAKE");
					count=count+1;
				
				}else{
					System.out.println("Invalid");
				}
				}
                   } catch (IOException e) {
					
					e.printStackTrace();
				   }finally{
					pw.close();
				   }
				
				System.out.println("");
				
					System.out.println("Credits = "+credit2);
			
				
					if (credit2 == 120 && L4avgR < 40) {
						System.out.println("You are eligible for move to the Level-06");
					} else if (credit2 == 120) {
						System.out.println("You are eligible for move to the Level-06");
						System.out.println("but you have to RETAKE your failure Module");
					} else if (credit2 == 100 && L4avgR < 40) {
						System.out.println("You are eligible for move to the Level-06");
						System.out.println("but you have to RETAKE your failure Module");
					} else if (credit2 < 100) {
						System.out.println("You are not eligible for move to the Level-06");
					} else if (credit2 == 140) {
						System.out.println("You are eligible for move to the Level-06");
						System.out.println("and you passed the RETAKE module of Level-04");

					
					}else{
						System.out.println("Invalid");
					}
					
					try {
						Scanner sc2 =new Scanner(level05);//read from level 5 status text file
						 l5m1Rep = sc2.next();
						 l5m2Rep = sc2.next();
						 l5m3Rep = sc2.next();
						 l5m4Rep = sc2.next();
						 l5m5Rep = sc2.next();
						 l5m6Rep = sc2.next();
						 l5m7Rep = sc2.next();
						 l5m8Rep = sc2.next();
						 l5m9Rep = sc2.next();
						 l5m10Rep = sc2.next();
						 l5m11Rep = sc2.next();
						 l5m12Rep = sc2.next();
						 l5m13Rep = sc2.next();
						 l5m14Rep = sc2.next();
						 l5m15Rep = sc2.next();
						 l5m16Rep = sc2.next();
						 l5m17Rep = sc2.next();
						 l5m18Rep = sc2.next();
						 if(L4avgR>0){
						 l5m19Rep = sc2.next();
						 l5m20Rep = sc2.next();
						 l5m21Rep = sc2.next();
						 }
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		//CerHE output
		}else{
			System.out.println("     -------------------------------------------------------");
			System.out.println("     |Total Credits = "+credit1+"                                  |");
			System.out.println("     |YOU HAVE THE CERTIFICATE OF HIGHER EDUCATION         |");
			System.out.println("     -------------------------------------------------------");
		}
		
		
		System.out.println("");//DipHE menu
		System.out.println("Choose Your Career:-");
		System.out.println("(1)Continue");
		System.out.println("(2)Exit with DipHE");
		int diphe=sc.nextInt();
		if(diphe==1){
			
		//Level 06
				if(credit2>=100){
				System.out.println("");
				System.out.println("---Level 06---");
				System.out.println("");
		        File file3 = new File ("Level06.txt");//level06 marks file
				
				//module 01
				System.out.println("Module 1:-");
				int [] L6M1ict=new int[3];
				for (int i =0; i<3;i++){
					System.out.print("ICT"+(i+1)+" : ");
					L6M1ict [i]=sc.nextInt();
					M1I1=L6M1ict[0];
					M1I2=L6M1ict[1];
					M1I3=L6M1ict[2];
				}
			    total=M1I1+M1I2+M1I3;
			    L6avg1=total/3;
				Marks3 L6M1 =new Marks3(L6avg1);
				
				//Module 02
				System.out.println("Module 2:-");
				int [] L6M2ict=new int[3];
				for (int i =0; i<3;i++){
					System.out.print("ICT"+(i+1)+" : ");
					L6M2ict [i]=sc.nextInt();
					M2I1=L6M2ict[0];
					M2I2=L6M2ict[1];
					M2I3=L6M2ict[2];
				}
			    total=M2I1+M2I2+M2I3;
			    L6avg2=total/3;
				Marks3 L6M2 =new Marks3(L6avg2);
				
				//Module 03
				System.out.println("Module 3:-");
				int [] L6M3ict=new int[3];
				for (int i =0; i<3;i++){
					System.out.print("ICT"+(i+1)+" : ");
					L6M3ict [i]=sc.nextInt();
					M3I1=L6M3ict[0];
					M3I2=L6M3ict[1];
					M3I3=L6M3ict[2];
				}
			    total=M3I1+M3I2+M3I3;
			    L6avg3=total/3;
				Marks3 L6M3 =new Marks3(L6avg3);
				
				//Module 04
				System.out.println("Module 4:-");
				int [] L6M4ict=new int[3];
				for (int i =0; i<3;i++){
					System.out.print("ICT"+(i+1)+" : ");
					L6M4ict [i]=sc.nextInt();
					M4I1=L6M4ict[0];
					M4I2=L6M4ict[1];
					M4I3=L6M4ict[2];
				}
			    total=M4I1+M4I2+M4I3;
			    L6avg4=total/3;
				Marks3 L6M4 =new Marks3(L6avg4);
				
				//Module 05
				System.out.println("Module 5:-");
				int [] L6M5ict=new int[3];
				for (int i =0; i<3;i++){
					System.out.print("ICT"+(i+1)+" : ");
					L6M5ict [i]=sc.nextInt();
					M5I1=L6M5ict[0];
					M5I2=L6M5ict[1];
					M5I3=L6M5ict[2];
				}
			    total=M5I1+M5I2+M5I3;
			    L6avg5=total/3;
				Marks3 L6M5 =new Marks3(L6avg5);
				
				
				//Retake
				if (credit2==100&&L4avgR==0||credit2==120&&L4avgR>0){
				System.out.println("Leve 05 RETAKE Module :-");
				int [] L5RM1ict=new int[3];
				for (int i =0; i<3;i++){
					System.out.print("ICT"+(i+1)+" : ");
					L5RM1ict [i]=sc.nextInt();
					MI1R=L5RM1ict[0];
					MI2R=L5RM1ict[1];
					MI3R=L5RM1ict[2];
				}
			    total=MI1R+MI2R+MI3R;
			    L5avgR=total/3;
			    if(L5avgR>40){
			    	L5avgR=40;
			    }
				}
				Marks3 L5RM =new Marks3(L5avgR);
				
				
				
				try {
					FileOutputStream fos = new FileOutputStream(file3);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(L6M1);
					oos.writeObject(L6M2);
					oos.writeObject(L6M3);
					oos.writeObject(L6M4);
					oos.writeObject(L6M5);
					oos.writeObject(L5RM);
					oos.flush();
					oos.close();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				FileInputStream fis3;
				try {
					fis3 = new FileInputStream(file3);
					ObjectInputStream ois = new ObjectInputStream(fis3);
					try {
						Marks3 T1 = (Marks3)ois.readObject();
						Marks3 T2 = (Marks3)ois.readObject();
						Marks3 T3 = (Marks3)ois.readObject();
						Marks3 T4 = (Marks3)ois.readObject();
						Marks3 T5 = (Marks3)ois.readObject();
						Marks3 T6 = (Marks3)ois.readObject();
						
						File level06 = new File("Level6 Status.txt");//level 6 status text file
						PrintWriter pw=null;
						FileWriter fw=null;
						try {
							fw=new FileWriter(level06);
							pw=new PrintWriter(fw,true); // true Stands for auto flush

						//Module 01
						System.out.println("Module 1:-");
						System.out.println(T1);
					
						if (L6avg1 >= 40&&L6avg1<=100 && (M1I1 < 40 || M1I2 < 40 || M1I3 < 40)) {
							System.out.println("RESIT");
							pw.println("Module 01:-"+L6avg1+" RESIT");
							count2=count2+1;
						} else if (L6avg1 >= 40&&L6avg1<=100) {
							System.out.println("PASS");
							pw.println("Module 01:-"+L6avg1+" PASS");
							credit3=credit3+20;
						} else if (L6avg1 >= 30&&L6avg1<=100) {
							System.out.println("RESIT");
							pw.println("Module 01:-"+L6avg1+" RESIT");
							count2=count2+1;
						} else if (L6avg1 < 30) {
							System.out.println("RETAKE");
							System.out.println("");
							pw.println("Module 01:-"+L6avg1+" RETAKE");
							count=count+1;
						
						}else{
							System.out.println("Invalid");
						}
						
						//Module 02
						System.out.println("Module 2:-");
						System.out.println(T2);
					
						if (L6avg2 >= 40&&L6avg2<=100 && (M2I1 < 40 || M2I2 < 40 || M2I3 < 40)) {
							System.out.println("RESIT");
							pw.println("Module 02:-"+L6avg2+" RESIT");
							count2=count2+1;
						} else if (L6avg2 >= 40&&L6avg2<=100) {
							System.out.println("PASS");
							pw.println("Module 02:-"+L6avg2+" PASS");
							credit3=credit3+20;
						} else if (L6avg2 >= 30&&L6avg2<=100) {
							System.out.println("RESIT");
							pw.println("Module 02:-"+L6avg2+" RESIT");
							count2=count2+1;
						} else if (L6avg2 < 30) {
							System.out.println("RETAKE");
							System.out.println("");
							pw.println("Module 02:-"+L6avg2+" RETAKE");
							count=count+1;
						
						}else{
							System.out.println("Invalid");
						}
						
						//Module 03
						System.out.println("Module 3:-");
						System.out.println(T3);
					
						if (L6avg3 >= 40&&L6avg3<=100 && (M3I1 < 40 || M3I2 < 40 || M3I3 < 40)) {
							System.out.println("RESIT");
							pw.println("Module 03:-"+L6avg3+" RESIT");
							count2=count2+1;
						} else if (L6avg3 >= 40&&L6avg3<=100) {
							System.out.println("PASS");
							pw.println("Module 03:-"+L6avg3+" PASS");
							credit3=credit3+20;
						} else if (L6avg3 >= 30&&L6avg3<=100) {
							System.out.println("RESIT");
							pw.println("Module 03:-"+L6avg3+" RESIT");
							count2=count2+1;
						} else if (L6avg3 < 30) {
							System.out.println("RETAKE");
							System.out.println("");
							pw.println("Module 03:-"+L6avg3+" RETAKE");
							count=count+1;
						
						}else{
							System.out.println("Invalid");
						}
						
						//Module 04
						System.out.println("Module 4:-");
						System.out.println(T4);
					
						if (L6avg4 >= 40&&L6avg4<=100 && (M4I1 < 40 || M4I2 < 40 || M4I3 < 40)) {
							System.out.println("RESIT");
							pw.println("Module 04:-"+L6avg4+" RESIT");
							count2=count2+1;
						} else if (L6avg4 >= 40&&L6avg4<=100) {
							System.out.println("PASS");
							pw.println("Module 04:-"+L6avg4+" PASS");
							credit3=credit3+20;
						} else if (L6avg4 >= 30&&L6avg4<=100) {
							System.out.println("RESIT");
							pw.println("Module 04:-"+L6avg4+" RESIT");
							count2=count2+1;
						} else if (L6avg4 < 30) {
							System.out.println("RETAKE");
							System.out.println("");
							pw.println("Module 04:-"+L6avg4+" RETAKE");
							count=count+1;
						
						}else{
							System.out.println("Invalid");
						}
						
						//Module 05
						System.out.println("Module 5:-");
						System.out.println(T5);
					
						if (L6avg5 >= 40&&L6avg5<=100 && (M5I1 < 40 || M5I2 < 40 || M5I3 < 40)) {
							System.out.println("RESIT");
							pw.println("Module 05:-"+L6avg5+" RESIT");
							count2=count2+1;
						} else if (L6avg5 >= 40&&L6avg5<=100) {
							System.out.println("PASS");
							pw.println("Module 05:-"+L6avg5+" PASS");
							credit3=credit3+40;
						} else if (L6avg5 >= 30&&L6avg5<=100) {
							System.out.println("RESIT");
							pw.println("Module 05:-"+L6avg5+" RESIT");
							count2=count2+1;
						} else if (L6avg5 < 30) {
							System.out.println("RETAKE");
							System.out.println("");
							pw.println("Module 05:-"+L6avg5+" RETAKE");
							count=count+1;
						
						}else{
							System.out.println("Invalid");
						}
						
						
						//Retake Module
						if(L5avgR>0){
						System.out.println("Level 05 RETAKE Module:-");
						System.out.println(T6);
					
						if (L5avgR >= 40&&L5avgR<=100 && (MI1R < 40 || MI2R < 40 || MI3R < 40)) {
							System.out.println("RESIT");
							pw.println("Re Module:-"+L5avgR+" RESIT");
							count2=count2+1;
						} else if (L5avgR >= 40&&L5avgR<=100) {
							System.out.println("PASS");
							pw.println("Re Module:-"+L5avgR+" PASS");
							credit3=credit3+20;
						} else if (L5avgR >= 30&&L5avgR<=100) {
							System.out.println("RESIT");
							pw.println("Re Module:-"+L5avgR+" RESIT");
							count2=count2+1;
						} else if (L5avgR < 30) {
							System.out.println("RETAKE");
							System.out.println("");
							pw.println("Re Module:-"+L5avgR+" RETAKE");
							count=count+1;
						
						}else{
							System.out.println("Invalid");
						}
						}
						
						} catch (IOException e) {
							
							e.printStackTrace();
						   }finally{
							pw.close();
						   }
						
						System.out.println("");
						
							System.out.println("Credits = "+credit3);
					
						
							if (credit1+credit2==240&&credit3 == 120 && L5avgR < 40) {
								System.out.println("You are eligible for the HONORS DEGREE");
							} else if (credit3 == 120&&L5avgR>=40) {
								System.out.println("You are eligible for the NON-HONORS DEGREE");
								System.out.println("and you passed the RETAKE module of Level-05");
							} else if (credit3 == 120) {
								System.out.println("You are eligible for the NON-HONORS DEGREE");
							} else if (credit3 >= 60 && L5avgR < 40) {
								System.out.println("You are eligible for the NON-HONORS DEGREE");
								System.out.println("you can RETAKE your failure modules");
							} else if (credit3 < 60) {
								System.out.println("You have not passed the Level-06");
							} else if (credit3 == 140) {
								System.out.println("You are eligible for the HONORS DEGREE");
								System.out.println("and you passed the RETAKE module of Level-05 ");

							
							}else{
								System.out.println("Invalid");
							}
							
							try {
								Scanner sc2 =new Scanner(level06);//read from level 6 status text file
								 l6m1Rep = sc2.next();
								 l6m2Rep = sc2.next();
								 l6m3Rep = sc2.next();
								 l6m4Rep = sc2.next();
								 l6m5Rep = sc2.next();
								 l6m6Rep = sc2.next();
								 l6m7Rep = sc2.next();
								 l6m8Rep = sc2.next();
								 l6m9Rep = sc2.next();
								 l6m10Rep = sc2.next();
								 l6m11Rep = sc2.next();
								 l6m12Rep = sc2.next();
								 l6m13Rep = sc2.next();
								 l6m14Rep = sc2.next();
								 l6m15Rep = sc2.next();
								 if(L5avgR>0){
								 l6m16Rep = sc2.next();
								 l6m17Rep = sc2.next();
								 l6m18Rep = sc2.next();
								
								 }
							} catch (FileNotFoundException e) {
								e.printStackTrace();
							}

					
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
				
				if(credit3==120&&L5avgR<40||credit3==120||credit3 >= 60 && L5avgR < 40||credit3 == 140){
					int totalCredit=credit1+credit2+credit3;
					
					File award = new File("Award Status.txt");//Award status text file
					PrintWriter pw=null;
					FileWriter fw=null;
					try {
						fw=new FileWriter(award);
						pw=new PrintWriter(fw,true); // true Stands for auto flush
					
                    min=100;
					List <Integer> avg  =new ArrayList <Integer> ();
					avg.add(L5avg1);
					avg.add(L5avg2);
					avg.add(L5avg3);
					avg.add(L5avg4);
					avg.add(L5avg5);
					avg.add(L5avg6);
					avg.add(L6avg1);
					avg.add(L6avg2);
					avg.add(L6avg3);
					avg.add(L6avg4);
					avg.add(L6avg5);
					avg.add(L5avgR);
					total=0;
					for (int value:avg) {
					    if(value>=40){
					    	total=total+value;
							if (value <= min) {
								min = value;
								}
					    }
						
					}
					total=total-min;
					int totalAvg=0;
					totalAvg=total/10;
					System.out.println("");
					System.out.println("     -------------------------------------------------------");
					System.out.println("     |Total Credits = "+totalCredit+"                                 |");
					System.out.println("     |Total Average = "+totalAvg+"                                  |");
					  pw.println("Total Credits = "+totalCredit);
			    	  pw.println("Total Average = "+totalAvg);
					
				
					 if (totalCredit == 360) {
						      if (totalAvg >= 70) {
						    	  System.out.println("     |Class:-1st Class Honors                             |");
						    	  System.out.println("     |Degree:-B.Sc. 1st Class Honors DEGREE               |");
						    	  pw.println("Class:-1st Class Honors");
						    	  pw.println("Degree:-B.Sc. 1st Class Honors DEGREE");
						      } else if (totalAvg >= 60) {
						    	  System.out.println("     |Class:-2nd Class Honors Upper Division              |");
						    	  System.out.println("     |Degree:-B.Sc. 2nd Class Honors Upper Division DEGREE|");
						    	  pw.println("Class:-2nd Class Honors Upper Division");
						    	  pw.println("Degree:-B.Sc. 2nd Class Honors Upper Division DEGREE");
						      } else if (totalAvg >= 50) {
						    	  System.out.println("     |Class:-2nd Class Honors Lower Division              |");
						    	  System.out.println("     |Degree:-B.Sc. 2nd Class Honors Lower Division DEGREE|");
						    	  pw.println("Class:-2nd Class Honors Lower Division");
						    	  pw.println("Degree:-B.Sc. 2nd Class Honors Lower Division DEGREE");
						      } else if (totalAvg >= 40) {
						    	  System.out.println("     |Class:-3rd Class Honors                             |");
						    	  System.out.println("     |Degree:-B.Sc. 3rd Class Honors DEGREE               |");
						    	  pw.println("Class:-3rd Class Honors");
						    	  pw.println("Degree:-B.Sc. 3rd Class Honors DEGREE");
						      } else {
						    	  System.out.println("     |Class:-No Class                                     |");
						    	  System.out.println("     |Degree:-B.Sc. Honors DEGREE                         |");
						    	  pw.println("Class:-No Class");
						    	  pw.println("Degree:-B.Sc. Honors DEGREE");
						      }
					} else if (totalCredit >= 300) {
						System.out.println("     |Degree:-B.Sc. DEGREE                                |");
						 pw.println("Degree:-B.Sc. DEGREE");
					}
					System.out.println("     -------------------------------------------------------");
				
				
					
					
				}catch (IOException e) {
					
					e.printStackTrace();
				   }finally{
					pw.close();
				   }
				   
				   try {
						Scanner sc2 =new Scanner(award);//read from Award status text file
						 award1 = sc2.next();
						 award2 = sc2.next();
						 award3 = sc2.next();
						 award4 = sc2.next();
						 award5 = sc2.next();
						 award6 = sc2.next();
						 award7 = sc2.next();
						 award8 = sc2.next();
						 award9 = sc2.next();
						 award10 = sc2.next();
						 if(credit1+credit2+credit3==360){
						 award11 = sc2.next();
						 award12 = sc2.next();
						 award13 = sc2.next();
						 award14 = sc2.next();
						 award15 = sc2.next();
						 award16 = sc2.next();
						 }
					
						
						
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				}
		}else{//DipHE output
			System.out.println("     -------------------------------------------------------");
			System.out.println("     |Total Credits = "+credit2+"                                  |");
			System.out.println("     |YOU HAVE THE DIPLOMA OF HIGHER EDUCATION             |");
			System.out.println("     -------------------------------------------------------");
		}
		
				
		FileInputStream fiss;
		try {
			fiss = new FileInputStream(stu);
			ObjectInputStream ois = new ObjectInputStream(fiss);
			try {
				Student Add1 = (Student)ois.readObject();
				
				File report = new File("Report.txt");
				PrintWriter pw=null;
				FileWriter fw=null;
				try {
					fw=new FileWriter(report,true);//write to the Report text file
					pw=new PrintWriter(fw,true); 
					pw.println(Add1);
					pw.println("");
					pw.print("Level-04                ");
					pw.print("Level-05                                  ");
					pw.println("Level-06                                  ");
					pw.print(l4m1Rep+" ");
					pw.print(l4m2Rep+" ");
					pw.print(l4m3Rep+"               ");
					pw.print(l5m1Rep+" ");
					pw.print(l5m2Rep+" ");
					pw.print(l5m3Rep+"               ");
					pw.print(l6m1Rep+" ");
					pw.print(l6m2Rep+" ");
					pw.println(l6m3Rep);
					pw.print(l4m4Rep+" ");
					pw.print(l4m5Rep+" ");
					pw.print(l4m6Rep+"               ");
					pw.print(l5m4Rep+" ");
					pw.print(l5m5Rep+" ");
					pw.print(l5m6Rep+"               ");
					pw.print(l6m4Rep+" ");
					pw.print(l6m5Rep+" ");
					pw.println(l6m6Rep);
					pw.print(l4m7Rep+" ");
					pw.print(l4m8Rep+" ");
					pw.print(l4m9Rep+"               ");
					pw.print(l5m7Rep+" ");
					pw.print(l5m8Rep+" ");
					pw.print(l5m9Rep+"               ");
					pw.print(l6m7Rep+" ");
					pw.print(l6m8Rep+" ");
					pw.println(l6m9Rep);
					pw.print(l4m10Rep+" ");
					pw.print(l4m11Rep+" ");
					pw.print(l4m12Rep+"               ");
					pw.print(l5m10Rep+" ");
					pw.print(l5m11Rep+" ");
					pw.print(l5m12Rep+"               ");
					pw.print(l6m10Rep+" ");
					pw.print(l6m11Rep+" ");
					pw.println(l6m12Rep);
					pw.print(l4m13Rep+" ");
					pw.print(l4m14Rep+" ");
					pw.print(l4m15Rep+"               ");
					pw.print(l5m13Rep+" ");
					pw.print(l5m14Rep+" ");
					pw.print(l5m15Rep+"               ");
					pw.print(l6m13Rep+" ");
					pw.print(l6m14Rep+" ");
					pw.println(l6m15Rep);
					pw.print(l4m16Rep+" ");
					pw.print(l4m17Rep+" ");
					pw.print(l4m18Rep+"               ");
					pw.print(l5m16Rep+" ");
					pw.print(l5m17Rep+" ");
					pw.println(l5m18Rep+"               ");
					pw.print(l5m19Rep+" ");
					pw.print(l5m20Rep+" ");
					pw.print(l5m21Rep+"               ");
					pw.print(l6m16Rep+" ");
					pw.print(l6m17Rep+" ");
					pw.println(l6m18Rep);
					
					if(credit3>=60){
					pw.println(award1);
					pw.println(award2);
					pw.println(award3);
					pw.println(award4);
					pw.println(award5);
					pw.println(award6);
					pw.println(award7);
					pw.println(award8);
					pw.println(award9);
					pw.println(award10);
					pw.println(award11);
					pw.println(award12);
					pw.println(award13);
					pw.println(award14);
					pw.println(award15);
					pw.println(award16);
					}
					if(count+count2>2){
						pw.println("RESIT Modules = "+count2);
						pw.println("RETAKE Modules = "+count);
						
					}
					
					//write report details***
				
				} catch (IOException e) {
					
					e.printStackTrace();
				}finally{
					pw.close();
				}
				
				
			
				} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Add a student menu
		int i=1;
		System.out.println("");
		System.out.println("Choose Your desire:-");
		System.out.println("(1)Add a Student");
		System.out.println("(2)Finish");
		
		 num=sc.nextInt();
		}while(num==1);
			
		
	}
	

	
}
