package com.example.t_tazhan.ms.room;
import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileSave {

    private static final String get_data = "/Get_Data";
    public static void saveFile(String str, String X, String Y,String position,String direction) {
       // SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        long l=System.currentTimeMillis();
        String filePath;
        boolean hasSDCard = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
        if (hasSDCard) {
            filePath = Environment.getExternalStorageDirectory().toString()
                    + get_data
                    + File.separator
                    + "信标位置 " +position+"方向为"+direction
//                    + X
//                    + ","
//                    + Y
                    + "_test.txt";
        } else  {
            filePath = Environment.getDownloadCacheDirectory().toString()
                    + get_data
                    + File.separator
                    + "信标位置 " +position+"方向为"+direction
//                    + X
//                    + ","
//                    + Y
                    + "_test.txt";
        }
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                File dir = new File(file.getParent());
                dir.mkdirs();
                file.createNewFile();
            }
            FileOutputStream outStream = new FileOutputStream(file);
            outStream.write(str.getBytes());
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}