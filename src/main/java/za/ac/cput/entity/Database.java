package za.ac.cput.entity;


public class Database
{
    private String emailAddress;
    private String Password;
    private String passwordConfirmation;
    private int grade;
    private String userType;

    //private builder constructor
    private Database(Builder builder) {
        this.emailAddress = builder.emailAddress;
        this.Password = builder.Password;
        this.passwordConfirmation = builder.passwordConfirmation;
        this.grade = builder.grade;
        this.userType = builder.userType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    @Override
    public String toString() {
        return "Database{" +
                "emailAddress='" + emailAddress + '\'' +
                ", Password='" + Password + '\'' +
                ", passwordConfirmation='" + passwordConfirmation + '\'' +
                ", grade=" + grade +
                ", userType='" + userType + '\'' +
                '}';
    }

    public static class Builder {
        private String emailAddress;
        private String Password;
        private String passwordConfirmation;
        private int grade;
        private String userType;


        public Builder setemailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setPassword(String Password) {
            this.Password = Password;
            return this;
        }

        public Builder setpasswordConfirmation(String passwordConfirmation) {
            this.passwordConfirmation = passwordConfirmation;
            return this;
        }

        public Builder setgrade(int grade) {
            this.grade = grade;
            return this;
        }

        public Builder setuserType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder copy(Database d) {
            this.emailAddress = d.emailAddress;
            this.Password = d.Password;
            this.passwordConfirmation = d.passwordConfirmation;
            this.grade = d.grade;
            this.userType = d.userType;

            return this;
        }

        public Database build() {
            return new Database(this);
        }

        
    }
}
