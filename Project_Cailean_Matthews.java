import java.util.Scanner;

public class Project_Cailean_Matthews {
      static int  policyNumber;
      static String providerName;
      static String patientFirstName;
      static String patientLastName;
      static int patientAge;
      static String patientSmokeStatus;
      static int patientHeight;
      static double patientWeight;

   public static void main(String[]args) {
      
      Scanner scnr = new Scanner(System.in); 
      
      Policy policy;
      System.out.print("Please Enter the Policy Number: ");
      policyNumber = scnr.nextInt();
      System.out.print("Please Enter the Provider Name: ");
      providerName = scnr.nextLine();
      System.out.print("Please Enter the Policyholder's First Name: ");
      patientFirstName = scnr.nextLine();
      System.out.print("Please Enter the Policyholder's Last Name: ");
      patientLastName = scnr.nextLine();
      System.out.print("Please Enter the Policyholder's Age: ");
      patientAge = scnr.nextInt();
      System.out.print("Please Enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      patientSmokeStatus = scnr.nextLine();
      System.out.print("Please Enter the Policyholder's Height (in inches): ");
      patientHeight = scnr.nextInt();
      System.out.print("Please Enter the Policyholder's Weight (in pounds): ");
      patientWeight = scnr.nextDouble();
      
      System.out.println();
      
      
      policy = new Policy(policyNumber, providerName, patientFirstName, patientLastName, patientAge, patientSmokeStatus, patientHeight, patientWeight);
      policy.setFee();
      
      System.out.println("Policy Number: " + policy.getPolicyNum());
      System.out.println("Provider Name: " + policy.getProvName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age : " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokeStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight());
      System.out.println("Policyholder's Weight: " + policy.getWeight());
      System.out.println("Policyholder's BMI: " + policy.getBMI());
      System.out.println("Policyholder's Price: $%.2f.%n" + policy.getTotalPrice());
   }   
}