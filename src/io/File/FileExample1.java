package io.File;

import java.io.File;
import java.io.IOException;

public class FileExample1 {

    //Java file example



    public static void main(String[] args) throws IOException {

        //getting all the files in the d directory
        File file = new File("C:\\Users\\User");
        String[] filenames = file.list();
        assert filenames != null;
        for(String files: filenames) {
            System.out.println(files);
        }
    }
}


