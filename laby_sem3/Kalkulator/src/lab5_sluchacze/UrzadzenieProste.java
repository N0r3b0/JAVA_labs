package lab5_sluchacze;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class UrzadzenieProste extends Klawiatura
{
    private static final long serialVersionUID = 10;

    public short pobierzCalkowita(JTextField jtf)
    {
        short argument;
        try{
            argument = Short.parseShort(jtf.getText());
        }
        catch (NumberFormatException x)
        {
            argument = 0;
            System.out.println(x.toString());
        }
        return argument;
    }
    public float pobierzReczywista(JTextField jtf)
    {
        return Float.parseFloat(jtf.getText());
    }
    public UrzadzenieProste()
    {
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                short x, y, z;
                if(ae.getSource() == przycisk1)
                    dispose();
                if(ae.getSource() == poletekstowe1)
                    etykieta.setText("Pole Tekstowe");
                if(ae.getSource() == przycisk2) {
                    x = pobierzCalkowita(poletekstowe1);
                    y = pobierzCalkowita(poletekstowe2);
                    z = (short) (x + y);
                    boolean poprawne = !(Integer.signum(x) == Integer.signum(y)) && Integer.signum(x) != Integer.signum(z);
                    if (poprawne)
                        etykieta.setText("suma = " + z);
                    else {
                        try {throw new MojWyjatek(x, y );}
                        catch (MojWyjatek wyjatek){
                            System.out.println(wyjatek.toString());
                            etykieta.setText("skorygowane = " + wyjatek.suma);
                        }
                    }
                }

                    if(ae.getSource() == przycisk3)
                    {
                        x = pobierzCalkowita(poletekstowe1);
                        y = pobierzCalkowita(poletekstowe2);
                        z = (short) (x-y);
                        etykieta.setText("roznica = " + z);
                    }
                    if(ae.getSource() == przycisk4)
                    {
                        float a, b, c;
                        a = pobierzReczywista(poletekstowe1);
                        b = pobierzReczywista(poletekstowe2);
                        c = a/b;
                        etykieta.setText("iloraz = " + c);
                    }
                    if(ae.getSource() == przycisk5)
                    {
                        float a, b, c;
                        a = pobierzReczywista(poletekstowe1);
                        b = pobierzReczywista(poletekstowe2);
                        c = a*b;
                        etykieta.setText("iloczyn = " + c);
                    }
            }
        };

        przycisk1.addActionListener(al);
        przycisk2.addActionListener(al);
        przycisk3.addActionListener(al);
        przycisk4.addActionListener(al);
        przycisk5.addActionListener(al);
        poletekstowe1.addActionListener(al);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UrzadzenieProste();
            }
        });
    }
}
