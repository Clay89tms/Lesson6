package Robot;

public class Mai {
    public static void main(String[] args){
        Size size = new Size(10, 50, 20);
        Robo robo = new Robo("robocop", 200, 1997, size);
        robo.outData();
    }

}
