package JavaCamp.LanguageProgramming.webApi;

import JavaCamp.LanguageProgramming.business.abstracts.LanguageService;
import JavaCamp.LanguageProgramming.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getAll")
    public List<Language> getAll(){
        return languageService.getAll();
    }
    @PostMapping("/getAdd")
    public void add(@RequestBody() Language language) throws Exception {
        this.languageService.add(language);
    }
    @GetMapping("/getId")
    public Language getId(@RequestParam int languageId){
        return languageService.getId(languageId);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam int languageId) throws Exception {
       this.languageService.delete(languageId);

    }
    @PutMapping("/getUpdate")
    public void getUpdate(int languageId, Language language) throws Exception {
        this.languageService.getUpdate(languageId, language);
    }
}
