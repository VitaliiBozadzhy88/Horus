import java.util.List;
import java.util.stream.Collectors;

public class Wall implements Structure{
    private final List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public String findBlockByColor(String color) {
        return blocks.stream()
                .filter(c -> c.getColor().equals(color))
                .collect(Collectors.toList()) + " - result of findBlockByColor in wall";
    }

    @Override
    public String findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(m -> m.getMaterial().equals(material))
                .collect(Collectors.toList()) + " - result of findBlockByMaterial in wall";
    }

    @Override
    public String count() {
        return blocks.size() + " blocks in List " + " - result of count() in  wall";
    }

    @Override
    public String getColor(Block block) {
        return block.getColor() + " - result of getColor in wall";
    }

    @Override
    public String getMaterial(Block block) {
        return block.getMaterial() + " - result of getMaterial in wall";
    }
}
