package org.jabref.logic.externalfiles;

import org.jabref.logic.citationkeypattern.AbstractCitationKeyPatterns;
import org.jabref.logic.citationkeypattern.CitationKeyPattern;
import org.jabref.model.entry.types.EntryType;

// Linked file pattern container class, re-use the same structure as the citation key patterns.  
public class GlobalLinkedFilePatterns extends AbstractCitationKeyPatterns {

    public GlobalLinkedFilePatterns(CitationKeyPattern defaultPattern) {
        this.defaultPattern = defaultPattern;
    }

    public static GlobalLinkedFilePatterns fromPattern(String pattern) {
        return new GlobalLinkedFilePatterns(new CitationKeyPattern(pattern));
    }

    @Override
    public CitationKeyPattern getLastLevelCitationKeyPattern(EntryType entryType) {
        return defaultPattern;
    }
}