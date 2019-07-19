package com.serialization;

import java.io.*;

public class Data {

    public void intoTextFile(String userName, String password, String emailId) throws IOException {
        UserData userData = new UserData(emailId, userName, password);
        File file = new File("C:\\Users\\User.FULL479-WIN.003\\Downloads\\Database\\"+userName + "Data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(userData);
        objectOutputStream.close();
        fileOutputStream.close();
    }

}
