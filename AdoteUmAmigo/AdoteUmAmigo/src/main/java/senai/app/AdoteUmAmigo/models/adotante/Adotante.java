package senai.app.AdoteUmAmigo.models.adotante;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import senai.app.AdoteUmAmigo.models.pet.Pet;

import java.util.List;

@Entity
@Table(name = "adotantes")
@Getter
@Setter

public class Adotante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomeCompleto;

    @Column
    private String cpf;

    @Column
    private String telefone;

    @Column
    private String email;

    @Column
    private List<Pet> historicoDeAdocoes;

    public Adotante (String nomeCompleto,
                     String cpf,
                     String telefone,
                     String email,
                     List <Pet> historicoDeAdocoes){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.historicoDeAdocoes = historicoDeAdocoes;
    }
    public Adotante(){

    }
}
