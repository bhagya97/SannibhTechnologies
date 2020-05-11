package com.example.lenovo.sannibhtechnologies;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.*;

import javax.net.ssl.HttpsURLConnection;


public class BackgroundActivity extends AsyncTask<String, Void, String> {


    Context ctx;
    public String result;
    //Connection con;
    BackgroundActivity(Context ctx) {

        this.ctx=ctx;
    }

   /* public void onPreExecute(String uname,String psw)
    {   try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sannibhdb", uname, psw);
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    }*/

    @Override
    protected String doInBackground(String... params) {

        String submit_url = "http://localhost//Sannibhdb/register.php";

        try {

                String name = params[0];
                String email = params[1];
                String mobile_no = params[2];
                String message = params[3];
               // String sql="insert into details values(name,email,mobile_no,email)";
               // Statement st=con.createStatement();
               // st.executeUpdate(sql);

                URL url = new URL(submit_url);
                HttpURLConnection hc = (HttpURLConnection) url.openConnection();
                hc.setRequestMethod("POST");
                hc.setDoOutput(true);
                OutputStream OS = hc.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(OS, "UTF-8"));
                String data = URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8") + "&" +
                        URLEncoder.encode("mobile_no", "UTF-8") + "=" + URLEncoder.encode(mobile_no, "UTF-8") + "&"+
                        URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8") + "&" +
                        URLEncoder.encode("message", "UTF-8") + "=" + URLEncoder.encode(message, "UTF-8");

                bw.write(data);
                bw.flush();
                bw.close();
                OS.close();
                InputStream IS = hc.getInputStream();
                IS.close();

            } catch (Exception e) {
                e.printStackTrace();
            }// catch (IOException e) {
             //   e.printStackTrace();
            //}

        return "Submitted Successfully";
       // return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {

        result=result.toString();

        if(result.equals("Submitted Successfully"))
            Toast.makeText(ctx,result, Toast.LENGTH_SHORT).show();

        else
        {
            Toast.makeText(ctx,"Error Occurred",Toast.LENGTH_SHORT).show();
        }

    }



}
