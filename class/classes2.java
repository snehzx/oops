public class classes2 {
    public static void main(String[] args) {
        class human{
            int age;
            String name;
            int salary;
            static int population;
            human(int age,String name,int salary){
                this.age = age;
                this.name = name;
                this.salary = salary;
                human.population+=1;
            }
        }
        human xyz = new human(22,"xyz",15000);
        human pqr = new human(30,"pqr",20000);
        // System.out.println(human.population);
        System.out.println(xyz.age);
        System.out.println(xyz.name);
        System.out.println(xyz.salary);
        System.out.println(pqr.age);
        System.out.println(human.population);
        //convention is to write class name with static variable , this will also work but this refers to current obj and population is static (class level)
        //this->it checks if it exists in the xyz , if not check in class human and if it is static print it
        // something which is not static , belongs to an object 
        // static methods are resolved during compile time

        //  System.out.println(xyz); 
        // > X wrong method
    }
}
/*22
xyz
15000
30
2 */