package Droid;

public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;

    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;


    }
    public void energyReport(){
        System.out.println(batteryLevel);
    }
    public void energyTransfer(Droid a, Droid b){
        int temp=0;
       temp= a.batteryLevel;
        a.batteryLevel=b.batteryLevel;
        b.batteryLevel=temp;
        System.out.println(a.batteryLevel +" " +b.batteryLevel);
    }
    public String toString() {
        return String.format("Hello,I`m the droid: %s", name);
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        Droid codey2 = new Droid("Codey2");
        System.out.println(codey);
        System.out.println(codey2);
        codey.performTask("dancing");
        codey2.performTask("singing");
        codey2.performTask("playing");
        codey.energyReport();
        codey2.energyReport();
        codey.energyTransfer(codey,codey2);
        System.out.println(codey.batteryLevel);

    }
}
