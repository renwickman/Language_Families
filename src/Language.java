class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String langName, int speakers, String regions, String order){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = order;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args){
        Language spanishLang = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanishLang.getInfo();
        Mayan tzeltal = new Mayan("Tzeltal", 589144);
        tzeltal.getInfo();
    }

}