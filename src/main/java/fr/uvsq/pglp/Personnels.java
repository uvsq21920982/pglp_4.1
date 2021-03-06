package fr.uvsq.pglp;


import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Personnels implements PersonelsInter {

    private final String nom;
    private final String prenom;
    private final int Id;//new

    /**
     * parametre optionel
     */
    private final LocalDate dateDeNaissance;
    private final ArrayList<Integer> numTel;

    public static class Builder{

        /**
         * parametre obligatoire
         */
        private final String nom;
        private final String prenom;
        private final int Id;//new
        /**
         * parametre optionel
         */
        private LocalDate dateDeNaissance;
        private ArrayList<Integer> numTel;

        public Builder(String nom, String prenom, int Id) {
            this.nom=nom;
            this.prenom=prenom;
            this.Id=Id;

        }

        public Builder dateDeNaissance(int anne,int mois,int jour) {
            this.dateDeNaissance= LocalDate.of(anne, mois, jour);
            return this;

        }

        public Builder numTel(int numTel) {
            this.numTel.add(numTel);
            return this;

        }

        public Personnels build() {
            return new Personnels(this);

        }


    }

    private Personnels(Builder builder) {
        //Obligatoire
        this.nom=builder.nom;
        this.prenom=builder.prenom;
        this.Id=builder.Id;//new
        //optionel
        this.dateDeNaissance=builder.dateDeNaissance;
        this.numTel=builder.numTel;

    }
    /**
     * Affichage des informations du personnel
     */
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("l'identifiant du personnel :"+this.Id+" "+this.nom+" "+this.prenom);
    }

    public String toString(){
        String str = "\t je suis un Personnel ID ==>> " + this.Id;
        return str;
    }

}
