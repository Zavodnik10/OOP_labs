package lotr;

class Elf extends Character {

    public Elf() {
        hp = 10;
        power = 10;
    }

    public void kick(Character c) {
        if (c.getPower() < power) {
            c.setHp(0);
        } else {
            power--;
        }
    }

    protected void decreasePower() {
        power--;
    }

    @Override
    public String toString() {
        return "Elf{" + "hp=" + hp + ", power=" + power + '}';
    }
}
