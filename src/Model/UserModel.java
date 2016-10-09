package Model;

public class UserModel {

    private int userId;
    private boolean isMale;
    private String name;

    public UserModel(int userId, boolean isMale, String name) {
        this.userId = userId;
        this.isMale = isMale;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
