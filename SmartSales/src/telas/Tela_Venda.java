/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import DAO.VendaDAO;
import apoio.Formatacao;
import entidades.Cliente;
import entidades.Funcionario;
import entidades.Pedido;
import entidades.Produto;
import entidades.Produtos_Pedido;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author yNot
 */
public class Tela_Venda extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Venda
     */
    Pedido p = new Pedido();
    Double total = 0.0;
    Cliente c;
    Funcionario f;
    Produto produto;
    Date now = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Tela_Venda() {

        initComponents();
        this.DesativaProdutos();
        Formatacao.formatarData(txt_data);
        // Formatacao.formatarDecimal(txt_precototal);
        txt_data.setText(sdf.format(now));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        scrollbar1 = new java.awt.Scrollbar();
        menuTabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        btn_pesquisacliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ComboPagamento = new javax.swing.JComboBox<>();
        txt_CriarCompra = new javax.swing.JButton();
        txt_sair = new javax.swing.JButton();
        txt_data = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_vendedor = new javax.swing.JTextField();
        pesquisa_vendedor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Finalizar = new javax.swing.JButton();
        cancelar = new javax.swing.JToggleButton();
        Selecionar = new javax.swing.JButton();
        txt_produtos = new javax.swing.JTextField();
        AdicionarProduto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutosVenda = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JTextField();
        txt_precototal = new javax.swing.JFormattedTextField();

        jLabel5.setText("jLabel5");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuTabs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cliente* :");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Obrigat??rio \" * \"");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Data:");

        txt_cliente.setEditable(false);
        txt_cliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btn_pesquisacliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_pesquisacliente.setText("Pesquisar");
        btn_pesquisacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisaclienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Forma de Pagamento* :");

        ComboPagamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ComboPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Dinheiro", "Cart??o de Cr??dito" }));

        txt_CriarCompra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_CriarCompra.setText("Criar Compra");
        txt_CriarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CriarCompraActionPerformed(evt);
            }
        });

        txt_sair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_sair.setText("Sair");
        txt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sairActionPerformed(evt);
            }
        });

        txt_data.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Vendedor:");

        txt_vendedor.setEditable(false);

        pesquisa_vendedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pesquisa_vendedor.setText("Pesquisar");
        pesquisa_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_vendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                        .addComponent(txt_CriarCompra)
                        .addGap(82, 82, 82)
                        .addComponent(txt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_pesquisacliente)
                            .addComponent(pesquisa_vendedor))))
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboPagamento, 0, 205, Short.MAX_VALUE)
                    .addComponent(txt_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pesquisa_vendedor)
                    .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_pesquisacliente))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CriarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        menuTabs.addTab("Venda", jPanel1);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Produtos:");

        Finalizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Finalizar.setText("Finalizar");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        Selecionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Selecionar.setText("Selecionar");
        Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
            }
        });

        AdicionarProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AdicionarProduto.setText("Adicionar");
        AdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarProdutoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Pre??o Total:");

        tabelaProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Pre??o"
            }
        ));
        jScrollPane1.setViewportView(tabelaProdutosVenda);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Excluir Produto");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Quantidade:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(58, 58, 58)
                        .addComponent(cancelar)
                        .addGap(57, 57, 57)
                        .addComponent(Finalizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txt_precototal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(AdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addGap(56, 56, 56)
                        .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txt_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Selecionar)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(AdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_precototal, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        menuTabs.addTab("Produtos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuTabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_txt_sairActionPerformed

    private void btn_pesquisaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisaclienteActionPerformed

        Dlg_SelecionaCliente sf = new Dlg_SelecionaCliente(null, true, this);
        sf.setLocationRelativeTo(this);
        sf.setVisible(true);
    }//GEN-LAST:event_btn_pesquisaclienteActionPerformed

    private void txt_CriarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CriarCompraActionPerformed

        if (txt_cliente.getText().isEmpty() || ComboPagamento.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.");
        } else {

            p.setStaus("A");
            p.setCliente(c);
            p.setData_venda(txt_data.getText());
            p.setFuncionario(f);
            p.setTipo_pagamento((String) ComboPagamento.getSelectedItem());
            VendaDAO.cadastrar(p);
            System.out.println("Venda Criada com sucesso");
            this.DesativaVenda();
            menuTabs.setSelectedIndex(1);
            VendaDAO.pesquisa(tabelaProdutosVenda, p.getId());
        }
    }//GEN-LAST:event_txt_CriarCompraActionPerformed

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        Dlg_SelecionaProduto sp = new Dlg_SelecionaProduto(null, true, this);
        sp.setLocationRelativeTo(this);
        sp.setVisible(true);
    }//GEN-LAST:event_SelecionarActionPerformed

    private void pesquisa_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_vendedorActionPerformed
        Dlg_SelecionaFuncionario sf = new Dlg_SelecionaFuncionario(null, true, this);
        sf.setLocationRelativeTo(this);
        sf.setVisible(true);
    }//GEN-LAST:event_pesquisa_vendedorActionPerformed

    private void AdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarProdutoActionPerformed
        if (txt_produtos.getText().isEmpty() || txt_quantidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.");
        } else {
            Produtos_Pedido pd = new Produtos_Pedido();

            pd.setProduto(produto);
            pd.setQuantidade(Integer.parseInt(txt_quantidade.getText()));
            pd.setPreco(produto.getPreco() * Integer.parseInt(txt_quantidade.getText()));
            pd.setStatus("A");
            pd.setPedido(p);
            VendaDAO.cadastrarProdutos(pd);
            JOptionPane.showMessageDialog(null, "Produto Adicionado");
            VendaDAO.pesquisa(tabelaProdutosVenda, p.getId());
            this.total += produto.getPreco() * Integer.parseInt(txt_quantidade.getText());
            txt_precototal.setText(String.valueOf(total));
            txt_produtos.setText("");
            txt_quantidade.setText("");

        }
    }//GEN-LAST:event_AdicionarProdutoActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
        this.dispose();
    }//GEN-LAST:event_FinalizarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        VendaDAO.ExcluirVenda(p.getId());
        this.DesativaProdutos();
        JOptionPane.showMessageDialog(null, "Venda Cancelada");
        menuTabs.setSelectedIndex(0);
        txt_vendedor.setText("");
        ComboPagamento.setSelectedIndex(0);
        txt_data.setText(sdf.format(now));
    }//GEN-LAST:event_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Tela_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Venda().setVisible(true);
            }
        });
    }

    public void DefinirCliente(Cliente c) {
        txt_cliente.setText(c.getNome());
        this.c = c;
    }

    public void DefinirProduto(Produto p) {
        txt_produtos.setText(p.getNome());
        this.produto = p;
    }

    public void DefinirFuncionario(Funcionario f) {
        txt_vendedor.setText(f.getNome());
        this.f = f;
    }

    public void DesativaVenda() {
        txt_cliente.setText("");
        txt_data.setText("");
        ComboPagamento.setToolTipText("");
        this.menuTabs.setEnabledAt(0, false);
        this.menuTabs.setEnabledAt(1, true);
    }

    public void DesativaProdutos() {
        txt_cliente.setText("");
        txt_data.setText("");
        ComboPagamento.setToolTipText("");
        this.menuTabs.setEnabledAt(0, true);
        this.menuTabs.setEnabledAt(1, false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarProduto;
    private javax.swing.JComboBox<String> ComboPagamento;
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton Selecionar;
    private javax.swing.JButton btn_pesquisacliente;
    private javax.swing.JToggleButton cancelar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane menuTabs;
    private javax.swing.JButton pesquisa_vendedor;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JTable tabelaProdutosVenda;
    private javax.swing.JButton txt_CriarCompra;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JFormattedTextField txt_data;
    private javax.swing.JFormattedTextField txt_precototal;
    private javax.swing.JTextField txt_produtos;
    private javax.swing.JTextField txt_quantidade;
    private javax.swing.JButton txt_sair;
    private javax.swing.JTextField txt_vendedor;
    // End of variables declaration//GEN-END:variables
}
