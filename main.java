import java.util.*;
import java.io.*;
class finance
{  
  	static Scanner sc= new Scanner(System.in);
    	static double emi_calculator(double p, double r, double t)
    	{
            	p= p/t;
            	double emi = p+p*(r/100);
        	return (emi);
    	}
	static double m(double p, double r, double t)
	{
		double emi=emi_calculator(p,r,t);
		return (emi);
	}
	static void intr(double rat, double tim, double principal)
	{
       		double emi = emi_calculator(principal, rat, tim);
		int em=(int)emi;
         	 System.out.println("\t\t\t\tBill amount is 		:  " + principal);
		 System.out.println("\t\t\t\tInterest rate is 	:  "+ rat);
		 System.out.println("\t\t\t\tTime period 		:  " + tim);
       		 System.out.println("\t\t\t\tMonthly EMI is 	        =  Rs " + em); 
	}
	static void display(double p, double d1, double c)
	{
			int a3=(int)(m(c,10,3));
			int a6=(int)(m(c,10,6));
			int a12=(int)(m(c,12,12));
			int a18=(int)(m(c,13,18));
			int a24=(int)(m(c,13,24));
			float d=(float)d1;
			System.out.println("  \t\t\t\t EMI TABLE ");
			System.out.println();
			System.out.println(" --------------------------------------------------------------------------------------------		");
			System.out.println("|              	|   3 Months   |   6 Months   |   12 Months   |   18 Months  |   24 Months   | 	");
			System.out.println(" --------------------------------------------------------------------------------------------		");
			System.out.println("| Price		|     "+p+" |   "+p+"   |     "+p+"  |    "+p+"  |    "+p+"   |	");				
			System.out.println(" --------------------------------------------------------------------------------------------		");
			System.out.println("| Down payment	|     "+d+" |    "+d+"   |    "+d+"    |     "+d+"  |      "+d+"  |	");				
			System.out.println(" ---------------------------------------------------------------------------------------------	");
			System.out.println("| Interest Rate	|     "+10+"       |      "+10+"      |      "+12+"       |    "+13+"        |     "+16+"        |	");			
			System.out.println(" --------------------------------------------------------------------------------------------		");
			System.out.println("| EMI Amount	|     "+a3+"    |  "+a6+"       |   "+a12+"        |    "+a18+"      |    "+a24+"       |	");				
			System.out.println(" --------------------------------------------------------------------------------------------		");
	}
	static Color o=new Color();
	void EMIC(double price)
	{
		double dp= price/10;
		System.out.println("enter downpayment amount");
		System.out.println("Down Payment should be 10% of Your Vechile Price");
		double down= sc.nextFloat();
		//double down=20000;
		if(down>=dp && down<price)
		{
			double principal = price-down;
			display(price,down,principal);
			System.out.println();
			System.out.println();
			System.out.println("enter the number of months you want monthly installments");
			System.out.println();
			System.out.println("1. 3 Months\n2. 6 Months\n3. 12 Months\n4. 18 Months\n5. 24 Months ");
			int a= sc.nextInt();
         		if(a==1)
			{
       				 intr(10,3,principal);
			}
			else if(a==2)
			{
       			 	 intr(10,6,principal);
			}
			else if(a==3)
			{
       			 	 intr(12,12,principal);
			}	
			else if(a==4)
			{
       				 intr(13,18,principal);
			}
			else if(a==5)
			{
			       	 intr(16,24,principal);	
			}
   	 	}
		else
		{
			if(down<dp)
			{
				System.out.println(o.red+o.ITALIC);
				System.out.println("The Downpayment Amount should be atleast 10% of the Billing amount");
				System.out.println(o.reset);
			}
			if(down==price)
			{
				 System.out.println(" bill amount is :" + price);
			}
		}
	}
}
class Color
{
	static Scanner sc=new Scanner(System.in);
	public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BOLD = "\u001B[1m";
    public static final String DEF = "\u001B[0m";
	public static final String BLINK = "\u001B[5m";
	public static final String UNDERLINE="\u001B[21m";
 	public static final String SKBLUE = "\u001B[36m";
	public static final String ITALIC="\u001B[3m";
	static String magenta = "\u001B[35m";
	static String cyan = "\u001B[36m";
	static String def = "\u001B[0m";
	static String blink = "\u001B[5m";
	static String bold="\u001B[1m";
	static String reset="\u001B[0m";
    static String underline="\u001B[21m";
    //static String blink="\u001B[5m";
	static String red = "\u001B[31m";
	static String green = "\u001B[32m";
	static String yellow = "\u001B[33m";
	static String blue = "\u001B[34m";
	static String purple = "\u001B[35m";
	static String skblue = "\u001B[36m";
}
class Cars
{
	static Color o=new Color();
	static Scanner sc=new Scanner(System.in);
   	void car()
	{
		System.out.println(o.BLUE+o.bold+o.ITALIC);
		System.out.println("WELCOME to CARS");
		System.out.println("Select on Option\n1.Budget Cars\n2.Premium Cars");
		int car=sc.nextInt();
		System.out.println(o.reset);
		if(car==1)
		{
			System.out.println("---- Budget Cars -----");
			Bud_Cars();
       		}
        	else if(car==2)
		{
			System.out.println("---- Premium Cars -----");
            		PCar();
        	}
       		else {
			System.out.println(o.RED+o.bold);
        		System.out.println("INVALID OPTION\nPress 1 for Re-Enter Your option or any key to exit");
			int ce=sc.nextInt();
			System.out.println(o.reset);
			if(ce==1)
			{
        			car();
			}
     		}
	}
	void PCar()
	{
		Pc px=new Pc();
		System.out.println(o.BLUE+o.bold+o.ITALIC);
		System.out.println("1.Mercedez Benz\n2.BMW\n3.Audi\n4.Jaguar Land Rover");
			int c1=sc.nextInt();
			System.out.println(o.reset);
			if(c1==1)
			{
					System.out.println(o.YELLOW+o.bold+o.ITALIC);	
 System.out.println("                       ....::-::::..                 ");                
 System.out.println("                  :-==+++++++++++++*+=-:             ");             
 System.out.println("               :++-:..      :.      .:-=+=:          ");          
 System.out.println("             =##-.          +-          ..=*-        ");        
 System.out.println("           -%%=             #=             -**:      ");      
 System.out.println("          +%#.             .%+              .*%=     ");    
 System.out.println("         +%*               -#=.               #%+    ");    
 System.out.println("        -##                +#-.                %%+   ");   
 System.out.println("       .-%.                ##::                .@%:  ");  
 System.out.println("       -*+                 %#::                 *%+  ");  
 System.out.println("       =*:                :#*...                =@# "); 
 System.out.println("      .**.               ...-:+**-.             -@*."); 
 System.out.println("       #+.           .:::=++= ..:=*+:           =%* "); 
 System.out.println("       ++.        .:-==+=:.      .:=*#+.        ##= "); 
 System.out.println("       .%=.     :=+=-.              .-=##=     -@*. "); 
 System.out.println("        =%*. :---.                      .-==: :@*:  "); 
 System.out.println("         =%#:                                -%+:   "); 
 System.out.println("          -%%+                              +#=.    "); 
 System.out.println("           .+%%=                          =#+:      "); 
 System.out.println("             .=**=:                    -*#=:        "); 
 System.out.println("                :-==-:.           .-+*#+-.          ");
 System.out.println("                   .:-+++=-==+**%%%*=-.             ");
 System.out.println("                        ..:----::.                  ");
				System.out.println(o.reset);
				px.Benz();
			}
			else if(c1==2)
			{
			System.out.println(o.YELLOW+o.bold+o.ITALIC);	
System.out.println("                     ......                      ");   
System.out.println("               .:-=+****##****+=-:.              ");    
System.out.println("           .:-*#%%%%%- .%%. -%%%%%#*=:.          ");    
System.out.println("         :-*#%%%%%%%%:.----.:%%%%%%%%#*-:        ");    
System.out.println("       :=***%%%%%%%%%::%..%::%%%%%%%%%=+#=:      ");    
System.out.println("     .-**:=:-=+%%%%%#++++==++#%%%%%%#::*++*-.    ");   
System.out.println("    .=#-.#+:*=.##+-:-----     .:+#%+ .--.-%#=.   ");   
System.out.println("   .=%%*-..*--*-:--------         -*#%+.:-.=%=.  ");  
System.out.println("  .=%%%%%#=:*=:----------           =#:-+#%%%%=. "); 
System.out.println("  -*%%%%%%%%-------------            -%%%%%%%%*- "); 
System.out.println("  =%%%%%%%%=:------------             =%%%%%%%%+."); 
System.out.println(" :+%%%%%%%%.-------------             .%%%%%%%%+: ");
System.out.println(" :+%%%%%%%%.::::::::::::::::::::::::::.%%%%%%%%+: ");
System.out.println(" :+%%%%%%%%.             -------------.%%%%%%%%+: ");
System.out.println("  =%%%%%%%%=             ------------:=%%%%%%%%+. ");
System.out.println("  -*%%%%%%%%-            -------------%%%%%%%%*-  ");
System.out.println("  .=%%%%%%%%%=           ----------:=%%%%%%%%%=.  ");
System.out.println("   .=%%%%%%%%%#-         --------:-#%%%%%%%%%=.   ");
System.out.println("    .=#%%%%%%%%%#+:.     -----:-+#%%%%%%%%%#=.    ");
System.out.println("     .-*%%%%%%%%%%%%#*+==+++*#%%%%%%%%%%%%*-.     ");
System.out.println("       :=#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#=:       ");
System.out.println("         :-*#%%%%%%%%%%%%%%%%%%%%%%%%#*-:         ");
System.out.println("           .:=*#%%%%%%%%%%%%%%%%%%#*=:.           ");
System.out.println("               .:-=+*########*+=-:.               ");
System.out.println("                     ........                     ");
				System.out.println(o.reset);
				px.Bmw();
			}
			else if(c1==3)
			{
				System.out.println(o.YELLOW+o.bold+o.ITALIC);
				System.out.println("                 ..                 ..                 ..                 ..           ");   
				System.out.println("             .:----====-.       ::----====-.      .::----====-.      .::---=====:      ");   
				System.out.println("         .-=+=-:::--=+++++  .-=+=-:::-==+++++  .-+=--:::-=+++++=  :-+=--:::-=++++++:   ");   
				System.out.println("       :=-.           .--::++.           .--::++.           .----+=.           :=++++. ");   
				System.out.println("     .=-                :=+=++             :=+=*=             :++=*=              -+=*-");   
				System.out.println("    :+:                :+. =-++           -+..=-*=           -= .=-*=              :=-*-");  
				System.out.println("   .+-                .+:   --*-         :+.  .--*:         :+.  .-=*.              :-=* "); 
				System.out.println("  .-+               ..-+    ::++       ..=+    ::*=       ..+=    ::*-               ::*:"); 
				System.out.println(" .:-+               .:=+    ..++       ::==    ..++       :.+-    ..*-               :.*-"); 
				System.out.println("  --*.              .--*    ..+=       :-=*    ..*-       ::=+    .:*:               .:*."); 
				System.out.println("  --++               --+=    -+.        --*-    -+        .--*-    =+                 == "); 
				System.out.println("   ==++              .==+=  :+:         .==*-  :+.         :==*-  -+.                =+  "); 
				System.out.println("    =+++-             .+++.-+.           .+++ -=.           :+==.==.               .==   "); 
				System.out.println("     :++++=:.           .-+++=:.           .-+++=:.           .-+++=:            .-=:    "); 
				System.out.println("       :=*++==-::....:-==::=*++==-::...::-=-::++++=--::...::-=-:-+++==--::...:-==-.      "); 
				System.out.println("          .:-=+++++==-.      .-==+++++==-.      .-==+++++=-:.      :-==+++++=-:.         "); 
				System.out.println(o.reset);
				px.Audi();
			}
			else if(c1==4)
			{
			System.out.println(o.YELLOW+o.bold+o.ITALIC);	
System.out.println("    :::::::::::.          :::.        ::::       :::     ::::::::::.    .:::::::::::. ");     
System.out.println("   -@@%#######@@*       :%@@@@=      :@@@@@*:    #@@.  .%@@%######@@=   =@@%%%%%%%%%* ");     
System.out.println("   -@@*=======%@@      +@@#.-%@*     :@@*:*@@#=  #@@.  :@@=  -----**+   =@@#+++++++:  ");    
System.out.println("   -@@#*****@@@#:    .#@@@***#@@%:   :@@+  .=%@@*%@@.  :@@-  +++++@@#   =@@#===++++:  ");     
System.out.println("   -@@=     .#@@=   -%@%-------+@@+  :@@+     :*@@@@.   #@%%%%%%%%@@+   =@@%%%%%%%%%* ");    
System.out.println("    ::.       :::.  :::         :::.  --.       .---     .:::::::::.    .::::::::::::  ");    
System.out.println();                                                                                          
System.out.println("   :##########*+.    -*#########*=   -##+        *##=   *###########:   -##########*+. ");    
System.out.println("   -@@*-------%@%   .@@%========@@*   -%@#.    :%@@=    #@@=========.   =@@*-------%@% ");    
System.out.println("   -@@%#######@@#   .@@#        @@*    .#@%-  =@@#.     #@@@@@@@@@@     =@@%#######@@# ");    
System.out.println("   -@@*::::-*@@#    .@@#-------=@@*      =@@*#@@+       #@@========-    =@@+::::-#@@*  ");    
System.out.println("   :##-      -##*.   =############:       :####:        *###########:   -##-      -##*.");    
			System.out.println(o.reset);
				px.Jag();
			}
			else
			{
				System.out.println(o.RED+o.bold);
				System.out.println("INVALID OPTION\nPress 1 for Re-Enter Your option\nPress 2 for Main Cars Menu\nPress any key to exit");
				int p=sc.nextInt();
				System.out.println(o.reset);
				if(p==1)
				{
        				PCar();
				}
				else if(p==2)
				{
					car();
				}	
			}
	}
	void Bud_Cars()
	{
		Bc y=new Bc();
		System.out.println(o.BLUE+o.bold+o.ITALIC);
		System.out.println("1.Maruti Suzuki\n2.Tata Motors\n3.Hyundai\n4.KIA Motors\n5.Honda");
		int ca=sc.nextInt();
		System.out.println(o.reset);
		if(ca==1)
		{
			
System.out.println("                 .=##+-             ");    
System.out.println("               -*#######+:          ");    
System.out.println("           .-+#############+:       ");    
System.out.println("       .:=*####*--+##########*+:    ");   
System.out.println("     .+##########*=--+##########*=. ");    
System.out.println("       .-*##########*=::=*#####*=:  ");    
System.out.println("          .=*##########*=. ...       ");   
System.out.println("             .=*##########*-.        ");   
System.out.println("       .-=++++=::=*##########*-.     ");   
System.out.println("     .+##########*=-=*##########+-   ");   
System.out.println("      .-*##########*--+######*=-.    ");  
System.out.println("          .=*##########*##*=:.       ");   
System.out.println("             :=*#######*=:           ");   
System.out.println("                :=*##+:              ");   
System.out.println("                  ::                 ");  
			y.Maruti();
		}
		else if(ca==2)
		{
			
System.out.println(":::::::::::     :::     :::::::::::     :::     		");
System.out.println("    :+:       :+: :+:       :+:       :+: :+:   		");
System.out.println("    +:+      +:+   +:+      +:+      +:+   +:+  ");
System.out.println("    +#+     +#++:++#++:     +#+     +#++:++#++: ");
System.out.println("    +#+     +#+     +#+     +#+     +#+     +#+ ");
System.out.println("    #+#     #+#     #+#     #+#     #+#     #+# ");
System.out.println("    ###     ###     ###     ###     ###     ### ");
			y.Tata();
		}
		else if(ca==3)
		{
			
System.out.println("                                     ............          ");              
System.out.println("               .:-===-: :+%#+===+++*****++=-.              "); 
System.out.println("          .----:.. -+- :%+.             .::=#+-...         ");
System.out.println("       :--:       :=:.:%=                  :+    .*=:.     "); 
System.out.println("    .-=.         =-:. *#                :-=.    :---=+-..   ");
System.out.println("   :=.         .=.-:  =*            ::::       :-     :*-   ");
System.out.println("  :-          .: :--   ::     .:::::......    --       .+-  ");
System.out.println("  =          :.  .:-==-:::.:::::::::...--::..=:         =. .");
System.out.println("  :.        ..    ..:-==---:.       .   ==:.=.          +   ");
System.out.println("   :.      ..    ::::.             .    =::=           +: . ");
System.out.println("    .:..  :: :=-:                       :=-         .-=..   ");
System.out.println("     .::-:=-+*:                        -+.       .-=-:.     ");
System.out.println("       ..::.  -.                  :  :##    .---==::.       ");
System.out.println("           .::::-:::::::::.....:=: .==:=====-:::.           ");
System.out.println("                 ..:::::::------:::::::::..                 ");
			y.Hyundai();
		}
		else if(ca==4)
		{
			
System.out.println("                  .::--==++++++++++===-::.                   ");
System.out.println("            :-++*#*+=--:::........:::--=+*#**+=:             ");
System.out.println("        -+*#*=-:.                          ..-=*##+-.        ");
System.out.println("     -*#*=::                                     :=*#*=      ");
System.out.println("   =##+-   -####  .*###*   :####.     .*#####       :+*%+    ");
System.out.println(" .##*-     .%%%# -#%%%=     #%%#.     .#%%%%%+        -*#%:  ");
System.out.println(" %#*-      .%%%#+%%%#:      %%%%.     *%%%*%%%-        :*#%. ");
System.out.println("-%#*.      .%%%%%%%%:       %%%%.    =%%%=.%%%#         +*%= ");
System.out.println(".@#*:      .%%%%=%%%%-      %%%%.   :%%%#  -%%%*       .*#%- ");
System.out.println(" =%%*.     .%%%% :#%%%*     %%%%.   #%%%:   *%%%-     .+#%+  ");
System.out.println("  :#%#=    .@@@%   +@@@%-   %@@@.  +@@@+    .%@@%    -#%%-   ");
System.out.println("    -#%%+:  ----    :----   ----   ----      :---::+#%#=     ");
System.out.println("      .=*%%*=:.                               :=*%%#=.       ");
System.out.println("          .-+#%%*+=-:.                .:-=+*%%#*=:           ");
System.out.println("              .:-=+**##%%########%%###*+=-:.                 ");
			y.kia();
		}
		else if(ca==5)
		{
			
System.out.println("                   .---.=-:::::::::::::+.:--:        ");         
System.out.println("                ..*-  + --            .* -: :*:.     ");         
System.out.println("               . #.   +. #            *: =.   # .     ");        
System.out.println("               : #    +. +=          :# .+    +::     ");        
System.out.println("               :.*    +: .%          #: .*    --:     ");        
System.out.println("               :.*    +:  ++        -#  :*    --:     ");        
System.out.println("               : *    ==.  #-      .#:  -+    =::     ");        
System.out.println("               : *    -+:. .=:....:-:  :+=    +.:     ");        
System.out.println("                -+.   .#-:.   .:::.  ..-*-    * :     ");        
System.out.println("                ---    %+-::*=::::-*-:-=#:   .+-      ");        
System.out.println("                ::+    #*=-#=      :%==*%    -:-     ");         
System.out.println("                 --.   +%**#        +#*##   .-=       ");        
System.out.println("                   --=++***+==---====***++==-.        ");        
System.out.println("                            .........                 ");        
			y.Honda();
		}
		else
		{
			System.out.println(o.RED+o.bold);
			System.out.println("INVALID OPTION\nPress 1 for Re-Enter Your option\nPress 2 for Main Cars Menu\nPress any key to exit");
			int bc=sc.nextInt();
			System.out.println(o.reset);
			if(bc==1)
			{
        			Bud_Cars();
			}
			else if(bc==2)
			{
				car();
			}
		}
	}
	static finance fin=new finance();
	void payment(double price)
	{
		System.out.println(o.PURPLE+o.bold+o.ITALIC);	
		System.out.println("\t\t\t\t\t\t1.CrediCard or DebitCard ");
		System.out.println("\t\t\t\t\t\t2.UPI Payments ");
		System.out.println("\t\t\t\t\t\t3.EMI ");
		System.out.println("\t\t\t\t\t\t4.Exit ");
		System.out.println();
		System.out.println(o.reset);
		int x = sc.nextInt();
        	System.out.println();
		System.out.println(o.reset);
		switch(x)
		{
			case 1 : Card(); break;
			case 2 : Num(); break;
			case 3 : fin.EMIC(price); break;
			case 4: break;
			default :
			{
				System.out.println(o.RED+o.bold);
				System.out.println("\t\t\t\t\t\tInvalid Selection ");
				System.out.println(o.reset);
				payment(price);
			}
		}		
	}
	void Card()
	{
			System.out.println(o.BLUE+o.bold+o.ITALIC);
			System.out.print("\t\t\t\t\t\tPlease Enter your 12 digit Card Number: ");
			long n = sc.nextLong();
			int c=0;
			while(n>0)
			{
				n/=10;
				c++;
			}
			System.out.println(o.reset);		
			if(c==12)
			{
				System.out.println(o.CYAN+o.ITALIC);
				System.out.println("\t\t\t\t\t\tOTP Sent Succesfully");
			   while(true)
			   {
				Random r=new Random();
        			int otp=1000+r.nextInt(8999);
				System.out.println("\t\t\t\t\t\tyou otp is: "+otp);
				System.out.println();
				System.out.print("\t\t\t\t\t\tPlease Enter otp: ");
				int otp1 = sc.nextInt();
				System.out.println(o.reset);
				if(otp==otp1)
				{
					System.out.println(o.GREEN+o.bold+o.ITALIC);	
					System.out.println("\t\t\t\t\t\tYour payment is successful");
					System.out.println("\t\t\t\t\t\tThanks for Choosing Motor Verse.....");
						System.out.println(o.reset);
					System.exit(0);
				}
				else{
					System.out.println(o.RED+o.bold);
				   System.out.println("\t\t\t\t\t\tInvalid Otp please re-try");
					System.out.println(o.reset);
				}
			   }				
			}
			else
			{
				System.out.println(o.RED+o.bold);
				System.out.println("\t\t\t\t\t\tInvalid Card Number ");
				System.out.println("\t\t\t\t\t\tPlease Enter Your Valid Card Number : ");
				System.out.println(o.reset);
				Card();	
			}
	}
	void Num()
	{
					System.out.println(o.BLUE+o.bold+o.ITALIC);
			System.out.print("\t\t\t\t\t\tPlease Enter your 10-Digit UPI Number: ");
			long n = sc.nextLong();
			System.out.println();
			int c=0;
			while(n>0)
			{
				n/=10;
				c++;
			}		
			if(c==10)
			{
				System.out.println("\t\t\t\t\t\tOTP Sent Succesfully");

			  while(true)
			   {
				Random r=new Random();
        			int otp=1000+r.nextInt(8999);
				System.out.println("\t\t\t\t\t\tyou otp is: "+otp);
				System.out.println();
				System.out.print("\t\t\t\t\t\tPlease Enter otp: ");
				int otp1 = sc.nextInt();
				System.out.println(o.reset);
				if(otp==otp1)
				{
							System.out.println(o.GREEN+o.bold+o.ITALIC);
					System.out.println("\t\t\t\t\t\tYour payment is successful");
					System.out.println("\t\t\t\t\t\tThanks for Choosing Motor Verse......");
							System.out.println(o.reset);
					System.exit(0);
				}
				else{
					System.out.println(o.RED+o.bold);
				   System.out.println("\t\t\t\t\t\tInvalid Otp please re-try");
					System.out.println(o.reset);
				}
			   }	
			}
			else
			{
				System.out.println(o.RED+o.bold);
				System.out.println("\t\t\t\t\t\tInvalid UPI Number ");
				System.out.println(o.reset);
				System.out.println("\t\t\t\t\t\tPlease Enter Your Valid UPI Number : ");
				Num();	
			}
	}
}
class Bc
{
	static Color o=new Color();
	static ca m=new ca();
	static Scanner sc=new Scanner(System.in);
	void Maruti()
	{
		System.out.println(o.SKBLUE+o.bold+o.ITALIC);
		System.out.println("WELCOME TO MARUTI SUZUKI\nAvailable Models");
        	System.out.println("1.MARUTI SUZUKI SWIFT\n2.MARUTI SUZUKI BALENO\n3.MARUTI SUZUKI ALTO\n4.MARUTI SUZUKI ERTIGA");
		System.out.println();
        	char ch=sc.next().charAt(0);
        	if(ch=='1'){
        	    System.out.println("Swift");
        	    m.swift();
        	}
        	else if(ch=='2'){
        	    System.out.println("Baleno");
        	    m.baleno();
        	}
        	else if(ch=='3'){
        	    System.out.println("Alto");
        	    m.alto();
        	}
        	else if(ch=='4'){
        	    System.out.println("Ertiga");
        	    m.ertiga();
       		 }
        	else{
			System.out.println(o.RED+o.bold);
        		System.out.println("Invalid Option");
        	    	System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char ce=sc.next().charAt(0);
			if(ce=='1')
			{
				Maruti();
			}
			else if(ce=='2')
			{
				new Cars().Bud_Cars();
				//System.out.println("Back");
			}
        	}
		System.out.println(o.reset);
	}
	void kia()
    	{
		System.out.println(o.SKBLUE+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO Hyundai Motors\nAvailable Models");
        	System.out.println("1.KIA SELTOS\n2.KIA SONET");
        	char ke=sc.next().charAt(0);
        	if(ke=='1')
		{
            		System.out.println("SELTOS");
            		m.seltos();
        	}
        	else if(ke=='2')
		{
            		System.out.println("");
            		m.sonet();
        	}
        	else
		{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char k=sc.next().charAt(0);
			if(k=='1')
			{
				kia();
			}
			else if(k=='2')
			{
				new Cars().Bud_Cars();
			}
        	}
		System.out.println(o.reset);
    	}
	void Tata()
    	{
		System.out.println(o.SKBLUE+o.bold+o.ITALIC);
    	    System.out.println("WELCOME TO TATA MOTORS\nAvailable Models");
    	    System.out.println("1.TATA Tiago\n2.TATA NEXON(GEN,EV) \n3.TATA SAFARI");
    	    char Th=sc.next().charAt(0);
    	    if(Th=='1'){
    	        System.out.println("TIAGO");
        	    m.tiago();
        	}
        	else if(Th=='2'){
        	    System.out.println("NEXON");
        	    m.nexon();
        	}
        	else if(Th=='3'){
        	    System.out.println("SAFARI");
        	    m.safari();
        	}
        	else{
			System.out.println(o.RED+o.bold);
        	    System.out.println("Invalid Option");
        	    System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char Te=sc.next().charAt(0);
			if(Te=='1')
			{
				Maruti();
			}
			else if(Te=='2')
			{
				new Cars().Bud_Cars();
				//System.out.println("Back");
			}
        	}
		System.out.println(o.reset);
    	}
	void Honda()
    	{
		System.out.println(o.SKBLUE+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO Honda Motors\nAvailable Models");
        	System.out.println("1.HONDA AMAZE\n2.HONDA CITY");
        	char aa=sc.next().charAt(0);
        	if(aa=='1'){
        	    System.out.println("AMAZE");
        	    m.amaze();
        	}
        	else if(aa=='2'){
        	    System.out.println("CITY");
        	    m.city();
        	}
        	else
		{
			System.out.println(o.RED+o.bold);
        		System.out.println("Invalid Option");
        		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char kh=sc.next().charAt(0);
			if(kh=='1')
			{
				Honda();
			}
			else if(kh=='2')
			{
				new Cars().Bud_Cars();
			}
	       }
		System.out.println(o.reset);
   	}
    	void Hyundai()
    	{
		System.out.println(o.SKBLUE+o.bold+o.ITALIC);
    		System.out.println("WELCOME TO Hyundai Motors\nAvailable Models");
        	System.out.println("1.Hyundai Creta\n2.Hyundai Verna\n3.Hyundai i20");
        	char Th=sc.next().charAt(0);
        	if(Th=='1'){
        	    System.out.println("Creta");
        	    m.creta();
        	}
       		else if(Th=='2'){
        	    System.out.println("Verna");
        	    m.verna();
        	}
        	else if(Th=='3'){
        	    System.out.println("i20");
        	    m.i20();
       		}
        	else{
		System.out.println(o.RED+o.bold);
        	    System.out.println("Invalid Option");
        	    System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char He=sc.next().charAt(0);
			if(He=='1')
			{
				Maruti();
			}
			else if(He=='2')
			{
				new Cars().Bud_Cars();
				//System.out.println("Back");
			}
        	}
		System.out.println(o.reset);
    	}	
}
class Pc
{
    	static Scanner sc=new Scanner(System.in);
	static ca m=new ca();
	static Color o=new Color();
    	void Benz()
    	{
		System.out.println(o.CYAN+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO Mercedez - Benz\nAvailable Models");
        	System.out.println("1.Mercedez C - class\n2.Mercedez E - class");
        	char Pb=sc.next().charAt(0);
        	if(Pb=='1'){
            		System.out.println("C - Class");
            		m.benc();
        	}
        	else if(Pb=='2'){
            		System.out.println("E - Class");
            		m.bene();
        	}
       	 	else{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back or Press any key to Exit");
			System.out.println(o.reset);
			char Pbe=sc.next().charAt(0);
			if(Pbe=='1')
			{
				Benz();
			}
			else if(Pbe=='2')
			{
				new Cars().PCar();
				//System.out.println("Back");
			}
        	}
		System.out.println(o.reset);
    	}
	void Jag()
    	{
		System.out.println(o.CYAN+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO Jaguar Land Rover\nAvailable Models");
        	System.out.println("1.Jaguar XF\n2.Range Rover Sport");
        	char Je=sc.next().charAt(0);
        	if(Je=='1'){
        		System.out.println("Range Rover Sport");
            		m.sport();
        	}
        	else if(Je=='2'){
            		System.out.println("XF Jaguar");
            		m.xf();
        	}
        	else{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char Pj=sc.next().charAt(0);
			if(Pj=='1')
			{
				Jag();
			}
			else if(Pj=='2')
			{
				new Cars().PCar();
				//System.out.println("Back");
			}
        	}
		System.out.println(o.reset);
    	}
	void Audi()
    	{
		System.out.println(o.CYAN+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO AUDI\nAvailable Models");
        	System.out.println("1.AUDI A4\n2.AUDI A6\n3.AUDI E - Tron");
        	char Th=sc.next().charAt(0);
        	if(Th=='1'){
        		System.out.println("A4");
            		m.a4();
        	}
        	else if(Th=='2'){
            		System.out.println("A6");
            		m.a6();
        	}
        	else if(Th=='3'){
            		System.out.println("E - Tron");
            		m.etron();
        	}
        	else{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char Pae=sc.next().charAt(0);
			if(Pae=='1')
			{
				Audi();
			}
			else if(Pae=='2')
			{
				new Cars().PCar();
				//System.out.println("Back");
			}
        	}
		System.out.println(o.reset);
    	}
	void Bmw()
    	{
		System.out.println(o.CYAN+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO BMW\nAvailable Models");
        	System.out.println("1.BMW X6\n2.BMW x7");
        	char Pbe=sc.next().charAt(0);
        	if(Pbe=='1'){
            		System.out.println("X6");
            		m.x6();
        	}
        	else if(Pbe=='2'){
            		System.out.println("X7");
            		m.x7();
        	}
        	else{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char Pbm=sc.next().charAt(0);
			if(Pbm=='1')
			{
				Bmw();
			}
			else if(Pbm=='2')
			{
				new Cars().PCar();
				//System.out.println("Back");
			}
        	}
		System.out.println(o.reset);
    	}
}
class Bikes
{
	static Color o=new Color();
	static Scanner sc=new Scanner(System.in);
	void Bikes()
	{
		System.out.println(o.GREEN+o.bold+o.BLINK+o.ITALIC);
		System.out.println("WELCOME to BIKES");
		System.out.println("Select on Option\n1.Budget Bikes\n2.Premium Bikes");
		int b=sc.nextInt();
		System.out.println(o.reset);
		if(b==1)
		{
			System.out.println("---- Budget Bikes -----");
            		Bud_Bikes();
		}
		else if(b==2)
		{
			System.out.println("---- Premium Bikes -----");
			PBikes();
		}
		else
		{
			System.out.println(o.RED+o.bold);
			System.out.println("INVALID OPTION");
			System.out.println("Press 1 for Re-Enter Your option\nPress any key to exit");
			int eb=sc.nextInt();
			System.out.println(o.reset);
			if(eb==1){
				Bikes();
			}
		}  
	}
	void Bud_Bikes()
	{
		System.out.println(o.BLUE+o.bold+o.BLINK+o.ITALIC);
		System.out.println("Select Brand\n1.Honda\n2.suzuki\n3.Hero\n4.Bajaj\n5.TVS");
            	int b1=sc.nextInt();
		B_bikes bb=new B_bikes();
		System.out.println(o.reset);
            	if(b1==1)
		{
			
System.out.println("                   .---.=-:::::::::::::+.:--:        ");         
System.out.println("                ..*-  + --            .* -: :*:.     ");         
System.out.println("               . #.   +. #            *: =.   # .     ");        
System.out.println("               : #    +. +=          :# .+    +::     ");        
System.out.println("               :.*    +: .%          #: .*    --:     ");        
System.out.println("               :.*    +:  ++        -#  :*    --:     ");        
System.out.println("               : *    ==.  #-      .#:  -+    =::     ");        
System.out.println("               : *    -+:. .=:....:-:  :+=    +.:     ");        
System.out.println("                -+.   .#-:.   .:::.  ..-*-    * :     ");        
System.out.println("                ---    %+-::*=::::-*-:-=#:   .+-      ");        
System.out.println("                ::+    #*=-#=      :%==*%    -:-     ");         
System.out.println("                 --.   +%**#        +#*##   .-=       ");        
System.out.println("                   --=++***+==---====***++==-.        ");        
System.out.println("                            .........                 ");        
			bb.Hond();
		}
		else if(b1==2)
		{
			
System.out.println("                 .=##+-             ");    
System.out.println("               -*#######+:          ");    
System.out.println("           .-+#############+:       ");    
System.out.println("       .:=*####*--+##########*+:    ");   
System.out.println("     .+##########*=--+##########*=. ");    
System.out.println("       .-*##########*=::=*#####*=:  ");    
System.out.println("          .=*##########*=. ...       ");   
System.out.println("             .=*##########*-.        ");   
System.out.println("       .-=++++=::=*##########*-.     ");   
System.out.println("     .+##########*=-=*##########+-   ");   
System.out.println("      .-*##########*--+######*=-.    ");  
System.out.println("          .=*##########*##*=:.       ");   
System.out.println("             :=*#######*=:           ");   
System.out.println("                :=*##+:              ");   
System.out.println("                  ::                 ");  
			bb.suzuki();
		}
		else if(b1==3)
		{
			
System.out.println("                                 .            ");              
System.out.println("                                :@%+.         ");              
System.out.println("                                :@@@@%+.      ");              
System.out.println("                .=.            :@@@@@@@%+     ");             
System.out.println("                 .##*=.         :@@@@@@@@@.   ");              
System.out.println("                 .#####*-.      :@@@@@@@@@.   ");              
System.out.println("                 .########*     :@@@@@@@@@.   ");              
System.out.println("                 .#########     :@@@@@@*-.    ");              
System.out.println("                 .#########     :@@%+:        ");              
System.out.println("                 .#########     .=.           ");              
System.out.println("                 .#########              :.   ");              
System.out.println("                 .#########           :+%@-   ");              
System.out.println("                 .#########        :+%@@@@-   ");              
System.out.println("                 .#########      -%@@@@@@@-   ");              
System.out.println("                 .#########       -*@@@@@@-   ");              
System.out.println("                 .#########          -*@@@-   ");              
System.out.println("                 .#########             -*-   ");              
System.out.println("                   :+######                    ");             
System.out.println("                      :=###                    ");             
System.out.println("                         .=                    "); 
			bb.hero();
		}
		else if(b1==4)
		{
System.out.println("                              :--:.                     ");                                                                                                                                                
System.out.println("                         .:=+*******=-.                 ");                                                                                                                                                
System.out.println("                     .-=****************+=:.            ");                                                                                                                                                
System.out.println("                    .:=+********************+=-.        ");                                                                                                                                                
System.out.println("               =-.       :-+*********************+-.    ");                                   
System.out.println("               ****+-:       .-=+******************=    ");                         
System.out.println("              ********+=:.    .-**************+-:       ");                        
System.out.println("               *************=+************+=-.          ");                                          
System.out.println("                .:=+******************+-:.              ");                                                             
System.out.println("                  .-+****************+-.                ");                            
System.out.println("               =+************************+-:            ");                                          
System.out.println("               **********+-: .:-+************+=:.       ");                      
System.out.println("               *****+=-.       :-*****************=:    ");                           
System.out.println("               *+-:.      .:=+********************+-    ");                                                       
System.out.println("                      :-=*********************+=:.      ");                                                                                                                                                
System.out.println("                    :=+*******************=-.           ");                                                                                                                                                
System.out.println("                        :-+**********+=:.               ");                                                                                                                                                
System.out.println("                           .-=+++-:                     ");  
			bb.bajaj();
		}
		else if(b1==5)
		{
			
System.out.println("                                                              ..               ");            
System.out.println("                                                         :=+*#######*=:        ");             
System.out.println("                                                       +######+=====++:        ");            
System.out.println("                                                     -+####+-. .:-=====#:      ");             
System.out.println("             -+**+=:                                :+##*=. :=*#########*:     ");             
System.out.println("                 :*##+:.    .-==-:                 -**=.  -*##############+:   ");             
System.out.println("                  .=#####**#+=:. .-===-:.      .:--:   :=###########*++*####+:  ");            
System.out.println("                     -=++=:    :*#########+-:..  ..:-+*############.     =***+  ");            
System.out.println("                              -####################################-             ");           
System.out.println("                            .+######################################*-.          ");           
System.out.println("                          .=###########################################*=:       ");           
System.out.println("                       :=*################################################*=:    ");           
System.out.println("                     :*#############*+=-. .-=+*##########*+*##*+=----==+*####*=.  ");          
System.out.println("                   :+###*-                      ..:::...    :.             :-=*#+: ");         
System.out.println("               .:=*#*+-.                                                       .=**-.");       
System.out.println("      :=*#+==+*+=-:.                                                             .=+*=");    
			bb.tvs();
		}
        	else {
			System.out.println(o.RED+o.bold);
        		System.out.println("INVALID OPTION");
			System.out.println("Press 1 for Re-Enter Your option\nPress 2 for Main Bike Menu\nPress any key to exit");
			int be=sc.nextInt();
			System.out.println(o.reset);
			if(be==1)
			{
				Bud_Bikes();
			}
			else if(be==2)
			{
				Bikes();
			}	
       		}
	}
	void PBikes()
	{
		Pbikes prem=new Pbikes(); 
		System.out.println(o.GREEN+o.bold+o.BLINK+o.ITALIC);
		System.out.println("Select Brand\n1.Royal Enfield\n2.KTM\n3.Triumph\n4.Harley - Davidson");
		int p1=sc.nextInt();
            	if(p1==1)
		{
		System.out.println(o.CYAN+o.bold+o.BLINK+o.ITALIC);	
System.out.println("+#######*=:                                                  *########=                                                          "); 
System.out.println("=###-..=###:   :=+++=-. .===:   :==   ===-     -===:         +###-..... ===:    -==: :======= .===-  =======: :===:  :======-:.  "); 
System.out.println("=###-  .###- =##*-.:+##+.-###:  *#-  -####-    =###:         +###:      ####+   =##: -###+---..###+  ###*---- -###-  :###+--=##*- ");
System.out.println("=###-.:*##= -###     +##* :###-*#-   ##=###.   -###:         +###+--==  *#####- =##: :###-    .###+  ###*...  -###-  .###=   .###=");
System.out.println("=###*###*.  -###     -###  :####-   +#- *##*   -###:         +###+++++  *##-###*+##: :######: .###+  ####**+  -###-  .###=    *###");
System.out.println("=###-.+###=  =##*-:  *##+   *###   -##***###=  -###:         +###:      *## .+#####: :###-    .###+  ###*     -###-  .###=   :###+");
System.out.println("=###-  :*###+:.::::-*##+    *###  .##.   =###: =###****=     +###:      :::--:.+###: -###-    .###+  ####++++ -###*==-:::::-+###* ");
System.out.println("::::.    .-+*######*+-.     ::::  :::    .:::: ::::::::.     *####****###*=--:  .::. .:::.    .::::  :::::::: .:::--=+*######*=:  ");
		System.out.println(o.reset);
			prem.re();
		}
		else if(p1==2)
		{
			System.out.println(o.CYAN+o.bold+o.BLINK+o.ITALIC);
System.out.println("                      =*****************************************.                ");
System.out.println("                    .--------------+**********+----------------                  ");
System.out.println("          :::::::::::     .:::::::  +**********:     .:::::::::.     .:::::::::. ");
System.out.println("         =**********.   -+*****+:  +**********-    .=**********    :+**********: ");
System.out.println("        -**********- .=******=.   -**********+   .=***********=  -+***********+  ");
System.out.println("       :**********=-+*****+-     :***********. .=*************:-**************-  ");
System.out.println("      .******************+      .***********-.=*******************************   ");
System.out.println("      +*******************+:    +***********+********************************=   ");
System.out.println("     +*********+************=  +*********************************************.   ");
System.out.println("    =**********..+************=*****************+-.*************=.-*********=    ");
System.out.println("   -**********:   -***************************+:  -***********-   +*********.    ");
System.out.println("  .++++++++++-     .++++++++++++++++++++++++=:    ++++++++++:    .++++++++++     ");
			System.out.println(o.reset);
			prem.ktm();
		}
		else if(p1==3)
		{
			System.out.println(o.CYAN+o.bold+o.BLINK+o.ITALIC);
 System.out.println("    :=:.....--.                                                               ");  
 System.out.println("  :+%%#%%%%%%-.                                                               "); 
 System.out.println("  .=#=::*%*:-+#-.......                                                       ");  
 System.out.println("  ::  :*%+: .:-=##++**===+++=-+++-:-++==+++-    :++=:------:..:---:..:::::    "); 
 System.out.println("        :*%+:    -#%=.-%#--%%-.-+%=- .=#::=%%#-..=#%*-:-#%*+*%#==*%%=.:=#%*-. ");   
 System.out.println("       :*%+:    :#%=.-%*:-%%- :+%=:  =*:.=*+%%=+=#%=: :*%=::%%===%#:..-#%=-    "); 
 System.out.println("       :*%+:    :#%++*=: -%%- :+%=:  =*:.=*-=%#=-*%=: :*%=-=%+-:=%#=+#+%%**+:  "); 
 System.out.println("       :*%*:    :#%==-:  -%%- :+%=:  =*:.=*:.--.:*%=: :#%*++:. :=%%*=:-%%=-#-: "); 
 System.out.println("      -+%%#+:  -+%%+--==:-%%=:.=%*-.:+=::=*:    -#%=- :#%=-    :=%+-  :%%=-#-. "); 
 System.out.println("     .:::::.  :----: .-=+=-+- .-++++-::=++=-  -+***-==##*-.  :=#%*-.-+%%+-=.   ");
 System.out.println("                       .:=+*+=-....            ...........    ....-.--==::     ");
 System.out.println("                          .:=+*%#+++-:.....               ....:-=++#*+-.       ");
 System.out.println("                              .:=++*%%%#**++++++=====++++++*#%#*++-:.          ");
 System.out.println("                                   ...:-=+++++********+++++=--:..              "); 
 System.out.println("                                            ...........                        ");
			System.out.println(o.reset);
			prem.triumph();
		}
		else if(p1==4)
		{
			System.out.println(o.CYAN+o.bold+o.BLINK+o.ITALIC);
			System.out.println("HARLEY - DAVIDSON");
System.out.println("                                .=#%=.                                ");
System.out.println("                             :+%%+:.=#%+:                            "); 
System.out.println("                       .-=*%%*-.:+%%+-.-+#%*=:.                       ");
System.out.println("            --==++*####*=-::-+#@+:  :=@#+-..-=+*#**++=----        ");    
System.out.println("            @*-::::::-=+#%@+-. :#@: @*+  :=#%*+=-:...::-+@:           ");
System.out.println("            @= @@@@%-*@* ++ *@:.@@: @@+ #%. @= ::=#@@@@.:@:     ");      
System.out.println("            @#::*@@*  -  += %@:.@@: @@+ #@: @= *+ .@@*.:*@:           ");
System.out.println("             :## +@* = = += +*..@@: @@+ =*. @- == :@+ *%:             ");
System.out.println("+++++++++++++++@**@%+@#@+#@++++#@@*+@@@++++#@#+@@*+@**@*+++++++++++++=	");
System.out.println("@*------------------------------------------------------------------+@				");
System.out.println("@= #@*##*%#**@#**#@*#@#**%*%%*@@%***%@**%*%#*#*%++#@#++%%*+*%**%*%% -@		");
System.out.println("@= %@.=+ @= .@-:= @ =@- +@.=--@@@ - +@  * *=.=.# = # -::+ + *. * *@ -@		");
System.out.println("@= %@.:- @:: %-:= @ =@-.*@+  ###% *.+*..=--.==.# % * -*#+ @ +. : *@ -@");
System.out.println("@= %@.:- % . *-.- % =@- *@@ -%**% *.+=  .+  #=.# % ##+.=+ @ +.:  *@ -@	");
System.out.println("@= %@.=+ * # =--# # -#-.#@@.=@@@@ = +.== #  @=.# + # =-.+ # +.+. *@ -@");
System.out.println("@= %@*#%+#*@**##@+@+++#++%@*#@@@@++*@*%%+@+*@#*%++*@#=+#@+=+@*%#+%@ -@");
System.out.println("@=                                                                  -@	");
System.out.println("*#############@@#%@%###%@#%@%#@@##%@##@@%###@%####%@%#@@#***********#*		");
System.out.println("            :#@- *@  ==*@:.# -% .-*% :@@-.--@ :===%@% :@#:            ");
System.out.println("          -%@%. +@@ .@@@@@. -@# +@@% :@@-:@@@..:::*@@*  #@%-      ");    
System.out.println("            :#@+..*#=.=%@@+ @@# +@@% :@@-.-*@@@#-.**: =%#:            ");
System.out.println("              .+@#- -#*:-@+ @@# +@@% :@@--@@@-:+*= :*%+.              ");
System.out.println("                 :*@*:.=*@* @@# +@@% :@@- :=@*=.:+%*-             ");    
System.out.println("                    -#@*-.-*@@%. -#%  .*###=.:+%#-                    ");
System.out.println("                       -*@#=.:=**+*@***=:.-*%*-                       ");
System.out.println("                          :+#@#+-:...:=*%#=:                          ");
System.out.println();
			System.out.println(o.reset);
			prem.harley();
		}
        	else {
			System.out.println(o.RED+o.bold);
        		System.out.println("INVALID OPTION");
			System.out.println("Press 1 for Re-Enter Your option\nPress 2 for Main Bike Menu\n Press any key to exit");
			int be=sc.nextInt();
			System.out.println(o.reset);
			if(be==1)
			{
				PBikes();
			}
			else if(be==2)
			{
				Bikes();
			}	
       		}
		System.out.println(o.reset);
	}
}
class B_bikes
{
	static Color o=new Color();
	static bi obj=new bi();
	static Scanner sc=new Scanner(System.in);
	void Hond()
	{
		System.out.println(o.magenta+o.bold+o.ITALIC);
		System.out.println("WELCOME TO HONDA\nAvailable Models");
        	System.out.println("1.Honda SHINE\n2.HONDA UNICORN\n3.HONDA ACTIVA 6G");
        	char Bhe=sc.next().charAt(0);
        	if(Bhe=='1'){
        	    System.out.println("SHINE");
        	    obj.shine(); 
        	}
        	else if(Bhe=='2'){
        	    System.out.println("Unicorn");
        	    obj.unicorn();
        	}
        	else if(Bhe=='3'){
        	    System.out.println("Activa 6G");
        	    obj.activa();
        	}
        	else{
			System.out.println(o.RED+o.bold);
        		System.out.println("Invalid Option");
        	    	System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char He=sc.next().charAt(0);
			if(He=='1')
			{
				Hond();
			}
			else if(He=='2')
			{
				//new Cars().Bud_Cars();
				new Bikes().Bud_Bikes();
			}
        	}
		System.out.println(o.reset);
	}
	void suzuki()
    	{
		System.out.println(o.magenta+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO Suzuki \nAvailable Models");
        	System.out.println("1.Suzuki Access 125\n2.Suzuki Gixer");
        	char Se=sc.next().charAt(0);
        	if(Se=='1')
		{
            		System.out.println("Access 125");
            		obj.access();
        	}
        	else if(Se=='2')
		{
            		System.out.println("Gixer");
            		obj.gixer();
        	}
        	else
		{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char S=sc.next().charAt(0);
			if(S=='1')
			{
				suzuki();
			}
			else if(S=='2')
			{
				//new Cars().Bud_Cars();
				new Bikes().Bud_Bikes();
			}
        	}
		System.out.println(o.reset);
    	}
	void hero()
    	{
		System.out.println(o.magenta+o.bold+o.ITALIC);
    	    	System.out.println("WELCOME TO HERO Motors\nAvailable Models");
    	    	System.out.println("1.Hero Glamour\n2.Hero Splender \n3.Hero HF Deluxe");
    	    	char G=sc.next().charAt(0);
    	    	if(G=='1'){
    	        	System.out.println("Glamour");
        	    	obj.glamour();
        	}
        	else if(G=='2'){
        	    System.out.println("Splender");
        	    obj.splender();
        	}
        	else if(G=='3'){
        	    System.out.println("HF Deluxe");
        	    obj.hf();
        	}
        	else{
			System.out.println(o.RED+o.bold);
        	    System.out.println("Invalid Option");
        	    System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char ghe=sc.next().charAt(0);
			if(ghe=='1')
			{
				hero();
			}
			else if(ghe=='2')
			{
				//new Cars().Bud_Cars();
				new Bikes().Bud_Bikes();
			}
        	}
		System.out.println(o.reset);
    	}
	void bajaj()
    	{
		System.out.println(o.magenta+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO BAJAJ Motors\nAvailable Models");
        	System.out.println("1.Bajaj Pulsar(220)\n2.Bajaj Platina");
        	char baje=sc.next().charAt(0);
        	if(baje=='1'){
        	    System.out.println("Pulsar(220CC)");
        	    obj.pulsar();
        	}
        	else if(baje=='2'){
        	    System.out.println("Platina");
        	    obj.platina();
        	}
        	else
		{
			System.out.println(o.RED+o.bold);
        		System.out.println("Invalid Option");
        		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char baj=sc.next().charAt(0);
			if(baj=='1')
			{
				bajaj();
			}
			else if(baj=='2')
			{
				//new Cars().Bud_Cars();
				new Bikes().Bud_Bikes();
			}
	       }
		System.out.println(o.reset);
   	}
    	void tvs()
    	{
		System.out.println(o.magenta+o.bold+o.ITALIC);
    		System.out.println("WELCOME TO TVS Motors\nAvailable Models");
        	System.out.println("1.TVS XL 100\n2.TVS Star City Plus");
        	char tv=sc.next().charAt(0);
        	if(tv=='1'){
        	    System.out.println("XL 100");
        	    obj.xl100();
        	}
       		else if(tv=='2'){
        	    System.out.println("Star City Plus");
        	    obj.star();
        	}
        	else{
			System.out.println(o.RED+o.bold);
        	    System.out.println("Invalid Option");
        	    System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char tve=sc.next().charAt(0);
			if(tve=='1')
			{
				tvs();
			}
			else if(tve=='2')
			{
				//new Cars().Bud_Cars();
				new Bikes().Bud_Bikes();
			}
        	}
		System.out.println(o.reset);
    	}
}
class Pbikes
{
    	static Scanner sc=new Scanner(System.in);
	static bi obj=new bi();
	static Color o=new Color();
    	void re()
    	{
		System.out.println(o.YELLOW+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO ROYAL ENFIELD\nAvailable Models");
        	System.out.println("1.Classic 350\n2.Continental GT 650\n3.Himalayan\n4.Intercetor GT 650");
        	char ree=sc.next().charAt(0);
        	if(ree=='1'){
            		System.out.println("Classic 350");
            		obj.classic();
        	}
        	else if(ree=='2'){
            		System.out.println("Continental GT 650");
            		obj.conti();
        	}
        	else if(ree=='3'){
            		System.out.println("Himalayan");
            		obj.himalayan();
        	}
        	else if(ree=='4'){
            		System.out.println("Interceptor GT 650");
            		obj.interceptor();
        	}
       	 	else{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back or Press any key to Exit");
			System.out.println(o.reset);
			char Pbe=sc.next().charAt(0);
			if(Pbe=='1')
			{
				re();
			}
			else if(Pbe=='2')
			{
				//new Cars().PCar();
				new Bikes().PBikes();
			}
        	}
		System.out.println(o.reset);
    	}
	void ktm()
    	{
		System.out.println(o.YELLOW+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO KTM\nAvailable Models");
        	System.out.println("1.KTM DUKE(125CC , 250CC) XF\n2.KTM RC(125 CC , 200 CC)");
        	char kte=sc.next().charAt(0);
        	if(kte=='1'){
        		System.out.println("KTM Duke(250CC)");
            		obj.duke();
        	}
        	else if(kte=='2'){
            		System.out.println("KTM RC(200CC)");
            		obj.rc();
        	}
        	else{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char kt=sc.next().charAt(0);
			if(kt=='1')
			{
				ktm();
			}
			else if(kt=='2')
			{
				//new Cars().PCar();
				new Bikes().PBikes();
			}
        	}
		System.out.println(o.reset);
    	}
	void triumph()
    	{
		System.out.println(o.YELLOW+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO Triumph\nAvailable Models");
        	System.out.println("1.Triumph Speed 400");
        	char tri=sc.next().charAt(0);
        	if(tri=='1'){
        		System.out.println("Triumph Speed 400");
            		obj.speed();
        	}
        	else{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char tre=sc.next().charAt(0);
			if(tre=='1')
			{
				triumph();
			}
			else if(tre=='2')
			{
				//new Cars().PCar();
				new Bikes().PBikes();
			}
        	}
		System.out.println(o.reset);
    	}
	void harley()
    	{
		System.out.println(o.YELLOW+o.bold+o.ITALIC);
        	System.out.println("WELCOME TO AUDI\nAvailable Models");
        	System.out.println("1.Harley DavidSon X440 CC");
        	char dae=sc.next().charAt(0);
        	if(dae=='1'){
        		System.out.println("Harley - DavidSon X440");
            		obj.x440();
        	}
        	else{
			System.out.println(o.RED+o.bold);
            		System.out.println("Invalid Option");
            		System.out.println("press 1 for Re - Enter your Options \npress 2 for Back\nPress any key to Exit");
			System.out.println(o.reset);
			char son=sc.next().charAt(0);
			if(son=='1')
			{
				harley();
			}
			else if(son=='2')
			{
				//new Cars().PCar();
				new Bikes().PBikes();
			}
        	}
		System.out.println(o.reset);
    	}
}
class ca{
	static Pc pr=new Pc();
	static Bc br=new Bc();
	static double benzc=6256000;
	static double benze=7520000;
	static double bmw6=1127500;
	static double bmw7=12145000;	
	static double audi4=4534000;
	static double audi6=6500000;
	static double audietron=11230000;	
	static double rangesport=16445000;
	static double jagxf=7645000;
	static double mswift=950000;
	static double mbaleno=880000;
	static double malto=512000;
	static double mertiga=1308000;
	static double mbreeza=1420000;
	static double ttiago=924000;
	static double tnexon=1674000;
	static double tsafari=1865000;
	static double hcreta=2105000;
	static double hvenue=894000;
	static double hi20=1124000;
	static double hverna=1542000;
	static double kseltos=1090000;
	static double ksonet=869000;
	static double hamaze=992000;
	static double hcity=142200;
	static Scanner sc=new Scanner(System.in);
	static Color o=new Color();
	void venue(){
		System.out.println(o.GREEN+o.bold+o.ITALIC);
		System.out.println("-----------------------  Hyundai Venue ----------------------- ");
		System.out.println();
		System.out.println("| Category                      | Specification                                         ");
		System.out.println("|-------------------------------|-------------------------------------------------------");	
		System.out.println("| **Engine Options**            | 1.0L Turbocharged Inline-3 (petrol)                   ");
		System.out.println("|                               | 1.2L Inline-4 (petrol)                                ");
		System.out.println("| **Transmission Options**      | 5-speed Manual (1.2L)                                 ");
		System.out.println("|                               | 6-speed Manual (1.0L)                                 ");
		System.out.println("|                               | 7-speed Dual-clutch Automatic (1.0L)                 ");
		System.out.println("| **Power Output**              | 1.0L Turbo: Around 120 hp                             ");	
		System.out.println("|                               | 1.2L: Around 83 hp                                   ");
		System.out.println("| **Torque**                    | 1.0L Turbo: Around 172 Nm                            ");
		System.out.println("|                               | 1.2L: Around 115 Nm                                  ");
		System.out.println("| **Fuel Efficiency (Combined)**| Varies based on engine and transmission choices      ");
		System.out.println("| **Dimensions (L x W x H)**    | Around 3995 mm x 1770 mm x 1605 mm                    ");
		System.out.println("| **Wheelbase**                 | Around 2500 mm                                        ");
		System.out.println("| **Boot Space**                | Around 350 liters                                     ");
		System.out.println("| **Fuel Tank Capacity**        | Around 45 liters                                      ");
		System.out.println("| **Safety Features**           | Varied based on trim level; may include ABS, Airbags, ");
		System.out.println("|                               | Electronic Stability Control, Rear Parking Sensors,  ");
		System.out.println("|                               | and more.                                             ");
		System.out.println("| **Infotainment System**       | Touchscreen infotainment system with Apple CarPlay,   ");
		System.out.println("|                               | Android Auto, Bluetooth connectivity, and more.      ");
		System.out.println();
		System.out.println(o.reset);
	        System.out.println("Press 1 for payments\n press 2 for Back menu");
        	int sel=sc.nextInt();
        	if(sel==1){
            		billing(hvenue);
        	}
        	else if(sel==2){
            		br.Hyundai();
        	}
		
	}
	void alto()
	{
		System.out.println(o.GREEN+o.bold+o.ITALIC);
		System.out.println("       --------------- Suzuki ALTO ----------------      "); 
		System.out.println();
		System.out.println("|    Category               		| 	Specification   						 ");                                      
		System.out.println("|------------------------		|-------------------------------------------------------		 ");
		System.out.println("| Engine             			| 0.66L 3-cylinder petrol engine  				 ");                     
		System.out.println("| Power Output       		\t| Varies by model and trim, typically around 54 hp		 ");     
		System.out.println("| Torque             			| Varies by model and trim, typically around 63 Nm	 ");    
		System.out.println("| Transmission       		\t| 5-speed manual or automatic transmission			 ");             
		System.out.println("| Fuel Economy      		\t| Varies by model and driving conditions			 ");              
		System.out.println("| Dimensions        			|                                                   			 ");    
		System.out.println("| (Length x Width x Height)	\t| Varies by model, approximately:   				 ");                    
		System.out.println("|                        		| Around 3,395 x 1,475 x 1,490 mm(length x width x height)"); 
		System.out.println("| Wheelbase          		\t| Around 2,460 mm                					 ");                    
		System.out.println("| Weight             			| Varies by model, typically around 700-800 kg		 ");  
		System.out.println("| Fuel Tank Capacity 		\t| Around 35 liters                                      		 ");
		System.out.println("| Seating Capacity   		\t| 4 or 5, depending on the model                        	 ");
		System.out.println("| Safety Features    		\t| Varies by model, may include airbags, ABS, etc.       	 ");
		System.out.println("| Infotainment       		\t| Varies by trim, may include touchscreen, Bluetooth, etc. 		 ");
		System.out.println("| Air Conditioning   		\t| Available in most models                              		 ");
		System.out.println("| Warranty           			| Check with local dealers for warranty information     	 ");
		System.out.println();
		System.out.println(o.reset);
	        System.out.println("Press 1 for payments\n press 2 for Back menu");
        	int sl=sc.nextInt();
        	if(sl==1){
            		billing(malto);
        	}
        	else if(sl==2){
            		br.Maruti();
        	}
		
	}
	void ertiga()
	{	
		System.out.println(o.GREEN+o.bold+o.ITALIC);
			System.out.println("       --------------- SUZUKI ERTIGA ----------------      "); 
		System.out.println();
		System.out.println("|      Category             	|        Specification                              ");
		System.out.println("|---------------------------	|-----------------------------------------------------");
		System.out.println("| Engine                	| 1.5L K15B Petrol Engine                    ");
		System.out.println("|                           	| 1.5L DDiS 225 Diesel Engine (varies by region) ");
		System.out.println("| Maximum Power         	| Petrol: Around 103 bhp                      ");
		System.out.println("|                           	| Diesel: Around 94 bhp (varies by region) ");
		System.out.println("| Maximum Torque        	| Petrol: Around 138 Nm                       ");
		System.out.println("|                           	| Diesel: Around 225 Nm (varies by region)   ");
		System.out.println("| Transmission          	| 5-speed Manual                             ");
		System.out.println("|                           	| 4-speed Automatic (varies by region)   ");
		System.out.println("| Seating Capacity     	\t| 7 (varies by region)                        ");
		System.out.println("| Fuel Tank Capacity   	\t| Around 45 to 50 liters                     ");
		System.out.println("| Dimensions (L x W x H)	| Around 4395 mm x 1735 mm x 1690 mm");  
		System.out.println("| Wheelbase            	\t| Around 2740 mm                             ");
		System.out.println("| Ground Clearance      	| Around 185 mm                              ");
		System.out.println("| Boot Space            	| Around 209 liters (expandable)             ");
		System.out.println("| Suspension           	\t| Front: MacPherson Strut                    ");
		System.out.println("|                           	| Rear: Torsion Beam                          ");
		System.out.println("| Brakes               	\t| Front: Ventilated Discs                    ");
		System.out.println("|                           	| Rear: Drum                                  ");
		System.out.println("| Tyres                 	| 185/65 R15 (varies by region)              ");
		System.out.println();
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(mertiga);
        	}
        	else if(sele==2){
            		br.Maruti();
        	}
				System.out.println(o.reset);
	}
	void baleno()
	{
				System.out.println(o.GREEN+o.bold+o.ITALIC);
		System.out.println("       --------------- SUZUKI BALENO ----------------      "); 
		System.out.println();
		System.out.println("| Category           		| Specification                                 "); 
		System.out.println("|----------------------------	| --------------------------------------------"); 
		System.out.println("| Engine         		| 1.2L DualJet K12C Petrol                      ");    
		System.out.println("| Power          		| 82 bhp @ 6,000 rpm                              ");   
		System.out.println("| Torque        		| 113 Nm @ 4,200 rpm                                "); 
		System.out.println("| Transmission   	        | 5-speed Manual / CVT Automatic                    "); 
		System.out.println("| Fuel Efficiency		| Manual: 21.01 km/l (claimed)                     "); 
		System.out.println("|                    		| CVT: 19.56 km/l (claimed)                         "); 
		System.out.println("| Dimensions    		| Length: 3,995 mm                                  "); 
		System.out.println("|                    		| Width: 1,745 mm                                   "); 
		System.out.println("|                    		| Height: 1,510 mm                                  "); 
		System.out.println("|                    		| Wheelbase: 2,520 mm                               "); 
		System.out.println("| Fuel Tank      		| 37 liters                                        "); 
		System.out.println("| Seating Capacity		| 5                                              "); 
		System.out.println("| Suspension     		| Front: MacPherson Strut                    ");        
		System.out.println("|                    		| Rear: Torsion Beam                             ");    
		System.out.println("| Brakes         		| Front: Ventilated Discs                           "); 
		System.out.println("|                    		| Rear: Drum                                       "); 
		System.out.println("| Tyres          		| 185/65 R15                                       "); 
		System.out.println("| Safety Features		| Dual Front Airbags                                "); 
		System.out.println("|                    		| ABS with EBD                                      "); 
		System.out.println("|                    		| Rear Parking Sensors                              "); 
		System.out.println("|                    		| ISOFIX Child Seat Anchors                        "); 
		System.out.println("| Warranty                 	| Standard manufacturer warranty                    "); 
		System.out.println();
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(mbaleno);
        	}
        	else if(sele==2){
            		br.Maruti();
        	}
				System.out.println(o.reset);
	}
	void swift()
	{
				System.out.println(o.GREEN+o.bold+o.ITALIC);
		System.out.println("       --------------- SUZUKI SWIFT ----------------      "); 
		System.out.println();
		
		System.out.println("| 	Category                 	| Specification                                    ");   	
		System.out.println("|--------------------------		|----------------------------------------------------  ");    
		System.out.println("| Engine                   		| Various options, e.g., 1.2L petrol                 ");
		System.out.println("| Transmission             		| Manual or automatic                                 ");
		System.out.println("| Power                    		| Range: approximately 83 hp to 110 hp              "); 
		System.out.println("| Torque                   		| Varies based on the engine                         ");
		System.out.println("| Fuel Efficiency          		| Depends on the engine and transmission options ");    	
		System.out.println("| Dimensions (L x W x H)   	\t| Varies by model and year                           ");
		System.out.println("| Wheelbase                		| Varies by model and year                           ");
		System.out.println("| Curb Weight              		| Depends on the trim level and equipment          ");  
		System.out.println("| Cargo Space              		| Varies based on configuration                      ");
		System.out.println("| Seating Capacity         		| Typically 5 passengers                              ");
		System.out.println("| Infotainment System      	\t| Touchscreen display, Bluetooth, USB connectivity ");  
		System.out.println("| Safety Features          		| Airbags, ABS, ESC, collision avoidance systems     ");
		System.out.println("| Fuel Tank Capacity       		| Varies by model and year                           ");
		System.out.println("| Warranty                 		| Standard manufacturer warranty                     ");
		System.out.println();
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(mswift);
        	}
        	else if(sele==2){
            		br.Maruti();
        	}
				System.out.println(o.reset);
	}
	void creta(){	
			System.out.println(o.GREEN+o.bold+o.ITALIC);
		System.out.println("--------------------- Hyundai Creta --------------------------");
		System.out.println();
        	System.out.println("| Category                     | Specification                                      ");
        	System.out.println("|------------------------------|----------------------------------------------------");
        	System.out.println("| **Maximum Power**            | 1.5L Petrol: Varies with model                     ");
        	System.out.println("|                              | 1.4L Turbo Petrol: Varies with model               ");
        	System.out.println("| **Maximum Torque**           | 1.5L Petrol: Varies with model                     ");
        	System.out.println("|                              | 1.5L Diesel: Varies with model                     ");
        	System.out.println("|                              | 1.4L Turbo Petrol: Varies with model               ");
        	System.out.println("| **Transmission Options**     | 6-speed Manual, 6-speed Automatic, 7-speed DCT    ");
        	System.out.println("| **Fuel Efficiency (ARAI)**   | 1.5L Petrol: Varies with transmission and model   ");
        	System.out.println("|                              | 1.5L Diesel: Varies with transmission and model   ");
        	System.out.println("|                              | 1.4L Turbo Petrol: Varies with transmission model ");
        	System.out.println("| **Dimensions (L x W x H)**   | Varies with model, typically around 4300 x 1790 x 1635 mm ");
        	System.out.println("| **Wheelbase**                | Varies with model, typically around 2610 mm        ");
        	System.out.println("| **Boot Space**               | Varies with model, typically around 433 liters     ");
        	System.out.println("| **Ground Clearance**         | Varies with model, typically around 190 mm        ");
        	System.out.println("| **Fuel Tank Capacity**       | Varies with model, typically around 50 liters     ");
        	System.out.println("| **Tyre Size**                | Varies with model, typically around 215/60 R17    ");
        	System.out.println("| **Seating Capacity**         | 5                                              ");
		System.out.println();
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(hcreta);
        	}
        	else if(sele==2){
            		br.Hyundai();
        	}
		System.out.println(o.reset);
	}
    void i20()
	{
			System.out.println(o.GREEN+o.bold+o.ITALIC);
 		System.out.println("------------------ Hyundai i20  ---------------------------");
		System.out.println();
        	System.out.println("| Category                      | Specification                                     ");
        	System.out.println("|-------------------------------|---------------------------------------------------");
        	System.out.println("| **Engine Options**            | 1.2L Petrol, 1.0L Turbo Petrol, 1.5L Diesel       ");
        	System.out.println("| **Maximum Power**             | 1.2L Petrol: Varies with model                    ");
        	System.out.println("|                               | 1.0L Turbo Petrol: Varies with model              ");
        	System.out.println("|                               | 1.5L Diesel: Varies with model                    ");
       	 	System.out.println("| **Maximum Torque**            | 1.2L Petrol: Varies with model                    ");
        	System.out.println("|                               | 1.0L Turbo Petrol: Varies with model              ");
        	System.out.println("|                               | 1.5L Diesel: Varies with model                    ");
        	System.out.println("| **Transmission Options**      | 5-speed Manual, 6-speed iMT (Intelligent Manual Transmission), 7-speed DCT, CVT");
        	System.out.println("| **Fuel Efficiency (ARAI)**    | 1.2L Petrol: Varies with transmission and model  ");
        	System.out.println("|                               | 1.0L Turbo Petrol: Varies with transmission and model ");
        	System.out.println("|                               | 1.5L Diesel: Varies with transmission and model  ");
        	System.out.println("| **Dimensions (L x W x H)**    | Varies with model, typically around 3995 x 1775 x 1505 mm ");
        	System.out.println("| **Wheelbase**                 | Varies with model, typically around 2580 mm       ");
        	System.out.println("| **Boot Space**                | Varies with model, typically around 311 liters    ");
        	System.out.println("| **Ground Clearance**          | Varies with model, typically around 170 mm       ");
        	System.out.println("| **Fuel Tank Capacity**        | Varies with model, typically around 40 liters    ");
        	System.out.println("| **Tyre Size**                 | Varies with model, typically around 195/55 R16   ");
        	System.out.println("| **Seating Capacity**          | 5    ");
		System.out.println();
						System.out.println(o.reset);
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(hi20);
        	}
        	else if(sele==2){
            		br.Hyundai();
        	}

	}  
	void verna(){	
				System.out.println(o.GREEN+o.bold+o.ITALIC);
		System.out.println("-----------------------  Hyundai Verna  ----------------------------");
        	System.out.println();
        	System.out.println("| Category                      | Specification                                      ");
        	System.out.println("|-------------------------------|----------------------------------------------------");
        	System.out.println("| **Engine Options**            | 1.5L Petrol, 1.0L Turbo Petrol, 1.5L Diesel        ");
        	System.out.println("| **Maximum Power**             | 1.5L Petrol: Varies with model                     ");
       	 	System.out.println("|                               | 1.0L Turbo Petrol: Varies with model               ");
        	System.out.println("|                               | 1.5L Diesel: Varies with model                     ");
        	System.out.println("| **Maximum Torque**            | 1.5L Petrol: Varies with model                     ");
        	System.out.println("|                               | 1.0L Turbo Petrol: Varies with model               ");
        	System.out.println("|                               | 1.5L Diesel: Varies with model                     ");
        	System.out.println("| **Transmission Options**      | 6-speed Manual, 6-speed Automatic, 7-speed DCT    ");
        	System.out.println("| **Fuel Efficiency (ARAI)**    | 1.5L Petrol: Varies with transmission and model  ");
        	System.out.println("|                               | 1.0L Turbo Petrol: Varies with transmission and model ");
        	System.out.println("|                               | 1.5L Diesel: Varies with transmission and model   ");
        	System.out.println("| **Dimensions (L x W x H)**    | Varies with model, typically around 4440 x 1729 x 1475 mm ");
       		System.out.println("| **Wheelbase**                 | Varies with model, typically around 2600 mm        ");
        	System.out.println("| **Boot Space**                | Varies with model, typically around 480 liters     ");
        	System.out.println("| **Ground Clearance**          | Varies with model, typically around 165 mm       ");
        	System.out.println("| **Fuel Tank Capacity**        | Varies with model, typically around 45 liters    ");
        	System.out.println("| **Tyre Size**                 | Varies with model, typically around 195/55 R16   ");
        	System.out.println("| **Seating Capacity**          | 5                                               ");
		System.out.println();
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(hverna);
        	}
        	else if(sele==2){
            		br.Hyundai();
        	}
				System.out.println(o.reset);
	}
	void tiago(){
				System.out.println(o.GREEN+o.bold+o.ITALIC);
		System.out.println("----------------------    Tata Tiago   ---------------------");
        	System.out.println();
        	System.out.println("| Category                      | Specification                                      ");
        	System.out.println("|-------------------------------|----------------------------------------------------");
       		System.out.println("| **Engine Options**            | 1.2L Revotron Petrol                              ");
        	System.out.println("| **Maximum Power**             | 1.2L Revotron Petrol: Varies with model            ");
        	System.out.println("| **Maximum Torque**            | 1.2L Revotron Petrol: Varies with model            ");
        	System.out.println("| **Transmission Options**      | 5-speed Manual, 5-speed AMT (Automatic Manual Transmission) ");
        	System.out.println("| **Fuel Efficiency (ARAI)**    | 1.2L Revotron Petrol: Varies with transmission and model  ");
        	System.out.println("| **Dimensions (L x W x H)**    | Varies with model, typically around 3765 x 1677 x 1535 mm ");
        	System.out.println("| **Wheelbase**                 | Varies with model, typically around 2400 mm        ");
        	System.out.println("| **Boot Space**                | Varies with model, typically around 242 liters     ");
        	System.out.println("| **Ground Clearance**          | Varies with model, typically around 170 mm       ");
        	System.out.println("| **Fuel Tank Capacity**        | Varies with model, typically around 35 liters    ");
        	System.out.println("| **Tyre Size**                 | Varies with model, typically around 175/60 R15   ");
        	System.out.println("| **Seating Capacity**          | 5                                               ");
		System.out.println();
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(ttiago);
        	}
        	else if(sele==2){
            		br.Tata();
        	}
				System.out.println(o.reset);
    	}
	void nexon(){
				System.out.println(o.GREEN+o.bold+o.ITALIC);				
		System.out.println("------------------------ Tata Nexon Electric vehicle  --------------------------");
        	System.out.println();
        	System.out.println("| Category                      | Specification                                      ");
        	System.out.println("|-------------------------------|----------------------------------------------------");
        	System.out.println("| **Powertrain**                | Electric Motor (Permanent Magnet AC Motor)         ");
        	System.out.println("| **Battery Capacity**          | 30.2 kWh Lithium-ion                              ");
        	System.out.println("| **Electric Range**            | Up to 312 km (ARAI claimed)                        ");
        	System.out.println("| **Maximum Power**             | 129 bhp                                          ");
        	System.out.println("| **Maximum Torque**            | 245 Nm                                           ");
        	System.out.println("| **Transmission**              | Single-speed automatic                            ");
        	System.out.println("| **Charging Time**             | DC Fast Charging (0-80%): Approximately 60 minutes ");
       	 	System.out.println("|                               | AC Slow Charging (0-100%): Approximately 8-9 hours");
        	System.out.println("| **Performance**               | 0 to 100 km/h: Approximately 9.9 seconds          ");
        	System.out.println("| **Dimensions (L x W x H)**    | Varies with model, typically around 3993 x 1811 x 1607 mm ");
        	System.out.println("| **Wheelbase**                 | Varies with model, typically around 2498 mm       ");
        	System.out.println("| **Boot Space**                | Varies with model, typically around 350 liters    ");
        	System.out.println("| **Ground Clearance**          | Varies with model, typically around 205 mm       ");
        	System.out.println("| **Tyre Size**                 | Varies with model, typically around 215/60 R16   ");
        	System.out.println("| **Seating Capacity**          | 5                                               ");
		System.out.println();
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(tnexon);
        	}
        	else if(sele==2){
            		br.Tata();
        	}
				System.out.println(o.reset);
    	}	
    	void safari(){
				System.out.println(o.GREEN+o.bold+o.ITALIC);
		System.out.println("----------------------   Tata Safari   ---------------------------");
        	System.out.println();
        	System.out.println("| Category                   | Specification                                            ");
        	System.out.println("| -------------------------- | -------------------------------------------------------- ");
        	System.out.println("| **Engine Options**         | 2.0L Kryotec Diesel Engine                              ");
        	System.out.println("| **Maximum Power**          | Varies (Refer to the latest specifications)              ");
        	System.out.println("| **Maximum Torque**         | Varies (Refer to the latest specifications)              ");
        	System.out.println("| **Transmission Options**   | 6-speed Manual, 6-speed Automatic                        ");
        	System.out.println("| **Drive Type**             | Front-wheel drive (FWD)                                  ");
        	System.out.println("| **Fuel Efficiency**        | Varies based on engine and transmission options         ");
        	System.out.println("| **Dimensions (Length)**    | Varies based on model year and version                  ");
        	System.out.println("| **Dimensions (Width)**     | Varies based on model year and version                  ");
        	System.out.println("| **Dimensions (Height)**    | Varies based on model year and version                  ");
        	System.out.println("| **Wheelbase**              | Varies based on model year and version                  ");
        	System.out.println("| **Seating Capacity**       | 6/7 (Depending on the variant)                           ");
        	System.out.println("| **Ground Clearance**       | Varies based on model year and version                  ");
        	System.out.println("| **Tyre Size**              | Varies based on model year and version                  ");
        	System.out.println("| **Infotainment System**    | Touchscreen infotainment with Apple CarPlay and Android Auto ");
        	System.out.println("| **Safety Features**        | ABS with EBD, Dual Airbags, ESP, Hill Hold Control, Traction Control, Rear Parking Sensors, etc.");
		System.out.println();
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(tsafari);
        	}
        	else if(sele==2){
            		br.Tata();
        	}
			System.out.println(o.reset);
    	}   
        void seltos(){
				System.out.println(o.GREEN+o.bold+o.ITALIC);
            	System.out.println("-----------------  Kia Seltos  -----------------------");
            	System.out.println();
            	System.out.println("| Category                   | Specification                                     ");
            	System.out.println("| -------------------------- | ------------------------------------------------- ");
            	System.out.println("| **Engine Options**         | 1.5L Petrol, 1.4L Turbo Petrol, 1.5L Diesel       ");
            	System.out.println("| **Maximum Power**          | 1.5L Petrol: Varies, 1.4L Turbo Petrol: Varies, 1.5L Diesel: Varies ");
            	System.out.println("| **Maximum Torque**         | 1.5L Petrol: Varies, 1.4L Turbo Petrol: Varies, 1.5L Diesel: Varies ");
            	System.out.println("| **Transmission Options**   | 6-speed Manual, Intelligent Variable Transmission (IVT), 7-speed DCT (Dual Clutch Transmission) ");
            	System.out.println("| **Drive Type**             | Front-wheel drive (FWD), All-wheel drive (AWD) - Depending on the variant ");
            	System.out.println("| **Fuel Efficiency**        | Varies based on engine and transmission options  ");
            	System.out.println("| **Dimensions (Length)**    | Varies based on model year and version           ");
            	System.out.println("| **Dimensions (Width)**     | Varies based on model year and version           ");
            	System.out.println("| **Dimensions (Height)**    | Varies based on model year and version           ");
            	System.out.println("| **Wheelbase**              | Varies based on model year and version           ");
            	System.out.println("| **Seating Capacity**       | 5                                               ");
            	System.out.println("| **Ground Clearance**       | Varies based on model year and version           ");
            	System.out.println("| **Tyre Size**              | Varies based on model year and version           ");
            	System.out.println("| **Infotainment System**    | Touchscreen infotainment with Apple CarPlay and Android Auto");
            	System.out.println("| **Safety Features**        | ABS with EBD, Dual Airbags, ESP, Hill Assist, Rear Parking Sensors, etc. (Features vary by variant) ");
		System.out.println();
	        System.out.println("Press 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(kseltos);
        	}
        	else if(sele==2){
            		br.kia();
        	}
				System.out.println(o.reset);
        }
        void sonet(){
				System.out.println(o.GREEN+o.bold+o.ITALIC);
            	System.out.println("-----------------------  Kia Sonet  -----------------------------");
            	System.out.println();
            	System.out.println("| Category                   | Specification                                     ");
            	System.out.println("| -------------------------- | ------------------------------------------------- ");
            	System.out.println("| **Engine Options**         | 1.2L Petrol, 1.0L Turbo Petrol, 1.5L Diesel       ");
            	System.out.println("| **Maximum Power**          | 1.2L Petrol: Varies, 1.0L Turbo Petrol: Varies, 1.5L Diesel: Varies ");
           	System.out.println("| **Maximum Torque**         | 1.2L Petrol: Varies, 1.0L Turbo Petrol: Varies, 1.5L Diesel: Varies ");
           	System.out.println("| **Transmission Options**   | 5-speed Manual, 6-speed Manual, 6-speed iMT, 7-speed DCT, 6-speed Automatic ");
           	System.out.println("| **Drive Type**             | Front-wheel drive (FWD) - Depending on the variant ");
            	System.out.println("| **Fuel Efficiency**        | Varies based on engine and transmission options  ");
            	System.out.println("| **Dimensions (Length)**    | Varies based on model year and version           ");
            	System.out.println("| **Dimensions (Width)**     | Varies based on model year and version           ");
           	System.out.println("| **Dimensions (Height)**    | Varies based on model year and version           ");
            	System.out.println("| **Wheelbase**              | Varies based on model year and version           ");
            	System.out.println("| **Seating Capacity**       | 5                                               ");
            	System.out.println("| **Ground Clearance**       | Varies based on model year and version           ");
            	System.out.println("| **Tyre Size**              | Varies based on model year and version           ");
            	System.out.println("| **Infotainment System**    | Touchscreen infotainment with Apple CarPlay and Android Auto ");
            	System.out.println("| **Safety Features**        | ABS with EBD, Dual Airbags, ESP, Hill Assist, Rear Parking Sensors, etc. (Features vary by variant) ");
		System.out.println();
	        System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(ksonet);
        	}
        	else if(sele==2){
            		br.kia();
        	}
				System.out.println(o.reset);
        }
        void amaze(){
				System.out.println(o.GREEN+o.bold+o.ITALIC);
                System.out.println("----------------------  Honda Amaze  ----------------------");
                System.out.println();
                System.out.println("| Category                   | Specification                                     ");
                System.out.println("| -------------------------- | ------------------------------------------------- ");
                System.out.println("| **Engine Options**         | 1.2L Petrol, 1.5L Diesel                           ");
                System.out.println("| **Maximum Power**          | 1.2L Petrol: Varies, 1.5L Diesel: Varies           ");
                System.out.println("| **Maximum Torque**         | 1.2L Petrol: Varies, 1.5L Diesel: Varies           ");
                System.out.println("| **Transmission Options**   | 5-speed Manual, CVT (Continuously Variable Transmission) for Petrol, 5-speed Manual, CVT for Diesel ");
                System.out.println("| **Drive Type**             | Front-wheel drive (FWD)                            ");
                System.out.println("| **Fuel Efficiency**        | Varies based on engine and transmission options  ");
                System.out.println("| **Dimensions (Length)**    | Varies based on model year and version           ");
                System.out.println("| **Dimensions (Width)**     | Varies based on model year and version           ");
                System.out.println("| **Dimensions (Height)**    | Varies based on model year and version           ");
                System.out.println("| **Wheelbase**              | Varies based on model year and version           ");
                System.out.println("| **Seating Capacity**       | 5                                               ");
                System.out.println("| **Ground Clearance**       | Varies based on model year and version           ");
                System.out.println("| **Tyre Size**              | Varies based on model year and version           ");
                System.out.println("| **Infotainment System**    | Touchscreen infotainment with Apple CarPlay and Android Auto ");
                System.out.println("| **Safety Features**        | ABS with EBD, Dual Airbags, Rear Parking Sensors, ACE™ Body Structure, etc. (Features vary by variant) ");
	        System.out.println();
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(hamaze);
        	}
        	else if(sele==2){
            		br.Honda();
        	}
		System.out.println(o.reset);
        }    
        void city(){
		System.out.println(o.GREEN+o.bold+o.ITALIC);
                System.out.println("-------------------------  Honda City  -------------------------");
                System.out.println();
                System.out.println("| Specification               | Details                                 ");
                System.out.println("|-----------------------------|-----------------------------------------");
                System.out.println("| Engine                      | 1.5L SOHC i-VTEC (varies by model)      ");
                System.out.println("| Transmission                | Manual or Automatic (varies by model)   ");
                System.out.println("| Power                       | Varies (e.g., around 118 hp)            ");
                System.out.println("| Torque                      | Varies (e.g., around 107 lb-ft)         ");
                System.out.println("| Fuel Efficiency (City/Hwy)  | Varies (e.g., 28/34 mpg)                ");
                System.out.println("| Wheelbase                   | Varies (e.g., around 106 inches)        ");
                System.out.println("| Length                      | Varies (e.g., around 177 inches)        ");
                System.out.println("| Width                       | Varies (e.g., around 69 inches)         ");
                System.out.println("| Height                      | Varies (e.g., around 58 inches)         ");
                System.out.println("| Curb Weight                 | Varies (e.g., around 2,500 lbs)          ");
                System.out.println("| Seating Capacity            | 5                                      ");
                System.out.println("| Infotainment System         | Touchscreen Display (varies by model)   ");
                System.out.println("| Safety Features             | Airbags, ABS, EBD, Stability Control, etc");
                System.out.println("| Fuel Tank Capacity          | Varies (e.g., around 12.4 gallons)      ");
                System.out.println("| Tires                       | Varies by trim and model                ");
                System.out.println("| Suspension                  | Front: MacPherson Strut, Rear: Torsion Beam ");
                System.out.println("| Brakes                      | Front Disc, Rear Drum (varies by model) ");
	        System.out.println();
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(hcity);
        	}
        	else if(sele==2){
            		br.Honda();
        	}
		System.out.println(o.reset);
        }
        void etron(){
		System.out.println(o.YELLOW+o.bold+o.ITALIC);
                  System.out.println("------------------  Audi e-tron 	--------------------------	");
                System.out.println();
                  System.out.println("| **Category**                  | **Specification**                              	");
                  System.out.println("|-------------------------------|-------------------------------------------------");
                  System.out.println("| **Powertrain**                | Dual electric motors (quattro all-wheel drive) ");
                  System.out.println("| **Total Power Output**        | Varies by model; typically around 355-402 hp   ");
                  System.out.println("| **Torque**                    | Varies by model; typically around 414-490 lb-ft");
                  System.out.println("| **Acceleration (0-60 mph)**   | Varies by model; typically around 5.5 seconds   ");
                  System.out.println("| **Range (EPA-estimated)**     | Varies by model; typically around 200-230 miles");
                  System.out.println("| **Battery Capacity**          | Varies by model; typically around 71-95 kWh    ");
                  System.out.println("| **Charging (DC Fast Charging)*| Up to approximately 80% in 30 minutes (150 kW)");
                  System.out.println("| **Charging (AC Level 2)**     | Varies; around 9-11 hours for a full charge    ");
                  System.out.println("| **Regenerative Braking**      | Adjustable regenerative braking settings      ");
                  System.out.println("| **Cargo Volume**              | Varies by model; typically around 28.5 cubic feet");
                  System.out.println("| **Technology and Features**   |                                                ");
                  System.out.println("| Virtual Cockpit               | Audi MMI Touch Response infotainment system   ");
                  System.out.println("| Virtual Side Mirrors 		| Camera-based side mirrors (in some versions)  ");
                  System.out.println("| Advanced Driver Assistance 	| Adaptive cruise control, lane-keeping assist, etc.");
                  System.out.println("| **Warranty**                  |                                                ");
                  System.out.println("| Battery Warranty              | 8 years or 100,000 miles                       ");
	        System.out.println();
				System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(audietron);
        	}
        	else if(sele==2){
            		pr.Audi();
        	}
        }
        void a4(){
				System.out.println(o.YELLOW+o.bold+o.ITALIC);
                System.out.println("----------------------- Audi A4 ----------------------------	");
                System.out.println();
                  System.out.println("| **Category**              	| **Specification**                                      ");
                  System.out.println("|---------------------------	|--------------------------------------------------------");
                  System.out.println("| **Engine**                	| 2.0-liter turbocharged inline-4                       ");
                  System.out.println("| **Power**                 	| 201 horsepower                                       ");
                  System.out.println("| **Torque**                	| 236 lb-ft                                             ");
                  System.out.println("| **Transmission**         	| 7-speed S tronic dual-clutch automatic transmission  ");
                  System.out.println("| **Drive System**          	| Quattro all-wheel drive                               ");
                  System.out.println("| **Acceleration **	    	| Approximately 6.1 seconds                             ");
                  System.out.println("| **Top Speed**             	| Approximately 130 mph                                 ");
                  System.out.println("| **Fuel Economy  	    	|                                      ");
                  System.out.println("| City                      	| Approximately 24 mpg                                  ");
                  System.out.println("| Highway                   	| Approximately 31 mpg                                  ");
                  System.out.println("| Combined                  	| Approximately 27 mpg                                  ");
                  System.out.println("| **Interior**              	|                                                      ");
                  System.out.println("| Seating Capacity         	| 5 passengers                                         ");
                  System.out.println("| Cargo Volume              	| Approximately 12 cubic feet                           ");
                  System.out.println("| Technology and Features 	|                                                ");
                  System.out.println("| MMI Touch Response 		| Virtual Cockpit (optional)              ");
                  System.out.println("| Android Auto compatibility 	| Audi Pre Sense Basic and City (safety features) ");
                  System.out.println("| **Warranty**              	|                                                      ");
                  System.out.println("| Limited Warranty          	| 4 years or 50,000 miles                               ");
	        System.out.println();
			System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(audi4);
        	}
        	else if(sele==2){
            		pr.Audi();
        	}
	}
        void a6(){
				System.out.println(o.YELLOW+o.bold+o.ITALIC);
              System.out.println("				Audi A6 			");
              System.out.println();
              System.out.println("| **Category**              		| **Specification**                                      ");
              System.out.println("|-------------------------------------	|--------------------------------------------------------");
              System.out.println("| **Engine**                		| 2.0-liter turbocharged inline-4                       ");
              System.out.println("| **Power**                 		| 261 horsepower                                       ");
              System.out.println("| **Torque**                		| 273 lb-ft                                             ");
              System.out.println("| **Transmission**         		| 7-speed S tronic dual-clutch automatic transmission  ");
              System.out.println("| **Drive System**          		| Quattro all-wheel drive                               ");
              System.out.println("| **Acceleration **        		| Approximately 6.1 seconds                             ");
              System.out.println("| **Top Speed**             		| Approximately 130 mph                                 ");
              System.out.println("| **Fuel Economy **        		|                                      ");
              System.out.println("| City                      		| Approximately 23 mpg                                  ");
              System.out.println("| Highway                   		| Approximately 31 mpg                                  ");
              System.out.println("| Combined                  		| Approximately 26 mpg                                  ");
              System.out.println("| **Interior**              		|                                                      ");
              System.out.println("| Seating Capacity          		| 5 passengers                                         ");
              System.out.println("| Cargo Volume              		| Approximately 13.7 cubic feet                         ");
              System.out.println("| **Technology Features**  		|                                                ");
              System.out.println("| MMI Touch Response system 		| Virtual Cockpit (optional)              ");
              System.out.println("| Android Auto compatibility 		| Audi Pre Sense Basic and City (safety features) ");
              System.out.println("| **Warranty**              		|                                                      ");
              System.out.println("| Limited Warranty          		| 4 years or 50,000 miles                               ");
	        System.out.println();
				System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(audi6);
        	}
        	else if(sele==2){
            		pr.Audi();
        	}
        }
        void x6(){
				System.out.println(o.YELLOW+o.bold+o.ITALIC);
              System.out.println("----------------------- BMW X6  -----------------------");
                System.out.println();
              System.out.println("| **Category**                 | **Specification**                              ");
              System.out.println("|------------------------------|----------------------------------------------- ");
              System.out.println("| **Engine Options**           | Varies by model; e.g., 3.0L Turbocharged Inline-6, 4.4L TwinPower Turbo V8  ");
              System.out.println("| **Power Output**             | Varies by engine; e.g., 335 to 523 horsepower   ");
              System.out.println("| **Torque**                   | Varies by engine; e.g., 330 to 553 lb-ft        ");
              System.out.println("| **Transmission**             | 8-speed automatic                              ");
              System.out.println("| **Drive System**             | Rear-wheel drive (sDrive) or all-wheel drive (xDrive)  ");
              System.out.println("| **Acceleration (0-60 mph)**  | Varies by model; e.g., around 4.6 to 6 seconds  ");
              System.out.println("| **Top Speed**                | Varies by model; e.g., around 130 to 155 mph    ");
              System.out.println("| **Fuel Economy ** 	       | Varies by engine and drive configuration      ");
              System.out.println("| **Dimensions**               |                                                ");
              System.out.println("| Length                       | Varies by model; e.g., around 194 to 200 inches  ");
              System.out.println("| Width                        | Varies by model; e.g., around 79 to 79.5 inches  ");
              System.out.println("| Height                       | Varies by model; e.g., around 66 to 67 inches   ");
              System.out.println("| Wheelbase                    | Varies by model; e.g., around 117 to 117.1 inches  ");
              System.out.println("| **Cargo Volume**             | Varies by model; e.g., around 27 to 59.6 cubic feet  ");
              System.out.println("| **Technology and Features**  |                                                ");
              System.out.println("| Infotainment System          | iDrive system with touchscreen display        ");
              System.out.println("| Android Auto compatibility   |        ");
              System.out.println("| Driver Assistance Features   | Adaptive cruise control, lane departure warning, etc.  ");
              System.out.println("| **Warranty**                 |                                                ");
              System.out.println("| Limited Warranty             | 4 years or 50,000 miles (whichever comes first)  ");
	        System.out.println();
			System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(bmw6);
        	}
        	else if(sele==2){
            		pr.Bmw();
        	}
        }
        void x7(){
		System.out.println(o.YELLOW+o.bold+o.ITALIC);
                System.out.println("----------------- BMW X7 ------------------------");
                System.out.println();
                System.out.println("| **Category**                 | **Specification**                             ");
                System.out.println("|------------------------------|-----------------------------------------------");
                System.out.println("| **Engine Options**           | Varies by model; e.g., 3.0L Turbocharged Inline-6, 4.4L TwinPower Turbo V8 ");
                System.out.println("| **Power Output**             | Varies by engine; e.g., 335 to 612 horsepower  ");
                System.out.println("| **Torque**                   | Varies by engine; e.g., 330 to 590 lb-ft       ");
                System.out.println("| **Transmission**             | 8-speed automatic                             ");
                System.out.println("| **Drive System**             | Rear-wheel drive (sDrive) or all-wheel drive (xDrive) ");
                System.out.println("| **Acceleration **  	       | Varies by model; e.g., around 4.5 to 7 seconds  ");
                System.out.println("| **Top Speed**                | Varies by model; e.g., around 130 to 155 mph   ");
                System.out.println("| **Fuel Economy ** 	       | Varies by engine and drive configuration     ");
                System.out.println("| **Dimensions**               |                                               ");
                System.out.println("| Length                       | Varies by model; e.g., around 203 to 203.3 inches ");
                System.out.println("| Width                        | Varies by model; e.g., around 78.7 to 78.9 inches ");
                System.out.println("| Height                       | Varies by model; e.g., around 71.1 to 71.8 inches ");
                System.out.println("| Wheelbase                    | Varies by model; e.g., around 122.2 to 122.9 inches ");
                System.out.println("| **Cargo Volume**             | Varies by model; e.g., around 12.8 to 90.4 cubic feet ");
                System.out.println("| **Technology and Features**  |                                               ");
                System.out.println("| Infotainment System          | iDrive system with touchscreen display       ");
                System.out.println("| Android Auto compatibility   |       ");
                System.out.println("| Driver Assistance Features   | Adaptive cruise control, lane departure warning, etc. ");
                System.out.println("| **Warranty**                 |                                               ");
                System.out.println("| Limited Warranty             | 4 years or 50,000 miles (whichever comes first) ");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(bmw7);
        	}
        	else if(sele==2){
            		pr.Bmw();
        	}
        }

        void xf(){
		System.out.println(o.YELLOW+o.bold+o.ITALIC);
                System.out.println("	--------------------  Jaguar XF  ---------------------------  ");
                System.out.println();
                System.out.println("| **Category**               		| **Specification**                               ");
                System.out.println("|------------------------------------   |-------------------------------------------------");
                System.out.println("| **Engine Options**         		| Varies by model and year; e.g., 2.0L turbocharged inline-4, 3.0L supercharged V6 ");
                System.out.println("| **Power Output**           		| Varies by engine; e.g., from around 247 to 380 horsepower ");
                System.out.println("| **Torque**                 		| Varies by engine; e.g., from around 269 to 332 lb-ft ");
                System.out.println("| **Transmission**           		| 8-speed automatic                             ");
                System.out.println("| **Drive System**           		| Rear-wheel drive (RWD) or all-wheel drive (AWD) ");
                System.out.println("| **Acceleration **			| Varies by model; e.g., around 5.0 to 6.0 seconds ");
                System.out.println("| **Top Speed**              		| Varies by model; e.g., around 120 to 155 mph   ");
                System.out.println("| **Fuel Economy ** 			| Varies by engine and drive configuration     ");
                System.out.println("| **Dimensions**             		|                                                 ");
                System.out.println("| Length                     		| Varies by model and year; e.g., around 195 inches ");
                System.out.println("| Width                      		| Varies by model and year; e.g., around 78 inches  ");
                System.out.println("| Height                     		| Varies by model and year; e.g., around 58 inches  ");
                System.out.println("| Wheelbase                  		| Varies by model and year; e.g., around 116 inches ");
                System.out.println("| **Cargo Volume**           		| Varies by model and year; e.g., around 19 cubic feet ");
                System.out.println("| **Technology and Features**		|                                                 ");
                System.out.println("| InControl Touch Pro system 		| Apple CarPlay and Android Auto compatibility ");
                System.out.println("| Meridian audio system  		|  ");
                System.out.println("| Driver Assistance Features 		| Adaptive cruise control, lane departure warning, etc. ");
                System.out.println("| **Warranty**               		|                                                 ");
                System.out.println("| Limited Warranty           		| Typically 4 years or 50,000 miles (whichever comes first) ");
	        System.out.println();
				System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(jagxf);
        	}
        	else if(sele==2){
            		pr.Jag();
        	}
        }
       void sport(){
		System.out.println(o.YELLOW+o.bold+o.ITALIC);
                System.out.println("---------------------  Range Rover Sport SUV  ----------------------- ");
                System.out.println();
                System.out.println("| **Category**               | **Specification**                               ");
                System.out.println("|----------------------------|-------------------------------------------------");
                System.out.println("| **Engine Options**         | e.g., 3.0L turbocharged inline-6, 3.0L turbocharged inline-6 with mild-hybrid technology ");
                System.out.println("| **Power Output**           | Varies by engine; e.g., from around 355 to 575 horsepower ");
                System.out.println("| **Torque**                 | Varies by engine; e.g., from around 365 to 516 lb-ft ");
                System.out.println("| **Transmission**           | 8-speed automatic                             ");
                System.out.println("| **Drive System**           | Four-wheel drive (4WD)                        ");
                System.out.println("| **Acceleration **          | Varies by model and engine; e.g., around 4.3 to 7.0 seconds ");
                System.out.println("| **Top Speed**              | Varies by model and engine; e.g., around 130 to 176 mph   ");
                System.out.println("| **Fuel Economy **          | Varies by engine and drive configuration     ");
                System.out.println("| **Dimensions**             |                                                 ");
                System.out.println("| Length                     | Varies by model and year; e.g., around 192 inches ");
                System.out.println("| Width                      | Varies by model and year; e.g., around 78.1 inches  ");
                System.out.println("| Height                     | Varies by model and year; e.g., around 71 inches  ");
                System.out.println("| Wheelbase                  | Varies by model and year; e.g., around 115 inches ");
                System.out.println("| **Cargo Volume**           | Varies by model and year; e.g., around 27.5 to 59.5 cubic feet ");
                System.out.println("| **Technology and Features**|                                                 ");
                System.out.println("| Touch Pro Duo system       | Meridian audio system (available in some models) ");
                System.out.println("| InControl Remote & Protect | Navigation system                               ");
                System.out.println("| Driver Assistance Features | Adaptive cruise control, lane-keeping assist, etc. ");
                System.out.println("| **Warranty**               |                                                 ");
                System.out.println("| Limited Warranty           | Typically 4 years or 50,000 miles (whichever comes first) ");
	        System.out.println();
				System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(rangesport);
        	}
        	else if(sele==2){
            		pr.Jag();
        	}
        }
        void benc(){
				System.out.println(o.YELLOW+o.bold+o.ITALIC);
                System.out.println("------------ Mercedes-Benz C-Class  ---------------------- ");
                System.out.println();
                System.out.println("| **Category**               | **Specification**                               ");
                System.out.println("|----------------------------|-------------------------------------------------");
                System.out.println("| **Engine Options**         | Varies by model and year; e.g., 2.0L turbocharged inline-4, 3.0L turbocharged inline-6");
                System.out.println("| **Power Output**           | Varies by engine; e.g., from around 255 to 503 horsepower ");
                System.out.println("| **Torque**                 | Varies by engine; e.g., from around 273 to 516 lb-ft ");
                System.out.println("| **Transmission**           | 9-speed automatic (common in recent models)    ");
                System.out.println("| **Drive System**           | Rear-wheel drive (RWD) or all-wheel drive (4MATIC) ");
                System.out.println("| **Acceleration **          | Varies by model and engine; e.g., around 4.1 to 7.0 seconds ");
                System.out.println("| **Top Speed**              | Varies by model and engine; e.g., around 130 to 155 mph   ");
                System.out.println("| **Fuel Economy **          | Varies by engine and drive configuration     ");
                System.out.println("| **Dimensions**             |                                                 ");
                System.out.println("| Length                     | Varies by model and year; e.g., around 184 inches ");
                System.out.println("| Width                      | Varies by model and year; e.g., around 71.3 inches  ");
                System.out.println("| Height                     | Varies by model and year; e.g., around 56.8 inches  ");
                System.out.println("| Wheelbase                  | Varies by model and year; e.g., around 111.8 inches ");
                System.out.println("| **Cargo Volume**           | Varies by model and year; e.g., around 12.6 to 17.3 cubic feet ");
                System.out.println("| **Technology and Features**|                                                 ");
                System.out.println("| MBUX  infotainment system  | Apple CarPlay and Android Auto compatibility ");
                System.out.println("| Available digital cluster  | Available driver assistance features (adaptive cruise control, lane-keeping assist, etc.) ");
                System.out.println("| **Warranty**               |                                                 ");
                System.out.println("| Limited Warranty           | Typically 4 years or 50,000 miles (whichever comes first) ");
	        System.out.println();
				System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(benzc);
        	}
        	else if(sele==2){
            		pr.Benz();
        	}
        }
        void bene(){
				System.out.println(o.YELLOW+o.bold+o.ITALIC);
                System.out.println("-------------- Mercedes-Benz E-Class -------------------- ");
                System.out.println();
                System.out.println("| **Category**               | **Specification**                                ");
                System.out.println("|----------------------------|--------------------------------------------------");
                System.out.println("| **Engine Options**         | Varies by model and year; e.g., 2.0L turbocharged inline-4, 3.0L turbocharged inline-6, or V8 engine");
                System.out.println("| **Power Output**           | Varies by engine; e.g., from around 255 to 603 horsepower ");
                System.out.println("| **Torque**                 | Varies by engine; e.g., from around 273 to 627 lb-ft ");
                System.out.println("| **Transmission**           | 9-speed automatic (common in recent models)     ");
                System.out.println("| **Drive System**           | Rear-wheel drive (RWD) or all-wheel drive (4MATIC) ");
                System.out.println("| **Acceleration **          | Varies by model and engine; e.g., around 4.3 to 7.5 seconds ");
                System.out.println("| **Top Speed**              | Varies by model and engine; e.g., around 130 to 186 mph   ");
                System.out.println("| **Fuel Economy **          | Varies by engine and drive configuration      ");
                System.out.println("| **Dimensions**             |                                                  ");
                System.out.println("| Length                     | Varies by model and year; e.g., around 193 inches ");
                System.out.println("| Width                      | Varies by model and year; e.g., around 73.2 inches  ");
                System.out.println("| Height                     | Varies by model and year; e.g., around 57.8 inches  ");
                System.out.println("| Wheelbase                  | Varies by model and year; e.g., around 115.7 inches ");
                System.out.println("| **Cargo Volume**           | Varies by model and year; e.g., around 13.1 to 13.9 cubic feet ");
                System.out.println("| **Technology and Features**|                                                  ");
                System.out.println("| MBUX  infotainment system  | Apple CarPlay and Android Auto compatibility  ");
                System.out.println("| Available digital cluster  | Available driver assistance features (adaptive cruise control, lane-keeping assist, etc.) ");
                System.out.println("| **Warranty**               |                                                  ");
                System.out.println("| Limited Warranty           | Typically 4 years or 50,000 miles (whichever comes first) ");
	        System.out.println();
				System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(benze);
        	}
        	else if(sele==2){
            		pr.Benz();
        	}
            }
	void testride(){
		System.out.println("Hello");
	}
	void billing(double amount){
		long l=(long)amount;
		System.out.println(o.WHITE+o.bold+o.BLINK+o.ITALIC);
		System.out.println("\t\t\t\t\t\tYour bill 	   : "+l);
		double gst=(l*0.028);
		double prce=gst+l;
		long sum=(long)prce;
		long price=(long)prce;
		System.out.println("\t\t\t\t\t\tBill with Gst      : "+gst);
		System.out.println("\t\t\t\t\t\tYour total bill    : Rs "+sum);
		System.out.println();
		System.out.println();
		System.out.println("Press 1 for Payments or any key to Exit");
				System.out.println(o.reset);
		char cs=sc.next().charAt(0);
		if(cs=='1'){
			new Cars().payment(price);
		}
	}
}
class bi
{
	static Pbikes pbk=new Pbikes();
	static B_bikes bik=new B_bikes();
	static Color o=new Color();
	void unicorn()
	{
		System.out.println(o.WHITE+o.ITALIC);
		 double unicorn=125238;
		System.out.println();
 		System.out.println("\t------  HONDA UNICORN   -------- ");
		System.out.println();		
		System.out.println("Ex-Showroom Price	: 	Rs 1,25,238 		");
		System.out.println("Color options	\t: 	Pearl Igneous Black, Geny Gray Metallic, Red");
		System.out.println("Fuel economy	\t: 	60 km/l");
		System.out.println("Curb weight		: 	146 kg");
		System.out.println("Displacement	\t: 	149.2 cc");
		System.out.println("Max speed		: 	101 km/h");
		System.out.println("Seat height		: 	798 mm");
	        System.out.println();
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(unicorn);
        	}
        	else if(sele==2){
            		bik.Hond();
        	}
		System.out.println(o.reset);
	}
	void shine()
	{
				System.out.println(o.PURPLE+o.ITALIC);
		double shine=110900;
		System.out.println();
 		System.out.println("\t------  HONDA SHINE    -------- ");
		System.out.println();		
		System.out.println("Ex-Showroom Price	: 	Rs 1,10,900 		");
		System.out.println("Color options	\t: 	Genny Grey Metallic, Decent Blue Metallic, Black Metallic");
		System.out.println("Fuel economy	\t: 	65 km/l");
		System.out.println("Curb weight		: 	146 kg");
		System.out.println("Displacement	\t: 	125 cc");
		System.out.println("Max speed		: 	90 km/h");
		System.out.println("Seat height		: 	798 mm");
		System.out.println("Curb weight		:	99 kg");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(shine);
        	}
        	else if(sele==2){
            		bik.Hond();
        	}	
	}
	void activa()
	{
		System.out.println(o.PURPLE+o.ITALIC);
		double activa=95786;
		System.out.println();
 		System.out.println("\t------  HONDA ACTIVA 6G    -------- ");
		System.out.println();		
		System.out.println("Ex-Showroom Price	: 	 Rs 95,786 		");
		System.out.println("Color options	\t: 	Pearl Siren Blue, Pearl Night Star Black, MORE");
		System.out.println("Fuel economy	\t: 	55 km/l");
		System.out.println("Curb weight		: 	146 kg");
		System.out.println("Displacement	\t: 	110 cc");
		System.out.println("Max speed		: 	85 km/h");
		System.out.println("Seat height		: 	765 mm");
		System.out.println("Curb weight		:	106 to 107 kg");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(activa);
        	}
        	else if(sele==2){
            		bik.Hond();
        	}
	}
    void access(){
		System.out.println(o.PURPLE+o.ITALIC);
	double access=95376;
    	System.out.println("---------  Access 125 CC ---------		");
    	System.out.println();
    	System.out.println("Ex-Showroom Price   : Rs 95,376		");	
    	System.out.println("Fuel economy        : 64 km/l				");
    	System.out.println("Color options       : Metallic Matte Black, Pearl Mirage White, MORE	");
    	System.out.println("Curb weight         : 101 to 104 kg	");
    	System.out.println("Displacement        : 124 cc		");
    	System.out.println("Max speed           : 90 to 92 km/h	");
    	System.out.println("Seat height         : 773 mm		");
	        System.out.println();
				System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(access);
        	}
        	else if(sele==2){
            		bik.suzuki();
        	}
    }
    void gixer(){
		System.out.println(o.PURPLE+o.ITALIC);
	double  gixer=211450;
    	System.out.println("---------- GIXXER SF 250 -------------	");
    	System.out.println();
    	System.out.println("Ex-Showroom Price   : Rs 2.11 lakhs 	");
    	System.out.println("Fuel economy        : 38.5 km/l			");
    	System.out.println("Color options       : Metallic Matte Black, Blue Silver, MORE	");
    	System.out.println("Displacement        : 249 cc		");
    	System.out.println("Curb weight         : 156 to 161 kg	");
    	System.out.println("Fuel tank capacity  : 12 L		");
    	System.out.println("Ground clearance    : 165 mm	");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(gixer);
        	}
        	else if(sele==2){
            		bik.suzuki();
        	}
    }
    void platina(){
			System.out.println(o.PURPLE+o.ITALIC);
	double platina=80525;
        System.out.println("Ex-Showroom Price   : Rs 80,525");
        System.out.println("Fuel economy        : 70 to 100 km/l");
        System.out.println("Color options       : Ebony Black - Blue, Ebony Black - Red, Saffire Blue, MORE");
        System.out.println("Curb weight         : 117 to 123 kg");
        System.out.println("Seat height         : 804 to 807 mm");
        System.out.println("Displacement        : 115 to 115.4 cc");
        System.out.println("Max speed           : 90 km/h");
        System.out.println();
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(platina);
        	}
        	else if(sele==2){
            		bik.bajaj();
        	}
    }
    
    void pulsar(){
		System.out.println(o.PURPLE+o.ITALIC);
	double pulsar=142000;
        System.out.println("-------- pulasr 220f ----------- ");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 1.42 lakhs");
        System.out.println("Fuel economy        : 40 km/l");
        System.out.println("Color options       : Volcanic Red, Sparkle Black, Pearl White, Black Blue, Black & Red, Sapphire Blue, Black Silver");
        System.out.println("Max speed           : 134 km/h");
        System.out.println("Curb weight         : 160 kg");
        System.out.println("Seat height         : 795 mm");
        System.out.println("Displacement        : 220 cc");
        System.out.println();
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(pulsar);
        	}
        	else if(sele==2){
            		bik.bajaj();
        	}
    }
    void star(){
		System.out.println(o.PURPLE+o.ITALIC);
	double star=95249;
        System.out.println("------ Tvs Star City plus --------");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 95,249");
        System.out.println("Fuel economy        :  74 km/l");
        System.out.println("Displacement        : 125 cc");
        System.out.println("Max speed           : 95 km/h");
        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(star);
        	}
        	else if(sele==2){
            		bik.tvs();
        	}
    }
    void xl100(){
		System.out.println(o.PURPLE+o.ITALIC);
	double xl= 80499;
        System.out.println("------ Tvs XL 100 --------");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 80,499");
        System.out.println("Fuel economy        :  60 km/l");
        System.out.println("Displacement        : 99.7 cc");
        System.out.println("Max speed           : 60 to 65 km/h");
        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(xl);
        	}
        	else if(sele==2){
            		bik.tvs();
        	}
    }
	static Scanner sc=new Scanner(System.in);
    void classic(){
		System.out.println(o.PURPLE+o.ITALIC);
	double clas=225000;
        System.out.println("---------- Classic 350 ------------ ");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 2.25 lakhs ");
        System.out.println("Curb weight         : 192 to 195 kg");
        System.out.println("Fuel tank capacity  : 13 to 13.5 L");
        System.out.println("Fuel economy        : 35 to 37 km/l");
        System.out.println("Color options       : Stealth Black, Redditch Red, Redditch Grey, MORE");
        System.out.println("Body style          : Roadster");
        System.out.println("Seat height         : 800 to 805 mm");
	        System.out.println();
		System.out.println(o.reset);	
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(clas);
        	}
        	else if(sele==2){
            		pbk.re();
        	}
    }
    void himalayan(){
		System.out.println(o.PURPLE+o.ITALIC);
	double himalaya=270000;
        System.out.println("--------- Himalayan ------------");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 2.28 lakhs");
        System.out.println("Curb weight         : 194 to 199 kg");
        System.out.println("Color options       : Granite Black, Sleet Black, Rock Red, Gravel Grey, MORE");
        System.out.println("Displacement        : 411 cc");
        System.out.println("Seat height         : 800 mm");
        System.out.println("Fuel tank capacity  : 15 L");
        System.out.println("Fuel economy        : 30 to 33.3 km/l");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(himalaya);
        	}
        	else if(sele==2){
            		pbk.re();
        	}
    }
    void conti(){
		System.out.println(o.PURPLE+o.ITALIC);
	double conti=345000;
        System.out.println("---------- continental GT 650 ---------");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 3.45 lakhs");
        System.out.println("Battery             : 12 V 12 Ah VRLA");
        System.out.println("Body frame design   : Double Cradle Frame");
        System.out.println("Body frame material : Steel");
        System.out.println("Body style          : Roadster");
        System.out.println("Color options       : Rocker Red, Apex Grey, Slipstream Blue, MORE");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(conti);
        	}
        	else if(sele==2){
            		pbk.re();
        	}
    }
    void interceptor(){
		System.out.println(o.PURPLE+o.ITALIC);
	double inter=331000;
        System.out.println("------- Interceptor GT 650 --------");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 3.31 lakhs");
        System.out.println("Battery             : 12 V 12 Ah VRLA");
        System.out.println("Body frame design   : Double Cradle Frame");
        System.out.println("Body frame material : Steel");
        System.out.println("Body style          : Roadster");
        System.out.println("Color options       : Barcelona Blue, Canyon Red, Black Peral, MORE");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(inter);
        	}
        	else if(sele==2){
            		pbk.re();
        	}
    }
    void duke(){
		System.out.println(o.PURPLE+o.ITALIC);
	double duke=240000;
        System.out.println("---------- Duke 250 CC ----------");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 2.4 lakhs");
        System.out.println("Color options       : Dark Galvano, Ceramic White, White, Silver Metallic, Electric Orange, Orange");
        System.out.println("Fuel economy        : 30.8 km/l");
        System.out.println("Curb weight         : 170 kg");
        System.out.println("Displacement        : 248.8 cc");
        System.out.println("Max speed           : 142 km/h");
        System.out.println("Seat height         : 822 to 830 mm");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(duke);
        	}
        	else if(sele==2){
            		pbk.ktm();
        	}
    }
    void rc(){
		System.out.println(o.PURPLE+o.ITALIC);
	double rc=211000;
        System.out.println("-------- KTM RC 200 CC -----------");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 2.11 lakhs");
        System.out.println("Fuel economy        : 35 km/l");
        System.out.println("Color options       : Dark Galvano, Electronic Orange");
        System.out.println("Max speed           : 140 km/h");
        System.out.println("Model               : KTM RC 200");
        System.out.println("Displacement        : 200 cc");
        System.out.println("Seat height         : 820 mm");
        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(rc);
        	}
        	else if(sele==2){
            		pbk.ktm();
        	}
    }
    void speed(){
		System.out.println(o.PURPLE+o.ITALIC);
	double speed=333000;
        System.out.println("-------- Triumph speed 400 --------");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 3.33 lakhs");
        System.out.println("Seat height         : 790 mm");
        System.out.println("Curb weight         : 176 kg");
        System.out.println("Color options       : Carnival Red / Phantom Black, MORE");
        System.out.println("Displacement        : 398.2 cc");
        System.out.println("Fuel tank capacity  : 13 L");
        System.out.println("Wheelbase           : 1.377 m");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(speed);
        	}
        	else if(sele==2){
            		pbk.triumph();
        	}
    }
    void x440(){
		System.out.println(o.PURPLE+o.ITALIC);
	double har=385000;
        System.out.println("--------- Harley - Davidson X440 ------");
        System.out.println();
        System.out.println("Ex-Showroom Price   : Rs 3.8 lakhs");
        System.out.println("Fuel economy        : 35 km/l");
        System.out.println("Curb weight         : 190 kg");
        System.out.println("Seat height         : 850 mm");
        System.out.println("Fuel tank capacity  : 13.5 L");
        System.out.println("Color options       : Denim-Mustard Denim, Vivid-Thick Red, Vivid-Dark Silver, S-Matte Black");
        System.out.println("Displacement        : 440 cc");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(har);
        	}
        	else if(sele==2){
            		pbk.harley();
        	}
    }
	void glamour()
	{
		System.out.println(o.PURPLE+o.ITALIC);
		double glamour=110459;
		System.out.println("------------ Hero Glamour  -------------");
	    	System.out.println();
		System.out.println("Ex-Showroom Price   : Rs 1,10,000");
		System.out.println("Engine Type         : Air cooled 4 stroke Engine ");
		System.out.println("Displacement        : 125cc ");
		System.out.println("Torque              : 10.6Nm @ 6000rpm ");
		System.out.println("FuelCapacity        : 13.4 Liters");
		System.out.println("Color Options       : Fiery Red,Techno Blue (Canvas), Candy Blazing Red, Techno Blue Black, Sports Red Black.");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(glamour);
        	}
        	else if(sele==2){
            		bik.hero();
        	}
	}
	void splender()
	{
		System.out.println(o.PURPLE+o.ITALIC);
		double splender=90568;
		System.out.println("------------ Hero Splendor -------------");
	    	System.out.println();
		System.out.println("Ex-Showroom Price   : Rs 90,568");
		System.out.println("Engine Type         : Air cooled, 4-stroke, single cylinder, OHC Engine ");
		System.out.println("Displacement        : 97.2cc ");
		System.out.println("Torque              : 8.05Nm @ 6000rpm ");
		System.out.println("FuelCapacity        : 9.8 Liters");
		System.out.println("Color Options       : Black Grey Strip,Sports Red Black,Blue Black,Black Red Purple,Force Silver,Black and Accent.");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(splender);
        	}
        	else if(sele==2){
            		bik.hero();
        	}
	}
	void hf()
	{
		System.out.println(o.PURPLE+o.ITALIC);
		double hf=85568;
		System.out.println("------------ HF Deluxe -------------");
	    	System.out.println();
	    	System.out.println("Ex-Showroom Price   : Rs 85,568");
		System.out.println("Engine Type         : Air cooled, 4-stroke, single cylinder, OHC Engine ");
		System.out.println("Displacement        : 97.2cc ");
		System.out.println("Torque              : 8.05Nm @ 6000rpm ");
		System.out.println("FuelCapacity        : 9.6 Liters");
		System.out.println("Color Options       : Sports Red Black, Candy Blazing Red, Black Nexus Blue, Black Grey Stripe, Canvas Black.");
	        System.out.println();
		System.out.println(o.reset);
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
        	int sele=sc.nextInt();
        	if(sele==1){
            		billing(hf);
        	}
        	else if(sele==2){
            		bik.hero();
        	}
	}
	void testride(){
		System.out.println("Hello");
	}
	void billing(double amount){
		long l=(long)amount;
		System.out.println(o.WHITE+o.BLINK+o.ITALIC+o.BOLD);
		System.out.println("\t\t\t\t\t\tYour bill 	   : "+l);
		double gst=(l*0.025);
		double prce=gst+l;
		long sum=(long)prce;
		long price=(long)prce;
		System.out.println("\t\t\t\t\t\tBill with Gst      : "+gst);
		System.out.println("\t\t\t\t\t\tYour total bill    : Rs "+sum);
		System.out.println();
		System.out.println();
		System.out.println("\nPress 1 for payments\npress 2 for Back menu");
		System.out.println(o.reset);
		char cs=sc.next().charAt(0);
		if(cs=='1'){
			new Cars().payment(price);
		}
	}
}
class User
{
    //static A obj=new A();
	static Color o=new Color();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){	
		System.out.println();
		System.out.println();
		System.out.println(o.PURPLE+o.bold+o.BLINK+o.ITALIC);
		System.out.println("\t##   ##   #####    ######   #####   ######            ##   ##   ######  ######    ####     ######  ");
		System.out.println("\t### ###  ##   ##   # ## #  ##   ##  ##   ##           ##   ##   ##      ##   ##  ##  ##    ##      	");
		System.out.println("\t#######  ##   ##     ##    ##   ##  ##   ##           ##   ##   ##      ##   ##  ##        ##      	");
		System.out.println("\t#######  ##   ##     ##    ##   ##  ##  ###           ### ###   #####   ##  ###   #####    #####   ");
		System.out.println("\t## # ##  ##   ##     ##    ##   ##  #####              #####    ##      #####         ##   ##      	");
		System.out.println("\t##   ##  ##   ##     ##    ##   ##  ## ###              ###     ##      ## ###   ##   ##   ##      	");
		System.out.println("\t##   ##   #####      ##     #####   ##  ###              #      ######  ##  ###   #####    ###### 		");
	System.out.println();
	System.out.println();
	System.out.println(o.reset);
	System.out.println(o.cyan+o.bold+o.BLINK+o.ITALIC);
        System.out.println("Enter your Option");
        System.out.println("1.Cars\n2.Bikes");
	 System.out.println(o.reset);
        int n=sc.nextInt();
	System.out.println(o.reset);
        if(n==1){
		Cars obj=new Cars();
            	obj.car();
        }
        else if(n==2){
		Bikes x=new Bikes();
            	x.Bikes();
        }
        else {
		System.out.println(o.RED+o.bold);
            System.out.println("INVALID OPTION\nPress 1 for Re-Enter Your option or any key to exit");
		int main=sc.nextInt();
		 System.out.println(o.reset);
		if(main==1)
		{
			main(null);	
		}
        }
    }
}
