package Animals;

public class Eagle implements IAnimal {
    @Override
    public String getName() {
        return "Eagle";
    }

    @Override
    public String makeNoise() {
        return "IIIIIIII";
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
