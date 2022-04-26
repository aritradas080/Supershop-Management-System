package classes;

public class Employees {
   private String name;
   private String id;
   private int Salary;
   private String Emp_Father_name;
   private String Emp_mother_name;
   private String Dob;
   private String joindate;
   private String Par_address;
   private String Pre_Address;
   private String email;
   private String phone;
   private String Maritial_Status;
   

     

     public Employees(String name, String id, int salary, String emp_Father_name, String emp_mother_name, String dob, String joindate, String par_address, String pre_Address, String email, String phone,String Marital_Status) {
               this.name = name;
               this.id = id;
              this.Salary = salary;
              this.Emp_Father_name = emp_Father_name;
              this.Emp_mother_name = emp_mother_name;
              this.Dob = dob;
              this.joindate = joindate;
              this.Par_address = par_address;
              this.Pre_Address = pre_Address;
              this.email = email;
              this.phone = phone;
              this.Maritial_Status =Marital_Status;
     }
     public void Employeeinfo(){
         System.out.println("Employee Name                     : "+name);
         System.out.println("Employee Id                       : "+id);
         System.out.println("Employee Salary                   : "+Salary+" Tk /-Month");
         System.out.println("Employee's Father's Name          : "+Emp_Father_name);
         System.out.println("Employee's Mother's Name          : "+Emp_mother_name);
         System.out.println("Date of Birth                     :"+Dob);
         System.out.println("Employee's Joining Date           :"+joindate);
         System.out.println("Employee's Parmanent Address      : "+Par_address);
         System.out.println("Employee's Present Address        : "+Pre_Address);
         System.out.println("Employee's E-mail Address         :"+email);
         System.out.println("Employee's Phone Number           :"+phone);
         System.out.println("Maritial Status of the employee   : "+Maritial_Status);
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public int getSalary() {
         return Salary;
     }

     public void setSalary(int salary) {
         Salary = salary;
     }

     public String getEmp_Father_name() {
         return Emp_Father_name;
     }

     public void setEmp_Father_name(String emp_Father_name) {
         Emp_Father_name = emp_Father_name;
     }

     public String getEmp_mother_name() {
         return Emp_mother_name;
     }

     public void setEmp_mother_name(String emp_mother_name) {
         Emp_mother_name = emp_mother_name;
     }

     public String getDob() {
         return Dob;
     }

     public void setDob(String dob) {
         Dob = dob;
     }

     public String getJoindate() {
         return joindate;
     }

     public void setJoindate(String joindate) {
         this.joindate = joindate;
     }

     public String getPar_address() {
         return Par_address;
     }

     public void setPar_address(String par_address) {
         Par_address = par_address;
     }

     public String getPre_Address() {
         return Pre_Address;
     }

     public void setPre_Address(String pre_Address) {
         Pre_Address = pre_Address;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getPhone() {
         return phone;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }

     public String getMaritial_Status() {
         return Maritial_Status;
     }

     public void setMaritial_Status(String maritial_Status) {
         Maritial_Status = maritial_Status;
     }
    }

     

    
     

    

   
    
    
    

    

  
    
    

   
       

   
    
    

