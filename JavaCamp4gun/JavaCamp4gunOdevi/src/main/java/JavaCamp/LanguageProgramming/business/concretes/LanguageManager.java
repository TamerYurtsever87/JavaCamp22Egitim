package JavaCamp.LanguageProgramming.business.concretes;

import JavaCamp.LanguageProgramming.business.abstracts.LanguageService;
import JavaCamp.LanguageProgramming.dataAccess.abstracts.LanguageRepository;
import JavaCamp.LanguageProgramming.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return this.languageRepository.getAll();
    }

    @Override
    public void add(Language language) throws Exception {
        if (ifNameExist(language)){
            throw new Exception("Programlama Dili Zaten Var.");
        }
        if (ifNameEmpty(language)){
            throw new Exception("Programala Dili Boş Geçilemez.");
        }
        if (isIdExist(language.getLanguageId())){
            throw new Exception("Proglama Dili ID'si Yanlış.");
        }
        this.languageRepository.add(language);
    }

    @Override
    public Language getId(int languageId) {
        return languageRepository.getId(languageId);
    }

    @Override
    public void delete(int languageId) throws Exception {
        if (!isIdExist(languageId)){
            throw new Exception("Proglama Dili ID'si Bulunamadı.");
        }
        this.languageRepository.delete(languageId);
    }

    @Override
    public void getUpdate(int languageId, Language language) throws Exception {
        if (ifNameExist(language)){
            throw new Exception("Programlama Dili Zaten Var.");
        }
        if (ifNameEmpty(language)){
            throw new Exception("Programala Dili Boş Geçilemez.");
        }
        if (!isIdExist(languageId)){
            throw new Exception("Proglama Dili ID'si Bulunamadı.");
        }
        this.languageRepository.getUpdate(languageId, language);

    }

    public boolean ifNameExist(Language language){
        for (Language language1 :getAll()) {
            if (language1.getLanguageNaMe().equals(language.getLanguageNaMe())) {
                return true;
            }
        }
        return false;
    }
    public boolean ifNameEmpty(Language language) {
        for (Language language1 : getAll()) {
            if (language1.getLanguageNaMe().isBlank()) {
                return true;
            }
        }
        return false;
    }

    public boolean isIdExist(int languageId){
       for (Language language1:getAll()){
           if (language1.getLanguageId()==languageId){
               return true;
           }
       }return false;
    }
}