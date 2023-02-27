package com.Tienda_IQ23.controller;
import com.Tienda_IQ23.dao.ClienteDao;
import com.Tienda_IQ23.domain.Cliente;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Joseth
 */
@Controller
public class IndexController {
    @Autowired
    ClienteDao clienteDao;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        String fecha = new Date().toString();
        String mensaje = "Estamos en semana 4, saludos!";
        model.addAttribute("MensajeSaludo", mensaje);
        model.addAttribute("fecha", fecha);

        // Cliente cliente = new Cliente("Jonathan", "Brenes Blanco", "jbrenesbl@gmail.com", "88447799");
        // Cliente cliente2 = new Cliente("Francisco", "Montero Ramirez", "fmontero@gmail.com", "88557711");
        // Cliente cliente3 = new Cliente("Juan", "Montero Ramirez", "fmontero@gmail.com", "88557711");
        //model.addAttribute("cliente", cliente);
        //List<Cliente> clientes = Arrays.asList(cliente, cliente2, cliente3);
        // model.addAttribute("clientes", clientes);
        var clientes = clienteDao.findAll();
        return "index";
    }

}
