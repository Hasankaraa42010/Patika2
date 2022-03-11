package Fabrika;

public class Employee {
    String name;
    double salary;
    byte workHours;
    int hireYear;
    double bonus;
    double vergi;

    double raiseSalary;

    public Employee(String name, double salary, byte workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void tax(){
        if (this.salary<1000){
            System.out.println("Maaş 1000 tlden az vergi uygulanmaycak.");
            vergi=0;
        }
        else if (this.salary>1000){
            vergi=this.salary*3/100;

        }
        bonus();
    }
    void bonus(){
        if (this.workHours>40){
             bonus=(workHours-40)*30;
        }
        else{
            bonus=0;
        }
        raiseSalary();
    }
    void raiseSalary(){
        int year=2021-this.hireYear;
        if (year<10){
            raiseSalary  = salary*0.05;


        }
        else if (this.hireYear>9 && this.hireYear<0){
            raiseSalary=  salary*0.1;
        }
        else{
            raiseSalary=salary*0.15;
        }
       //  newsalary=(this.salary)-(this.vergi)+(this.maasArtması)+this.bonus;
        toString();
    }
   public String toString(){
       System.out.println("Adı"+":"+this.name);
       System.out.println("Maaşı"+":"+this.salary);
       System.out.println("Çalışma saati"+":"+this.workHours);
       System.out.println("Başlangıc yılı"+":"+this.hireYear);
       System.out.println("Vergi"+":"+this.vergi);
       System.out.println("bonus"+":"+this.bonus);
       System.out.println("Maas artması"+":"+(raiseSalary+bonus-vergi));
       System.out.println("Toplam maaş:"+(salary+raiseSalary+bonus-vergi));
        return this.name;
    }
}
