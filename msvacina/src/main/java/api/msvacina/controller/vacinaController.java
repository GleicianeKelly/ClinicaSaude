package api.msvacina.controller;

import api.msvacina.mapper.VacinaMapper;
import api.msvacina.service.VacinaService;
import io.swagger.api.VacinaApi;

import io.swagger.model.VacinaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vacina")
public class vacinaController implements VacinaApi {

    @Autowired
    public VacinaService vacinaService;

    @Autowired
    public VacinaMapper vacinaMapper;

    @GetMapping
    public String ok(){
        return "ok";
    }

    @GetMapping("/{nome}")
    public ResponseEntity<VacinaDTO> findByName(@PathVariable String nome){
        var vacinaDTO = vacinaMapper.toDTO(vacinaService.findByName(nome));
        return ResponseEntity.ok().body(vacinaDTO);
    }


}
