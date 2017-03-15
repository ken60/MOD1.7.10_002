package SennaMod.registry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs
{
	public static final CreativeTabs tabSennaMod = new CreativeTabs("Senna's Mod")
	{
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(ModBlock.sennaBlock);
		}
	};
}