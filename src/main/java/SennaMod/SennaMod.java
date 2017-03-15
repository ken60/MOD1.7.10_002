package SennaMod;

import SennaMod.items.SennaBlockGenerator;
import SennaMod.registry.ModArmor;
import SennaMod.registry.ModBiome;
import SennaMod.registry.ModBlock;
import SennaMod.registry.ModDimension;
import SennaMod.registry.ModEntity;
import SennaMod.registry.ModItem;
import SennaMod.registry.ModRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = SennaMod.MOD_ID, name = SennaMod.MODNAME, version = SennaMod.VERSION)

public class SennaMod
{
	public static final String MOD_ID = "sennamod";
	public static final String MODNAME = "Senna's Mod";
	public static final String VERSION = "1.0.2";

	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		ModBlock.RegisterBlock();
		ModItem.RegisterItem();
		ModArmor.RegisterArmmor();
		ModEntity.RegisterEntity(this);
		ModDimension.RegisterDimension();

		GameRegistry.registerWorldGenerator(new SennaBlockGenerator(), 0);
	}

	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		ModBlock.SetLanguage();
		ModItem.SetLanguage();
		ModArmor.SetLanguage();

		ModRecipe.RegisterRecipe();
		ModBiome.RegisterBiome();
	}
}
