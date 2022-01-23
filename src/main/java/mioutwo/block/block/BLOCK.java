package mioutwo.block.block;

import mioutwo.block.block.conquest.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BLOCK implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    public static final blue_schist_cobble blue_schist_cobble = new blue_schist_cobble(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final broken_reticulated_brick broken_reticulated_brick = new broken_reticulated_brick(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final cliffstone_cobble cliffstone_cobble = new cliffstone_cobble(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final graywacke_cobble graywacke_cobble = new graywacke_cobble(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final graywacke_mortar_wall graywacke_mortar_wall = new graywacke_mortar_wall(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final green_schist_cobble green_schist_cobble = new green_schist_cobble(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final irregular_andesite_stone_wall irregular_andesite_stone_wall = new irregular_andesite_stone_wall(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final irregular_andesite_stone_wall_stone_brick_quoins irregular_andesite_stone_wall_stone_brick_quoins = new irregular_andesite_stone_wall_stone_brick_quoins(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final large_andesite_brick large_andesite_brick = new large_andesite_brick(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final large_black_painted_block large_black_painted_block = new large_black_painted_block(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final large_inscribed_black_painted_block large_inscribed_black_painted_block = new large_inscribed_black_painted_block(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final mixed_fanpattern_setts mixed_fanpattern_setts = new mixed_fanpattern_setts(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final mud_brick mud_brick = new mud_brick(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final reticulated_brick reticulated_brick = new reticulated_brick(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final smooth_large_black_painted_block smooth_large_black_painted_block = new smooth_large_black_painted_block(FabricBlockSettings.of(Material.STONE).hardness(4.0f));
    public static final smooth_large_inscribed_black_painted_block smooth_large_inscribed_black_painted_block = new smooth_large_inscribed_black_painted_block(FabricBlockSettings.of(Material.STONE).hardness(4.0f));



    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        Registry.register(Registry.BLOCK, new Identifier("conquest", "blue_schist_cobble"), blue_schist_cobble);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "broken_reticulated_brick"), broken_reticulated_brick);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "cliffstone_cobble"), cliffstone_cobble);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "graywacke_cobble"), graywacke_cobble);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "graywacke_mortar_wall"), graywacke_mortar_wall);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "green_schist_cobble"), green_schist_cobble);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "irregular_andesite_stone_wall"), irregular_andesite_stone_wall);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "irregular_andesite_stone_wall_stone_brick_quoins"), irregular_andesite_stone_wall_stone_brick_quoins);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "large_andesite_brick"), large_andesite_brick);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "large_black_painted_block"), large_black_painted_block);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "large_inscribed_black_painted_block"), large_inscribed_black_painted_block);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "mixed_fanpattern_setts"), mixed_fanpattern_setts);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "mud_brick"), mud_brick);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "reticulated_brick"), reticulated_brick);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "smooth_large_black_painted_block"), smooth_large_black_painted_block);
        Registry.register(Registry.BLOCK, new Identifier("conquest", "smooth_large_inscribed_black_painted_block"), smooth_large_inscribed_black_painted_block);


        Registry.register(Registry.ITEM, new Identifier("conquest", "blue_schist_cobble"), new BlockItem(blue_schist_cobble, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "broken_reticulated_brick"), new BlockItem(broken_reticulated_brick, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "cliffstone_cobble"), new BlockItem(cliffstone_cobble, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "graywacke_cobble"), new BlockItem(graywacke_cobble, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "graywacke_mortar_wall"), new BlockItem(graywacke_mortar_wall, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "green_schist_cobble"), new BlockItem(green_schist_cobble, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "irregular_andesite_stone_wall"), new BlockItem(irregular_andesite_stone_wall, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "irregular_andesite_stone_wall_stone_brick_quoins"), new BlockItem(irregular_andesite_stone_wall_stone_brick_quoins, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "large_andesite_brick"), new BlockItem(large_andesite_brick, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "large_black_painted_block"), new BlockItem(large_black_painted_block, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "large_inscribed_black_painted_block"), new BlockItem(large_inscribed_black_painted_block, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "mixed_fanpattern_setts"), new BlockItem(mixed_fanpattern_setts, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "mud_brick"), new BlockItem(mud_brick, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "reticulated_brick"), new BlockItem(reticulated_brick, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "smooth_large_black_painted_block"), new BlockItem(smooth_large_black_painted_block, new FabricItemSettings().group(BLOCK.STONE)));
        Registry.register(Registry.ITEM, new Identifier("conquest", "smooth_large_inscribed_black_painted_block"), new BlockItem(smooth_large_inscribed_black_painted_block, new FabricItemSettings().group(BLOCK.STONE)));

    }

    public static final ItemGroup STONE = FabricItemGroupBuilder.build(
            new Identifier("conquest", "stone"),
            () -> new ItemStack(Blocks.COBBLESTONE));

}
