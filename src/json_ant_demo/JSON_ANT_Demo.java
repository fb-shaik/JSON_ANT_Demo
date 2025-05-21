/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package json_ant_demo;

import org.json.JSONObject;

public class JSON_ANT_Demo {

   
    public static void main(String[] args) {
        //Classname Objectname = new ClassName();
        
        JSONObject obj = new JSONObject();
        obj.put("name", "Joe");
        obj.put("age", 30);
        obj.put("city", "Wonderland");
        
        System.out.println(obj.toString(2));  // pretty print with 2 spaces
        
        
        
    }
    
}
