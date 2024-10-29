class SinoTibetan extends Language {

    SinoTibetan(String langName, int speakers){
        super(langName, speakers, "Asia", "subject-object-verb");
        if(langName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }

    public static void main(String[] args){
        SinoTibetan Xin = new SinoTibetan("Chinese", 1350000000);
        SinoTibetan Burmese = new SinoTibetan("Burmese", 33000000);
        Xin.getInfo();
        Burmese.getInfo();
    }

}