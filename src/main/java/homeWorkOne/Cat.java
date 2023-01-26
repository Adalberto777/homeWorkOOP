package homeWorkOne;

public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void sayMay(String command){
        if (command.equals(this.getName())){
            System.out.println("May");
        }
        else System.out.println("Pss");
    }
}
