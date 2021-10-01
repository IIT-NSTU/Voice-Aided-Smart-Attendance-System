package com.TeamEnigma.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AfterLogin extends Button_templete {

    Button_templete button_templete;
    private JButton enroll, home, reset, sheet;

    AfterLogin() {
        super.frame();
        super.setTitle("After login");
        super.container();
        setBackground(new Color(128, 219, 219));
        super.setBounds(250, 180, 600, 600);
        speak.setVisible(false);
        display.setVisible(false);
        login.setVisible(false);

        initcomponent();

   /* enroll = new JButton("Enroll");
    enroll.setBounds(150,20,100,50);
    setLayout(null);
    add(enroll);

    enroll.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            AfterEnroll afterEnroll = new AfterEnroll();
            afterEnroll.setVisible(true);
            dispose();
        }
    });

    sheet = new JButton("Sheet");
    sheet.setBounds(260,20,100,50);
    setLayout(null);
    add(sheet);
    sheet.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Attendance a = new Attendance();
            a.setVisible(true);
            dispose();
        }
    });

    reset = new JButton("Reset");
    reset.setBounds(380,20,100,50);
    setLayout(null);
    add(reset);


    reset.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            IdPassModifier idPassModifier = new IdPassModifier();
            idPassModifier.setVisible(true);
            dispose();
        }
    });

    home = new JButton("Home");
    home.setBounds(170,100,300,50);
    setLayout(null);
    add(home);

    home.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MatchFrame m = new MatchFrame();
            m.setVisible(true);
            dispose();
        }
    });*/

    }

   /* public void initcomponent() {
        enroll = new JButton("Enroll");
        enroll.setBounds(135, 220, 100, 50);
        setLayout(null);
        add(enroll);

        enroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AfterEnroll afterEnroll = new AfterEnroll();
                afterEnroll.setVisible(true);
                dispose();
            }
        });

        sheet = new JButton("Sheet");
        sheet.setBounds(250, 220, 100, 50);
        setLayout(null);
        add(sheet);
        sheet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Attendance a = new Attendance();
                a.setVisible(true);
                dispose();
            }
        });

        reset = new JButton("Reset");
        reset.setBounds(370, 220, 100, 50);
        setLayout(null);
        add(reset);


        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IdPassModifier idPassModifier = new IdPassModifier();
                idPassModifier.setVisible(true);
                dispose();
            }
        });

        home = new JButton("Home");
        home.setBounds(160, 320, 300, 50);
        setLayout(null);
        add(home);

    home.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MatchFrame m = new MatchFrame();
            m.setVisible(true);
            dispose();
        }
    });

    }
*/
    public void initcomponent() {
        enroll = new JButton("Enroll");
        enroll.setBounds(135, 220, 100, 50);
        setLayout(null);
        add(enroll);

        enroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AfterEnroll afterEnroll = new AfterEnroll();
                afterEnroll.setVisible(true);
                dispose();
            }
        });

        sheet = new JButton("Sheet");
        sheet.setBounds(250, 220, 100, 50);
        setLayout(null);
        add(sheet);
        sheet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Attendance a = new Attendance();
                a.setVisible(true);
                dispose();
            }
        });

        reset = new JButton("Reset");
        reset.setBounds(370, 220, 100, 50);
        setLayout(null);
        add(reset);


        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IdPassModifier idPassModifier = new IdPassModifier();
                idPassModifier.setVisible(true);
                dispose();
            }
        });

        home = new JButton("Home");
        home.setBounds(160, 320, 300, 50);
        setLayout(null);
        add(home);

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MatchFrame m = new MatchFrame();
                m.setVisible(true);
                dispose();
            }
        });
    }


    public static void main(String[] args) {
        AfterLogin a = new AfterLogin();
        a.setVisible(true);
    }
}
