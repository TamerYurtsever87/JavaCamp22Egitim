package JavaCamp.LanguageProgramming.dataAccess.abstracts;

import JavaCamp.LanguageProgramming.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {

    List<Language> getAll();
    void add(Language language) throws Exception;
    void getUpdate(int languageId, Language language);
    Language delete(int languageId);
    Language getId(int languageId);

}
