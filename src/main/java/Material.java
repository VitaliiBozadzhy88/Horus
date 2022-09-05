import java.util.Objects;

public class Material {
    String material;

    public Material(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material1 = (Material) o;
        return Objects.equals(material, material1.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }

    @Override
    public String toString() {
        return "Material{" +
                "material='" + material + '\'' +
                '}';
    }
}
