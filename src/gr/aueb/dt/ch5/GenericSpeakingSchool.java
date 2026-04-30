package gr.aueb.dt.ch5;

public class GenericSpeakingSchool {

    private final ISpeakable speakable;


    // dependacny injection
    //
    public GenericSpeakingSchool(ISpeakable speakable) {
        this.speakable = speakable;
    }


    public void speak(){
        speakable.speak();
    }
}
