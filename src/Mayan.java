class Mayan extends Language {

    Mayan(String langName, int speakers){
        super(langName, speakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args){
        Mayan kiche = new Mayan("Ki'che'", 2330000);
        kiche.getInfo();
    }


}