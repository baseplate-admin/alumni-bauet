package bd.ac.bauet.alumni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumniService {
    private final AlumniRepository alumniRepository;

    @Autowired
    public AlumniService(AlumniRepository alumniRepository) {
        this.alumniRepository = alumniRepository;
    }

    public List<Alumni> finaAll() {
        return alumniRepository.findAll();
    }

    public List<Alumni> createOneAlumni(Alumni alumni) {
        if alumniRepository.findAlumniByEmail(alumni)
        

    }
}
