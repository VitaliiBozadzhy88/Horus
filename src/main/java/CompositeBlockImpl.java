import java.util.Collections;
import java.util.List;

public class CompositeBlockImpl implements CompositeBlock {
    private final List<Block> blocks;

    public CompositeBlockImpl(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List getBlocks() {
        return Collections.singletonList(blocks + " - result of List getBlock() from CompositeBlock");
    }
}
