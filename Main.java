/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.main;

import edu.esprit.entities.Reclamation;
import edu.esprit.entities.Reponse;
import edu.esprit.services.ServiceReclamation;
import edu.esprit.services.ServiceReponse;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author abidi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServiceReponse sr = new ServiceReponse() {
        };

        Reponse r1 = new Reponse(50, 12, 122, "weeey", Date.valueOf("2015-12-12"));
        Reponse r2 = new Reponse(90, 92, 19, "modifier", Date.valueOf("2018-12-12"));
        Reponse r3 = new Reponse(10, 10, 20, "oui", Date.valueOf("2018-12-12"));

        sr.ajouter(r1);

        sr.supprimer(7);
        sr.modifier(r3);

        System.out.println(sr.getOneById(20));
        System.out.println(sr.getAll());

        Reclamation s2 = new Reclamation("ss", "", "", Date.valueOf("2015-12-12"));

        ServiceReclamation sp = new ServiceReclamation();
        sp.ajouter(s2);
        Reclamation s3 = new Reclamation("awaym", "MMM", "hihihiii", Date.valueOf("2015-10-10"));
        Reclamation s4 = new Reclamation("mmmmmmmm", "oooooooo", "kkkkkkkkkkk", Date.valueOf("2015-10-10"));
       

        sp.supprimer(0);
        sp.modifier(s3);

        System.out.println(sp.getOneById(123));
        System.out.println(sp.getAll());

        List<Reclamation> listc = sp.getAll();
        List<Reclamation> tri_reclaamtion = sp.trier(listc);
        System.out.println(tri_reclaamtion);

        List<Reclamation> recherche_reclamation = sp.rechercher(listc, "lolo", "koko");
        System.out.println(recherche_reclamation);

        List<Reponse> listr = sr.getAll();
        List<Reponse> tri_reponse = sr.trier(listr);
        System.out.println(tri_reponse);

        List<Reponse> recherche_reponse = sr.rechercher(listr, "ameni");
        System.out.println(recherche_reponse);

    }
}
