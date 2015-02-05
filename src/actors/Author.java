package actors;

import java.util.Date;

/**
 * Created by andreas on 30.01.15.
 */
public class Author {
    private String fName;
    private String lName;
    private Date birthDate;

    //konstruktør for fornavn og etternavn
    public Author(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    //konstruktør for fornavn, etternavn og fødselsdag
    public Author(String fName, String lName, Date birthDate) {
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
    }

    //setters og getters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
