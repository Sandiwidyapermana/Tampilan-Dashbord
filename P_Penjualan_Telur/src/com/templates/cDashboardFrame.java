package com.templates;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import com.partials.cLinkKeluar;

import com.partials.cColor;
import com.partials.cFonts;

public class cDashboardFrame extends JFrame{

    public JPanel sidebar = new JPanel();
  public JPanel header = new JPanel();
  public JPanel main = new JPanel();
  public JPanel content = new JPanel();

  private JLabel appText = new JLabel("Hallo TI - B");
  public JLabel roleText = new JLabel("Role | Nama User");
  public JLabel menuTitle = new JLabel("Menu Title");

  private cLinkKeluar exitLink = new cLinkKeluar(1590);

  public cDashboardFrame()
  {
    super();
    setSize(1920, 1080);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setUndecorated(true);
    setLocationRelativeTo(null);
    setLayout(null);

    sidebar.setBackground(cColor.BLACK);
    sidebar.setBounds(0, 0, 230, 1080);
    sidebar.setLayout(null);

    header.setBackground(cColor.BLACK_GRAY);
    header.setBounds(230, 0, 1922, 70);
    header.setLayout(null);

    main.setBackground(cColor.WHITE_GRAY);
    main.setBounds(230, 70, 1050, 650);
    main.setLayout(null);

    content.setBackground(cColor.WHITE);
    content.setBounds(320, 150, 1510, 830);
    content.setLayout(null);

    appText.setFont(cFonts.APP_FONT);
    appText.setBounds(0, 0, 230, 70);
    appText.setHorizontalAlignment(JLabel.CENTER);
    appText.setVerticalAlignment(JLabel.CENTER);
    appText.setForeground(cColor.WHITE);

    roleText.setFont(cFonts.ROLE_FONT);
    roleText.setBounds(30, 0, 400, 70);
    roleText.setVerticalAlignment(JLabel.CENTER);
    roleText.setForeground(cColor.WHITE);

    menuTitle.setFont(cFonts.MENU_TITLE_FONT);
    menuTitle.setBounds(900, 800, 600, 500);
    menuTitle.setVerticalAlignment(JLabel.CENTER);
    menuTitle.setForeground(cColor.GREEN);
    


        
        header.add(exitLink);
        sidebar.add(appText);
        header.add(roleText);
        main.add(menuTitle);


        main.add(content);
        main.add(menuTitle);
        add(sidebar);
        add(header);
        add(content);
    }

    public cDashboardFrame(String title)
    {
        this();
        setTitle(title);
    }

}
