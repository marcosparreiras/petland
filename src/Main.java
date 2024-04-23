import com.patland.domain.cadastro.Cadastro;
import com.patland.domain.cadastro.Endereco;
import com.patland.domain.cadastro.Perfil;

public class Main {

  public static void main(String[] args) throws Exception {
    Perfil perfil = new Perfil(true, false, false);
    Endereco endereco = new Endereco("Fransisco Deslandes", 151);

    Cadastro cadastro = new Cadastro();
    cadastro.setId(1);
    cadastro.setNome("Marcos Parreiras");
    cadastro.setPerfil(perfil);
    cadastro.setEndereco(endereco);
  }
}
