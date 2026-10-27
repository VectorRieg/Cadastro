/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeAMRDao;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import testeAMRModel.Cadastro;
/**
 *
 * @author vector
 */
public class CadastroDao implements DaoGenerica<Cadastro>
{
    private ConexaoBanco conexao;
    
    public CadastroDao()
    {
        this.conexao = new ConexaoBanco();
    }
        public void inserir(Cadastro cadastro) 
        {
            //string com a consulta que sera executada no banco
            String sql = "INSERT INTO cadbasico (nomecad, cpf, sexo, email) VALUES (?,?,?,?)";

            try
            {
                //tenta realizar a conexão, se retornar verdadeiro entra no if
                if(this.conexao.conectar())
                {
                    //prepara a sentença com a consulta da string
                    PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);           
                    sentenca.setString(1,cadastro.getNomeCad());
                    sentenca.setString(2,cadastro.getCpf());
                    sentenca.setString(3,cadastro.getSexo()); 
                    sentenca.setString(4,cadastro.getEmail());               
                    sentenca.execute(); //executa o comando no banco
                    sentenca.close(); //fecha a sentença
                    this.conexao.getConnection().close(); //fecha a conexão com o banco
                }
            }
            catch(SQLException ex)
            {
               throw new RuntimeException(ex);
            }
        }

    public void alterar(Cadastro cadastro) 
    {
        String sql = "UPDATE cadbasico SET nomecad = ?, cpf = ?, sexo = ?, email = ? where idcad = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1,cadastro.getNomeCad());
                sentenca.setString(2,cadastro.getCpf());
                sentenca.setString(3,cadastro.getSexo());
                sentenca.setString(4,cadastro.getEmail());
                sentenca.setInt(5, cadastro.getIdCad());
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void excluir() 
    {
        String sql = "DELETE FROM ESCOLA";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
   
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    
    public void excluirID(int id) 
    {
        String sql = "DELETE FROM cadbasico WHERE idcad = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setInt(1, id);
                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    

    @Override
    public ArrayList<Cadastro> consultar() 
    {
        return consultar("");
    }

    public ArrayList<Cadastro> consultar(String str) 
    {
        ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
        String sql = "SELECT idcad, nomecad, cpf, email, sexo "+
                     "FROM cadbasico "+
                     "WHERE UPPER(nomecad) LIKE UPPER(?) "+
                     "OR cpf LIKE ? "+
                     "OR REPLACE(REPLACE(cpf,'.',''),'-','') LIKE ? "+
                     "OR UPPER(email) LIKE UPPER(?) "+
                     "OR idcad = ? "+
                     "ORDER BY (idcad = ?) DESC, nomecad ";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                String digitos = str.replaceAll("\\D", "");
                String filtro = "%" + str + "%";
                String filtroCpf = "%" + (digitos.isEmpty() ? str : digitos) + "%";

                // id exato -1 se o texto não for um número de id válido
                int idBusca = -1;
                try { idBusca = Integer.parseInt(str.trim()); } catch (NumberFormatException e) { }

                sentenca.setString(1, filtro);
                sentenca.setString(2, filtro);
                sentenca.setString(3, filtroCpf);
                sentenca.setString(4, filtro);
                sentenca.setInt(5, idBusca);
                sentenca.setInt(6, idBusca);
                ResultSet rs = sentenca.executeQuery();

                while(rs.next()) 
                {
                    Cadastro c = new Cadastro();
                    c.setIdCad(rs.getInt("idcad"));
                    c.setNomeCad(rs.getString("nomecad"));
                    c.setCpf(rs.getString("cpf"));
                    c.SetSexo(rs.getString("sexo"));
                    c.setEmail(rs.getString("email"));
                    lista.add(c);
                }
                rs.close();
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return lista;
        }
        catch(SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }
    @Override
    public ArrayList<Cadastro> dashboard() 
    {
        
        ArrayList<Cadastro> ListarDashBoard = new ArrayList<Cadastro>();
//        String sql = "select count(idcad) as numcad, count(idcad)*2 as sumcad, (select count(idsexo)+100 from cadsexo) as numsexualidade from cadbasico;";
        String sql = "SELECT FLOOR( RAND( ) * ( 10 -5 +1 ) *10 ) AS numcad, FLOOR( RAND( ) * ( 10 -5 +1 ) *10 ) AS sumcad, FLOOR( RAND( ) * ( 10 -5 +1 ) *10 ) AS numsexualidade";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //recebe o resultado da consulta
                 ResultSet resultadoSentenca = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while(resultadoSentenca.next()) 
                {
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela Escola
                    Cadastro cadastro = new Cadastro();
                    cadastro.setTotalCadastros(resultadoSentenca.getInt("numcad"));
                    cadastro.SetSomaCodigos(resultadoSentenca.getInt("sumcad"));
                    cadastro.SetNumSexualidade(resultadoSentenca.getInt("numsexualidade"));
                    
                    ListarDashBoard.add(cadastro);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return ListarDashBoard;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void inserir() 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar() 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean temEmail(String email) 
    {
    String sql = "SELECT COUNT(*) FROM cadbasico WHERE email = ?";
    try {
        if (this.conexao.conectar()) 
        {
            PreparedStatement sentenca = this.conexao.getConnection().prepareStatement (sql);
            sentenca.setString(1, email);
            ResultSet rs = sentenca.executeQuery();
            boolean existe = rs.next() && rs.getInt(1) > 0;
            rs.close();
            sentenca.close();
            this.conexao.getConnection().close();
            return existe;
        }
        return false;
        } 
        catch (SQLException ex) 
        {
        throw new RuntimeException(ex);
        }
    }

    public boolean novaSenha(String email, String novaSenha) 
    {
        String sql = "UPDATE cadbasico SET senha = ? WHERE email = ?";
        try 
        {
            if (this.conexao.conectar()) 
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement (sql);
                sentenca.setString(1, hash(novaSenha));
                sentenca.setString(2, email);
                int linhas = sentenca.executeUpdate();
                sentenca.close();
                this.conexao.getConnection().close();
                return linhas > 0;
            }
            return false;
        } 
        catch (SQLException ex) 
        {
            throw new RuntimeException(ex);
        }
    }

    public static String hash(String texto) 
    {
        try 
        {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(texto.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            return String.format("%064x", new BigInteger(1, bytes));
        } 
        catch (java.security.NoSuchAlgorithmException ex) 
        {
            throw new RuntimeException(ex);
        }
    }
    public ArrayList<String> listarSexos() 
    {
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT DISTINCT sexo FROM cadbasico "+
                     "WHERE sexo IS NOT NULL AND sexo <> '' ORDER BY sexo";
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet rs = sentenca.executeQuery();
                while(rs.next()) 
                {
                    lista.add(rs.getString("sexo"));
                }
                rs.close();
                sentenca.close();
                this.conexao.getConnection().close();
            }
            return lista;
        }
        catch(SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }
}
