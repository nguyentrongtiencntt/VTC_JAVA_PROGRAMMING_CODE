package file;

import java.io.File;

//https://gpcoder.com/3001-thao-tac-voi-tap-tin-va-thu-muc-trong-java/

public class AbsoluteRelavativePathExample {
    public static void main(String[] args) {
        // Get Current Directory using getAbsolutePath()
        File file = new File("");
        String currentDirectory = file.getAbsolutePath();
        System.out.println("Current working directory : " + currentDirectory);

        // Get Current Directory using Property user.dir
        String workingDir = System.getProperty("user.dir");
        System.out.println("Current working directory : " + workingDir);
    }
}
