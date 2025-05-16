 class Display {
    public static void main(String[]args){
        Employee e1 = new Employee("pabasara madhawa","Intern",18,90000);
        Employee e2 = new Employee("jayashantha madhawa","Manager",29,9000000);
        Employee e3 = new Employee("Nimal perera","CEO",39,10000000);

        e1.Find_sal();
        e2.Find_sal();
        e3.Find_sal();

        e1.Display();
        e2.Display();
        e3.Display();
    }
}
