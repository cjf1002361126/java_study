package basic.syntax.utils;

import java.util.ArrayList;
import java.util.List;

/**
* @description 
* @author  cjf
* @create 2020-12-20 18:34
*/
public class Lists {

    public static List newArrayList(Integer ...str){

        List<Integer> list = new ArrayList<Integer>();
        for(Integer s : str){
            list.add(s);
        }
        return list;
    }

    public static List newArrayList(String ...str){

        List<String> list = new ArrayList<String>();
        for(String s : str){
            list.add(s);
        }
        return list;
    }
}
