package api.msvacina.service;


import api.msvacina.model.Vacina;
import api.msvacina.repository.VacinaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Service
public class VacinaService {

    @Autowired
    public VacinaRepository vacinaRepository;

    public Vacina findByName(String nome){
        Optional<Vacina> vacina = vacinaRepository.findByNome(nome);
        return vacina.get();
    }

}
