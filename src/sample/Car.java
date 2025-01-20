package sample;

public class Car {
private int speed;
public static void run() throws Exception{
speed += 10;
if(speed>=120){
    throw new Exception("スピードの出し過ぎです");
}
}
    
}
