package solid4_i.bad;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClassicExample implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.printf("Clicked at (%d, %d)%n", x, y);
    }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }
}
