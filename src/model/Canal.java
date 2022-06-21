package model;

public class Canal {
    private String publicacao;

    public String getPublicacao() {
        return publicacao;
    }

    public String setPublicacao(String publicacao) {
        return publicacao;
    }

    @Override
    public String toString() {
        return "Canal{" +
                "publicacao='" + publicacao + '\'' +
                '}';
    }
}
