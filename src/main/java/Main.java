import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Block block1 = new Block("red", "natural");
        Block block2 = new Block("white", "natural");
        Block block3 = new Block("red", "fireproof");

        List<Block> blocks = new ArrayList<>();
        blocks.add(block1);
        blocks.add(block2);
        blocks.add(block3);

        Wall wall = new Wall(blocks);
        System.out.println(wall.findBlockByColor("red"));
        System.out.println(wall.findBlocksByMaterial("natural"));
        System.out.println(wall.count());

        System.out.println(wall.getColor(block1));
        System.out.println(wall.getMaterial(block1));

        CompositeBlock compositeBlock = new CompositeBlockImpl(blocks);
        System.out.println(compositeBlock.getBlocks());
    }
}
