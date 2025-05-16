class Employee{
    public String name;
    public String job_title;
    public int age;
    public double basicsal;
    public double netsal;

    public Employee(String name,String job_title,int age, double basicsal ){
        this.name = name;
        this.job_title = job_title;
        this.age = age;
        this.basicsal= basicsal;
        this.netsal = 0;

    }
    public void Find_sal(){
        double taxrate;

        if(basicsal>300000){
             taxrate = 0.36;
        } else if (basicsal>200000) {
            taxrate = 0.20;

        } else if (basicsal>100000) {
            taxrate = 0.10;
        }
        else{
            taxrate = 0.00;
        }
        double tax_amount = basicsal*taxrate;
        netsal = basicsal - tax_amount;

    }
    public void Display(){
        System.out.println("your name is " +name);
        System.out.println("Your job title is " +job_title);
        System.out.println("Your age is " +age);
        System.out.println("Your basic salary is " +basicsal);
        System.out.println("Your net salary is " +netsal);
        System.out.println("--------------------------------------------");
    }

}

