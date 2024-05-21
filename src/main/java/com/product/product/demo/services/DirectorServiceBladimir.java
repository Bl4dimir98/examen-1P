package com.product.product.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.product.product.demo.entities.DirectorBladimir;
import com.product.product.demo.repositories.DirectorRepositoryBladimir;

@Service
public class DirectorServiceBladimir {

    @Autowired
    private DirectorRepositoryBladimir directorRepository;

    // Create Director
    public DirectorBladimir save(DirectorBladimir director) {
        return directorRepository.save(director);
    }

    // Read All Directors
    public List<DirectorBladimir> findAll() {
        return directorRepository.findAll();
    }

    // Read director by Id
    public DirectorBladimir findById(long id) {
        return directorRepository.findById(id).orElse(null);
    }

    // Delete Directors
    public void deleteById(long id) {
        directorRepository.deleteById(id);
    }

    // Parcial update
    public ResponseEntity<DirectorBladimir> updateById(long id, DirectorBladimir directorUpdate) {
        try {
            DirectorBladimir directorExist = findById(id);
            // Verificacition ID
            if (directorExist == null)
                return ResponseEntity.notFound().build();
            // Update each field
            if (directorUpdate.getDni() != null)
                directorExist.setDni(directorUpdate.getDni());
            if (directorUpdate.getFullNames() != null)
                directorExist.setFullNames(directorUpdate.getFullNames());
            if (directorUpdate.getLastNames() != null)
                directorExist.setLastNames(directorUpdate.getLastNames());
            if (directorUpdate.getEnable() != null)
                directorExist.setEnable(directorUpdate.getEnable());
            // Save data
            DirectorBladimir directorSave = save(directorExist);
            return ResponseEntity.ok(directorSave);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    };
}
