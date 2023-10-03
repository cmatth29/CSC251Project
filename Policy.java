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
      private int smokerNum = 0;
      private int nonSmokerNum = 0;
      
      
      // Basic constructor if the user inputs no values
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
      
      // Constructor
      public Policy(int policyNumber, String providerName, String patientFirstName, String patientLastName,
      int patientAge, String patientSmokeStatus, int patientHeight, double patientWeight){
         
         policyNum = policyNumber;
         provName = providerName;
         firstName = patientFirstName;
         lastName = patientLastName;
         age = patientAge;
         smokeStatus = patientSmokeStatus;
         if (smokeStatus.equals("smoker")){
            smokerNum = 1;
         } else {
            nonSmokerNum = 1;
         }
         
         height = patientHeight;
         weight = patientWeight;
      }
      
      // The following 8 methods are getters
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
      
      public int getSmokerNum() {
         return smokerNum;
      }
      
      public int getNonSmokerNum() {
         return nonSmokerNum;
      }
      
      // setter and getter for BMI
      public void setBMI() {
         BMI = 730 * ((getWeight())/(getHeight() * getHeight()));
      }
      
      public double getBMI() {
         return BMI;
      }
      
      //setter and getter for the fee
      public void setFee() {
            fee = (getBMI() - 35) * 20;
      }
      
      public double getFee(){
         return fee;
      }
      
      //And lastly, the setter and getter for the total price
      public void setTotalPrice() {
         if (getAge() > 50) {
            totalPrice = totalPrice + 75;
         }
         if  (smokeStatus.equals("smoker")) {
            totalPrice = totalPrice + 100;
         }
         if (getBMI() > 35) {
            totalPrice = totalPrice + fee;
         }
      }
      
      public double getTotalPrice() {
         return totalPrice;
      }
      
      
   }
