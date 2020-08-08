package com.example.janinodemo.controller;

import org.apache.tomcat.util.log.SystemLogHandler;
import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/edit")
@RestController
public class JaninoCodeEditController {
    @PostMapping("/cookCodes")
    public Map<String, Object> giveHimCodes(String codes,String codes2, HttpServletResponse response, HttpServletRequest request) {
        Map<String, Object> resultMap = new HashMap<>();
        int[] arr = {11,22,3,34,15,9,86,7,7,55,475,8,49};
        Arrays.sort(arr);
        int [] goodResult = arr;
        String goodResultStr = "";
        Arrays.equals(arr,goodResult);
        for(int i=0;i<goodResult.length;i++){
            goodResultStr += goodResult[i]+ " ";
        }
        if (StringUtils.isEmpty(codes)) {
            return null;
        } else {
            try {
                ServletOutputStream outputStream = response.getOutputStream();
                PrintStream printStream = new PrintStream("print.txt");
                System.setOut(new SystemLogHandler(printStream));
                ScriptEvaluator scriptEvaluator = new ScriptEvaluator();
                codes = codes+codes2;
                codes=codes+"int[] arr = {11,22,3,34,15,9,86,7,7,55,475,8,49};";
                codes=codes+"int[] arr2 = {3,7, 7, 8 ,9 ,11, 15 ,22, 34, 49, 55 ,86, 475};";
                codes=codes+"int[] result = sortArr(arr);";
//                codes=codes+"System.out.println(\"实际返回:\"+result);";
//                System.out.println("期望返回:"+"{3,7, 7, 8 ,9 ,11, 15 ,22, 34, 49, 55 ,86, 475}");
                codes=codes+"boolean isEquals = testEquals(result,arr2);";

                codes=codes+"System.out.println(\"testEquals测试结果\"+isEquals);";
                scriptEvaluator.cook(codes);
//                scriptEvaluator.cook(codes2);

                Object evaluate = scriptEvaluator.evaluate(new Object[0]);
                FileReader fileReader = new FileReader("print.txt");
                BufferedReader br = new BufferedReader(fileReader);
                StringBuilder sb = new StringBuilder();
                String temp = "";

                while ((temp = br.readLine()) != null) {
                    // 拼接换行符
                    sb.append(temp + "</br>");
                }
                br.close();
//                Assert.assertArrayEquals(goodResult,re );
                String js = sb.toString();
                resultMap.put("success", 1);
                resultMap.put("evaluate", evaluate);
                resultMap.put("print", js);
            } catch (CompileException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
                resultMap.put("success", -1);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }
        return resultMap;
    }




    public static String readFileContent(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        StringBuffer sbf = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempStr;
            while ((tempStr = reader.readLine()) != null) {
                sbf.append(tempStr);
            }
            reader.close();
            return sbf.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return sbf.toString();
    }

    public static void clearInfoForFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
