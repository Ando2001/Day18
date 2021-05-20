public class Animal  {
   protected String voice;
   protected String eat;

   public Animal(String voice,String eat){
       this.eat=eat;
       this.voice=voice;
   }
   public String getVoice(){
       return voice;
   }
   public String getEat(){
       return eat;
   }
    public void eat() {
        System.out.println("nyam-nyam " + this.eat);
    }

    public void voice() {
        System.out.println("haf haf " + this.voice);
    }

}
