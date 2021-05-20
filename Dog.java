public class Dog extends Animal {

    public Dog(String voice, String eat) {
        super(voice, eat);
    }

    public void voice(String voice){
        System.out.println("haf "+getVoice());
    }
    public void eat(String eat){
        System.out.println("utel "+ getEat());
    }
}
