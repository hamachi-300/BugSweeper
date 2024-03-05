import java.awt.Font;

import javax.swing.JFrame;

abstract class PopUpWindow extends JFrame{
    
    protected final int color1R = 44;
    protected final int color1G = 51;
    protected final int color1B = 51;
    protected final int color2R = 57;
    protected final int color2G = 91;
    protected final int color2B = 100;
    protected final int color3R = 165;
    protected final int color3G = 201;
    protected final int color3B = 202;
    protected final int color4R = 231;
    protected final int color4G = 246;
    protected final int color4B = 242;

    protected final Font bigFont = new Font("Monospaced", Font.BOLD, 18);
    protected final Font mediumFont = new Font("Monospaced", Font.BOLD, 12);
    protected final Font smallFont = new Font("Monospaced", Font.PLAIN, 12);

    public PopUpWindow(){
        setSize(300, 400);
        setLocationRelativeTo(null);
    }

    abstract public void setLabel(PopUpWindow window);
}
