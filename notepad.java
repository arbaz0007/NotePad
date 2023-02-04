import java.awt.*;
import javax.swing.*;
class notepad
{
JFrame f;
JTextArea ta;
JMenuBar mb;
JMenu m1,m2,m3,m4,m5;
JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17,mi18,mi19,mi20,mi21,mi22;
notepad()
{
f= new JFrame("Untitled-Notepad");
ta=new JTextArea();
mb=new JMenuBar();
m1=new JMenu("File");
m2=new JMenu("Edit");
m3=new JMenu("View");
m4=new JMenu("Color");
m5=new JMenu("Zoom");
mi1=new JMenuItem("New");
mi2=new JMenuItem("New Window");
mi3=new JMenuItem("Open");
mi4=new JMenuItem("Save");
mi5=new JMenuItem("Save as");
mi6=new JMenuItem("Page Setup");
mi7=new JMenuItem("Page");
mi8=new JMenuItem("Exit");
mi9=new JMenuItem("Undo");
mi10=new JMenuItem("Cut");
mi11=new JMenuItem("Copy");
mi12=new JMenuItem("Paste");
mi13=new JMenuItem("Find");
mi14=new JMenuItem("Select All");
mi15=new JMenuItem("Zoom");
mi16=new JMenuItem("Status bar");
mi17=new JMenuItem("Word wrap");
mi18=new JMenuItem("Font Color");
mi19=new JMenuItem("back Color");

mi21=new JMenuItem("Zoom in");
mi22=new JMenuItem("Zoom out");

m4.add(mi18);
m4.add(mi19);

m1.add(mi1);
m1.add(mi2);
m1.add(mi3);
m1.add(mi4);
m1.add(mi5);
m1.addSeparator();
m1.add(mi6);
m1.add(mi7);
m1.addSeparator();
m1.add(mi8);

m2.add(mi9);
m2.addSeparator();
m2.add(mi10);
m2.add(mi11);
m2.add(mi12);
m2.addSeparator();
m2.add(mi13);
m2.add(m4);

m3.add(mi14);
m3.add(mi15);
m3.add(mi16);
m3.add(mi17);

m3.add(m5);
m5.add(mi21);
m5.add(mi22);

mb.add(m1);
mb.add(m2);
mb.add(m3);
f.setJMenuBar(mb);
JScrollPane p= new JScrollPane(ta);
f.add(p);
f.setVisible(true);
}
public static void main(String ar[])
{
notepad n=new notepad();
}
}










