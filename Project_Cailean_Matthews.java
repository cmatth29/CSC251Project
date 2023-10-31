import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Project_Cailean_Matthews {
      static int  policyNumber;
      static String providerName;
      static String patientFirstName;
      static String patientLastName;
      static int patientAge;
      static String patientSmokeStatus;
      static int patientHeight;
      static double patientWeight;
      static int i = 0;
      static int finalSmokerNum = 0;
      static int finalNonSmokerNum = 0;
      static int policyAmt = 0;

   public static void main(String[]args) throws IOException {
      
      Scanner scnr = new Scanner(System.in); 
      ArrayList<Object> policies = new ArrayList<Object>();
      BufferedReader objReader = new BufferedReader(new FileReader("C://Users//spoon//OneDrive//Documents//GitHubRepositories//CSC251Project//PolicyInformation.txt"));
      
      Policy policy;
      
      for (i = 0; i < 6; ++i) {
         policyNumber = Integer.valueOf(objReader.readLine());
         providerName = objReader.readLine();
         patientFirstName = objReader.readLine();
         patientLastName = objReader.readLine();
         patientAge = Integer.valueOf(objReader.readLine());
         patientSmokeStatus = objReader.readLine();
         patientHeight = Integer.valueOf(objReader.readLine());
         patientWeight = Integer.valueOf(objReader.readLine());
         objReader.readLine();
         
         policy = new Policy(policyNumber, providerName, patientFirstName, patientLastName, patientAge, patientSmokeStatus, patientHeight, patientWeight);
         policy.setFee();
      
         policies.add(policy);
         policyAmt++;
         finalSmokerNum = finalSmokerNum + policy.getSmokerNum();
         finalNonSmokerNum = finalNonSmokerNum + policy.getNonSmokerNum();
         policy.setBMI();
         policy.setTotalPrice();
         
         System.out.println("Policy Number: " + policy.getPolicyNum());
         System.out.println("Provider Name: " + policy.getProvName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age : " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokeStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight());
         System.out.println("Policyholder's Weight: " + policy.getWeight());
         System.out.println("Policyholder's BMI: " + policy.getBMI());
         System.out.format("Policyholder's Price: %.2f", policy.getTotalPrice());
         System.out.println();
      }

      System.out.println("The number of policies with a smoker is: " + finalSmokerNum);
      System.out.println("\nThe number of policies with a non-smoker is: " + finalNonSmokerNum);
   }   
}