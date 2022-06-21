import controller.ControllerNotifica;
import controller.ControllerInscrito;

public class Principal {
    public static void main(String [] args){
        ControllerNotifica cn = new ControllerNotifica();
        ControllerInscrito ci = new ControllerInscrito();

        ci.adicionaArray();
        cn.criaPublicacao();
    }
}
