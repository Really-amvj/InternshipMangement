package com.serialization;



import java.io.*;

public class DataInFile {

    public void intoTextFile(String userName, String password, String emailId) throws IOException {
        UserData userData = new UserData(emailId, userName, password);
        File file = new File(userName + "Data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(userData);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public void display() {
        System.out.println(
                "Yeah its working"
        );
    }
}
