package classes;

public class Manager {
    public String name;
    public int age;
    public String id;
    public String dob;
    public String email;
    public String phnnumber;
    public String fname;
    public String mname;
    public String preAddress;
    public String parAddress;
    public String maritialsatus;
    public int salary;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhnnumber() {
        return phnnumber;
    }

    public void setPhnnumber(String phnnumber) {
        this.phnnumber = phnnumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getPreAddress() {
        return preAddress;
    }

    public void setPreAddress(String preAddress) {
        this.preAddress = preAddress;
    }

    public String getParAddress() {
        return parAddress;
    }

    public void setParAddress(String parAddress) {
        this.parAddress = parAddress;
    }

    public String getMaritialsatus() {
        return maritialsatus;
    }

    public void setMaritialsatus(String maritialsatus) {
        this.maritialsatus = maritialsatus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

            
    
    
    
    public Manager(String name, int age, String id, String dob, String email, String phnnumber, String fname, String mname, String preAddress, String parAddress, String maritialsatus, int salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.dob = dob;
        this.email = email;
        this.phnnumber = phnnumber;
        this.fname = fname;
        this.mname = mname;
        this.preAddress = preAddress;
        this.parAddress = parAddress;
        this.maritialsatus = maritialsatus;
        this.salary = salary;
    }

    public void managerinfo(){
        System.out.println("Name                : "+name);
        System.out.println("Age                 : "+age);
        System.out.println("ID                  : "+id);
        System.out.println("Date of Birth       : "+dob);
        System.out.println("Email               : "+email);
        System.out.println("Phone number        : "+phnnumber);
        System.out.println("Father's Name       : "+fname);
        System.out.println("Mother's Name       : "+mname);
        System.out.println("Present Address     : "+preAddress);
        System.out.println("Permanent Address   : "+parAddress);
        System.out.println("Maritial status     : "+maritialsatus);
        System.out.println("Salary              : "+salary+" Tk /-Month");
    }
}
    

  
   
  
   
        
    


   


    

    
    


