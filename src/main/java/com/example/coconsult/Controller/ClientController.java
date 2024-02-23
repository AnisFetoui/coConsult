package com.example.coconsult.Controller;

import com.example.coconsult.Services.IServiceClient;
import com.example.coconsult.Services.ServiceClient;
import com.example.coconsult.models.Client;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Clients")
public class ClientController {

    @Autowired
    IServiceClient iServiceClient;

    @PostMapping("/addclient")
    @ResponseBody
    public Long addclient(@RequestBody Client client){
        return iServiceClient.ajouterClient(client);
    }

    @GetMapping("/getall")
    public List<Client> getall(){
        return iServiceClient.getAllClients();
    }

    @GetMapping("/getClient/{idc}")
    @ResponseBody
    public Client getClient(@PathVariable("idc")Long id){
        return iServiceClient.getClient(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client newClientData) {
        try {
            Client updatedClient = iServiceClient.modifierClient(id, newClientData);
            return ResponseEntity.ok(updatedClient);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeClient(@PathVariable Long id) {
        try {
            iServiceClient.removeClient(id);
            return ResponseEntity.ok("Client removed successfully");
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Client not found");
        }
    }

}
