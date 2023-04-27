package tasks.Core4Files;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;

public class UserInfo implements Externalizable {
    private String firstName;
    private String secondName;
    private String pass;

    public UserInfo() {
    }
    public UserInfo(String firstName, String secondName, String pass) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.pass = pass;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPass() {
        return pass;
    }

    private String encryptedString (String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    private String decryptedString (String str) {
        return Arrays.toString(Base64.getDecoder().decode(str));
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.encryptedString(getFirstName()));
        out.writeObject(this.encryptedString(getSecondName()));
        out.writeObject(this.encryptedString(getPass()));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = this.decryptedString((String) in.readObject());
        secondName = this.decryptedString((String) in.readObject());
        pass = this.decryptedString((String) in.readObject());
    }
}

class Main2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("BoratData.dat"));
        objectOutputStream.writeObject(new UserInfo("Borat", "Sagdyev", "Sokol"));

        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("BoratData.dat"));
        UserInfo userInfo2 = (UserInfo) objectInputStream.readObject();
    }
}