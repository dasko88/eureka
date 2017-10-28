package it.ts.dotcom.example.client.web.model.bean;

public class Bed {

    private String code;
    private String model;

    public Bed() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "code='" + code + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
