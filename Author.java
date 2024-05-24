public class Author {
    String name;
    String sex;
    String email;

    public Author(String name, String sex, String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
    public String toString(){
        return "Имя автора: " + name + ", пол: " + sex + ", почта: " + email;
    }
}