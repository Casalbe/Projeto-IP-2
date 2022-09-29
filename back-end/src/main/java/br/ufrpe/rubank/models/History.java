package br.ufrpe.rubank.models;

public class History {
    private String id;
    private String description;
    private String date;
    private String value;
    private String type;

    public History(String id, String description, String date, String value, String type) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.value = value;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
