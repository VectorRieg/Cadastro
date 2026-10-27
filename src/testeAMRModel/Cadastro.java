/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeAMRModel;

/**
 *
 * @author vector
 */
public class Cadastro 
{
    private int idcad;
    private String nomecad;
    private String cpf;
    private int idsexo;
    private String email;
    private String sexo;
    private int numCadastros;
    private int somaCodigos;
    private int numSexualidade;
    private String foto;
    private String senha;
    
    //Construtor
    public Cadastro() 
    {
    }
    
    public Cadastro(String nomecad, String cpf, String sexo, String email) 
    {
        this.nomecad = nomecad;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;        
    }

 public Cadastro(int idcad, String nomecad, String cpf, String sexo, String email) 
    {
        this.idcad = idcad;     
        this.nomecad = nomecad;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
    
    }   
  public Cadastro(int numCadastros, int somaCodigos, int numSexualidade) 
    {
        this.numCadastros = numCadastros;
        this.somaCodigos = somaCodigos; 
        this.numSexualidade = numSexualidade;
    }      
    //Metodos GETs e SETs
    public int getIdCad() { return idcad; }
    public String getNomeCad() { return nomecad; }
    public String getCpf() { return cpf; }
    public int getIdSexo() { return idsexo; }
    public String getEmail() { return email; }
    public String getSexo() { return sexo; }
    public int getTotalCadastros() { return numCadastros; }
    public int getSomaCodigos() { return somaCodigos; }
    public int getNumSexualidade() { return numSexualidade; }
    public String getFoto() { return foto; }
    public String getSenha() { return senha; }
  
    public void setIdCad(int idcad) { this.idcad = idcad; }
    public void setNomeCad(String nomecad) { this.nomecad = nomecad; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setIdSexo(int idsexo) { this.idsexo = idsexo; }
    public void setEmail(String email) { this.email = email; }
    public void SetSexo(String nomesexo) { this.sexo = nomesexo; }
    public void setTotalCadastros(int numCadastros) { this.numCadastros = numCadastros; }
    public void SetSomaCodigos(int somaCodigos) { this.somaCodigos = somaCodigos; }
    public void SetNumSexualidade(int numSexualidade) { this.numSexualidade = numSexualidade; }
    public void setFoto(String foto) { this.foto = foto; }
    public void setSenha(String senha) { this.senha = senha; }
}
