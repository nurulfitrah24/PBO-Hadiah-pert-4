import java.util.Scanner;
class nilai{
	public static void main(String[] args){
		String nama;
		int n1,n2,n3,nilaimid,nilaifinal;
		char nlhuruf ;
	
	
	
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Nama Mahasiswa/i  : ");
		nama= input.nextLine();
		System.out.print("Nilai Tugas 1 : ");
		n1= input.nextInt();
	    System.out.print("Nilai Tugas 2 : ");
		n2= input.nextInt();
	    System.out.print("Nilai Tugas 3 : ");
		n3= input.nextInt();
		System.out.print("Nilai MID : ");
		nilaimid= input.nextInt();
		System.out.print("Nilai FINAL : ");
		nilaifinal= input.nextInt();
		
		
		double nlrata = (n1 + n2 + n3)/3;
		double nlakhir = (nlrata * 0.3)+(nilaimid*0.3)+(nilaifinal * 0.4);
		System.out.println("Nilai Akhir : "+ nlakhir);
		
    	
		if(nlakhir>=80){
			 nlhuruf = 'A';	
				
		}else if(nlakhir>=60){
			 nlhuruf = 'B';
			
		}else if(nlakhir>=50){
			 nlhuruf = 'C';
			 
		}else if(nlakhir >=40){
		     nlhuruf = 'D';
		     
		}else{
			 nlhuruf = 'E';
			 
		}
		
		System.out.println("Nilai Huruf : "+nlhuruf);
		
		
		System.out.println("");
		
		System.out.println("Nama Mahasiswa/i  : "+nama);
		System.out.println("Nilai Akhir : "+ nlakhir);
	 	System.out.println("Nilai Huruf : "+nlhuruf);
	 	
	 	}
	 	}
	 	
		
		
		
		
	
	
