package duckcorp.duck;

/**
 * Interface représentant un objet dont on peut évaluer la qualité.
 *
 * TODO (Ex1) :
 * - Implémentez isDefective() et getQualityLabel() (méthodes default)
 * 
 * @author Roussille Philippe <roussille@3il.fr>
 */
public interface Qualifiable {

    /** Retourne le score de qualité (entre 0 et 100). */
    int getQualityScore();

    default boolean isDefective() {
        return getQualityScore() < 20;
    }

    default String getQualityLabel() {
        int score = getQualityScore();
        if (score >= 80)
            return "Excellent";
        if (score >= 50)
            return "Bon";
        if (score >= 20)
            return "Médiocre";
        return "Défectueux";
    }
}
