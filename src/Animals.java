class Animals {
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.setArea("На юге");
        b.setWinterFly(false);
        b.display();
        b.chirick_chirick();

        Fish f = new Fish();
        f.setName("Сельдь");
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        f.display();
        f.bul_bul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.setWingCount(4);
        i.setLikeJesus(true);
        i.display();
        i.ggggg();
    }
}

class Animal {
    private String type, name;
    private int age;
    private double weight;
    private boolean isSwim, isWalk, isFly;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public boolean isFly() {
        return isFly;
    }

    public void display() {
        System.out.println("Тип:" + type +
                ", Имя:" + name +
                ", Возраст:" + age +
                ", Вес:" + Math.round(weight * 100) / 100.0 +
                ", Умеет летать:" + (isFly ? "Да" : "Нет") +
                ", Умеет ходить:" + (isWalk ? "Да" : "Нет") +
                ", Умеет плавать:" + (isSwim ? "Да." : "Нет."));

    }

    public void holiday() {
        weight += 0.1;
    }

    public void holiday(double m) {
        weight += m;
    }

    public void holiday(double m, int n) {
        weight -= (m * n);
    }
}

class Bird extends Animal {
    public String getArea() {
        return area;
    }

    @Override
    public void display() {
        System.out.println("I am: " + this.getClass().getName() +
                ", Имя:" + getName() +
                ", Зона обитания: " + getArea() +
                ", Возраст:" + getAge() +
                ", Вес:" + Math.round(getWeight() * 100) / 100.0 +
                ", Умеет летать:" + (isFly() ? "Да" : "Нет") +
                ", Умеет ходить:" + (isWalk() ? "Да" : "Нет") +
                ", Умеет плавать:" + (isSwim() ? "Да." : "Нет.") +
                ", Улетает зимовать на югах:" + (isSwim() ? "Да." : "Нет."));
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    private String area;
    private boolean winterFly;

    public Bird() {
        super("Птица", null, 0, 0, false, false, true);
    }

    static void chirick_chirick() {
        System.out.println("Chirik-Chirik");
    }
}

class Fish extends Animal {
    private String squama;
    private boolean upStreamSwim;

    @Override
    public void display() {
        System.out.println("I am:" + this.getClass().getName() +
                ", Имя:" + getName() +
                ", Тип чешуи: " + getSquama() +
                ", Возраст:" + getAge() +
                ", Вес:" + Math.round(getWeight() * 100) / 100.0 +
                ", Умеет летать:" + (isFly() ? "Да" : "Нет") +
                ", Умеет ходить:" + (isWalk() ? "Да" : "Нет") +
                ", Умеет плавать:" + (isSwim() ? "Да." : "Нет.") +
                ", Умеет ли плавать против течения:" + (isUpStreamSwim() ? "Да." : "Нет."));
    }

    public Fish() {
        super("Рыба", null, 0, 0, true, false, false);
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public void bul_bul() {
        System.out.println("Bul_bul");
    }
}

class Insect extends Animal {
    private int wingCount;
    private boolean likeJesus;

    @Override
    public void display() {
        System.out.println("I am:" + this.getClass().getName() +
                ", Имя:" + getName() +
                ", Количество крыльев: " + getWingCount() +
                ", Возраст:" + getAge() +
                ", Вес:" + Math.round(getWeight() * 100) / 100.0 +
                ", Умеет летать:" + (isFly() ? "Да" : "Нет") +
                ", Умеет ходить:" + (isWalk() ? "Да" : "Нет") +
                ", Умеет плавать:" + (isSwim() ? "Да." : "Нет.") +
                ", Умеет ли ходить по воде:" + (isLikeJesus() ? "Да." : "Нет."));
    }

    public Insect() {
        super("Насекомое", null, 0, 0, false, true, false);
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public void ggggg() {
        System.out.println("Ggggg");
    }
}