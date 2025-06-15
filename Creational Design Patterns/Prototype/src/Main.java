import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Flyer flyer = new Flyer("FACE","RED","yes");

        Flyer flyer2 = flyer.clone();
        System.out.println(flyer);
    }
}