package SennaMod.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipe
{
	public static void RegisterRecipe()
	{
		Misic();
		Food();
		Block();
		Tool();
		Armor();
		Furnace();
	}

	private static void Misic()
	{
		GameRegistry.addRecipe(new ItemStack(ModItem.sennanium, 1),
				"SSS",
				"SSS",
				"SSS",
				'S', ModItem.fragmentSennanium
				);
	}

	private static void Food()
	{

	}

	private static void Block()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlock.sennaBlock, 1),
				"   ",
				"SS ",
				"SS ",
				'S', ModItem.fragmentSennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModBlock.sennaBlock, 1),
				" SS",
				" SS",
				"   ",
				'S', ModItem.fragmentSennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModBlock.sennaBlock, 1),
				"SS ",
				"SS ",
				"   ",
				'S', ModItem.fragmentSennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModBlock.sennaBlock, 1),
				"   ",
				" SS",
				" SS",
				'S', ModItem.fragmentSennanium
				);
	}

	private static void Tool()
	{
		GameRegistry.addRecipe(new ItemStack(ModItem.sennaSword, 1),
				" J ",
				" J ",
				" S ",
				'J', ModItem.sennanium,
				'S', Items.stick
				);

		GameRegistry.addRecipe(new ItemStack(ModItem.sennaSword, 1),
				"  J",
				"  J",
				"  S",
				'J', ModItem.sennanium,
				'S', Items.stick
				);

		GameRegistry.addRecipe(new ItemStack(ModItem.sennaSword, 1),
				"J  ",
				"J  ",
				"S  ",
				'J', ModItem.sennanium,
				'S', Items.stick
				);

		//****_blackSennaSword
		GameRegistry.addRecipe(new ItemStack(ModItem.blackSennaSword, 1),
				"DJD",
				"PJP",
				" S ",
				'P', ModItem.fragmentSennanium,
				'J', ModItem.sennanium,
				'S', Items.stick,
				'D', Items.diamond
				);
	}

	private static void Armor()
	{
		GameRegistry.addRecipe(new ItemStack(ModArmor.sennaHelmet, 1),
				"SSS",
				"S S",
				"   ",
				'S', ModItem.fragmentSennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModArmor.sennaHelmet, 1),
				"   ",
				"SSS",
				"S S",
				'S', ModItem.fragmentSennanium
				);


		GameRegistry.addRecipe(new ItemStack(ModArmor.sennaChestPlate, 1),
				"S S",
				"SSS",
				"SSS",
				'S', ModItem.fragmentSennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModArmor.sennaLeggings, 1),
				"SSS",
				"S S",
				"S S",
				'S', ModItem.fragmentSennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModArmor.sennaBoots, 1),
				"   ",
				"S S",
				"S S",
				'S', ModItem.fragmentSennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModArmor.sennaBoots, 1),
				"S S",
				"S S",
				"   ",
				'S', ModItem.fragmentSennanium
				);

		//_blackSennaArmor
		GameRegistry.addRecipe(new ItemStack(ModArmor.blackSennaHelmet, 1),
				"SSS",
				"S S",
				"   ",
				'S', ModItem.sennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModArmor.blackSennaHelmet, 1),
				"   ",
				"SSS",
				"S S",
				'S', ModItem.sennanium
				);


		GameRegistry.addRecipe(new ItemStack(ModArmor.blackSennaChestPlate, 1),
				"S S",
				"SSS",
				"SSS",
				'S', ModItem.sennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModArmor.blackSennaLeggings, 1),
				"SSS",
				"S S",
				"S S",
				'S', ModItem.sennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModArmor.blackSennaBoots, 1),
				"   ",
				"S S",
				"S S",
				'S', ModItem.sennanium
				);

		GameRegistry.addRecipe(new ItemStack(ModArmor.blackSennaBoots, 1),
				"S S",
				"S S",
				"   ",
				'S', ModItem.sennanium
				);
	}

	private static void Furnace()
	{
		GameRegistry.addSmelting(ModItem.rawSennaMeat,new ItemStack(ModItem.cookedSennaMeat),0.7f);
		GameRegistry.addSmelting(ModItem.cookedSennaMeat,new ItemStack(ModItem.drySennaMeat),0.7f);
	}
}
