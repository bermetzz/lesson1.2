public class Main {
    public static void main(String[] args){
        String[] commands={"сидеть", "лежать"};
        Shelter shelter= new Shelter("Romashka", "Chuy 1");
        Dog dog=new Dog("Rex", "Ovcharka", commands, shelter, ColorEnum.BROWN);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("гув гув");
        dog.makeVoice("гив гив");
        System.out.println("------------------------");
        Shelter shelter1=new Shelter("Cvetochek", "Chuy 2");
        Dog dog1=new Dog("Bobik", "Ovcharka", shelter1, ColorEnum.GRAY);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("гув гув");
        dog1.makeVoice("гив гив");

        Dog dog2=new Dog();
        System.out.println(dog2.getInfo());
    }
}
