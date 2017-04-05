package de.neemann.digital.core.io;

import de.neemann.digital.core.*;
import de.neemann.digital.core.element.Element;
import de.neemann.digital.core.element.ElementAttributes;
import de.neemann.digital.core.element.ElementTypeDescription;
import de.neemann.digital.core.element.Keys;
import de.neemann.digital.lang.Lang;

/**
 * The Button
 *
 * @author hneemann
 */
public class RotEncoder implements Element {

    /**
     * The Button description
     */
    public static final ElementTypeDescription DESCRIPTION = new ElementTypeDescription(RotEncoder.class)
            .addAttribute(Keys.ROTATE)
            .addAttribute(Keys.LABEL);

    private final ObservableValue outA;
    private final ObservableValue outB;

    /**
     * Creates a new instance
     *
     * @param attributes the attributes
     */
    public RotEncoder(ElementAttributes attributes) {
        outA= new ObservableValue("A", 1).setPinDescription(DESCRIPTION);
        outB= new ObservableValue("B", 1).setPinDescription(DESCRIPTION);
    }

    @Override
    public void setInputs(ObservableValues inputs) throws NodeException {
        throw new NodeException(Lang.get("err_noInputsAvailable"));
    }

    @Override
    public ObservableValues getOutputs() {
        return new ObservableValues(outA, outB);
    }

    @Override
    public void registerNodes(Model model) {
    }

}
