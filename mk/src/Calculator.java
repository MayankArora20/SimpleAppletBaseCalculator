import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Applet implements ActionListener
{
 static String s1=" ";
 static int fcounter=0,sy=0,eq=0;
 static float nn=0,n=0,ans=0;
 static char c='\0';
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bpl,bmin,bdiv,bmul,beql,bclr,bdot;
 TextField t;
 Label l;
 public void init()
 {
     b1=new Button("1");     b2=new Button("2");    b3=new Button("3");     b4=new Button("4");     b5=new Button("5");     b6=new Button("6");     b7=new Button("7");     b8=new Button("8"); 
     b9=new Button("9");    b0=new Button("0");   bpl=new Button("+");    bmin=new Button("-");   bdiv=new Button("/");   bmul=new Button("*");   beql=new Button("=");   bclr=new Button("clr");
     bdot=new Button(".");
     l=new Label("MAYANK Calculator");
     t=new TextField(150);
     setLayout(null);
     resize (500,600);
     add(b1);  add(b2);   add(b3);   add(b4);   add(b5);   add(b6);   add(b7);   add(b8);   add(b9);   add(b0);   add(bpl);   add(bmin);   add(bdiv);   add(bmul);   add(beql);   add(bclr);
     add(bdot);     add(t); add(l);
     t.setBounds(100,50,200,85);
     b1.setBounds(100,150,50,50);      b2.setBounds(150,150,50,50);      b3.setBounds(200,150,50,50);     bpl.setBounds(250,150,50,50);
     b4.setBounds(100,200,50,50);      b5.setBounds(150,200,50,50);      b6.setBounds(200,200,50,50);     bmin.setBounds(250,200,50,50);
     b7.setBounds(100,250,50,50);     b8.setBounds(150,250,50,50);      b9.setBounds(200,250,50,50);    bdiv.setBounds(250,250,50,50);
     bdot.setBounds(100,300,50,50);   b0.setBounds(150,300,50,50);      beql.setBounds(200,300,50,50);    bmul.setBounds(250,300,50,50);
     bclr.setBounds(250,130,50,20);
     l.setBounds(100,130,150,20);
     l.setForeground(Color.blue);
     l.setBackground(Color.red);
     setBackground(Color.black);
     b1.addActionListener(this);    b2.addActionListener(this);     b3.addActionListener(this);     b4.addActionListener(this);     b5.addActionListener(this);     b6.addActionListener(this);
     b7.addActionListener(this);    b8.addActionListener(this);     b9.addActionListener(this);     b0.addActionListener(this);     bpl.addActionListener(this);    bmin.addActionListener(this);
     bdiv.addActionListener(this);    bmul.addActionListener(this);     beql.addActionListener(this);     bclr.addActionListener(this);     bdot.addActionListener(this);
 }
 
 public void actionPerformed(ActionEvent e)
 {
     
    
     if (e.getSource()==b1)
      { 
          s1=s1+"1";
          t.setText(s1);
      }
      if (e.getSource()==b2)
       {
           s1=s1+"2";
             t.setText(s1);
      }
      if (e.getSource()==b3)
       {s1=s1+"3";
             t.setText(s1);
      }
      if (e.getSource()==b4)
       {s1=s1+"4";
             t.setText(s1);
      }
      if (e.getSource()==b5)
       {s1=s1+"5";
             t.setText(s1);
      }
      if (e.getSource()==b6)
       {s1=s1+"6";
             t.setText(s1);
      }
      if (e.getSource()==b7)
       {s1=s1+"7";
             t.setText(s1);
      }
      if (e.getSource()==b8)
       {s1+="8";
             t.setText(s1);
      }
      if (e.getSource()==b9)
       {s1+="9";
             t.setText(s1);
      }
      if (e.getSource()==b0)
       {s1+="0";
             t.setText(s1);
      }
       if (e.getSource()==bdot)
        {s1+=".";
             t.setText(s1);
             fcounter++;
      }
           
      if (e.getSource()==bpl)
       {
           if(eq==1)
             s1=s1.substring(1);
           nn=Float.parseFloat(s1);
           s1+="+";
           t.setText(s1);
           sy=s1.indexOf('+');
           c='+';
       }
       if (e.getSource()==bmin)
       {
           if(eq==1)
             s1=s1.substring(1);
           nn=Float.parseFloat(s1);
           s1+="-";
           t.setText(s1);
           sy=s1.indexOf('-');
           c='-';
           t.setText(s1);
       }
       if (e.getSource()==bdiv)
       {
           if(eq==1)
             s1=s1.substring(1);
           nn=Float.parseFloat(s1);
           s1+="/";
           t.setText(s1);
           sy=s1.indexOf('/');
           c='/';
           t.setText(s1);
       }
       if (e.getSource()==bmul)
       {
           if(eq==1)
             s1=s1.substring(1);
           nn=Float.parseFloat(s1);
           s1+="*";
           t.setText(s1);
           sy=s1.indexOf('*');
           c='*';
           t.setText(s1);
       }
        if(e.getSource()==bclr)
     {
         s1="";
         t.setText(s1);
         nn=n=0;
         eq=0;
         fcounter=0;
     }
       if(e.getSource()==beql)
       {
           if(sy==0)
           {
            n=Float.parseFloat(s1);   
            s1=String.valueOf(n);
            s1="="+s1;
           }
           else
           {
            s1=s1.substring(sy+1);
            n=Float.parseFloat(s1);
            if(c=='+')
            ans=n+nn;
            else
            if(c=='-')
            ans=nn-n;
            else
            if(c=='/')
            ans=nn/n;
            else
            if(c=='*')
            ans=nn*n;
            if (fcounter!=0)
            s1=String.valueOf(ans);
            else
            s1=String.valueOf(ans);
            s1="="+s1;
            }
            t.setText(s1);
            sy=0;
            eq=1;
        }
    }
           
}
