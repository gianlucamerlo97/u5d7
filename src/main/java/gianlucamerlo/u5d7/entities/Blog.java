package gianlucamerlo.u5d7.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Blog {
    @Setter(AccessLevel.NONE)
    private int id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

public Blog(String categoria,String titolo,String cover,String contenuto,int tempoDiLettura)
{
    Random rndm= new Random();
    this.id=rndm.nextInt(1,10000);
    this.categoria=categoria;
    this.titolo=titolo;
    this.cover=cover;
    this.contenuto=contenuto;
    this.tempoDiLettura=tempoDiLettura;

}
}
