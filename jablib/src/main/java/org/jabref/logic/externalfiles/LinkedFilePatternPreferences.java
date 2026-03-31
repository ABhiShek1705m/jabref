package org.jabref.logic.externalfiles;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

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
