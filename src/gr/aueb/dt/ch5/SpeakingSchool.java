package gr.aueb.dt.ch5;

public class SpeakingSchool {

    private final Cat cat = new Cat();

    public SpeakingSchool() {
    }

    public void learnToSpeak(ISpeakable speakable){
        cat.speak();
    }
}
