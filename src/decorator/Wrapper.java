/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author daza
 */
public class Wrapper extends OptionalWrapper{

    public Wrapper(Component componente) {
        super(componente);
    }
    
    
    @Override
    public String doThis() {
        return componente.doThis() + "";
    }
   
    
}
