package secantmethod;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SecantMethod extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    JButton clear, cancel, equal, plus, minus, times, divide, dot,  button;
    JButton multi, expo, sin, cos, tan, log, rad, ln, log10, xx, bracket1, bracket2;
    JTextField guess1t, guess2t, error, dplace;
    JTextField dp = new JTextField(10);
    DecimalFormat df = new DecimalFormat();
    JTextArea area;
    JFrame frame;
    String str = "",strcalc="";
    int count1 = 0,count = 0, ii,iminus=0;
    boolean trvalue=true;
//this constructor used for displaying GUI
    SecantMethod() {

        super("Calculator For SECANT Method");

        area = new JTextArea(2, 20);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(new Font("Monospaced", 1, 20));
        area.setBorder(new TitledBorder("enter equation"));
        area.setEditable(false);
        
        guess1t = new JTextField(10);
        guess2t = new JTextField(10);
        error = new JTextField(10);
        dplace = new JTextField(10);

        JPanel p2 = new JPanel(new GridLayout(4, 2, 5, 5));
           JPanel p22 = new JPanel(new BorderLayout());
           
        p2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));

        p2.add(new JLabel("Xo"));
        p2.add(guess1t);
        p2.add(new JLabel("X1"));
        p2.add(guess2t);
        p2.add(new JLabel("Tolerable error"));
        p2.add(error);
        p2.add(new JLabel("D.places"));
        p2.add(dp);
        
p22.add(p2,BorderLayout.WEST);
        JPanel p3 = new JPanel(new GridLayout(2, 1));
        p3.setBorder(new LineBorder(Color.BLACK, 1));

        JScrollPane pane = new JScrollPane(area);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        minus = new JButton("-");
        plus = new JButton("+");
        times = new JButton("*");
        divide = new JButton("/");
        dot = new JButton(".");
        cancel = new JButton("DEL");
        clear = new JButton("C");
        equal = new JButton("=");
        xx = new JButton("x");
        multi = new JButton("^");

        sin = new JButton("Sin");
        cos = new JButton("Cos");
        tan = new JButton("Tan");
        log = new JButton("Log");

        rad = new JButton("_/rad");
        log10 = new JButton("Log10");
        ln = new JButton("LN");
        expo = new JButton("ex");
        bracket1 = new JButton("(");
        bracket2 = new JButton(")");

        JPanel bracket = new JPanel(new GridLayout(1, 2));
        bracket.add(bracket1);
        bracket.add(bracket2);

        equal.setFont(new Font("Monospaced", 1, 30));
        dot.setFont(new Font("Monospaced", 1, 30));
        clear.setFont(new Font("plain", 1, 30));
        cancel.setFont(new Font("plain", 1, 15));
        cancel.setBackground(Color.LIGHT_GRAY);
        clear.setBackground(Color.LIGHT_GRAY);

        JPanel p1 = new JPanel(new GridLayout(7, 4));
        p1.setBorder(new LineBorder(Color.BLACK, 2));

         equal.setBackground(Color.DARK_GRAY);
         equal.setForeground(Color.WHITE);
        equal.setFont(new Font("Monospaced", 1, 30));
        dot.setBackground(Color.DARK_GRAY);
        dot.setForeground(Color.WHITE);
        dot.setFont(new Font("Monospaced", 1, 30));
        clear.setFont(new Font("plain", 1, 30));
        cancel.setFont(new Font("plain", 1, 15));
        cancel.setBackground(Color.LIGHT_GRAY);
        clear.setBackground(Color.LIGHT_GRAY);
 
        rad.setBackground(Color.DARK_GRAY);
        rad.setForeground(Color.WHITE);
        rad.setFont(new Font("plain", 1, 15));
        tan.setBackground(Color.DARK_GRAY);
        tan.setForeground(Color.WHITE);
        tan.setFont(new Font("plain", 1, 15));
        cos.setBackground(Color.DARK_GRAY);
        cos.setForeground(Color.WHITE);
        cos.setFont(new Font("plain", 1, 15)); 
        sin.setBackground(Color.DARK_GRAY);
        sin.setForeground(Color.WHITE);
        sin.setFont(new Font("plain", 1, 15)); 
        expo.setBackground(Color.DARK_GRAY);
        expo.setForeground(Color.WHITE);
        expo.setFont(new Font("plain", 1, 15)); 
        ln.setBackground(Color.DARK_GRAY);
        ln.setForeground(Color.WHITE);
        ln.setFont(new Font("plain", 1, 15)); 
        log.setBackground(Color.DARK_GRAY);
        log.setForeground(Color.WHITE);
        log.setFont(new Font("plain", 1, 15)); 
        minus.setBackground(Color.DARK_GRAY);
        minus.setForeground(Color.WHITE);
        minus.setFont(new Font("plain", 1, 20));
        plus.setBackground(Color.DARK_GRAY);
        plus.setForeground(Color.WHITE);
        plus.setFont(new Font("plain", 1, 20)); 
        times.setBackground(Color.DARK_GRAY);
        times.setForeground(Color.WHITE);
        times.setFont(new Font("plain", 1, 20)); 
        multi.setBackground(Color.DARK_GRAY);
        multi.setForeground(Color.WHITE);
        multi.setFont(new Font("plain", 1, 20)); 
        xx.setBackground(Color.DARK_GRAY);
        xx.setForeground(Color.WHITE);
        xx.setFont(new Font("plain", 1, 20));  
        divide.setBackground(Color.DARK_GRAY);
        divide.setForeground(Color.WHITE);
        divide.setFont(new Font("plain", 1, 20)); 
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("plain", 1, 15)); 
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("plain", 1, 15)); 
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("plain", 1, 15)); 
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("plain", 1, 15));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("plain", 1, 15));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("plain", 1, 15)); 
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("plain", 1, 15));
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setFont(new Font("plain", 1, 15)); 
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setFont(new Font("plain", 1, 15));
        b0.setBackground(Color.BLACK);
        b0.setForeground(Color.WHITE);
        b0.setFont(new Font("plain", 1, 15)); 
        bracket1.setBackground(Color.DARK_GRAY);
        bracket1.setForeground(Color.WHITE);
        bracket1.setFont(new Font("plain", 1, 20));
        bracket2.setBackground(Color.DARK_GRAY);
        bracket2.setForeground(Color.WHITE);
        bracket2.setFont(new Font("plain", 1, 20)); 
        
        p1.add(clear);
        p1.add(cos);
        p1.add(tan);
        p1.add(cancel);

        p1.add(rad);
        p1.add(bracket);
        p1.add(ln);
        p1.add(expo);

        p1.add(sin);
        p1.add(divide);
        p1.add(times);
        p1.add(log);

        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(minus);

        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(plus);

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(multi);

        p1.add(b0);
        p1.add(xx);
        p1.add(dot);
        p1.add(equal);

        p3.add(pane);
        p3.add(p22);

        add(p3, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);

        thehandler handler = new thehandler();

        b0.addActionListener(handler);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);

        plus.addActionListener(handler);
        minus.addActionListener(handler);
        times.addActionListener(handler);
        divide.addActionListener(handler);

        sin.addActionListener(handler);
        cos.addActionListener(handler);
        tan.addActionListener(handler);
        log.addActionListener(handler);

        expo.addActionListener(handler);
        ln.addActionListener(handler);
        multi.addActionListener(handler);
        dot.addActionListener(handler);

        clear.addActionListener(handler);
        cancel.addActionListener(handler);
        equal.addActionListener(handler);
        rad.addActionListener(handler);
        xx.addActionListener(handler);

        bracket1.addActionListener(handler);
        bracket2.addActionListener(handler);

    }
   // this method give priority for brackets
    double bracket(double x, int y) {
        
        double value = 0 , takevalue = 0;
        char[] ch = strcalc.toCharArray();
        count = 0;
        for (int i = y; i < ch.length; i++) {
            
            switch (ch[i]) {
                case '(':
                    i++;
                    if (ch[i] == '1' || ch[i] == '2' || ch[i] == '3' || ch[i] == '4' || ch[i] == '4' || ch[i] == '5' || ch[i] == '6' || ch[i] == '7' || ch[i] == '8' || ch[i] == '9' || ch[i] == '0') {
                        double calc;
                        String conc = "";
                        conc += String.valueOf(ch[i]);
                        int ic = (i + 1);
                        for (; ic < ch.length; ic++) {
                            if (ch[ic] == '.' ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                conc += String.valueOf(ch[ic]);
                                
                                i = ic;
                            } else {
                                break;
                            }
                        }
                        calc = Double.parseDouble(conc);
                        if (count == 0) {
                            value = calc;
                            count++;
                            
                        }
                        
                    } else if (ch[i] == 'x') {
                        
                        if (count == 0) {
                            value = x;
                            count++;
                            
                        }
                    }else if (ch[i] == 'C') {
                        
                        value = cosf(x, i);
                        i = ii;
                    }
                    else if (ch[i] == 'e') {
                        
                        value = expf(x, i);
                        i = ii;
                    }else if (ch[i] == 'S') {
                        
                        value = sinf(x, i);
                        i = ii;
                    }  else if (ch[i] == 'L') {
                        
                        value = logf(x, i);
                        i = ii;
                    } else if (ch[i] == 'T') {
                        
                        value = tanf(x, i);
                        i = ii;
                    }
                    else if (ch[i] == 'l') {
                        
                        value = lnf(x, i);
                        i = ii;
                    }
                    else if (ch[i] == 'r') {
                        
                        value = sqrtf(x, i);
                        i = ii;
                    }
                    
                    
                    else if (ch[i] == '+') {
                        
                        if (ch[i + 1] == 'x') {
                            value += x;
                            i++;
                        } else if (ch[i + 1] == '(') {
                            takevalue = value;
                            value = bracket(x, (i + 1));
                            i = ii;
                            value = takevalue + value;
                        } else if (ch[i + 1] == 'C') {
                            i++;
                            value += cosf(x, i);
                            i = ii;
                        }else if (ch[i + 1] == 'e') {
                            i++;
                            value += expf(x, i);
                            i = ii;
                        }else if (ch[i+1] == 'S') {
                            i++;
                            value += sinf(x, i);
                            i = ii;
                        }  else if (ch[i+1] == 'L') {
                            i++;
                            value += logf(x, i);
                            i = ii;
                        } else if (ch[i+1] == 'T') {
                            i++;
                            value += tanf(x, i);
                            i = ii;
                        }
                        else if (ch[i+1] == 'l') {
                            i++;
                            value += lnf(x, i);
                            i = ii;
                        }
                        else if (ch[i+1] == 'r') {
                            i++;
                            value += sqrtf(x, i);
                            i = ii;
                        }else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {
                            
                            i++;
                            double calc;
                            String conc = "";
                            conc += String.valueOf(ch[i]);
                            
                            int ic = (i + 1);
                            for (; ic < ch.length; ic++) {
                                if (ch[ic] == '.' ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                    conc += String.valueOf(ch[ic]);
                                    i = ic;
                                } else {
                                    break;
                                }
                            }
                            calc = Double.parseDouble(conc);
                            value += calc;
                        } else {
                            System.out.println("invalid");
                        }
                        
                    } else if (ch[i] == '-') {
                        
                        if (ch[i + 1] == 'x') {
                            value -= x;
                            i++;
                        } else if (ch[i + 1] == '(') {
                            takevalue = value;
                            value = bracket(x, (i + 1));
                            i = ii;
                            value = takevalue - value;
                        } else if (ch[i + 1] == 'C') {
                            i++;
                            value -= cosf(x, i);
                            i = ii;
                        }else if (ch[i + 1] == 'e') {
                            i++;
                            value -= expf(x, i);
                            i = ii;
                        }else if (ch[i + 1] == 'S') {
                            i++;
                            value -= sinf(x, i);
                            i = ii;
                        }  else if (ch[i+1] == 'L') {
                            i++;
                            value -= logf(x, i);
                            i = ii;
                        } else if (ch[i+1] == 'T') {
                            i++;
                            value -= tanf(x, i);
                            i = ii;
                        }
                        else if (ch[i+1] == 'l') {
                            i++;
                            value -= lnf(x, i);
                            i = ii;
                        }
                        else if (ch[i+1] == 'r') {
                            i++;
                            value -= sqrtf(x, i);
                            i = ii;
                        }
                        else if ( ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {
                            
                            double calc;
                            String conc = "";
                            conc += String.valueOf(ch[i + 1]);
                            i++;
                            int ic = (i + 1);
                            for (; ic < ch.length; ic++) {
                                if (ch[ic] == '.' ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                    conc += String.valueOf(ch[ic]);
                                    i = ic;
                                } else {
                                    break;
                                }
                            }
                            calc = Double.parseDouble(conc);
                            value -= calc;
                        }
                        
                    }   break;
                case '-':
                switch (ch[i + 1]) {
                    case 'x':
                        value -= x;
                        i++;
                        break;
                    case '(':
                        takevalue = value;
                        value = bracket(x, (i + 1));
                        i = ii;
                        value = takevalue - value;
                        break;
                    case 'C':
                        i++;
                        value -= cosf(x, i);
                        i = ii;
                        break;
                    case 'e':
                        i++;
                        value -= expf(x, i);
                        i = ii;
                        break;
                    case 'S':
                        i++;
                        value -= sinf(x, i);
                        i = ii;
                        break;
                    case 'L':
                        i++;
                        value -= logf(x, i);
                        i = ii;
                        break;
                    case 'T':
                        i++;
                        value -= tanf(x, i);
                        i = ii;
                        break;
                    case 'l':
                        i++;
                        value -= lnf(x, i);
                        i = ii;
                        break;
                    case 'r':
                        i++;
                        value -= sqrtf(x, i);
                        i = ii;
                        break;
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '0':
                        i++;
                        double calc;
                        String conc = "";
                        conc += String.valueOf(ch[i]);
                        int ic = (i + 1);
                        for (; ic < ch.length; ic++) {
                            if (ch[ic] == '.' ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                conc += String.valueOf(ch[ic]);
                                i = ic;
                            } else {
                                break;
                            }
                        }
                        calc = Double.parseDouble(conc);
                        value -= calc;
                        break;
                    default:
                        System.out.println("invalid");
                        break;
                }
break;

                case '+':
                    if (ch[i + 1] == 'x') {
                        value += x;
                        i++;
                    } else if (ch[i + 1] == '(') {
                        takevalue = value;
                        value = bracket(x, (i + 1));
                        i = ii;
                        value = takevalue + value;
                    } else if (ch[i + 1] == 'C') {
                        i++;
                        value += cosf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'e') {
                        i++;
                        value += expf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'S') {
                        i++;
                        value += sinf(x, i);
                        i = ii;
                    }  else if (ch[i +1] == 'L') {
                        i++;
                        value += logf(x, i);
                        i = ii;
                    } else if (ch[i + 1] == 'T') {
                        i++;
                        value += tanf(x, i);
                        i = ii;
                    }
                    else if (ch[i + 1] == 'l') {
                        i++;
                        value += lnf(x, i);
                        i = ii;
                    }
                    else if (ch[i + 1] == 'r') {
                        i++;
                        value += sqrtf(x, i);
                        i = ii;}
                    else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {
                        
                        i++;
                        double calc;
                        String conc = "";
                        conc += String.valueOf(ch[i]);
                        
                        int ic = (i + 1);
                        for (; ic < ch.length; ic++) {
                            if (ch[ic] == '.' ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                conc += String.valueOf(ch[ic]);
                                i = ic;
                            } else {
                                break;
                            }
                        }
                        calc = Double.parseDouble(conc);
                        value += calc;
                    } else {
                        System.out.println("invalid");
                    }   break;
                case '*':
                    if (ch[i + 1] == 'x') {
                        value *= x;
                        i++;
                    } else if (ch[i + 1] == '(') {
                        takevalue = value;
                        value = bracket(x, (i + 1));
                        i = ii;
                        value = takevalue * value;
                    } else if (ch[i + 1] == 'C') {
                        i++;
                        value *= cosf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'e') {
                        i++;
                        value *= expf(x, i);
                        i = ii;
                    }  else if (ch[i + 1] == 'S') {
                        i++;
                        value *= sinf(x, i);
                        i = ii;
                    }  else if (ch[i + 1] == 'L') {
                        i++;
                        value *= logf(x, i);
                        i = ii;
                    } else if (ch[i + 1] == 'T') {
                        i++;
                        value *= tanf(x, i);
                        i = ii;
                    }
                    else if (ch[i + 1] == 'l') {
                        i++;
                        value *= lnf(x, i);
                        i = ii;
                    }
                    else if (ch[i + 1] == 'r') {
                        i++;
                        value *= sqrtf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {
                        
                        double calc;
                        String conc = "";
                        conc += String.valueOf(ch[i + 1]);
                        i++;
                        int ic = (i + 1);
                        for (; ic < ch.length; ic++) {
                            if (ch[ic] == '.' ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                conc += String.valueOf(ch[ic]);
                                i = ic;
                            } else {
                                break;
                            }
                        }
                        calc = Double.parseDouble(conc);
                        value *= calc;
                    }
                    break;
                case '^':
                    if (ch[i + 1] == 'x') {
                        value=Math.pow(value,x);
                        i++;
                    } else if (ch[i + 1] == '(') {
                        takevalue = value;
                        value = bracket(x, (i + 1));
                        i = ii;
                        value = Math.pow(takevalue,value);
                    } else if (ch[i + 1] == 'C') {
                        i++;
                         
                        value=Math.pow(value,cosf(x, i));
                        i = ii;
                    }else if (ch[i + 1] == 'e') {
                        i++;
                        
                        value=Math.pow(value,expf(x, i));
                        i = ii;
                    }  else if (ch[i + 1] == 'S') {
                        i++;
                        
                        value=Math.pow(value,sinf(x, i));
                        i = ii;
                    }  else if (ch[i + 1] == 'L') {
                        i++;
                        
                        value=Math.pow(value,logf(x, i));
                        i = ii;
                    } else if (ch[i + 1] == 'T') {
                        i++;
                        
                        value=Math.pow(value,tanf(x, i));
                        i = ii;
                    }
                    else if (ch[i] == 'l') {
                        i++;
                        
                        value=Math.pow(value,lnf(x, i));
                        i = ii;
                    }
                    else if (ch[i + 1] == 'r') {
                        i++;
                        
                        value=Math.pow(value,sqrtf(x, i));
                        i = ii;
                    }else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {
                        
                        double calc;
                        String conc = "";
                        conc += String.valueOf(ch[i + 1]);
                        i++;
                        int ic = (i + 1);
                        for (; ic < ch.length; ic++) {
                            if (ch[ic] == '.' ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                conc += String.valueOf(ch[ic]);
                                i = ic;
                            } else {
                                break;
                            }
                        }
                        calc = Double.parseDouble(conc);
                        
                        value=Math.pow(value,calc);
                    }
                    break;
                case '/':
                    if (ch[i + 1] == 'x') {
                        value /= x;
                        i++;
                    } else if (ch[i + 1] == '(') {
                        takevalue = value;
                        value = bracket(x, (i + 1));
                        i = ii;
                        value = takevalue / value;
                    } else if (ch[i + 1] == 'C') {
                        i++;
                        value /= cosf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'e') {
                        i++;
                        value /= expf(x, i);
                        i = ii;
                    }  else if (ch[i + 1] == 'S') {
                        i++;
                        value /= sinf(x, i);
                        i = ii;
                    }  else if (ch[i + 1] == 'L') {
                        i++;
                        value /= logf(x, i);
                        i = ii;
                    } else if (ch[i + 1] == 'T') {
                        i++;
                        value /= tanf(x, i);
                        i = ii;
                    }
                    else if (ch[i + 1] == 'l') {
                        i++;
                        value /= lnf(x, i);
                        i = ii;
                    }
                    else if (ch[i + 1] == 'r') {
                        i++;
                        value /= sqrtf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {
                        
                        double calc;
                        String conc = "";
                        conc += String.valueOf(ch[i + 1]);
                        i++;
                        int ic = (i + 1);
                        for (; ic < ch.length; ic++) {
                            if (ch[ic] == '.' ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                conc += String.valueOf(ch[ic]);
                                i = ic;
                            } else {
                                break;
                            }
                        }
                        calc = Double.parseDouble(conc);
                        value /= calc;
                    }
                    break;
                case ')':
                    ii = i;
                    count++;
                  
                    return value;
                case '2':
                    JOptionPane.showMessageDialog(null, "********************invalid input");
                    break;
                default:
                    
                    trvalue = false;
                    break;
            }
count++;
        }
        return value;
    }   
    //the whole equation pass to f() method
    double f(double x) {
         double   value1 = 0,  takevalue1 = 0;
         count = 0;
         /* stringcalc is a variable all equation previously entered from the user assigned to this variable.
         this string variable changed to array of character for further calculation e.g check is there any bracket? */
         
        char[] ch = strcalc.toCharArray(); 
   
        for (int i = 0; i < ch.length; i++) {
            //it call a method until it reach end of the loop it mainly check bracket,log,sin,cos..
            if (ch[i] == '(') {
               
                value1 = bracket(x,i); //calling bracket method and assign to value1
                i = ii;

            } else if (ch[i] == '-') {

                if (ch[i + 1] == 'x') {
                    value1 -= x;
                    i++;
                } else if (ch[i + 1] == '(') {

                    takevalue1 = value1;
                    value1 = bracket(x, (i + 1));
                    i = ii;
                    value1 = takevalue1 - value1;
                } else if (ch[i + 1] == 'C') {
                        i++;
                        value1 -= cosf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'e') {
                        i++;
                        value1 -= expf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'S') {
                     i++;
                    value1 -= sinf(x, i);
                    i = ii;
                }  else if (ch[i + 1] == 'L') {
                     i++;
                    value1 -= logf(x, i);
                    i = ii;
                } else if (ch[i + 1] == 'T') {
                     i++;
                    value1 -= tanf(x, i);
                    i = ii;
                }
                else if (ch[i + 1] == 'l') {
                     i++;
                    value1 -= lnf(x, i);
                    i = ii;
                }
                 else if (ch[i + 1] == 'r') {
                    i++;
                    value1 -= sqrtf(x, i);
                    i = ii;
                }else if ( ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                    i++;
                    double calc;
                    String conc = "";
                    conc += String.valueOf(ch[i]);

                    int ic = (i + 1);
                    for (; ic < ch.length; ic++) {
                        if ( ch[ic] == '.'  ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                            conc += String.valueOf(ch[ic]);
                            i = ic;
                        } else {
                            break;
                        }
                    }
                    calc = Double.parseDouble(conc);
                    value1 -= calc;
                } else {
                    System.out.println("invalid");
                }

            } else if (ch[i] == '+') {

                if (ch[i + 1] == 'x') {
                    value1 += x;
                    i++;
                } else if (ch[i + 1] == '(') {
                    takevalue1 = value1;
                    value1 = bracket(x, (i + 1));
                    i = ii;
                    value1 = takevalue1 + value1;
                } else if (ch[i + 1] == 'C') {
                        i++;
                        value1 += cosf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'e') {
                        i++;
                        value1 += expf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'S') {
                     i++;
                    value1 += sinf(x, i);
                    i = ii;
                }  else if (ch[i +1] == 'L') {
                     i++;
                    value1 += logf(x, i);
                    i = ii;
                } else if (ch[i + 1] == 'T') {
                     i++;
                    value1 += tanf(x, i);
                    i = ii;
                }
                else if (ch[i + 1] == 'l') {
                     i++;
                    value1 += lnf(x, i);
                    i = ii;
                }
                 else if (ch[i + 1] == 'r') {
                    i++;
                    value1 += sqrtf(x, i);
                    i = ii;}
                 else if ( ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                    i++;
                    double calc;
                    String conc = "";
                    conc += String.valueOf(ch[i]);

                    int ic = (i + 1);
                    for (; ic < ch.length; ic++) {
                        if (ch[ic] == '.'   ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                            conc += String.valueOf(ch[ic]);
                            i = ic;
                        } else {
                            break;
                        }
                    }
                    calc = Double.parseDouble(conc);
                    value1 += calc;
                } else {
                    System.out.println("invalid");
                }

            }   else if (count == 0) {
                

                if (ch[i] == '1' || ch[i] == '2' || ch[i] == '3' || ch[i] == '4' || ch[i] == '4' || ch[i] == '5' || ch[i] == '6' || ch[i] == '7' || ch[i] == '8' || ch[i] == '9' || ch[i] == '0') {
                    double calc;
                    String conc = "";
                    conc += String.valueOf(ch[i]);
                    int ic = (i + 1);
                    for (; ic < ch.length; ic++) {
                        if (ch[ic] == '.'  ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                            conc += String.valueOf(ch[ic]);

                            i = ic;
                        } else {
                            break;
                        }
                    }
                    calc = Double.parseDouble(conc);
                    if (count == 0) {
                        value1 = calc;
                        count++;

                    }

                } else if (ch[i] == 'x') {

                    if (count == 0) {
                        value1 = x;
                        count++;

                    }
                }else if (ch[i] == 'C') {
                    
                    value1 = cosf(x, i);
                    i = ii;
                } 
                else if (ch[i] == 'e') {
                     
                    value1 = expf(x, i);
                    i = ii;
                }else if (ch[i] == 'S') {
                     
                    value1 = sinf(x, i);
                    i = ii;
                }  else if (ch[i] == 'L') {
                     
                    value1 = logf(x, i);
                    i = ii;
                } else if (ch[i] == 'T') {
                     
                    value1 = tanf(x, i);
                    i = ii;
                }
                else if (ch[i] == 'l') {
                     
                    value1 = lnf(x, i);
                    i = ii;
                }
                 else if (ch[i] == 'r') {
                    
                    value1 = sqrtf(x, i);
                    i = ii;
                }
                } 
                 else if (ch[i] == '*' && count !=0) {
                     if (ch[i + 1] == 'x') {
                        value1 *= x;
                        i++;
                    } else if (ch[i + 1] == '(') {
                        takevalue1 = value1;
                        value1 = bracket(x, (i + 1));
                        i = ii;
                        value1 = takevalue1 * value1;
                    } else if (ch[i + 1] == 'C') {
                        i++;
                        value1 *= cosf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'e') {
                        i++;
                        value1 *= expf(x, i);
                        i = ii;
                    }  else if (ch[i + 1] == 'S') {
                     i++;
                    value1 *= sinf(x, i);
                    i = ii;
                }  else if (ch[i + 1] == 'L') {
                     i++;
                    value1 *= logf(x, i);
                    i = ii;
                } else if (ch[i + 1] == 'T') {
                     i++;
                    value1 *= tanf(x, i);
                    i = ii;
                }
                else if (ch[i + 1] == 'l') {
                     i++;
                    value1 *= lnf(x, i);
                    i = ii;
                }
                 else if (ch[i + 1] == 'r') {
                    i++;
                    value1 *= sqrtf(x, i);
                    i = ii;
                }else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                        double calc;
                        String conc = "";
                        conc += String.valueOf(ch[i + 1]);
                        i++;
                        int ic = (i + 1);
                        for (; ic < ch.length; ic++) {
                            if (ch[ic] == '.'   ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                conc += String.valueOf(ch[ic]);
                                i = ic;
                            } else {
                                break;
                            }
                        }
                        calc = Double.parseDouble(conc);
                        value1 *= calc;
                    }

            } else if (ch[i] == '^' && count != 0) {
                     if (ch[i + 1] == 'x') {
                        value1=Math.pow(value1,x);
                        i++;
                    } else if (ch[i + 1] == '(') {
                        takevalue1 = value1;
                        value1 = bracket(x, (i + 1));
                        i = ii;
                        value1 = Math.pow(takevalue1,value1);
                    } else if (ch[i + 1] == 'C') {
                        i++;
                         
                        value1=Math.pow(value1,cosf(x, i));
                        i = ii;
                    }else if (ch[i + 1] == 'e') {
                        i++;
                         
                         value1 = Math.pow(value1,expf(x, i));
                        i = ii;
                    }  else if (ch[i + 1] == 'S') {
                     i++;
                     
                     value1=Math.pow(value1,sinf(x, i));
                    i = ii;
                }  else if (ch[i + 1] == 'L') {
                     i++;
                     
                     value1=Math.pow(value1,logf(x, i));
                    i = ii;
                } else if (ch[i + 1] == 'T') {
                     i++;
                     
                     value1=Math.pow(value1,tanf(x, i));
                    i = ii;
                }
                else if (ch[i] == 'l') {
                     i++;
                    
                     value1=Math.pow(value1,lnf(x, i));
                    i = ii;
                }
                 else if (ch[i + 1] == 'r') {
                    i++;
                     
                     value1=Math.pow(value1,sqrtf(x, i));
                    i = ii;
                }else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                        double calc;
                        String conc = "";
                        conc += String.valueOf(ch[i + 1]);
                        i++;
                        int ic = (i + 1);
                        for (; ic < ch.length; ic++) {
                            if (ch[ic] == '.'  ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                conc += String.valueOf(ch[ic]);
                                i = ic;
                            } else {
                                break;
                            }
                        }
                        calc = Double.parseDouble(conc);
                         
                         value1=Math.pow(value1,calc);
                    }

            }  
         else if (ch[i] == '/' && count !=0) {
                   if (ch[i + 1] == 'x') {
                        value1 /= x;
                        i++;
                    } else if (ch[i + 1] == '(') {
                        takevalue1 = value1;
                        value1 = bracket(x, (i + 1));
                        i = ii;
                        value1 = takevalue1 / value1;
                    } else if (ch[i + 1] == 'C') {
                        i++;
                        value1 /= cosf(x, i);
                        i = ii;
                    }else if (ch[i + 1] == 'e') {
                        i++;
                        value1 /= expf(x, i);
                        i = ii;
                    }  else if (ch[i + 1] == 'S') {
                     i++;
                    value1 /= sinf(x, i);
                    i = ii;
                }  else if (ch[i + 1] == 'L') {
                     i++;
                    value1 /= logf(x, i);
                    i = ii;
                } else if (ch[i + 1] == 'T') {
                     i++;
                    value1 /= tanf(x, i);
                    i = ii;
                }
                else if (ch[i + 1] == 'l') {
                     i++;
                    value1 /= lnf(x, i);
                    i = ii;
                }
                 else if (ch[i + 1] == 'r') {
                    i++;
                    value1 /= sqrtf(x, i);
                    i = ii;
                }else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                        double calc;
                        String conc = "";
                        conc += String.valueOf(ch[i + 1]);
                        i++;
                        int ic = (i + 1);
                        for (; ic < ch.length; ic++) {
                            if (ch[ic] == '.'  ||ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                                conc += String.valueOf(ch[ic]);
                                i = ic;
                            } else {
                                break;
                            }
                        }
                        calc = Double.parseDouble(conc);
                        value1 /= calc;
                    }

            }  

                else {
               // JOptionPane.showMessageDialog(null, "invalid input");
                trvalue = false;
            }
count++;
        }
        return value1;
    }
    double cosf(double x, int y) {
        char[] ch = strcalc.toCharArray();
        
        double cosvalue = 0;
        for (int i = y; i < ch.length; i++) {
            if (ch[i + 1] == 'x') {
                i++;
                cosvalue = Math.cos(x);
                ii = i;
                break;
            } else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                i++;
                double calc;
                String conc = "";
                conc += String.valueOf(ch[i]);

                int ic = (i + 1);
                for (; ic < ch.length; ic++) {
                    if (ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                        conc += String.valueOf(ch[ic]);
                        i = ic;
                    } else {
                        break;
                    }
                }
                calc = Double.parseDouble(conc);
                cosvalue = Math.cos(calc);
                ii = i;
                break;
            } else if (ch[i + 1] == '(') {
                cosvalue = Math.cos(bracket(x, (i + 1)));

                i = ii;

                break;
            }
        }
        return cosvalue;
    }
    double sinf(double x, int y) {
        char[] ch = strcalc.toCharArray();
       

        double cosvalue = 0;
        for (int i = y; i < ch.length; i++) {
            if (ch[i + 1] == 'x') {
                i++;
                cosvalue = Math.sin(x);
                ii = i;
                break;
            } else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                i++;
                double calc;
                String conc = "";
                conc += String.valueOf(ch[i]);

                int ic = (i + 1);
                for (; ic < ch.length; ic++) {
                    if (ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                        conc += String.valueOf(ch[ic]);
                        i = ic;
                    } else {
                        break;
                    }
                }
                calc = Double.parseDouble(conc);
                cosvalue = Math.sin(calc);
                ii = i;
                break;
            } else if (ch[i + 1] == '(') {
                cosvalue = Math.sin(bracket(x, (i + 1)));

                i = ii;

                break;
            }
        }
        return cosvalue;
    }
    double tanf(double x, int y) {
        char[] ch = strcalc.toCharArray();
         

        double cosvalue = 0;
        for (int i = y; i < ch.length; i++) {
            if (ch[i + 1] == 'x') {
                i++;
                cosvalue = Math.tan(x);
                ii = i;
                break;
            } else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                i++;
                double calc;
                String conc = "";
                conc += String.valueOf(ch[i]);

                int ic = (i + 1);
                for (; ic < ch.length; ic++) {
                    if (ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                        conc += String.valueOf(ch[ic]);
                        i = ic;
                    } else {
                        break;
                    }
                }
                calc = Double.parseDouble(conc);
                cosvalue = Math.tan(calc);
                ii = i;
                break;
            } else if (ch[i + 1] == '(') {
                cosvalue = Math.tan(bracket(x, (i + 1)));

                i = ii;

                break;
            }
        }
        return cosvalue;
    }
double expf(double x, int y) {
        char[] ch = strcalc.toCharArray();
         

        double cosvalue = 0;
        for (int i = y; i < ch.length; i++) {
            if (ch[i + 1] == 'x') {
                i++;
                cosvalue = Math.exp(x);
                ii = i;
                break;
            } else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                i++;
                double calc;
                String conc = "";
                conc += String.valueOf(ch[i]);

                int ic = (i + 1);
                for (; ic < ch.length; ic++) {
                    if (ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                        conc += String.valueOf(ch[ic]);
                        i = ic;
                    } else {
                        break;
                    }
                }
                calc = Double.parseDouble(conc);
                cosvalue = Math.exp(calc);
                ii = i;
                break;
            } else if (ch[i + 1] == '(') {
                cosvalue = Math.exp(bracket(x, (i + 1)));

                i = ii;

                break;
            }
        }
        return cosvalue;
    }
double logf(double x, int y) {
        char[] ch = strcalc.toCharArray();
        count = 0;

        double cosvalue = 0;
        for (int i = y; i < ch.length; i++) {
            if (ch[i + 1] == 'x') {
                i++;
                cosvalue = Math.log10(x);
                ii = i;
                break;
            } else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                i++;
                double calc;
                String conc = "";
                conc += String.valueOf(ch[i]);

                int ic = (i + 1);
                for (; ic < ch.length; ic++) {
                    if (ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                        conc += String.valueOf(ch[ic]);
                        i = ic;
                    } else {
                        break;
                    }
                }
                calc = Double.parseDouble(conc);
                cosvalue = Math.log10(calc);
                ii = i;
                break;
            } else if (ch[i + 1] == '(') {
                cosvalue = Math.log10(bracket(x, (i + 1)));

                i = ii;

                break;
            }
        }
        return cosvalue;
    }
double lnf(double x, int y) {
        char[] ch = strcalc.toCharArray();
        count = 0;

        double cosvalue = 0;
        for (int i = y; i < ch.length; i++) {
            if (ch[i + 1] == 'x') {
                i++;
                cosvalue = Math.log(x);
                ii = i;
                break;
            } else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                i++;
                double calc;
                String conc = "";
                conc += String.valueOf(ch[i]);

                int ic = (i + 1);
                for (; ic < ch.length; ic++) {
                    if (ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                        conc += String.valueOf(ch[ic]);
                        i = ic;
                    } else {
                        break;
                    }
                }
                calc = Double.parseDouble(conc);
                cosvalue = Math.log(calc);
                ii = i;
                break;
            } else if (ch[i + 1] == '(') {
                cosvalue = Math.log(bracket(x, (i + 1)));

                i = ii;

                break;
            }
        }
        return cosvalue;
    }
double sqrtf(double x, int y) {
        char[] ch = strcalc.toCharArray();
        count = 0;

        double cosvalue = 0;
        for (int i = y; i < ch.length; i++) {
            if (ch[i + 1] == 'x') {
                i++;
                cosvalue = Math.sqrt(x);
                ii = i;
                break;
            } else if (ch[i + 1] == '1' || ch[i + 1] == '2' || ch[i + 1] == '3' || ch[i + 1] == '4' || ch[i + 1] == '4' || ch[i + 1] == '5' || ch[i + 1] == '6' || ch[i + 1] == '7' || ch[i + 1] == '8' || ch[i + 1] == '9' || ch[i + 1] == '0') {

                i++;
                double calc;
                String conc = "";
                conc += String.valueOf(ch[i]);

                int ic = (i + 1);
                for (; ic < ch.length; ic++) {
                    if (ch[ic] == '1' || ch[ic] == '2' || ch[ic] == '3' || ch[ic] == '4' || ch[ic] == '4' || ch[ic] == '5' || ch[ic] == '6' || ch[ic] == '7' || ch[ic] == '8' || ch[ic] == '9' || ch[ic] == '0') {
                        conc += String.valueOf(ch[ic]);
                        i = ic;
                    } else {
                        break;
                    }
                }
                calc = Double.parseDouble(conc);
                cosvalue = Math.sqrt(calc);
                ii = i;
                break;
            } else if (ch[i + 1] == '(') {
                cosvalue = Math.sqrt(bracket(x, (i + 1)));

                i = ii;

                break;
            }
        }
        return cosvalue;
    }
public static void main(String[] args) {

        JFrame frame = new SecantMethod();

        frame.setSize(350, 550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
class thehandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ob) {

            if (ob.getSource() == b0) {
                str = str + b0.getText();
                strcalc = strcalc + b0.getText();
                area.setText(str);
                System.out.println(str);
            } else if (ob.getSource() == b1) {
                str = str + b1.getText();
                strcalc = strcalc + b1.getText();
                area.setText(str);
            } else if (ob.getSource() == b2) {
                str = str + b2.getText();
                strcalc = strcalc + b2.getText();
                area.setText(str);
            } else if (ob.getSource() == b3) {
                str = str + b3.getText();
                strcalc = strcalc + b3.getText();
                area.setText(str);
            } else if (ob.getSource() == b4) {
                str = str + b4.getText();
                strcalc = strcalc + b4.getText();
                area.setText(str);
            } else if (ob.getSource() == b5) {
                str = str + b5.getText();
                strcalc = strcalc + b5.getText();
                area.setText(str);
            } else if (ob.getSource() == b6) {
                str = str + b6.getText();
                strcalc = strcalc + b6.getText();
                area.setText(str);
            } else if (ob.getSource() == b7) {
                str = str + b7.getText();
                strcalc = strcalc + b7.getText();
                area.setText(str);
            } else if (ob.getSource() == b8) {
                str = str + b8.getText();
                strcalc = strcalc + b8.getText();
                area.setText(str);
            } else if (ob.getSource() == b9) {
                str = str + b9.getText();
                strcalc = strcalc + b9.getText();
                area.setText(str);
            } else if (ob.getSource() == sin) {
                str = str + sin.getText();
                strcalc = strcalc + "S";
                area.setText(str);
            } else if (ob.getSource() == cos) {
                str = str + cos.getText();
                strcalc = strcalc + "C";
                area.setText(str);
            } else if (ob.getSource() == tan) {
                str = str + tan.getText();
                strcalc = strcalc + "T";
                area.setText(str);
            } else if (ob.getSource() == log) {
                str = str + log.getText();
                strcalc = strcalc + "L";
                area.setText(str);
            } else if (ob.getSource() == log10) {
                str = str + log10.getText();
                area.setText(str);
            } else if (ob.getSource() == ln) {
                str = str + ln.getText() ;
                strcalc = strcalc + "l";
                area.setText(str);
            } else if (ob.getSource() == expo) {
                 strcalc = strcalc + "e";
                str = str + "e";
                area.setText(str);
            } else if (ob.getSource() == plus) {
                str = str + plus.getText();
                 strcalc = strcalc + plus.getText();
                area.setText(str);
            } else if (ob.getSource() == minus) {
                str = str + minus.getText();
                 strcalc = strcalc + minus.getText();
                area.setText(str);
            } else if (ob.getSource() == times) {
                 strcalc = strcalc + times.getText();
                str = str + times.getText();
                area.setText(str);
            } else if (ob.getSource() == divide) {
                str = str + divide.getText();
                 strcalc = strcalc + divide.getText();
                area.setText(str);
            } else if (ob.getSource() == xx) {
                str = str + xx.getText();
                 strcalc = strcalc + xx.getText();
                area.setText(str);
            } else if (ob.getSource() == multi) {
                str = str + multi.getText();
                 strcalc = strcalc + multi.getText();
                area.setText(str);
            } else if (ob.getSource() == dot) {
                str = str + dot.getText();
                 strcalc = strcalc + dot.getText();
                area.setText(str);
            } else if (ob.getSource() == rad) {
                str = str + rad.getText();
                strcalc = strcalc + "r";
                area.setText(str);
            } else if (ob.getSource() == clear) {
                str = "";
                strcalc = "";
               // value = 0;
               // value1 = 0;
                iminus=0;
                trvalue = true;
                area.setText(str);
            } else if (ob.getSource() == bracket1) {
                str = str + bracket1.getText();
                 strcalc = strcalc + bracket1.getText();
                area.setText(str);
            } else if (ob.getSource() == bracket2) {
                str = str + bracket2.getText();
                 strcalc = strcalc + bracket2.getText();
                area.setText(str);
            } else if (ob.getSource() == equal) {
               
                if(trvalue){
                    
                  frame = new JFrame();
                    
                    frame.setSize(700,600);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(trvalue);
                    
                    df.setMaximumFractionDigits(Integer.parseInt(dp.getText()));
                    
                    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,20));
                    JLabel label = new JLabel("f(x) =  "+str);
                    label.setFont(new Font("SansSerif",3,25));
                    p1.setBorder(new TitledBorder("equation"));
                    p1.setBackground(Color. LIGHT_GRAY);
                   
                    p1.add(label);
                    
                    JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,20));
                     button = new JButton("Back");
                    p3.add(button);
                    
                    JPanel p2 = new JPanel(new GridLayout(0,1));
                    JScrollPane pane = new JScrollPane(p2);
                    p2.setBackground(Color.WHITE);
                    int xcounter=1;
                    
                    JPanel p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,10));
                    JPanel p44 = new JPanel(new GridLayout(2,1));
                    p44.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
                    
                    double guess1,guess2,guess3;
                    
                    guess2 = Double.parseDouble(guess1t.getText());
                    guess3 = Double.parseDouble(guess2t.getText());
                  
                    
                    p2.add(new JLabel(" X0  = " + df.format(bracket(guess2,0))));
                    p2.add(new JLabel(" X1  = " + df.format(bracket(guess3,0))));
                    do{
                        guess1 = guess2;
                        guess2 = guess3;
                        xcounter++;
                        
                        guess3 = (guess2 - ((f(guess2 ) * (guess2 - guess1)) / (f(guess2 ) - f(guess1 ))));
                        
                        if(guess3 ==0){
                            p3.add(new JLabel("X = "+ df.format(guess3)));
                            break;
                        }
                        p2.add(new JLabel(" X"+xcounter+"  = " + df.format(guess3)));
                        
                    }while(Math.abs(guess3-guess2)>Double.parseDouble(error.getText()));
                 
                  
                JLabel lable1 = new JLabel(" X"+xcounter+"  = " + df.format(guess3)+" is a Solution");
                lable1.setFont(new Font("Serif",3,20));
                
                     p4.add(lable1);
                     
                     p44.add(p4);
                     p44.add(p3);
                     
                     frame.add(p1,BorderLayout.NORTH);
                     frame.add(pane,BorderLayout.CENTER);
                     frame.add(p44,BorderLayout.SOUTH);
                     
                     button.addActionListener(new ActionListener(){
                         @Override
                         public void actionPerformed(ActionEvent e){
                             if(e.getSource() == button){
                                 frame.setVisible(false);
                             }
                         }
                     });
                }
                else{
                    JOptionPane.showMessageDialog(null,"Math Error check your input  ","",JOptionPane.ERROR_MESSAGE);
                }
            } else if (ob.getSource() == cancel) {
                iminus++;
                
                char[] ch2 = strcalc.toCharArray();
                char[] ch3 = new char[ch2.length-1];
                System.arraycopy(ch2, 0, ch3, 0, ch3.length);
                 strcalc = String.valueOf(ch3);
                 
                char[] ch = str.toCharArray();
                char[] ch1;        
                if (ch[(ch.length - 1)] == 'n') {
                    ch1 = new char[(ch.length - 3)];
                    System.arraycopy(ch, 0, ch1, 0, ch.length - 3);
                } else if (ch[(ch.length - 1)] == 'N') {
                    ch1 = new char[(ch.length - 2)];
                    System.arraycopy(ch, 0, ch1, 0, ch.length - 2);
                } else if (ch[(ch.length - 1)] == 'd') {
                    ch1 = new char[(ch.length - 5)];
                    System.arraycopy(ch, 0, ch1, 0, ch.length - 5);
                } else if (ch[(ch.length - 1)] == 's') {
                    ch1 = new char[(ch.length - 3)];
                    System.arraycopy(ch, 0, ch1, 0, ch.length - 3);
                } else if (ch[(ch.length - 1)] == 'g') {
                    ch1 = new char[(ch.length - 3)];
                    System.arraycopy(ch, 0, ch1, 0, ch.length - 3);
                } else {
                    ch1 = new char[(ch.length - 1)];
                    System.arraycopy(ch, 0, ch1, 0, ch.length - 1);
                }
                str = String.valueOf(ch1);
                area.setText(str);
            }
        }
    }
}
