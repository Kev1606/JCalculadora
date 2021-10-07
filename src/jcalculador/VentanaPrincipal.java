package jcalculador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private String memoria1;
    private String memoria2;
    private String signo;
    private int counter=0;
    private Operaciones resultado;
    private Archivos bitacora;
    private String path = "Bitacora.txt";
    private boolean estaBinario;
    private boolean estaPrimo;
    private ArrayList<String> memoriaNumeros = new ArrayList<>();
    
    public VentanaPrincipal(String titulo) {
        initComponents();
        setTitle(titulo);
        setResizable(false);
        setLocationRelativeTo(null);
        
        this.resultado = new Operaciones();
        this.bitacora = new Archivos();
        this.bitacora.createFile(path);
    }

    public String getMemoria2() {
        return memoria2;
    }

    public void setMemoria2(String memoria2) {
        this.memoria2 = memoria2;
    }

    public String getMemoria1() {
        return memoria1;
    }

    public void setMemoria1(String memoria1) {
        this.memoria1 = memoria1;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public boolean isEstaBinario() {
        return estaBinario;
    }
    
    public void setEstaBinario(boolean estaBinario){
        this.estaBinario = estaBinario;
    }

    public boolean isEstaPrimo() {
        return estaPrimo;
    }

    public void setEstaPrimo(boolean estaPrimo) {
        this.estaPrimo = estaPrimo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotones = new javax.swing.JPanel();
        btnNumber4 = new javax.swing.JButton();
        btnNumber7 = new javax.swing.JButton();
        btnNumber1 = new javax.swing.JButton();
        btnNumber0 = new javax.swing.JButton();
        btnNumber8 = new javax.swing.JButton();
        btnNumber5 = new javax.swing.JButton();
        btnNumber2 = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnNumber3 = new javax.swing.JButton();
        btnNumber6 = new javax.swing.JButton();
        btnNumber9 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnPromedio = new javax.swing.JButton();
        btnGuardaMemoria = new javax.swing.JButton();
        btnData = new javax.swing.JButton();
        btnBinario = new javax.swing.JButton();
        btnPrimo = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        pnlTexto = new javax.swing.JPanel();
        txfNumeros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBotones.setBackground(new java.awt.Color(51, 51, 51));
        pnlBotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNumber4.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber4.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber4.setText("4");
        btnNumber4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber4ActionPerformed(evt);
            }
        });

        btnNumber7.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber7.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber7.setText("7");
        btnNumber7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber7ActionPerformed(evt);
            }
        });

        btnNumber1.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber1.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber1.setText("1");
        btnNumber1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });

        btnNumber0.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber0.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber0.setText("0");
        btnNumber0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber0ActionPerformed(evt);
            }
        });

        btnNumber8.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber8.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber8.setText("8");
        btnNumber8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber8ActionPerformed(evt);
            }
        });

        btnNumber5.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber5.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber5.setText("5");
        btnNumber5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber5ActionPerformed(evt);
            }
        });

        btnNumber2.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber2.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber2.setText("2");
        btnNumber2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber2ActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(51, 51, 51));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("C");
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(51, 51, 51));
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnNumber3.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber3.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber3.setText("3");
        btnNumber3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber3ActionPerformed(evt);
            }
        });

        btnNumber6.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber6.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber6.setText("6");
        btnNumber6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber6ActionPerformed(evt);
            }
        });

        btnNumber9.setBackground(new java.awt.Color(51, 51, 51));
        btnNumber9.setForeground(new java.awt.Color(255, 255, 255));
        btnNumber9.setText("9");
        btnNumber9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber9ActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(51, 51, 51));
        btnDivision.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(0, 51, 204));
        btnDivision.setText("/");
        btnDivision.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnMultiplicacion.setBackground(new java.awt.Color(51, 51, 51));
        btnMultiplicacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(0, 51, 204));
        btnMultiplicacion.setText("*");
        btnMultiplicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(51, 51, 51));
        btnResta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnResta.setForeground(new java.awt.Color(0, 51, 204));
        btnResta.setText("-");
        btnResta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnSuma.setBackground(new java.awt.Color(51, 51, 51));
        btnSuma.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(0, 51, 204));
        btnSuma.setText("+");
        btnSuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnPromedio.setBackground(new java.awt.Color(51, 51, 51));
        btnPromedio.setForeground(new java.awt.Color(255, 255, 255));
        btnPromedio.setText("Avg");
        btnPromedio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioActionPerformed(evt);
            }
        });

        btnGuardaMemoria.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardaMemoria.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardaMemoria.setText("M+");
        btnGuardaMemoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardaMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaMemoriaActionPerformed(evt);
            }
        });

        btnData.setBackground(new java.awt.Color(51, 51, 51));
        btnData.setForeground(new java.awt.Color(255, 255, 255));
        btnData.setText("Data");
        btnData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActionPerformed(evt);
            }
        });

        btnBinario.setBackground(new java.awt.Color(51, 51, 51));
        btnBinario.setForeground(new java.awt.Color(255, 255, 255));
        btnBinario.setText("Binario");
        btnBinario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinarioActionPerformed(evt);
            }
        });

        btnPrimo.setBackground(new java.awt.Color(51, 51, 51));
        btnPrimo.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimo.setText("Primo");
        btnPrimo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimoActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(0, 51, 204));
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnData, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnNumber4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(btnNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNumber7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNumber0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnNumber2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNumber5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumber8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnNumber9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(btnNumber6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(btnGuardaMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addComponent(btnBinario, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardaMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNumber0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pnlTexto.setBackground(new java.awt.Color(51, 51, 51));
        pnlTexto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txfNumeros.setBackground(new java.awt.Color(255, 255, 255));
        txfNumeros.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txfNumeros.setForeground(new java.awt.Color(0, 0, 102));
        txfNumeros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfNumeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNumerosKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlTextoLayout = new javax.swing.GroupLayout(pnlTexto);
        pnlTexto.setLayout(pnlTextoLayout);
        pnlTextoLayout.setHorizontalGroup(
            pnlTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txfNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTextoLayout.setVerticalGroup(
            pnlTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTextoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(txfNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarioActionPerformed
        estaBinario = true;
        try {           
            setMemoria1(txfNumeros.getText());
            Double numero = Double.parseDouble(txfNumeros.getText());
            int numeroAConvertir = numero.intValue();
            txfNumeros.setText(Integer.toBinaryString(numeroAConvertir));
            bitacora.writeToFile(path,"Binario: "+txfNumeros.getText()+" del Decimal: "+getMemoria1()+"\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se puede ejecutar la conversion a binario","Error de Conversion",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBinarioActionPerformed

    private void btnNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber7ActionPerformed
        addNumber("7");

    }//GEN-LAST:event_btnNumber7ActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        addSigno("/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber5ActionPerformed
        addNumber("5");

    }//GEN-LAST:event_btnNumber5ActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        setMemoria2(txfNumeros.getText());
        resultado.setNumero2(getMemoria2());
        if (getMemoria1() != null){
            if (memoria2.equals("0") & signo.equals("/")) {
                JOptionPane.showMessageDialog(this,"La division entre 0 no esta permitido","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                if (memoria1 == null || memoria1.equals("")) {
                    txfNumeros.setText(getMemoria2());
                } else {
                    txfNumeros.setText(resultado.resultadoOperacion());
                    bitacora.writeToFile(path, getMemoria1()+getSigno()+getMemoria2()+"= "+txfNumeros.getText()+"\n");
                    setMemoria1(resultado.getNumero1());
                }
            }           
        } else{
            txfNumeros.setText(getMemoria2());
            bitacora.writeToFile(path, getMemoria2()+"= "+txfNumeros.getText()+"\n");
            setMemoria2(txfNumeros.getText());
        }
        setSigno("");
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber1ActionPerformed
        addNumber("1");
    }//GEN-LAST:event_btnNumber1ActionPerformed

    private void btnNumber0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber0ActionPerformed
        addNumber("0");
    }//GEN-LAST:event_btnNumber0ActionPerformed

    private void btnNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber2ActionPerformed
        addNumber("2");
    }//GEN-LAST:event_btnNumber2ActionPerformed

    private void btnNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber3ActionPerformed
        addNumber("3");
    }//GEN-LAST:event_btnNumber3ActionPerformed

    private void btnNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber4ActionPerformed
       addNumber("4");
    }//GEN-LAST:event_btnNumber4ActionPerformed

    private void btnNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber6ActionPerformed
        addNumber("6");
    }//GEN-LAST:event_btnNumber6ActionPerformed

    private void btnNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber8ActionPerformed
        addNumber("8");
    }//GEN-LAST:event_btnNumber8ActionPerformed

    private void btnNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber9ActionPerformed
        addNumber("9");
    }//GEN-LAST:event_btnNumber9ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        String cadena = txfNumeros.getText();    
        if (cadena.length() <= 0){
            txfNumeros.setText("0.");
        } else {
            if(!existePunto(txfNumeros.getText())){
                addNumber(".");
            }
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txfNumeros.setText("");
        resultado.borrarJuego();
        setMemoria1("");
        setMemoria2("");
        setSigno("");
        setEstaBinario(false);
        setEstaPrimo(false);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        addSigno("+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        if (txfNumeros.getText().equals("")) {
            addNumber("-");
        } else{
            addSigno("-");
        }      
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        addSigno("*");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnGuardaMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaMemoriaActionPerformed
        if (estaPrimo==false) {
            if(estaBinario==false){
                if (!txfNumeros.getText().equals("")) {
                    bitacora.writeToFile(path, "M+ "+txfNumeros.getText()+" > ");
                    if (memoriaNumeros.size() < 10) {
                        memoriaNumeros.add(txfNumeros.getText());
                        for (int i = 0; i < memoriaNumeros.size(); i++) {
                            bitacora.writeToFile(path, memoriaNumeros.get(i)+" ");
                        }
                        bitacora.writeToFile(path, "\n");
                    } else{
                        memoriaNumeros.remove(counter);
                        memoriaNumeros.add(counter,txfNumeros.getText());
                        counter++;
                        if (counter==10) {
                            counter=0;
                        }
                        for (int i = 0; i < memoriaNumeros.size(); i++) {
                            bitacora.writeToFile(path, memoriaNumeros.get(i)+" ");
                        }
                        bitacora.writeToFile(path, "\n");
                    }
                    resultado.setMemoriaNumeros(memoriaNumeros);               
                } else{
                    JOptionPane.showMessageDialog(this, "No se puede añadir, digite un numero","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se puede añadir un binario, digite otro numero","Error: Numero Binario",JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "No se puede añadir un booleano, digite un numero","Error: Valor Booleano",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardaMemoriaActionPerformed

    private void btnPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioActionPerformed
        if(memoriaNumeros.size() > 0){
            txfNumeros.setText(String.valueOf(resultado.promNumeros()));
            bitacora.writeToFile(path, "Avg ");
            for (int i = 0; i < memoriaNumeros.size(); i++) {
                bitacora.writeToFile(path, memoriaNumeros.get(i)+" ");
            }
            bitacora.writeToFile(path, "= "+txfNumeros.getText()+"\n");
        } else {
            txfNumeros.setText("0");
        }
    }//GEN-LAST:event_btnPromedioActionPerformed

    private void btnPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimoActionPerformed
        if (!estaBinario) {
            if (!txfNumeros.getText().equals("")){
                setMemoria1(txfNumeros.getText());
                if (resultado.esPrimo(txfNumeros.getText())) {
                    bitacora.writeToFile(path, "Primo "+txfNumeros.getText()+" true\n");
                    txfNumeros.setText("True");
                    setEstaPrimo(true);
                } else{
                    bitacora.writeToFile(path, "Primo "+txfNumeros.getText()+" false\n");
                    txfNumeros.setText("False");
                    setEstaPrimo(true);
                }              
            } else{
                JOptionPane.showMessageDialog(this, "No se puede calcular, digite un numero","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "No se puede calcular un binario, digite otro numero","Error: Numero Binario",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrimoActionPerformed

    private void btnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActionPerformed
        VentanaData vData = new VentanaData(bitacora,this.path);
        vData.setVisible(true);
    }//GEN-LAST:event_btnDataActionPerformed

    private void txfNumerosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNumerosKeyReleased
        if (estaBinario == true | estaPrimo == true) {
            txfNumeros.setText(getMemoria1());
            setEstaBinario(false);
        }
        
        if (evt.getKeyChar()=='C' | evt.getKeyChar()=='c') {
            btnBorrar.doClick();
        } else {
            }if (evt.getKeyChar()=='+') {
                String digitoFuera = txfNumeros.getText();
                txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                btnSuma.doClick();
            }else {
                }if (evt.getKeyChar()=='-') {
                    String digitoFuera = txfNumeros.getText();
                    txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                    btnResta.doClick();
                }else {
                    }if (evt.getKeyChar()=='*') {
                        String digitoFuera = txfNumeros.getText();
                        txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                        btnMultiplicacion.doClick();
                    }else {
                        }if (evt.getKeyChar()=='/') {
                            String digitoFuera = txfNumeros.getText();
                            txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                            btnDivision.doClick();
                        }else {
                            }if (evt.getKeyChar()=='\n'){                           
                                btnIgual.doClick();
                            } else{
                                }if (evt.getKeyChar()=='.'){
                                    String digitoFuera = txfNumeros.getText();
                                    txfNumeros.setText(digitoFuera.replaceFirst(".$",""));
                                    btnPunto.doClick();
                                }
    }//GEN-LAST:event_txfNumerosKeyReleased
    
    boolean existePunto(String cadena){
        boolean resultado = false;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i,i+1).equals(".")) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    void addNumber(String memoria1){
        if (estaBinario == true | estaPrimo == true) {
            txfNumeros.setText(getMemoria1());
            setEstaBinario(false);
        }
        txfNumeros.setText(txfNumeros.getText()+ memoria1);
    }
    
    void addSigno(String signo1){
        try {
            double evitaLetras = Double.parseDouble(txfNumeros.getText());           
            if (estaBinario == true | estaPrimo == true) {
                setMemoria1(txfNumeros.getText());
                txfNumeros.setText(getMemoria1());
                setEstaBinario(false);
                setEstaPrimo(false);
            }
            if (!txfNumeros.getText().equals("")) {
                setMemoria1(txfNumeros.getText());
                if (getMemoria1() == null | getMemoria1().equals("")){
                    setMemoria1(txfNumeros.getText());
                    resultado.setNumero1(getMemoria1());
                    setSigno(signo1);
                    resultado.setSigno(getSigno());
                    txfNumeros.setText("");
                } else {
                    setSigno(signo1);
                    setMemoria1(txfNumeros.getText());
                    resultado.setNumero1(getMemoria1());
                    resultado.setSigno(getSigno());
                    txfNumeros.setText("");
                }
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pueden digitar letras","Error",JOptionPane.ERROR_MESSAGE);
            txfNumeros.setText("");
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinario;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnData;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnGuardaMemoria;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNumber0;
    private javax.swing.JButton btnNumber1;
    private javax.swing.JButton btnNumber2;
    private javax.swing.JButton btnNumber3;
    private javax.swing.JButton btnNumber4;
    private javax.swing.JButton btnNumber5;
    private javax.swing.JButton btnNumber6;
    private javax.swing.JButton btnNumber7;
    private javax.swing.JButton btnNumber8;
    private javax.swing.JButton btnNumber9;
    private javax.swing.JButton btnPrimo;
    private javax.swing.JButton btnPromedio;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlTexto;
    private javax.swing.JTextField txfNumeros;
    // End of variables declaration//GEN-END:variables
}