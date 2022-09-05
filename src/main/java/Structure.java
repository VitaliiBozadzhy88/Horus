public interface Structure {
    Object findBlockByColor(String color);
    String findBlocksByMaterial(String material);
    String count();
    String getColor(Block block);
    String getMaterial(Block block);
}
