package SennaMod.registry;

import SennaMod.items.BlackSennaArmor;
import SennaMod.items.SennaArmor;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ModArmor
{
	public static Item sennaHelmet;
	public static Item sennaChestPlate;
	public static Item sennaLeggings;
	public static Item sennaBoots;
	public static Item blackSennaHelmet;
	public static Item blackSennaChestPlate;
	public static Item blackSennaLeggings;
	public static Item blackSennaBoots;


	public static void RegisterArmmor()
	{
		sennaHelmet = new SennaArmor(0)
				.setUnlocalizedName("senna_helmet")
				.setTextureName("sennamod:senna_helmet");

		sennaChestPlate = new SennaArmor(1)
				.setUnlocalizedName("senna_chestPlate")
				.setTextureName("sennamod:senna_chestPlate");

		sennaLeggings = new SennaArmor(2)
				.setUnlocalizedName("senna_leggings")
				.setTextureName("sennamod:senna_leggings");

		sennaBoots = new SennaArmor(3)
				.setUnlocalizedName("senna_boots")
				.setTextureName("sennamod:senna_boots");


		blackSennaHelmet = new BlackSennaArmor(0)
				.setUnlocalizedName("black_senna_helmet")
				.setTextureName("sennamod:black_senna_helmet");

		blackSennaChestPlate = new BlackSennaArmor(1)
				.setUnlocalizedName("black_senna_chestPlate")
				.setTextureName("sennamod:black_senna_chestPlate");

		blackSennaLeggings = new BlackSennaArmor(2)
				.setUnlocalizedName("black_senna_leggings")
				.setTextureName("sennamod:black_senna_leggings");

		blackSennaBoots = new BlackSennaArmor(3)
				.setUnlocalizedName("black_senna_boots")
				.setTextureName("sennamod:black_senna_boots");


		GameRegistry.registerItem(sennaHelmet, "senna_helmet");
		GameRegistry.registerItem(sennaChestPlate, "senna_chestPlate");
		GameRegistry.registerItem(sennaLeggings, "senna_leggings");
		GameRegistry.registerItem(sennaBoots, "senna_boots");
		GameRegistry.registerItem(blackSennaHelmet, "black_senna_helmet");
		GameRegistry.registerItem(blackSennaChestPlate, "black_senna_chestPlate");
		GameRegistry.registerItem(blackSennaLeggings, "black_senna_leggings");
		GameRegistry.registerItem(blackSennaBoots, "black_senna_boots");
	}

	public static void SetLanguage()
	{
		LanguageRegistry.addName(sennaHelmet, "Senna Helmet");
		LanguageRegistry.addName(sennaChestPlate, "Senna ChestPlate");
		LanguageRegistry.addName(sennaLeggings, "Senna Leggings");
		LanguageRegistry.addName(sennaBoots, "Senna Boots");
		LanguageRegistry.addName(blackSennaHelmet, "Black Senna Helmet");
		LanguageRegistry.addName(blackSennaChestPlate, "Black Senna ChestPlate");
		LanguageRegistry.addName(blackSennaLeggings, "Black Senna Leggings");
		LanguageRegistry.addName(blackSennaBoots, "Black Senna Boots");

	}
}
