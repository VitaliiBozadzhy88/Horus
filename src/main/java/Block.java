import java.util.List;
import java.util.Objects;

public class Block {
    private String color;
    private String material;
    private List blocks;

    public Block(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public List getBlocks() {
        return blocks;
    }

    public void setBlocks(List blocks) {
        this.blocks = blocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(color, block.color)
                && Objects.equals(material, block.material)
                && Objects.equals(blocks, block.blocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material, blocks);
    }

    @Override
    public String toString() {
        return "Block{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
