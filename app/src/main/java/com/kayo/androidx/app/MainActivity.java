package com.kayo.androidx.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kayo.androidx.json.XJson;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.v_text).setOnClickListener(v->{
            test();
        });

    }

    private void test(){
        JSONObject jsonObject = new JSONObject();
        JSONObject user = new JSONObject();
        try {
            user.put("name","小明");
            user.put("age",16);
            jsonObject.put("user",user);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        XJson xJson = new XJson(jsonObject.toString());
        xJson.put("test","test");
        System.out.println(xJson.toJson());


    }

    public static class User{
        public String name;
        public int age;

        @Override
        public String toString() {
            return "name:"+name+"  age:"+age;
        }
    }
}
