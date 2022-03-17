package dto;

public class SingleUserDetails {
    public Data data;
    public Support support;

    public SingleUserDetails() {
    }

    public Data getData() {
        return data;
    }

    public SingleUserDetails setData(Data data) {
        this.data = data;
        return this;
    }

    public Support getSupport() {
        return support;
    }

    public SingleUserDetails setSupport(Support support) {
        this.support = support;
        return this;
    }
}
