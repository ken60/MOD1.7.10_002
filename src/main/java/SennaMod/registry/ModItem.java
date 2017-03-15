package SennaMod.registry;

import SennaMod.items.BlackSennaSword;
import SennaMod.items.CookedSennaMeat;
import SennaMod.items.DrySennaMeat;
import SennaMod.items.FragmentSennanium;
import SennaMod.items.RawSennaMeat;
import SennaMod.items.SennaPowder;
import SennaMod.items.SennaSword;
import SennaMod.items.Sennanium;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ModItem
{
	public static Item sennanium = new Sennanium();
	public static Item fragmentSennanium = new FragmentSennanium();
	public static Item sennaPowder = new SennaPowder();

	public static Item sennaSword = new SennaSword();
	public static Item blackSennaSword = new BlackSennaSword();
	public static Item rawSennaMeat = new RawSennaMeat();
	public static Item cookedSennaMeat = new CookedSennaMeat();
	public static Item drySennaMeat = new DrySennaMeat();


	public static void RegisterItem()
	{
		GameRegistry.registerItem(sennanium, "sennanium");
		GameRegistry.registerItem(fragmentSennanium, "fragment_sennanium");
		GameRegistry.registerItem(sennaPowder, "senna_powder");

		GameRegistry.registerItem(rawSennaMeat, "raw_senna_meat");
		GameRegistry.registerItem(cookedSennaMeat, "cooked_senna_meat");
		GameRegistry.registerItem(drySennaMeat, "dry_senna_meat");
		GameRegistry.registerItem(sennaSword, "senna_sword");
		GameRegistry.registerItem(blackSennaSword, "black_senna_sword");
	}

	public static void SetLanguage()
	{
		LanguageRegistry.addName(rawSennaMeat, "Raw Senna Meat");
		LanguageRegistry.addName(cookedSennaMeat, "Cooked Senna Meat");
		LanguageRegistry.addName(sennaPowder, "Senna Powder");

		LanguageRegistry.addName(drySennaMeat, "Dry Senna Meat");
		LanguageRegistry.addName(sennanium, "Sennanium");
		LanguageRegistry.addName(fragmentSennanium, "Fragment of Sennanium");
		LanguageRegistry.addName(sennaSword, "Senna Sword");
		LanguageRegistry.addName(blackSennaSword, "Black Senna Sword");
	}
}
