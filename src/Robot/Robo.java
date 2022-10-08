package Robot;

public class Robo {
    String name;
    int coast;
    int year;
    Size size;

    public Robo() {
    }

    public Robo(String name, int coast, Size size) {
        this.name = name;
        this.coast = coast;
        this.size = size;
    }

    public Robo(String name, Size size, int coast) {
        this.name = name;
        this.size = size;
        this.coast = coast;
    }

    public Robo(String name, int coast, int year, Size size) {
        this.name = name;
        this.coast = coast;
        this.year = year;
        this.size = size;
    }

    public void outData() {
        System.out.println("name = " + this.name + "; cost = "
                + this.coast + "; year = " + this.year + "; size = " + this.size.outDataSize());
    }
}
