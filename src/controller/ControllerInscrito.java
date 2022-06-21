package controller;
import model.Inscrito;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ControllerInscrito implements Iinscrito {

    @Override
    public void adicionaArray() {
        Inscrito i1 = new Inscrito();
        List<Inscrito> inscritos = new ArrayList<>();
        i1.setNomeInscrito(JOptionPane.showInputDialog("Insira o nome do inscrito \n"));
        inscritos.add(i1);

        Inscrito i2 = new Inscrito();
        i2.setNomeInscrito(JOptionPane.showInputDialog("Insira o nome do inscrito \n"));
        inscritos.add(i2);

        Inscrito i3 = new Inscrito();
        i3.setNomeInscrito(JOptionPane.showInputDialog("Insira o nome do inscrito \n"));
        inscritos.add(i3);

        inscritos.forEach(i -> System.out.println(i.getNomeInscrito()));
    }
}
