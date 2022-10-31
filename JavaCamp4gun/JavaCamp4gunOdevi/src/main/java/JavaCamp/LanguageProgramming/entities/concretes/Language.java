package JavaCamp.LanguageProgramming.entities.concretes;

public class Language {
    private int languageId;
    private String languageNaMe;

    public Language() {
    }

    public Language(int languageId, String languageNaMe) {
        this.languageId = languageId;
        this.languageNaMe = languageNaMe;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageNaMe() {
        return languageNaMe;
    }

    public void setLanguageNaMe(String languageNaMe) {
        this.languageNaMe = languageNaMe;
    }
}
