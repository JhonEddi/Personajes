/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;


/**
 *
 * @author daza
 */
public class decorator implements Ejemplo{

    @Override
    public void operacion() {
        Component real = new RealComponent();
        System.out.println(real.doThis());
        Component wrapper = new Wrapper(real);
        System.out.println(wrapper.doThis());       
    }
    
}
