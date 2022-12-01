import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank(message = "Deve conter um nome de usuário")
private String nome;

@NotBlank(message = "Deve conter um email")
@Email
private String email;


@NotBlank(message = "Deve conter no minimo 8 e no maximo 16 caracteres")
@Size(min = 8,max = 16)
private String senha;

private String foto;


}


@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("categoria")
    private List<Produto> produtos;