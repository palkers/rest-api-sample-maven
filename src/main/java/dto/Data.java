package dto;


public class Data {
    public int id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;

    public Data() {
    }

    public int getId() {
        return id;
    }

    public Data setId(int id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Data setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirst_name() {
        return first_name;
    }

    public Data setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public Data setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public Data setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
}

