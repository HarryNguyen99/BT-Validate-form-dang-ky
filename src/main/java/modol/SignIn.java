package modol;

import javax.validation.constraints.*;

public class SignIn {
    @NotEmpty (message = "Không để trống, độ dài từ 5-45")
    @NotNull
    @Size(min = 5, max = 45)
    private String firstname;

    @NotEmpty (message = "Không để trống, độ dài từ 5-45")
    @NotNull
    @Size(min = 5, max = 45)
    private String lastname;

    @NotEmpty (message = "Không để trống, độ dài từ 10-11, bắt đầu abwngf số 0")
    @NotNull
    @Size(min = 10, max = 11)
    @Pattern(regexp = "(^0[1-9]{1}[0-9]{8,9}$)")
    private String phonnumber;

//    @NotEmpty(message = "Không để trống, tuổi thấp nhất 18")
    @NotNull
    @Min(18)
    private int age;

    @NotEmpty(message = "Không để trống")
    @NotNull
    @Pattern(regexp = "(^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(.[A-Za-z0-9]+)$)")
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonnumber() {
        return phonnumber;
    }

    public void setPhonnumber(String phonnumber) {
        this.phonnumber = phonnumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
