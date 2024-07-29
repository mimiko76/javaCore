package Lection_4.HW4;

public enum Gender {
    MEN("Мужчина"), WOMAN("Женщина");

    private final String RussianMaleTitle;

   Gender(String russianMaleTitle){
        this.RussianMaleTitle = russianMaleTitle;
    }
    public String getRussianMaleTitle(){
        return RussianMaleTitle;
    }
    @Override
    public String toString(){
        return  name();
    }
}
