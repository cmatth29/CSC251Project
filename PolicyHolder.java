public class PolicyHolder {

   public PolicyHolder() {
         firstName = "---";
         lastName = "---";
         age = 0;
         smokeStatus = "non-smoker";
         height = 0;
         weight = 0;
   }

   public PolicyHolder(String firstName, String lastName, int age, String smokeStatus, int height, int weight) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.smokeStatus = smokeStatus;
         this.height = height;
         this.weight = weight;
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

   public String toString() { 
      polHolString = "Policyholder's First Name: " + policy.getFirstName() + "Policyholder's Last Name: " + policy.getLastName()"Policyholder's Age : " + policy.getAge() + "Policyholder's Smoking Status: " + policy.getSmokeStatus());"Policyholder's Height: " + policy.getHeight() + "Policyholder's Weight: " + policy.getWeight();
   }




}