package SennaMod.registry;

import SennaMod.block.SennaBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class ModBlock
{
	public static Block sennaBlock= new SennaBlock();

	public static void RegisterBlock()
	{
		GameRegistry.registerBlock(sennaBlock, "senna_block");
	}

	public static void SetLanguage()
	{
		LanguageRegistry.addName(sennaBlock, "Senna Block");
	}
}
