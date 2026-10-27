/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sacidepatinete;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import testeAMRDao.CadastroDao;
import testeAMRModel.Cadastro;

/**
 *
 * @author rafae
 */
public class saciDePatinete extends javax.swing.JFrame 
{
    
String nome;
String cpf;
String sexo;
String tipo;
String email;
String cep;
String bairro;
String rua;
String uf;
String cidade;
String limiteCredito;
String telefone;
String nascimento;

private final javax.swing.JTextField txtPesquisa = new javax.swing.JTextField();
private final javax.swing.table.DefaultTableModel modeloTabela =
    new javax.swing.table.DefaultTableModel(
    new String[]{"ID", "Nome", "CPF", "Sexo", "Email"}, 0) 
    {
        @Override
        public boolean isCellEditable(int row, int col) { return false; }
    };
private final javax.swing.JTable tabela = new javax.swing.JTable(modeloTabela);
private final javax.swing.JLabel lblStatus = new javax.swing.JLabel(" ");
private javax.swing.Timer timerBusca;
private javax.swing.SwingWorker<java.util.ArrayList<Cadastro>, Void> workerBusca;
private javax.swing.JTabbedPane abas;
private javax.swing.Timer timerAuto;
    /**
     * Creates new form saciDePatinete
     */
    public saciDePatinete() {
        initComponents();
        montarAbas();
        configurarSexo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        cbCad = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        txtLimite = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Salvar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sacidepatinete/cachorro_100x88.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("panelPerfil");

        txtNome.setBackground(new java.awt.Color(204, 255, 255));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        cbSexo.setBackground(new java.awt.Color(204, 255, 255));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Não Binário" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        cbCad.setBackground(new java.awt.Color(204, 255, 255));
        cbCad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Juridica" }));

        txtEmail.setBackground(new java.awt.Color(204, 255, 255));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtLimite.setBackground(new java.awt.Color(204, 255, 255));
        txtLimite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLimiteKeyPressed(evt);
            }
        });

        jLabel4.setText("Sexo");

        jLabel5.setText("Tipo Cadastro");

        jLabel6.setText("Email");

        jLabel7.setText("Limite de Crédito");

        txtBairro.setBackground(new java.awt.Color(204, 255, 255));
        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroKeyPressed(evt);
            }
        });

        txtRua.setBackground(new java.awt.Color(204, 255, 255));
        txtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRuaKeyPressed(evt);
            }
        });

        jLabel8.setText("CEP");

        jLabel9.setText("Bairro");

        jLabel10.setText("Rua");

        txtUF.setBackground(new java.awt.Color(204, 255, 255));
        txtUF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUFKeyPressed(evt);
            }
        });

        txtCity.setBackground(new java.awt.Color(204, 255, 255));
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        jLabel11.setText("UF");

        jLabel12.setText("Cidade");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Salvar.setBackground(new java.awt.Color(0, 51, 51));
        Salvar.setForeground(new java.awt.Color(255, 255, 255));
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(0, 51, 51));
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        Cancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CancelarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Salvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Salvar.getAccessibleContext().setAccessibleDescription("buttonSalvar");
        Cancelar.getAccessibleContext().setAccessibleDescription("buttonCancelar");

        txtCpf.setBackground(new java.awt.Color(204, 255, 255));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfKeyPressed(evt);
            }
        });

        txtCep.setBackground(new java.awt.Color(204, 255, 255));
        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepKeyPressed(evt);
            }
        });

        jLabel13.setText("Telefone");

        txtTelefone.setBackground(new java.awt.Color(204, 255, 255));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });

        jLabel14.setText("Nascimento");

        txtNascimento.setBackground(new java.awt.Color(204, 255, 255));
        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUF)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(txtCep))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(183, 183, 183))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCpf)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRua)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(15, Short.MAX_VALUE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleDescription("labelNome");
        cbSexo.getAccessibleContext().setAccessibleDescription("comboboxSexo");
        cbCad.getAccessibleContext().setAccessibleDescription("comboboxTipoCadastro");
        txtEmail.getAccessibleContext().setAccessibleDescription("textfieldEmail");
        txtLimite.getAccessibleContext().setAccessibleDescription("textfieldLimite");
        jLabel4.getAccessibleContext().setAccessibleDescription("labelSexo");
        jLabel5.getAccessibleContext().setAccessibleDescription("labelTipoCadastro");
        jLabel6.getAccessibleContext().setAccessibleDescription("labelEmail");
        jLabel7.getAccessibleContext().setAccessibleDescription("labelLimite");
        txtBairro.getAccessibleContext().setAccessibleDescription("textfieldBairro");
        txtRua.getAccessibleContext().setAccessibleDescription("textfieldRua");
        jLabel8.getAccessibleContext().setAccessibleDescription("labelCEP");
        jLabel9.getAccessibleContext().setAccessibleDescription("labelBairro");
        jLabel10.getAccessibleContext().setAccessibleDescription("labelRua");
        txtUF.getAccessibleContext().setAccessibleDescription("textfieldUF");
        txtCity.getAccessibleContext().setAccessibleDescription("textfieldCidade");
        jLabel11.getAccessibleContext().setAccessibleDescription("labelUF");
        jLabel12.getAccessibleContext().setAccessibleDescription("labelCidade");
        txtCpf.getAccessibleContext().setAccessibleDescription("textfieldCPF");
        txtCep.getAccessibleContext().setAccessibleDescription("textfieldCEP");
        jLabel13.getAccessibleContext().setAccessibleDescription("labelTelefone");
        txtTelefone.getAccessibleContext().setAccessibleDescription("textfieldTelefone");
        txtNascimento.getAccessibleContext().setAccessibleDescription("textfieldNascimento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.getAccessibleContext().setAccessibleDescription("panel");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpa() 
    {
    txtNome.setText("");
    txtCpf.setValue(null);
    txtCep.setValue(null);
    txtTelefone.setValue(null);
    txtNascimento.setValue(null);
    txtEmail.setText("");
    txtLimite.setText("");
    txtBairro.setText("");
    txtRua.setText("");
    txtUF.setText("");
    txtCity.setText("");
    cbSexo.setSelectedIndex(0);
    cbCad.setSelectedIndex(0);
    txtNome.requestFocus();
    }
    
    private static final String NOVO_SEXO = "+ Novo...";
    private String sexoAnterior = "Masculino";

    private void configurarSexo() 
    {
        // acrescenta ao combobox os valores que já existem no banco
        try 
        {
            for (String s : new CadastroDao().listarSexos()) 
            {
                if (!sexoExiste(s)) cbSexo.addItem(s);
            }
        } 
        catch (RuntimeException ex) 
        {}

        cbSexo.addItem(NOVO_SEXO); // sempre o último item
        cbSexo.setSelectedIndex(0);

        cbSexo.addActionListener(e -> 
        {
            Object sel = cbSexo.getSelectedItem();
            if (sel == null) return;

            if (!NOVO_SEXO.equals(sel)) 
            {
                sexoAnterior = sel.toString();
                return;
            }

            String novo = JOptionPane.showInputDialog(this, "Digite o novo valor:");
            novo = (novo == null) ? "" : novo.trim();

            if (novo.isEmpty()) // cancelou ou deixou vazio
            {
                cbSexo.setSelectedItem(sexoAnterior);
                return;
            }
            if (novo.equalsIgnoreCase(NOVO_SEXO) || sexoExiste(novo)) 
            {
                cbSexo.setSelectedItem(encontrarSexo(novo)); // já existe: só seleciona
                return;
            }

            cbSexo.insertItemAt(novo, cbSexo.getItemCount() - 1); // antes do "+ Novo..."
            cbSexo.setSelectedItem(novo);
        });
    }

    private boolean sexoExiste(String valor) 
    {
        return encontrarSexo(valor) != null;
    }

    private String encontrarSexo(String valor) 
    {
        for (int i = 0; i < cbSexo.getItemCount(); i++) 
        {
            String item = cbSexo.getItemAt(i);
            if (item.equalsIgnoreCase(valor) && !item.equals(NOVO_SEXO)) return item;
        }
        return null;
    }
    
    private void montarAbas() 
    {
        abas = new javax.swing.JTabbedPane();
        abas.addTab("Cadastro", jPanel3);
        abas.addTab("Pesquisa", criarPainelPesquisa());

        getContentPane().removeAll();
        getContentPane().setLayout(new java.awt.BorderLayout());
        getContentPane().add(abas, java.awt.BorderLayout.CENTER);

        abas.addChangeListener(e -> 
        {
            if (abas.getSelectedIndex() == 1) buscar();
        });

        // atualiza sozinho a cada 5 s enquanto a aba Pesquisa estiver aberta
        timerAuto = new javax.swing.Timer(5000, e -> 
        {
            boolean ocioso = workerBusca == null || workerBusca.isDone();
            if (abas.getSelectedIndex() == 1 && ocioso) buscar();
        });
        timerAuto.start();

        pack();
        setLocationRelativeTo(null);
    }

    private javax.swing.JPanel criarPainelPesquisa() 
    {
        javax.swing.JPanel painel = new javax.swing.JPanel(new java.awt.BorderLayout());

        javax.swing.JPanel topo = new javax.swing.JPanel(new java.awt.BorderLayout(8, 0));
        topo.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topo.add(new javax.swing.JLabel("Pesquisar:"), java.awt.BorderLayout.WEST);
        topo.add(txtPesquisa, java.awt.BorderLayout.CENTER);

        tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabela.setAutoCreateRowSorter(true);

        painel.add(topo, java.awt.BorderLayout.NORTH);
        painel.add(new javax.swing.JScrollPane(tabela), java.awt.BorderLayout.CENTER);
        painel.add(lblStatus, java.awt.BorderLayout.SOUTH);

        // espera 300 ms depois da última tecla antes de consultar o banco
        timerBusca = new javax.swing.Timer(300, e -> buscar());
        timerBusca.setRepeats(false);

        txtPesquisa.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() 
        {
            public void insertUpdate(javax.swing.event.DocumentEvent e)  { timerBusca.restart(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e)  { timerBusca.restart(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { timerBusca.restart(); }
        });

        return painel;
    }

    private void buscar() 
    {
        final String termo = txtPesquisa.getText().trim();
        if (workerBusca != null && !workerBusca.isDone()) workerBusca.cancel(true);

        lblStatus.setText("Buscando...");
        workerBusca = new javax.swing.SwingWorker<java.util.ArrayList<Cadastro>, Void>() 
        {
            @Override
            protected java.util.ArrayList<Cadastro> doInBackground() 
            {
                CadastroDao dao = new CadastroDao();
                return termo.isEmpty() ? dao.consultar() : dao.consultar(termo);
            }

            @Override
            protected void done() 
            {
                if (isCancelled()) return;
                try 
                {
                    preencherTabela(get());
                } 
                catch (Exception ex) 
                {
                    lblStatus.setText("Erro ao consultar o banco.");
                    JOptionPane.showMessageDialog(saciDePatinete.this,
                            "Erro ao acessar o banco de dados:\n" + ex.getMessage());
                }
            }
        };
        workerBusca.execute();
    }

    private void preencherTabela(java.util.ArrayList<Cadastro> lista) 
    {
        modeloTabela.setRowCount(0);
        for (Cadastro c : lista) 
        {
            modeloTabela.addRow(new Object[]
            {
                c.getIdCad(), c.getNomeCad(), c.getCpf(), c.getSexo(), c.getEmail()
            });
        }
        lblStatus.setText(lista.size() + " registro(s) encontrado(s)");
    }
    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){txtCpf.requestFocus();} 
    }//GEN-LAST:event_txtNomeKeyPressed
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
    if (!Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", txtEmail.getText()))
    {      
        JOptionPane.showMessageDialog(null, "Por favor, digite um e-mail válido");
    }
    }//GEN-LAST:event_txtEmailFocusLost
    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){txtLimite.requestFocus();}
    }//GEN-LAST:event_txtEmailKeyPressed
    private void txtLimiteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){txtCep.requestFocus();}
    }//GEN-LAST:event_txtLimiteKeyPressed
    private void txtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){txtRua.requestFocus();}
    }//GEN-LAST:event_txtBairroKeyPressed
    private void txtRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuaKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){txtTelefone.requestFocus();}
    }//GEN-LAST:event_txtRuaKeyPressed
    private void txtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){cbSexo.requestFocus();}
    }//GEN-LAST:event_txtCpfKeyPressed
    private void txtUFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUFKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){txtCity.requestFocus();}
    }//GEN-LAST:event_txtUFKeyPressed
    private void txtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){txtBairro.requestFocus();}
    }//GEN-LAST:event_txtCepKeyPressed
    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){txtUF.requestFocus();}
    }//GEN-LAST:event_txtTelefoneKeyPressed
    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
    if(evt.getExtendedKeyCode() == evt.VK_ENTER){txtNascimento.requestFocus();}
    }//GEN-LAST:event_txtCityKeyPressed

    private void CancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CancelarKeyPressed

    }//GEN-LAST:event_CancelarKeyPressed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
    limpa();
    }//GEN-LAST:event_CancelarActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
    nome = txtNome.getText().trim();
    cpf = txtCpf.getText();
    sexo = (String) cbSexo.getSelectedItem();
    tipo = (String) cbCad.getSelectedItem();
    email = txtEmail.getText().trim();
    cep = txtCep.getText();
    bairro = txtBairro.getText().trim();
    rua = txtRua.getText().trim();
    uf = txtUF.getText().trim();
    cidade = txtCity.getText().trim();
    telefone = txtTelefone.getText().trim();
    nascimento = txtNascimento.getText().trim();
    limiteCredito = "R$ 0,00";

    // validações
    if (nome.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Digite o nome.");
        txtNome.requestFocus();
        return;
    }
    if (cpf.replaceAll("\\D", "").length() != 11) {
        JOptionPane.showMessageDialog(this, "Digite um CPF completo.");
        txtCpf.requestFocus();
        return;
    }
    String limiteTexto = txtLimite.getText().trim().replace(",", ".");
    if (!limiteTexto.isEmpty()) {
        try {
            double valor = Double.parseDouble(limiteTexto);
            limiteCredito = java.text.NumberFormat
                    .getCurrencyInstance(new java.util.Locale("pt", "BR")).format(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um valor válido para o limite.");
            txtLimite.requestFocus();
            return;
        }
    }

    // grava no banco
    try 
    {
        new CadastroDao().inserir(new Cadastro(nome, cpf, sexo, email));
    } 
    catch (RuntimeException ex) 
    {
        if (ex.getCause() instanceof java.sql.SQLIntegrityConstraintViolationException) 
        {
            JOptionPane.showMessageDialog(this, "Este CPF já está cadastrado.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(this,
                    "Erro ao salvar no banco:\n" + ex.getMessage());
        }
        return;
    }

    JOptionPane.showMessageDialog(this, "CADASTRO REALIZADO COM SUCESSO!\n\n"
            + "NOME: " + nome + "\n"
            + "CPF: " + cpf + "\n"
            + "SEXO: " + sexo + "\n"
            + "TIPO DE CADASTRO: " + tipo + "\n"
            + "EMAIL: " + email + "\n"
            + "CEP: " + cep + "\n"
            + "BAIRRO: " + bairro + "\n"
            + "RUA: " + rua + "\n"
            + "UF: " + uf + "\n"
            + "CIDADE: " + cidade + "\n"
            + "NASCIMENTO: " + nascimento + "\n"
            + "LIMITE DE CRÉDITO: " + limiteCredito + "\n"
            + "TELEFONE: " + telefone);

    limpa();
    buscar(); // atualiza a tabela de pesquisa na hora
    }//GEN-LAST:event_SalvarActionPerformed
    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost
    final String cep = txtCep.getText();
        if (cep.replaceAll("\\D", "").length() != 8) return;

        new javax.swing.SwingWorker<viaCEP.Endereco, Void>() 
        {
            @Override
            protected viaCEP.Endereco doInBackground() throws Exception 
            {
                return viaCEP.buscar(cep);
            }

            @Override
            protected void done() 
            {
                try {
                    viaCEP.Endereco e = get();
                    if (e == null) 
                    {
                        JOptionPane.showMessageDialog(saciDePatinete.this, "CEP não encontrado.");
                        return;
                    }
                    txtRua.setText(e.rua);
                    txtBairro.setText(e.bairro);
                    txtCity.setText(e.cidade);
                    txtUF.setText(e.uf);
                } 
                catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(saciDePatinete.this,
                            "Não foi possível consultar o CEP. Verifique a conexão.");
                }
            }
        }.execute();
    }//GEN-LAST:event_txtCepFocusLost

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(saciDePatinete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(saciDePatinete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(saciDePatinete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(saciDePatinete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new saciDePatinete().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Salvar;
    private javax.swing.JComboBox<String> cbCad;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCity;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLimite;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
