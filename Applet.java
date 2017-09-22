import java.awt.*;
import java.applet.*;
public class first extends Applet
{
public void paint(Graphics g)
{
g.drawRect(80,80,20,40);
g.setColor(Color.RED);
g.drawOval(40,40,100,200);
g.fillOval(68,81,10,20);
g.setColor(Color.BLUE);
g.fillArc(120,130,22,10,20,30);
}
} 
/*
<html>
<body >
<applet code=first.java width=400 height=300 ></applet>
</body>
</html>
*/
