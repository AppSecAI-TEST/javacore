package com.kitcenter.app.classwork.Lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class ReadFile {
    String currentDir = System.getProperty("user.dir");

    public String readFile(String relativeToProject) throws IOException{
        String line;
        String path = createAbsolutePath(currentDir, relativeToProject);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        if ((line = bufferedReader.readLine()) != null){
            bufferedReader.close();
        }else{
            line = "";
        }
        return line;
    }

    public String readFileFromResources(String resourcesFileName) throws IOException{
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(getPath(resourcesFileName)));
        if ((line = bufferedReader.readLine()) != null){
            bufferedReader.close();
        }else{
            line = "";
        }
        return line;
    }

    public String createAbsolutePath(String project, String relativeToProject){
        File file = new File(project, relativeToProject);
        return file.getAbsolutePath();
    }

    private String getPath(String fileName){
        String path = null;
        URL url = ReadFile.class.getClassLoader().getResource(fileName);
        if(url != null){
            path = url.getPath();
        }else{
            System.out.println("Not found resource");
        }
        return path;
    }
}

