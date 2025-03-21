package bd.ac.bauet.alumni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/alumni")
public class AlumniController {
    private final AlumniService alumniService;

    @Autowired
    public AlumniController(AlumniService alumniService) {
        this.alumniService = alumniService;
    }

    @GetMapping
    public List<Alumni> getAlumni() {
        return alumniService.finaAll();
    }

    public void registerNewAlumni(Alumni alumni) {
        alumniService.createOneAlumni(alumni);
    }
}
