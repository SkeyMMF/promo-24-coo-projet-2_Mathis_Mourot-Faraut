package duckcorp.machine;

/**
 * Interface représentant une machine pouvant être entretenue.
 *
 * TODO (Ex2) :
 * - Implémentez needsMaintenance() et getConditionLabel() (méthodes default)
 * 
 * @author Roussille Philippe <roussille@3il.fr>
 */
public interface Maintainable {

    /** Retourne l'état de la machine (entre 0 et 100). */
    int getCondition();

    /** Effectue une opération de maintenance sur la machine. */
    void maintain();

    default boolean needsMaintenance() {
        return getCondition() < 30;
    }

    default String getConditionLabel() {
        int condition = getCondition();
        if (condition >= 80)
            return "Parfait";
        if (condition >= 50)
            return "Correct";
        if (condition >= 30)
            return "Usé";
        return "Critique";
    }
}
