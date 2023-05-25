package week_02.day6.animal;

public class Cat {
    public String leftLegFront = "LLF";
    public String rightLegFront = "RLF";
    public String leftLegBack = "LLB";
    public String rightLegBack = "RLB";
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String gimmeVoice() {
        return  "meow!!!";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

