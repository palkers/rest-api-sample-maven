package dto;

public class Support{
    public String url;

    public Support() {
    }

    public String getText() {
        return text;
    }

    public Support setText(String text) {
        this.text = text;
        return this;
    }

    public String text;

    public String getUrl() {
        return url;
    }

    public Support setUrl(String url) {
        this.url = url;
        return this;
    }
}