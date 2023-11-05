package org.example.services_example;
import org.example.interface_example.camel_route_inter_sample;
public class implement_example implements camel_route_inter_sample{
    public String hello(){
        return "Hello from Interface implementation!";
    }

    public int age(){
        return 10;
    }

    public String hello(String input_str){
        return input_str;
    }

    public boolean entry(){
        return true;
    }
}
