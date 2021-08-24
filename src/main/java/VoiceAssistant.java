import edu.cmu.sphinx.api.Configuration;

public class VoiceAssistant {
    public static void main(String[] st) {

        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("resources/dictionary.dic");
        config.setLanguageModelPath("resources/model.lm");
    }
}
