package org.jabref.logic.externalfiles;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 * Stores user preferences related to linked file patterns.
 *
 * This class wraps the global linked file patterns and a default pattern.
 * It uses a JavaFX ObjectProperty to allow binding and observation in the UI layer.
 */

public class LinkedFilePatternPreferences {

    private final ObjectProperty<GlobalLinkedFilePatterns> keyPatterns = new SimpleObjectProperty<>();
    private final String defaultPattern;

    public LinkedFilePatternPreferences(GlobalLinkedFilePatterns keyPatterns, String defaultPattern) {
        this.keyPatterns.setValue(keyPatterns);
        this.defaultPattern = defaultPattern;
    }

    public GlobalLinkedFilePatterns getKeyPatterns() {
        return keyPatterns.get();
    }

    public ObjectProperty<GlobalLinkedFilePatterns> keyPatternsProperty() {
        return keyPatterns;
    }

    public void setKeyPatterns(GlobalLinkedFilePatterns keyPatterns) {
        this.keyPatterns.set(keyPatterns);
    }

    public String getDefaultPattern() {
        return defaultPattern;
    }
}
