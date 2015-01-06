package $organization$;

import ij.IJ;
import ij.plugin.PlugIn;

/**
 * You magic plugin class
 */
public class $name;format="Camel"$_ implements PlugIn {

    /**
     * Entry point to running a plugin.
     */
    @Override
    public void run(String arg) {
         IJ.showMessage("Yay, I'm alive!");
    }
}