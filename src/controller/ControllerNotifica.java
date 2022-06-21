package controller;

import model.Canal;

import javax.swing.*;

public class ControllerNotifica implements Inotifica{
    @Override
    public void criaPublicacao() {
        Canal c = new Canal();
        String x = JOptionPane.showInputDialog("Inserir nome da publicação: \n");
        c.setPublicacao(x);
        System.out.println(x);
        notificaPublicacao(x);
    }

    @Override
    public void notificaPublicacao(String publicacao) {
        System.out.printf("O canal x postou a publicação: " + publicacao);
    }
}
