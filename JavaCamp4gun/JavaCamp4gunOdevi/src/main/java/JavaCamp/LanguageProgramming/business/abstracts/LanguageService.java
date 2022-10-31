package JavaCamp.LanguageProgramming.business.abstracts;

import JavaCamp.LanguageProgramming.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    //iş kuralları
    List<Language> getAll();
    void add(Language language) throws Exception;
    Language getId(int languageId);
    void delete(int languageId) throws Exception;
    void getUpdate(int languageId, Language language) throws Exception;



}
