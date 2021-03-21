import javax.swing.*;  
class Menuex  
{  
          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5;  
          Menuex()
          {  
          JFrame f= new JFrame("MenuBar");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("File");  
          submenu=new JMenu("Font");  
          i1=new JMenuItem("New");  
          i2=new JMenuItem("Save");  
          i3=new JMenuItem("Save as");  
          i4=new JMenuItem("Ariel");  
          i5=new JMenuItem("Calibory");  
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(i4); submenu.add(i5);  
          menu.add(submenu);  
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new Menuex();  
}
}  
