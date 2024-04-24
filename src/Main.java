import com.patland.domain.atendimento.Atendimento;
import com.patland.domain.atendimento.AtendimentoStatus;
import com.patland.domain.atendimento.AtendimentoTipo;
import com.patland.domain.cadastro.Animal;
import com.patland.domain.cadastro.Cadastro;
import com.patland.domain.cadastro.Endereco;
import com.patland.domain.cadastro.Especie;
import com.patland.domain.cadastro.Perfil;
import com.patland.domain.cadastro.ProdutoServico;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

  public static void main(String[] args) throws Exception {
    Perfil perfil = new Perfil(true, false, false);
    Endereco endereco = new Endereco("Fransisco Deslandes", 151);
    Cadastro cadastro = new Cadastro();
    cadastro.setId(1);
    cadastro.setNome("Marcos Parreiras");
    cadastro.setPerfil(perfil);
    cadastro.setEndereco(endereco);

    Animal animal = new Animal();
    animal.setId(1);
    animal.setNome("Nestor");
    animal.setAniversario(LocalDate.of(2020, 1, 1));
    animal.setEspecie(Especie.CACHORRO);

    ProdutoServico servico = new ProdutoServico();
    servico.setId(1);
    servico.setNome("tosa");
    servico.setValor(80.0);
    servico.setServico(true);

    Atendimento atendimento = new Atendimento();
    atendimento.setId(1);
    atendimento.setDescricao(servico.getNome());
    atendimento.setData(LocalDate.now());
    atendimento.setHora(LocalTime.now());
    atendimento.setPaciente(animal);
    atendimento.setSolicitante(cadastro);
    atendimento.setServico(servico);
    atendimento.setTipo(AtendimentoTipo.HIGIENIZACAO);
    atendimento.setStatus(AtendimentoStatus.REALIZANDO);
  }
}
