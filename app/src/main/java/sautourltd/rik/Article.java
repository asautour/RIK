package sautourltd.rik;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by su on 09/09/2017.
 */

public class Article {
    private String legislationText;
    private String title;
    private String interpretation;
    private String reference;
    private Applicability applicability;
    private List<Article> linkedArticles = new ArrayList<>();

    public List<Article> getLinkedArticles() {
        return linkedArticles;
    }

    public void setLinkedArticles(List<Article> linkedArticles) {
        this.linkedArticles = linkedArticles;
    }

    public String getLegislationText() {
        return legislationText;
    }

    public void setLegislationText(String legislationText) {
        this.legislationText = legislationText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(String interpretation) {
        this.interpretation = interpretation;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Applicability getApplicability() {
        return applicability;
    }

    public void setApplicability(Applicability applicability) {
        this.applicability = applicability;
    }
}
