package javabean;

public class StuAnswer {
    int ID;
    String Type;
    String answer;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAnswer() {
        return answer;
    }

    public StuAnswer(int ID, String type, String answer) {
        this.ID = ID;
        Type = type;
        this.answer = answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
