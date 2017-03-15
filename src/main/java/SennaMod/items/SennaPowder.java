package SennaMod.items;

import SennaMod.registry.ModCreativeTabs;
import net.minecraft.item.Item;

public class SennaPowder extends Item
{
	public SennaPowder()
	{
		this.setCreativeTab(ModCreativeTabs.tabSennaMod);
		this.setUnlocalizedName("senna_powder");
		this.setTextureName("sennamod:senna_powder");
		this.setMaxStackSize(64);
	}
}
