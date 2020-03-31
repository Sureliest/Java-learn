package java1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LoginUser {
    private String path;
    private String username;
    private String userpwd;
    private String info[];
    public LoginUser(String filepath){
        this.path=filepath;
    }
    public int  login(String name,String pwd)
    {
        int ss=0;
        try {
            File f = new File(path);
            DataInputStream input = new DataInputStream(new FileInputStream(f));
            BufferedReader bf = new BufferedReader(new InputStreamReader(input));

            String data;
            int i=0;
            Map<String, String> map = new HashMap<String, String>();

            while ((data = bf.readLine()) != null) {
                info = data.split(", ");
                username= info[0];
                userpwd = info[1];
                map.put(username, userpwd);
                i++;
            }
            for (String key : map.keySet()) {
                if(key.equals(name))
                {
                    if(map.get(key).equals(pwd))ss=1;
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return ss;
    }
}
