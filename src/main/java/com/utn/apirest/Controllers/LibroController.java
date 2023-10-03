package com.utn.apirest.Controllers;

import com.utn.apirest.Entities.Libro;
import com.utn.apirest.Services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
