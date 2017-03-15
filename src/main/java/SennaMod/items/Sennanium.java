package SennaMod.items;

import SennaMod.registry.ModCreativeTabs;
import net.minecraft.item.Item;

public class Sennanium extends Item
{
	public Sennanium()
	{
		this.setCreativeTab(ModCreativeTabs.tabSennaMod);
		this.setUnlocalizedName("sennanium");
		this.setTextureName("sennamod:sennanium");
		this.setMaxStackSize(64);
	}
}

