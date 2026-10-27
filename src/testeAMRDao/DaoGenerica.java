/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package testeAMRDao;
import java.util.ArrayList;
/**
 *
 * @author vector
 */
interface DaoGenerica<T> 
{
    public void inserir();
    
    public void alterar();
    
    public void excluir();
    
    public ArrayList consultar();

    public ArrayList dashboard();    
}
