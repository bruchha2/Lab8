/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * Word.
     */
    private String name;

    /**
     * Word.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param namE word
     * @param manageR word
     */
    public Employee(final String namE, final String manageR) {
        this.name = namE;
        this.manager = manageR;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param namE word
     */
    public void setName(final String namE) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manageR word
     */
    public void setManager(final String manageR) {
        this.manager = manager;
    }
}
