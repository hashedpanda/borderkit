package net.bnbdiscord.borderkit.database;

import com.j256.ormlite.field.DatabaseField;

public class Ruleset {
    @DatabaseField(id = true)
    private int id;
    
    @DatabaseField(foreign = true, foreignAutoRefresh = true, uniqueCombo = true)
    private Jurisdiction jurisdiction;
    
    @DatabaseField(uniqueCombo = true)
    private String name;
    
    @DatabaseField
    private String language;
    
    @DatabaseField
    private String code;

    public int getId() {
        return id;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
