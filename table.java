import javax.swing.*;    
public class Tableex {    
    JFrame f;    
    Tableex(){    
    f=new JFrame();    
    String data[][]={ {"100","TISHA","IT"},    
                          {"101","PARIDHI","IT"},    
                          {"101","TANISHA","IT"}};    
    String column[]={"ID","NAME","BRANCH"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new Tableex();    
}    
}  
