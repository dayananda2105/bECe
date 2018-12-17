package mylearning.bece;

public class lists {
    String pic,exp,namse,spec,post;
    public lists() {
    }

    public lists(String pic, String exp, String namse, String spec, String post) {
        this.pic = pic;
        this.exp = exp;
        this.namse = namse;
        this.spec = spec;
        this.post = post;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getNamse() {
        return namse;
    }

    public void setNamse(String namse) {
        this.namse = namse;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
