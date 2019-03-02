package dto;

import java.util.ArrayList;

public class GeoData {
    private String type;
    ArrayList< Object > coordinates = new ArrayList < Object > ();


    // Getter Methods

    public String getType() {
        return type;
    }

    // Setter Methods

    public void setType(String type) {
        this.type = type;
    }
}