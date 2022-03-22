package com.harman.projannotation;

class RBI {
    double getInterestRate(){
        return 7;
    }
}
class SBI extends RBI{
    @Override
    double getInterestRate() {
        return 7.5;
    }
}
class AXIS extends RBI{
    @Override
    double getInterestRate() {
        return 8;
    }
}
class ICICI extends RBI{
    @Override
    double getInterestRate() {
        return 8.5;
    }
}
class Main extends RBI{
    public static void main(String[] args) {
        RBI rbioj = new RBI();
        System.out.print("Interest rate of RBI: ");
        System.out.println(rbioj.getInterestRate());
        SBI sbioj = new SBI();
        System.out.print("Interest rate of SBI: ");
        System.out.println(sbioj.getInterestRate());
        AXIS axisoj = new AXIS();
        System.out.print("Interest rate of Axis: ");
        System.out.println(axisoj.getInterestRate());
        ICICI icicioj = new ICICI();
        System.out.print("Interest rate of ICICI: ");
        System.out.println(icicioj.getInterestRate());
    }
}
