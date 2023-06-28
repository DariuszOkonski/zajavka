package zajavka.week_06.day27;

public abstract class Car implements Hornable{
    private String company;
    private String model;
    private String color;
    private String[] additionalEquipment;

    public Car(String company, String model, String color, String... additionalEquipment) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.additionalEquipment = additionalEquipment;
        method2();
    }

    private void method2() {
        System.out.println("example");
    }

    protected abstract String openDoors();
    protected abstract String openTrunk();

    protected String sayHello(String company, String model, String color) {
        return String.format("Hello my name is %s %s. I'm %s", company, model, color);
    }

    public int countAdditionalEquipmentElements() {
        return this.additionalEquipment.length;
    }

    public String getAdditionalEquipment() {
        StringBuilder sb = new StringBuilder("Equipment: ");
        for (String s : additionalEquipment) {
            sb.append(s).append(", ");
        }
        return sb.toString();
    }

    public void greetings() {
        System.out.println(sayHello(company, model, color));
        System.out.println(horn());
        System.out.println(openDoors());
        System.out.println(openTrunk());
    }
}