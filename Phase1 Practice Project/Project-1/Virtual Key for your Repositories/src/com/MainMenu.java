package com;

import java.util.Scanner;

public class MainMenu {
	Scanner scan = new Scanner(System.in);
	MenuOptions objy = new MenuOptions();
		
	public static final String path = "C:\\Users\\hp\\OneDrive\\Documents\\Software";
	
	public  void displayScreen() {
		System.out.println();
		System.out.println("\n**************************************\n");
        System.out.println("\t       WELCOME  \n");
        System.out.println("\t     LockedMe.com  \n");
        System.out.println("\tDeveloper :- Kshitiz Gupta \n");
        System.out.println("**************************************");
	}
	
	public  void exitScreen() {
		System.out.println();
		System.out.println("\n**************************************\n");
        System.out.println("\t       Thank You \n");
        System.out.println("**************************************");
	}
	
	public void MenuOptions() {
		System.out.println("\n");
		System.out.println("---------------------------------------");
		System.out.println("            MAIN MENU              ");
		System.out.println("---------------------------------------");
		System.out.println(" Select any one of the following:  ");
	    System.out.println("   	1 - Show All Files              ");
	    System.out.println("   	2 - More Options                ");
	    System.out.println("   	3 - Exit                        ");
	    System.out.println("---------------------------------------");
	    System.out.println("Enter your choice : ");
	    menulist();  
	}
	
	public void MoreOptions() {
		System.out.println("\n");
		System.out.println("---------------------------------------");
		System.out.println("            More Options              ");
		System.out.println("---------------------------------------");
		System.out.println(" Select any one of the following: ");
	    System.out.println("   	1 - Add a file                ");
	    System.out.println("   	2 - Delete a file             ");
	    System.out.println("	3 - Search a file             ");
	    System.out.println("  	4 - Go Back                   ");
	    System.out.println("---------------------------------------");
	}
	
	public void menulist() {
		int choice = scan.nextInt();
		
		if(choice>0 & choice<4) {
			if(choice == 1) {
				System.out.println();
				try {
					objy.listAllFiles(MainMenu.path);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println("\n***********************************\n");
				MenuOptions();
			}
			else if(choice == 2) {
				MoreOptions();
				submenulist();
				
			}
			else if(choice == 3) {
				exitScreen();
			}
		}
		else {
			System.out.println("Wrong Input");
			System.out.println("Try Again !!!");
			MenuOptions();
		}
	}
	
	public void submenulist() {
		String file;
		String fileName;
		System.out.println("Enter your choice : ");
		
		int options = scan.nextInt();
		if(options>0 & options<5) {
			if(options == 1) {
				System.out.println("\n==> Adding a File...");
				System.out.println("Please enter a file name : ");
				file = scan.next();
				fileName = file.trim();
				try {
					objy.createNewFile(MainMenu.path, fileName);
				}catch(NullPointerException e) {
					System.out.println(e.getMessage());
				}catch(Exception e) {
					System.out.println("Error occurred while adding file..");
					System.out.println("Please try again...");
				}
				System.out.println("\n**********************************\n");
				MoreOptions();
				submenulist();
			}
			else if(options == 2) {
				System.out.println("\n==> Deleting a File...");
				System.out.println("Please enter a file name to Delete : ");
				file = scan.next();
				fileName = file.trim();
				try {
					objy.deleteFile(MainMenu.path, fileName);
				}catch(NullPointerException e) {
					System.out.println(e.getMessage());
				}catch(Exception e) {
					System.out.println("Error occurred while Deleting File..");
					System.out.println("Please try again...");
				}
				System.out.println("\n***********************************\n");
				MoreOptions();
				submenulist();
			}
			else if(options == 3) {
				System.out.println("\n==> Searching a File...");
				System.out.println("Please enter a file name to Search : ");
				file = scan.next();
				fileName = file.trim();
				try {
					objy.searchFile(MainMenu.path, fileName);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println("\n***********************************\n");
				MoreOptions();
				submenulist();
			}
			else if(options == 4) {
				MenuOptions();
				menulist();
			}
		}
		else {
			System.out.println("Wrong Input");
			System.out.println("Try Again !!! ");
			MoreOptions();
		}
	}
	
	public static void main(String[] args) {
		MainMenu obj = new MainMenu();	
		obj.displayScreen();
		obj.MenuOptions();
		obj.menulist();
		obj.submenulist();
	}

}
