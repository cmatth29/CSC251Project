import java.util.Scanner;

public class Project_Cailean_Matthews {
   public static void main(String[]args) {
      int  policyNumber;
      String providerName;
      String patientFirstName;
      String patientLastName;
      int patientAge;
      String patientSmokeStatus;
      int patientHeight;
      double patientWeight;
      Policy policy;
      
      Scanner scnr = new Scanner(System.in); 
      
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



   public class Policy {
      private int  policyNum;
      private String provName;
      private String firstName;
      private String lastName;
      private int age;
      private String smokeStatus;
      private int height;
      private double weight;
      private double BMI;
      private double fee;
      private double totalPrice;
      
      
      public Policy() {
         policyNum = 0;
         provName = "Unknown";
         firstName = "---";
         lastName = "---";
         age = 0;
         smokeStatus = "non-smoker";
         height = 0;
         weight = 0;
         fee = 0;
         totalPrice = 600.00;
      }
      
      public Policy(int policyNumber, String providerName, String patientFirstName, String patientLastName,
      int patientAge, String patientSmokeStatus, int patientHeight, double patientWeight){
         policyNum = policyNumber;
         provName = providerName;
         firstName = patientFirstName;
         lastName = patientLastName;
         age = patientAge;
         smokeStatus = patientSmokeStatus;
         height = patientHeight;
         weight = patientWeight;
      }
      
      public int getPolicyNum() {
         return policyNum;
      }
      
      public String getProvName() {
         return provName;
      }
      
      public String getFirstName() {
         return firstName;
      }
      
      public String getLastName() {
         return lastName;
      }
      
      public int getAge() {
         return age;
      }
      
      public String getSmokeStatus() {
         return smokeStatus;
      }
      
      public int getHeight() {
         return height;
      }
      
      public double getWeight() {
         return weight;
      }
      
      public void setBMI() {
         BMI = (weight * 703)/(height * height);
      }
      
      public double getBMI() {
         return BMI;
      }
      
      public void setFee() {
         fee = (BMI - 35) * 20;
      }
      
      public double getFee(){
         return fee;
      }
      
      public void setTotalPrice() {
         if (age >= 50) {
            totalPrice = totalPrice + 75;
         }
         if  (smokeStatus == "smoker") {
            totalPrice = totalPrice + 100;
         }
         if (BMI >= 35) {
            totalPrice = totalPrice = fee;
         }
      }
      
      public double getTotalPrice() {
         return totalPrice;
      }
      
      
   }
   
}