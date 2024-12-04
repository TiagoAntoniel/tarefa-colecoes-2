package entities;

import java.util.Comparator;

public  class Dados  {
    private String name;
    private String sexo;

    public Dados(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: "
                + name
                + " Sexo: "
                + sexo;
    }
}
