package JavaCamp.LanguageProgramming.dataAccess.concretes;

import JavaCamp.LanguageProgramming.dataAccess.abstracts.LanguageRepository;
import JavaCamp.LanguageProgramming.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;

    @Autowired
    public InMemoryLanguageRepository() {
        languages=new ArrayList<>();
        languages.add(new Language(1,"C#"));
        languages.add(new Language(2,"Java"));
        languages.add(new Language(3,"Pyhton"));

    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void add(Language language){
        languages.add(language);
    }

    @Override
    public void getUpdate(int languageId, Language language){
        for(Language language1:languages){
            if(language1.getLanguageId()==languageId){
                language1.setLanguageNaMe(language.getLanguageNaMe());
            }
        }
    }

    @Override
    public Language delete(int languageId) {
        languages.removeIf(item-> item.getLanguageId()==languageId);
        return null;
    }

    @Override
    public Language getId(int languageId) {
        for (Language language1:languages){
            if (language1.getLanguageId()==languageId){
                return language1;
            }
        }
        return null;
    }
}
