import java.awt.*;
import javax.swing.*;

public class Boxlyt extends Frame
{
    Button buttons[];
    Boxlyt()
    {
        buttons=new Button[5];
        for(int i=0;i<5;i++)
        {
            buttons[i]=new Button("BTN"+(i+1));
            add(buttons[i]);
        }
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String args[])
    {
        Boxlyt ob=new Boxlyt();
    }
            
}
