public class Main {
    public static void main(String[] args) {
        Box<String, Banana> boxBanana = new Box<>("banana", new Banana());
        boxBanana.getObj().printClass();
        Box<String, Apple> boxApple = new Box<>("banana", new Apple());
        boxApple.getObj().printClass();
        Box<String, Fruit> boxFruit = new Box<>("fruit", new Fruit());
        boxFruit.getObj().printClass();
        VegetableBox<String, Cabbage> VegetableBoxCabbage = new VegetableBox<>("cabbage", new Cabbage());
        VegetableBoxCabbage.getObj().printClass();
    }
}