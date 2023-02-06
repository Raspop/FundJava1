
class WritingMaterials {
    public String name;
    public String color;
    public int price;
    public double length;
    public boolean draw;

    public WritingMaterials() {

    }

    public void display() {
        System.out.println("Название: " + name + " Цвет: " + color + " Длина: " + length + " Цена: " + price + " Умеет рисовать:" + (draw ? "Да" : "Нет"));
    }

    public void replace_rod(String s) {
        color = s;
    }

    public void priceUp(int a) {
        price = price + a;
    }

    public void priceDown(int a) {
        price = price - a;
    }

    public void draw() {
        System.out.println(draw ? getName() + " провёл линий: 1. Их цвет - " + getColor() : getName() + " не может ничего нарисовать...");
    }

    public void draw(int a) {
        System.out.println(draw ? getName() + " провёл линий: " + a + ". Их цвет - " + getColor() : getName() + " не может ничего нарисовать...");
    }

    public void draw(String color) {
        System.out.println(draw ? getName() + " провёл линий: 1. Их цвет - " + color : getName() + " не может ничего нарисовать...");
    }

    public void draw(String color, int n) {
        System.out.println(draw ? getName() + " провёл линий: " + n + ". Их цвет - " + color : getName() + " не может ничего нарисовать...");
    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.price = price;
        color = "No Color";
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.draw = draw;
        color = "No Color";
        name = "No Name";
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
}

class Pen extends WritingMaterials {
    public int countColor;
    public boolean auto;
    Pen(){
        super("Ручка", null, 145, 45.9, true);
    }
    public void writeMyName() {
        System.out.println(getName());
    }

    @Override
    public void display() {
        System.out.println("This is " + getClass());
        super.display();
        System.out.println("Количество цветов этой ручки " + getCountColor() + " Автоматическая? " + (isAuto()? "ДА": "Нет"));
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public int getCountColor() {
        return countColor;
    }

    public boolean isAuto() {
        return auto;
    }
}

class Ruler extends WritingMaterials{
    public double length;
    public boolean wood;

    public void measure(){
        System.out.println("Сейчас померяем длину");
    }

       public Ruler(){
        super("Линейка", null, 145, 45.9, true);
    }
    public void setLength(int length) {
        this.length = length;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public double getLength() {
        return length;
    }

    public boolean isWood() {
        return wood;
    }
    @Override
    public void display() {
        System.out.println("This is " + getClass());
        super.display();
        System.out.println("Длина линейки " + getLength() + " Из дерева? " + (wood? "Да": "Нет"));
    }
}

class Divider extends WritingMaterials{
    public String dividerType;
    public boolean metal;
    Divider(){
        super("Циркуль", null, 145, 45.9, true);
    }
    public void  draw_circle(){
        System.out.println("Нарисован круг");
    }

    @Override
    public void display() {
        System.out.println("This is " + getClass());
        super.display();
        System.out.println("тип циркуля " + getDividerType() + " Из металла? " + (metal? "Да": "Нет"));
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public boolean isMetal() {
        return metal;
    }
}
class Main{
    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("Паркер");
        p.setCountColor(2);
        p.setAuto(false);
        p.display();
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.setLength(25);
        r.setWood(true);
        r.display();
        System.out.println(r.isWood());
        r.measure();

        Divider d = new Divider();
        d.setName("Циркуль");
        d.setDividerType("С карандашом");
        d.setMetal(true);
        d.display();
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.draw_circle();
    }
}