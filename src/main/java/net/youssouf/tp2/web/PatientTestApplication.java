package net.youssouf.tp2.web;

import net.youssouf.tp2.entities.*;
import net.youssouf.tp2.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableJpaRepositories("net.youssouf.tp2.repository")
public class PatientTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(PatientTestApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RepositoryPatient patientRepo,
                            RepositoryMedecin medecinRepo,
                            RepositoryRendezVous rendezVousRepo,
                            RepositoryConsultation consultationRepo) {
        return args -> {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dateNaissance = sdf.parse("02/02/2002");

            // Créer des patients
            Patient patient = patientRepo.save(Patient.builder()
                    .nom("Guindo Badara Aliou")
                    .dateNaissance(dateNaissance)
                    .malade(true)
                    .score(2)
                    .build());

            // Créer un médecin
            Medecin medecin = medecinRepo.save(Medecin.builder()
                    .nom("Dr. Diallo")
                    .specialite("Cardiologue")
                    .build());

            // Créer un rendez-vous
            RendezVous rendezVous = rendezVousRepo.save(RendezVous.builder()
                    .date(new Date())
                    .statut("PENDING")
                    .patient(patient)
                    .medecin(medecin)
                    .build());

            // Créer une consultation
            consultationRepo.save(Consultation.builder()
                    .dateConsultation(new Date())
                    .rapport("Consultation normale")
                    .rendezVous(rendezVous)
                    .build());

            System.out.println("Les données ont été insérées avec succès !");
        };
    }
}
