class TeamMember {
    protected String name;
    
    public TeamMember(String name) {
        this.name = name;
    }
}

interface BonusEligible {
    void calculateBonus();
}

class Employee extends TeamMember implements BonusEligible {
    
    public Employee(String name) {
        super(name);
    }
    
    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus for " + name);
        

    }
}

class Contractor extends TeamMember {
    
    public Contractor(String name) {
        super(name);
    }
    
    public void work() {
        System.out.println(name + "is working as a contractor. ");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Alice");
        Contractor c = new Contractor("Bob");
        
        e.calculateBonus();
        c.work();
    }
}
