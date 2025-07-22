package gianlucamerlo.u5d7.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
@ToString
public class Author {
    @Setter(AccessLevel.NONE)
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private String avatar;


    public Author(String nome,String cognome,String email,LocalDate dataDiNascita,String avatar)
    {
        Random rndm= new Random();
        this.id=rndm.nextInt(1,10000);
        this.nome=nome;
        this.cognome=cognome;
        this.email=email;
        this.dataDiNascita=dataDiNascita;
        this.avatar=avatar;
    }
}
