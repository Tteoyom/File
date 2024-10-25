package ide;

/**
 * all methods must be overridden by each Component
 */
public abstract class IDEComponent {
    public IDEComponent() {

    }

    public IDEComponent(Mode m) {
        setMode(m);
    }

    /**
     * execute function of runner's method about Component's mode.
     */
    public abstract void executeComponent();

    /**
     * display textUI by mode
     */
    public abstract void showComponent();

    /**
     * assign Mode at mode variables.
     * @param m is Component's mode
     */
    public abstract void setMode(Mode m);

    /**
     * changing between mode
     */

    protected Mode mode = null;
    protected Mode runableMode = null;
    protected Mode viewingMode = null;
    protected Mode indexMode = null;
}