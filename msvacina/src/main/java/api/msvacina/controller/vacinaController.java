package api.msvacina.controller;

import io.swagger.api.VacinaApi;
import io.swagger.model.VacinaRepresentation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vacina")
public class vacinaController implements VacinaApi {

    @Override
    public ResponseEntity<VacinaRepresentation> findByName(String nome){
        return null;
    }
}
