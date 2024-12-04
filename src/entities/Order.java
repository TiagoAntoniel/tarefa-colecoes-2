package entities;

import java.util.Comparator;

public abstract class Order implements Comparator<Dados> {

    @Override
    public int compare(Dados o1, Dados o2){
        return o1.getSexo().compareTo(o2.getSexo());
    }
}
