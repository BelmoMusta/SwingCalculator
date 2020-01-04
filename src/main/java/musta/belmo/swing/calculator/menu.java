package musta.belmo.swing.calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Belmostapha
 */
public class menu extends javax.swing.JFrame {
    boolean equalPressed = false;
    String temp = "0";
    private static short nbVir = 0;
    private static short PlusOperation = 1;
    private static short MinusOperation = 2;
    private static short MultOperation = 3;
    private static short DivideOperation = 4;
    private static short normaliser = 5;
    private static short operations[] = {0, PlusOperation, MinusOperation, MultOperation, DivideOperation, normaliser};
    private static short operation;
    private static boolean buttonPressed;

    /*****/
    private void op(int n) {

        temp = jTextField1.getText();
        buttonPressed = true;
        operation = operations[n];
        nbVir = 0;

    }

    private void backSpace() {
        if (!equalPressed) {
            if (jTextField1.getText().length() == 1) {
                jTextField1.setText("0");
                temp = "0";
                jLabel1.setText("");
            } else {
                if (Verifier.isNumber(jTextField1.getText())) {
                    String rep = "";
                    for (int i = 0; i < jTextField1.getText().length() - 1; i++) {
                        rep += jTextField1.getText().charAt(i);
                        if (jTextField1.getText().charAt(i) == '.' || jTextField1.getText().charAt(i + 1) == '.')
                            nbVir = 0;
                    }
                    jTextField1.setText(rep);
                } else {
                    jTextField1.setText("0");
                    temp = "0";
                }
            }
        } else {
            jTextField1.setText("0");
        }
    }

    private void dot() {
        if (nbVir == 0 && !jTextField1.getText().contains(".")) {
            if (!buttonPressed) {
                jTextField1.setText(jTextField1.getText() + ".");
            } else jTextField1.setText("0.");
        }
        nbVir = 1;
        buttonPressed = false;
        equalPressed = false;
    }

    private void calculate() {

        if (Verifier.isNumber(temp) && Verifier.isNumber(jTextField1.getText())) {
            //  String permute=temp;
            // temp=jTextField1.getText();
            switch (operation) {
                case 1: {
                    jLabel1.setText(temp + " + " + jTextField1.getText() + " =");
                    double test = Double.parseDouble(jTextField1.getText()) + Double.parseDouble(temp);
                    if (String.valueOf(test).endsWith(".0"))
                        jTextField1.setText(String.valueOf(test).replace(".0", ""));
                    else jTextField1.setText(String.valueOf(test));
                }
                break;
                case 2: {
                    jLabel1.setText(temp + " - " + jTextField1.getText() + " =");
                    double test = -Double.parseDouble(jTextField1.getText()) + Double.parseDouble(temp);
                    if (String.valueOf(test).endsWith(".0"))
                        jTextField1.setText(String.valueOf(test).replace(".0", ""));
                    else jTextField1.setText(String.valueOf(test));
                }
                break;
                case 3: {
                    jLabel1.setText(temp + " X " + jTextField1.getText() + " =");
                    double test = Double.parseDouble(jTextField1.getText()) * Double.parseDouble(temp);
                    if (String.valueOf(test).endsWith(".0"))
                        jTextField1.setText(String.valueOf(test).replace(".0", ""));
                    else jTextField1.setText(String.valueOf(test));
                }
                break;
                case 4: {
                    jLabel1.setText(temp + " / " + jTextField1.getText() + " =");
                    double test = Double.parseDouble(temp) / Double.parseDouble(jTextField1.getText());
                    if (String.valueOf(test).endsWith(".0"))
                        jTextField1.setText(String.valueOf(test).replace(".0", ""));
                    else jTextField1.setText(String.valueOf(test));
                }
                break;
                case 5: {
                    Rationnel r;

                    if (Double.parseDouble(temp) - Math.floor(Double.parseDouble(temp)) == 0 &&
                            Double.parseDouble(jTextField1.getText()) - Math.floor(Double.parseDouble(jTextField1.getText())) == 0) {
                        int a = Integer.parseInt(temp);
                        int b = Integer.parseInt(jTextField1.getText());
                        r = new Rationnel(a, b);
                        r.normaliser();
                        jLabel1.setText(temp + " /" + jTextField1.getText() + " =");
                        jTextField1.setText(r.toString());
                    } else {
                        jTextField1.setText("invalide input");
                    }


                }
                break;
                default: {
                }

            }


        } else if (jTextField1.getText().contains("/")) {
            double n = Maths.evalDiv(jTextField1.getText());
            jTextField1.setText(String.valueOf(n));
            temp = "0";
        } else {
            jTextField1.setText("invalide input");
        }
        buttonPressed = true;
        nbVir = 0;
        equalPressed = true;


    }


    /*****/
    private void writeNumber(String s) {

        if (!buttonPressed) {
            if (jTextField1.getText().equals("0")) {


                jTextField1.setText(s);
            } else jTextField1.setText(jTextField1.getText() + s);
        } else {
            jTextField1.setText(s);
        }

        buttonPressed = false;
        equalPressed = false;

    }

    /**
     * Creates new form menu
     */
    public menu() {
        setTitle("Calculator");
        this.setFocusable(true);
        buttonPressed = false;

        initComponents();
        jRadioButton1.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                asciiHandler(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");
        jTextField1.setAutoscrolls(false);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.setFocusable(false);
        jTextField1.setHighlighter(null);

        jButton10.setText("n!");
        jButton10.setDefaultCapable(false);
        jButton10.setFocusPainted(false);
        jButton10.setFocusable(false);
        jButton10.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton6.setText(".");
        jButton6.setDefaultCapable(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton18.setText("Ln");
        jButton18.setDefaultCapable(false);
        jButton18.setFocusPainted(false);
        jButton18.setFocusable(false);
        jButton18.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton1.setText("0");
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton15.setText("/");
        jButton15.setDefaultCapable(false);
        jButton15.setFocusPainted(false);
        jButton15.setFocusable(false);
        jButton15.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton14.setText("9");
        jButton14.setDefaultCapable(false);
        jButton14.setFocusPainted(false);
        jButton14.setFocusable(false);
        jButton14.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton5.setText("1");
        jButton5.setDefaultCapable(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 51, 0));
        jButton24.setText("π");
        jButton24.setDefaultCapable(false);
        jButton24.setFocusPainted(false);
        jButton24.setFocusable(false);
        jButton24.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton8.setText("5");
        jButton8.setDefaultCapable(false);
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.setDefaultCapable(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton17.setText("+");
        jButton17.setDefaultCapable(false);
        jButton17.setFocusPainted(false);
        jButton17.setFocusable(false);
        jButton17.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton16.setText("=");
        jButton16.setFocusPainted(false);
        jButton16.setFocusable(false);
        jButton16.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton7.setText("2");
        jButton7.setDefaultCapable(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton26.setText("log");
        jButton26.setDefaultCapable(false);
        jButton26.setFocusPainted(false);
        jButton26.setFocusable(false);
        jButton26.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton2.setText("C");
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("7");
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton19.setText("-");
        jButton19.setDefaultCapable(false);
        jButton19.setFocusPainted(false);
        jButton19.setFocusable(false);
        jButton19.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton13.setText("6");
        jButton13.setDefaultCapable(false);
        jButton13.setFocusPainted(false);
        jButton13.setFocusable(false);
        jButton13.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton25.setText("tan");
        jButton25.setDefaultCapable(false);
        jButton25.setFocusPainted(false);
        jButton25.setFocusable(false);
        jButton25.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton27.setText("sin");
        jButton27.setDefaultCapable(false);
        jButton27.setFocusPainted(false);
        jButton27.setFocusable(false);
        jButton27.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton20.setText("*");
        jButton20.setDefaultCapable(false);
        jButton20.setFocusPainted(false);
        jButton20.setFocusable(false);
        jButton20.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton9.setText("8");
        jButton9.setDefaultCapable(false);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton21.setText("exp");
        jButton21.setDefaultCapable(false);
        jButton21.setFocusPainted(false);
        jButton21.setFocusable(false);
        jButton21.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton23.setText("cos");
        jButton23.setDefaultCapable(false);
        jButton23.setFocusPainted(false);
        jButton23.setFocusable(false);
        jButton23.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton11.setText("±");
        jButton11.setDefaultCapable(false);
        jButton11.setFocusPainted(false);
        jButton11.setFocusable(false);
        jButton11.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton22.setForeground(new java.awt.Color(255, 51, 51));
        jButton22.setText("e");
        jButton22.setDefaultCapable(false);
        jButton22.setFocusPainted(false);
        jButton22.setFocusable(false);
        jButton22.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton12.setText("3");
        jButton12.setDefaultCapable(false);
        jButton12.setFocusPainted(false);
        jButton12.setFocusable(false);
        jButton12.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton28.setText("1/x");
        jButton28.setDefaultCapable(false);
        jButton28.setFocusPainted(false);
        jButton28.setFocusable(false);
        jButton28.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("x³");
        jButton29.setDefaultCapable(false);
        jButton29.setFocusPainted(false);
        jButton29.setFocusable(false);
        jButton29.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText("x²");
        jButton30.setBorderPainted(false);
        jButton30.setDefaultCapable(false);
        jButton30.setFocusPainted(false);
        jButton30.setFocusable(false);
        jButton30.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton32.setText("←");
        jButton32.setDefaultCapable(false);
        jButton32.setFocusPainted(false);
        jButton32.setFocusable(false);
        jButton32.setMaximumSize(new java.awt.Dimension(48, 32));
        jButton32.setMinimumSize(new java.awt.Dimension(48, 32));
        jButton32.setName(""); // NOI18N
        jButton32.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton32.setRolloverEnabled(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton31.setText("√x");
        jButton31.setDefaultCapable(false);
        jButton31.setFocusPainted(false);
        jButton31.setFocusable(false);
        jButton31.setPreferredSize(new java.awt.Dimension(48, 32));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton33.setText("a/b");
        jButton33.setToolTipText("Normalize a rationnal number");
        jButton33.setFocusable(false);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Radian");
        jRadioButton1.setFocusable(false);
        jRadioButton1.setRequestFocusEnabled(false);
        jRadioButton1.setRolloverEnabled(false);
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radio2(evt);
            }
        });

        jRadioButton2.setText("Degree");
        jRadioButton2.setFocusable(false);
        jRadioButton2.setRequestFocusEnabled(false);
        jRadioButton2.setRolloverEnabled(false);
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioo(evt);
            }
        });

        jRadioButton3.setText("Grade");
        jRadioButton3.setFocusable(false);
        jRadioButton3.setRequestFocusEnabled(false);
        jRadioButton3.setRolloverEnabled(false);
        jRadioButton3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radio(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioButton3)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton2))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        writeNumber("0");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        /*if(!jTextField1.getText().equals("0")||!buttonPressed){ jTextField1.setText(jTextField1.getText()+"1");}
        else jTextField1.setText("1");
        buttonPressed=false;*/


        writeNumber("1");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        writeNumber("2");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        writeNumber("3");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        writeNumber("4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        writeNumber("5");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        writeNumber("6");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        writeNumber("7");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        writeNumber("8");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        writeNumber("9");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        op(1);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        op(2);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        op(3);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        op(4);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        calculate();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dot();        // TODO add your handling code here:

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int n;
        int fact = 1;
        jLabel1.setText(jTextField1.getText() + " !");
        if (Verifier.isNumber(jTextField1.getText())) {
            if (jTextField1.getText().contains(".")) {
                if (jTextField1.getText().endsWith(".0")) {
                    n = Integer.parseInt(jTextField1.getText().replace(".0", ""));
                    if (n < 17) {
                        for (int i = 0; i < n; i++) fact *= n - i;
                        jTextField1.setText(String.valueOf(fact));
                    } else jTextField1.setText("Memory overflow!");
                } else jTextField1.setText("invalide input!");


            } else {
                n = Integer.parseInt(jTextField1.getText());
                if (n < 0) jTextField1.setText("invalide input!");
                else if (n >= 17) jTextField1.setText("Memory overflow!");
                else {
                    for (int i = 0; i < n; i++) fact *= n - i;

                    jTextField1.setText(String.valueOf(fact));


                }


            }
        } else jTextField1.setText("invalide input");
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if (Verifier.isNumber(jTextField1.getText())) {
            if (String.valueOf(-Double.parseDouble(jTextField1.getText())).endsWith(".0"))
                jTextField1.setText(String.valueOf(-Double.parseDouble(jTextField1.getText())).replace(".0", ""));
            else jTextField1.setText(String.valueOf(-Double.parseDouble(jTextField1.getText())));


        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // cos
        jLabel1.setText("cos(" + jTextField1.getText() + ") =");
        double p = 0;   /// (a < 0) ? -a : a

        if (Verifier.isNumber(jTextField1.getText())) {
            if (jRadioButton2.isSelected()) p = Math.toRadians(Double.parseDouble(jTextField1.getText()));
            else if (jRadioButton3.isSelected()) p = Verifier.toGrades(Double.parseDouble(jTextField1.getText()));
            else if (jRadioButton1.isSelected()) p = Double.parseDouble(jTextField1.getText());
            if (String.valueOf(Math.cos(p)).endsWith(".0"))
                jTextField1.setText(String.valueOf(Math.abs(Math.cos(p)) <= 0.00000001 ? 0 : Math.cos(p)).replace(".0", ""));
            else jTextField1.setText(String.valueOf(Math.abs(Math.cos(p)) <= 0.00000000001 ? 0 : Math.cos(p)));
        } else {
            jTextField1.setText("invalide input!");
        }
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jLabel1.setText("e = ");

        jTextField1.setText(String.valueOf(Math.exp(1)));
        buttonPressed = true;
        nbVir = 0;

    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jLabel1.setText("PI = ");
        jTextField1.setText(String.valueOf(Math.PI));
        buttonPressed = true;
        nbVir = 0;

    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        //exponential
        jLabel1.setText("Exp( " + jTextField1.getText() + ") =");
        if (Verifier.isNumber(jTextField1.getText())) {
            if (String.valueOf(Math.exp(Double.parseDouble(jTextField1.getText()))).endsWith(".0"))
                jTextField1.setText(String.valueOf(Math.exp(Double.parseDouble(jTextField1.getText()))).replace(".0", ""));
            else jTextField1.setText(String.valueOf(Math.exp(Double.parseDouble(jTextField1.getText()))));

        }//GEN-LAST:event_jButton21ActionPerformed
        buttonPressed = true;
        nbVir = 0;
    }

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // sin
        jLabel1.setText("sin( " + jTextField1.getText() + ") =");
        double p = 0;   /// (a < 0) ? -a : a

        if (Verifier.isNumber(jTextField1.getText())) {
            if (jRadioButton2.isSelected()) p = Math.toRadians(Double.parseDouble(jTextField1.getText()));
            else if (jRadioButton3.isSelected()) p = Verifier.toGrades(Double.parseDouble(jTextField1.getText()));
            else if (jRadioButton1.isSelected()) p = Double.parseDouble(jTextField1.getText());
            if (String.valueOf(Math.sin(p)).endsWith(".0"))
                jTextField1.setText(String.valueOf(Math.abs(Math.sin(p)) <= 0.00000001 ? 0 : Math.sin(p)).replace(".0", ""));
            else jTextField1.setText(String.valueOf(Math.abs(Math.sin(p)) <= 0.0000000001 ? 0 : Math.sin(p)));
        } else {
            jTextField1.setText("invalide input!");
        }
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // tan
        jLabel1.setText("tan( " + jTextField1.getText() + ") =");
        double p = 0;   /// (a < 0) ? -a : a

        if (Verifier.isNumber(jTextField1.getText())) {
            if (jRadioButton2.isSelected()) p = Math.toRadians(Double.parseDouble(jTextField1.getText()));
            else if (jRadioButton3.isSelected()) p = Verifier.toGrades(Double.parseDouble(jTextField1.getText()));
            else if (jRadioButton1.isSelected()) p = Double.parseDouble(jTextField1.getText());

            if (String.valueOf(Math.tan(p)).endsWith(".0"))
                jTextField1.setText(String.valueOf((Math.abs(Math.tan(p)) <= 0.00000001) ? 0 : ((Math.abs(Math.tan(p)) >= 1E16) ? (p < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY) : Math.abs(Math.tan(p)))).replace(".0", ""));
            else
                jTextField1.setText(String.valueOf((Math.abs(Math.tan(p)) <= 0.00000001) ? 0 : ((Math.abs(Math.tan(p)) >= 1E16) ? (p < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY) : Math.abs(Math.tan(p)))));
        } else {
            jTextField1.setText("invalide input!");
        }
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        //logarithm
        jLabel1.setText("Ln(" + jTextField1.getText() + ") =");
        if (Verifier.isNumber(jTextField1.getText())) {
            if (String.valueOf(Math.log(Double.parseDouble(jTextField1.getText()))).endsWith(".0"))
                jTextField1.setText(String.valueOf(Math.log(Double.parseDouble(jTextField1.getText()))).replace(".0", ""));
            else jTextField1.setText(String.valueOf(Math.log(Double.parseDouble(jTextField1.getText()))));
        }
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton18ActionPerformed

    private void asciiHandler(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_asciiHandler
        if (Character.isDigit(evt.getKeyChar())) {
            writeNumber(String.valueOf(evt.getKeyChar()));
        } else
        switch (evt.getKeyChar()) {
            //case 'E' :writeNumber("E"); break;
            //case 'e' :writeNumber("E"); break;
            case '\n':
                calculate();
                break;
            case '+':
                op(1);
                break;

            case '-':
                op(2);
                break;
            case '.':
                dot();
                break;
            case ',':
                dot();
                break;
            case '*':
                op(3);
                break;
            case '/':
                op(4);
                break;
            case 27: {
                temp = "0";
                buttonPressed = true;
                jTextField1.setText("0");
                nbVir = 0;
            }
            break;
            case 8: {
                backSpace();
            }
            break;
        }
    }//GEN-LAST:event_asciiHandler

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("log( " + jTextField1.getText() + ") =");
        if (Verifier.isNumber(jTextField1.getText())) {
            if (String.valueOf(Math.log10(Double.parseDouble(jTextField1.getText()))).endsWith(".0"))
                jTextField1.setText(String.valueOf(Math.log10(Double.parseDouble(jTextField1.getText()))).replace(".0", ""));
            else jTextField1.setText(String.valueOf(Math.log10(Double.parseDouble(jTextField1.getText()))));
        }
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jLabel1.setText("1/" + jTextField1.getText() + " = ");
        if (Verifier.isNumber(jTextField1.getText())) {
            if (String.valueOf(Math.pow(Double.parseDouble(jTextField1.getText()), -1)).endsWith(".0"))
                jTextField1.setText(String.valueOf(Math.pow(Double.parseDouble(jTextField1.getText()), -1)).replace(".0", ""));
            else jTextField1.setText(String.valueOf(Math.pow(Double.parseDouble(jTextField1.getText()), -1)));

        }
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        jLabel1.setText(jTextField1.getText() + "³ = ");
        if (Verifier.isNumber(jTextField1.getText())) {
            if (String.valueOf(Math.pow(Double.parseDouble(jTextField1.getText()), 3)).endsWith(".0"))
                jTextField1.setText(String.valueOf(Math.pow(Double.parseDouble(jTextField1.getText()), 3)).replace(".0", ""));
            else jTextField1.setText(String.valueOf(Math.pow(Double.parseDouble(jTextField1.getText()), 3)));

        }
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jLabel1.setText(jTextField1.getText() + "² = ");
        if (Verifier.isNumber(jTextField1.getText())) {
            if (String.valueOf(Math.pow(Double.parseDouble(jTextField1.getText()), 2)).endsWith(".0"))
                jTextField1.setText(String.valueOf(Math.pow(Double.parseDouble(jTextField1.getText()), 2)).replace(".0", ""));
            else jTextField1.setText(String.valueOf(Math.pow(Double.parseDouble(jTextField1.getText()), 2)));

        }
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        if (Verifier.isNumber(jTextField1.getText())) {
            if (String.valueOf(Math.sqrt(Double.parseDouble(jTextField1.getText()))).endsWith(".0"))
                jTextField1.setText(String.valueOf(Math.sqrt(Double.parseDouble(jTextField1.getText()))).replace(".0", ""));
            else jTextField1.setText(String.valueOf(Math.sqrt(Double.parseDouble(jTextField1.getText()))));

        }
        buttonPressed = true;
        nbVir = 0;
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void radio2(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radio2
        if (jRadioButton1.isSelected()) {
            jRadioButton3.setSelected(false);
            jRadioButton2.setSelected(false);
        }
        if (!jRadioButton1.isSelected() && (!jRadioButton2.isSelected()) && (!jRadioButton3.isSelected())) {
            jRadioButton1.setSelected(true);
        }
    }//GEN-LAST:event_radio2

    private void radio(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radio
        if (jRadioButton3.isSelected()) {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
        }
        if (!jRadioButton1.isSelected() && (!jRadioButton2.isSelected()) && (!jRadioButton3.isSelected())) {
            jRadioButton3.setSelected(true);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_radio

    private void radioo(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioo
        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
        }
        if (!jRadioButton1.isSelected() && (!jRadioButton2.isSelected()) && (!jRadioButton3.isSelected())) {
            jRadioButton2.setSelected(true);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_radioo

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        op(5);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        temp = "0";     // TODO add your handling code here:
        buttonPressed = true;
        jTextField1.setText("0");
        nbVir = 0;
        jLabel1.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        backSpace();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}