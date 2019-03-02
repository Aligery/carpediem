package dto;

public class Data {
    private float global_id;
    private float Number;
    Cells CellsObject;


    // Getter Methods

    public float getGlobal_id() {
        return global_id;
    }

    public float getNumber() {
        return Number;
    }

    public Cells getCells() {
        return CellsObject;
    }

    // Setter Methods

    public void setGlobal_id(float global_id) {
        this.global_id = global_id;
    }

    public void setNumber(float Number) {
        this.Number = Number;
    }

    public void setCells(Cells CellsObject) {
        this.CellsObject = CellsObject;
    }
}

