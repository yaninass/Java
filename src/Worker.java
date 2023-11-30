import java.util.Scanner;

public class Worker{
    private String surname;
    private int experience;
    private double hourPay;
    private double quantityHour;
    public Worker(String surname,int experience,double hourPay,double quantityHour){
        this.surname=surname;
        this.experience=experience;
        this.hourPay=hourPay;
        this.quantityHour=quantityHour;
    }

    public Worker() {
    }


    public double calculate(){
        double Pay=hourPay*quantityHour;
        double prize;
        if(experience<1)
             prize=0;
        else if(experience>=1 && experience<3)
            prize=hourPay*quantityHour*0.05;
        else if(experience>=3&&experience<5)
            prize=hourPay*quantityHour*0.08;
        else
            prize=hourPay*quantityHour*0.15;
        double totalPay=prize+Pay;
        return totalPay;
    }
    public void inputDate(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите фамилию сотруника: ");
        surname=scanner.next();
        System.out.println("Введите стаж работы: ");
        experience=scanner.nextInt();
        System.out.println("Введите почасовую оплату: ");
        hourPay=scanner.nextDouble();
        System.out.println("Введите количество отработанных смен");
        quantityHour=scanner.nextDouble();
    }
    public void printDate(){
        System.out.println("Фамилия: "+surname);
        System.out.println("Опыт работы: "+experience);
        System.out.println("Почасовая оплата: "+hourPay);
        System.out.println("Количество отработаных часов: "+quantityHour);
        System.out.println("Заработная плата: "+calculate());
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
while(true){
    System.out.println("Введите:\n1 - чтобы рассчитать выплату и вывести информацию\n2 - для выхода");
    int choice;
    choice=scanner.nextInt();
    if(choice==1){
        Worker worker=new Worker();
        worker.inputDate();
        worker.printDate();
    } else if (choice==2) {
        System.out.println("Выход из программы");
        break;
    }
    else {
        System.out.println("Введите корректное значение");
    }
}
    }
}

