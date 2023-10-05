package lotr;

class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    public void kick(Character c) {
        if (c.power < this.power) {
            c.setHp(0);
        } else {
            c.decreasePower();
        }
    }

    private void decreasePower() {
        power--;
    }

    @Override
    public String toString() {
        return "Elf{" + "hp=" + hp + ", power=" + power + '}';
    }
}