package Robot;

public class Size {
    int x;
    int y;
    int z;

    public Size() {
    }

    public Size(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String outDataSize() {
        return "(dlin = " + this.x + "; shir = " + this.y + "; vus = " + this.z + ")";
    }
}
