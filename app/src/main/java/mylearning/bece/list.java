package mylearning.bece;

public class list {
    String about,text,gal;
    public list(){

    }
    public list(String about, String text, String gal) {
        this.about = about;
        this.text = text;
        this.gal = gal;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGal() {
        return gal;
    }

    public void setGal(String gal) {
        this.gal = gal;
    }
}
