package SennaMod.registry;

import SennaMod.SennaMod;
import SennaMod.mobs.EntityBlackSennaCreeper;
import SennaMod.mobs.EntityBlackSennaZombie;
import SennaMod.mobs.EntitySennaCreeper;
import SennaMod.mobs.EntitySennaZombie;
import SennaMod.mobs.RenderBlackSennaCreeper;
import SennaMod.mobs.RenderBlackSennaZombie;
import SennaMod.mobs.RenderSennaCreeper;
import SennaMod.mobs.RenderSennaZombie;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class ModEntity
{
	public static final BiomeGenBase[] BIOME_LIST = new BiomeGenBase[]
			{
					BiomeGenBase.taiga,
					BiomeGenBase.roofedForest,
					BiomeGenBase.plains,
					BiomeGenBase.beach,
					BiomeGenBase.mesa,
					BiomeGenBase.mesaPlateau,
					BiomeGenBase.forest,
					BiomeGenBase.forestHills,
					BiomeGenBase.birchForest,
					BiomeGenBase.jungle,
					BiomeGenBase.jungleHills,
					BiomeGenBase.jungleEdge
			};


	public static void RegisterEntity(SennaMod sennaMod)
	{
		if(FMLCommonHandler.instance().getSide() != Side.CLIENT) return;

		registerModEntity(EntitySennaCreeper.class, new RenderSennaCreeper(), 			"senna_creeper", 0, sennaMod, EnumCreatureType.monster,  BIOME_LIST);
		registerModEntity(EntityBlackSennaCreeper.class, new RenderBlackSennaCreeper(), 	"black_senna_creeper",1, sennaMod, EnumCreatureType.monster,  BIOME_LIST);
		registerModEntity(EntitySennaZombie.class, new RenderSennaZombie(), 				"senna_zombie", 2, sennaMod, EnumCreatureType.monster,  BIOME_LIST);
		registerModEntity(EntityBlackSennaZombie.class, new RenderBlackSennaZombie(), 	"black_senna_zombie", 3, sennaMod, EnumCreatureType.monster,  BIOME_LIST);
	}

	private static void registerModEntity(Class entityClass, Render render, String entityName, int entityId, SennaMod sennaMod, EnumCreatureType creatureType, BiomeGenBase... biome)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, entityId, sennaMod, 250, 1, true);
		EntityRegistry.addSpawn(entityClass, 250, 1, 64, creatureType, biome);
		RenderingRegistry.registerEntityRenderingHandler(entityClass, render);
	}
}
