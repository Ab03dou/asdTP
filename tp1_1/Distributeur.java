public class Distributeur {
        private int choix;
   
    public Boisson selection(int choix){
        setChoix(choix);
        if(choix == 1){
         return new Boisson("Café", 50); }
        else if (choix == 2){
         return new Boisson("Thé", 40); }
        else {
         return new Boisson("Lait", 30); }
    }

     public int getChoix() {
        return choix;
    }

    public void setChoix(int choix) {
        this.choix = choix;
    }

    public int monnaie(int dinars){
        /*money -> lzm n7sbu money li ymdhum utilisateur w n9su mnhum prix ta3 wch chra*/
        if(getprix() >= dinars){
            return 0;
        }else {
            return dinars- .getprix();
        }
    }

   
}


