package web;


public class Imc {
    private float taille;
    private float poids;

    public Imc(float taille, float poids) {
        this.taille = taille;
        this.poids = poids;
    }

    public float calcul() {
            return poids / (taille * taille);

    }

    public float getTaille() {
        return taille;
    }

    public float getPoids() {
        return poids;
    }
}
