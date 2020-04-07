package br.com.aquiperto.controller;
import br.com.aquiperto.dto.CriarComercioDTO;
import br.com.aquiperto.entity.Comercio;
import br.com.aquiperto.repository.ComercioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@Api(value = "Comércio")
@RequestMapping("comercio")
public class ComercioController {

    @Autowired
    ComercioRepository comercioRepository;

    @ApiOperation(value = "Busca todos os cadastros de comércios")
    @GetMapping (value = "/")
    public ResponseEntity buscaTodos() {
        return ResponseEntity.ok(comercioRepository.findAll());
    }

    @ApiOperation(value = "Busca cadastros de comercio por id")
    @GetMapping(value = "/{id}")
    public ResponseEntity buscaComercio (@PathVariable Integer id){
        Optional<Comercio> foundComercio = comercioRepository.findById(id);

        if(foundComercio.isPresent()){
            return ResponseEntity.ok(foundComercio.get());
        }else {
            return ResponseEntity.badRequest().body("Não encontrado comércio com o id:" + id);
        }
    }

    @ApiOperation(value = "Cria cadastro de comércio")
    @PostMapping(value = "/")
    public ResponseEntity criaComercio(@RequestBody CriarComercioDTO criarComercioDTO) {

        comercioRepository.save(new Comercio(criarComercioDTO));
        return ResponseEntity.ok(criarComercioDTO);
    }

    @ApiOperation(value = "Atualiza cadastros de comércio por ID")
    @PutMapping(value = "/{id}")
    public ResponseEntity atualizaComercio(@PathVariable Integer id, @RequestBody CriarComercioDTO criarComercioDTO){


        Optional<Comercio> foundComercio = comercioRepository.findById(id);
        if(!foundComercio.isPresent()){
            return ResponseEntity.badRequest().body("Não encontrado comércio com o id:" + id );
        }

        //caso tenha encontrado
        Comercio comercio = foundComercio.get();
        comercio.setNome(criarComercioDTO.getNome());
        comercio.setCategoria(criarComercioDTO.getCategoria());
        comercio.setEndereco(criarComercioDTO.getEndereco());
        comercio.setWebSite(criarComercioDTO.getWebSite());
        comercio.setHorarioInicioFuncionamento(criarComercioDTO.getHorarioInicioFuncionamento());
        comercio.setHorarioFimFuncionamento(criarComercioDTO.getHorarioFimFuncionamento());
        comercio.setTelefone(criarComercioDTO.getTelefone());
        comercio.setLatitude(criarComercioDTO.getLatitude());
        comercio.setLongitude(criarComercioDTO.getLongitude());

        return ResponseEntity.ok(comercioRepository.save(comercio));
    }

    @ApiOperation(value = "Deleta cadastro de comércio por ID")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity deletaComercio( @PathVariable Integer id) {
        comercioRepository.deleteById(id);
        return ResponseEntity.ok("");
    }
}
