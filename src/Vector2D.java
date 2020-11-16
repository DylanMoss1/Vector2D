import java.util.Vector;

public class Vector2D {

    public float i;
    public float j;
    public float k;

    public static void main(String[] args) {
        Vector2D a = new Vector2D();
        System.out.printf("\n%f %f %f\n",a.i,a.j,a.k);

        Vector2D b = new Vector2D(3,5,7);
        System.out.printf("\n%f %f %f\n",b.i,b.j,b.k);

        a.add(b);
        System.out.printf("\n%f %f %f\n",a.i,a.j,a.k);

        a.scalar(2);
        System.out.printf("\n%f %f %f\n",a.i,a.j,a.k);

        float c = b.magnitude();
        System.out.printf("\n%f\n",c);

        b.normalise();
        System.out.printf("\n%f %f %f\n",b.i,b.j,b.k);
    }

    Vector2D(){
        i = 0;
        j = 0;
        k = 0;
    }

    Vector2D(float i, float j, float k){
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public void add(Vector2D other){
        i = i + other.i;
        j = j + other.j;
        k = k + other.k;
    }

    public void scalar(float scale){
        i = i * scale;
        j = j * scale;
        k = k * scale;
    }

    public void normalise(){
        float mag = magnitude();
        i = i / mag;
        j = j / mag;
        k = k / mag;
    }

    public float magnitude(){
        return (float) Math.sqrt(i*i + j*j + k*k);
    }
}
