package proxy;

public class ProxyImage {
    private String filename;
    private RealImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.display();
    }
}
