
package database;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class NumberFilter 
{
    private boolean dot = false;
    public NumberFilter(KeyEvent evt,JTextField text)
    {
        char vChar = evt.getKeyChar();
        if (text.getText().equals(""))
            dot = false;
        if (dot == false){
            if (vChar == '.') dot = true;
            else 
                if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) 
                {
                    evt.consume();
                }
        }
        else 
        {
            if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) 
            {
                evt.consume();
            }
        }
    }
}
