package SennaMod.items;

import SennaMod.registry.ModCreativeTabs;
import net.minecraft.item.Item;

public class FragmentSennanium extends Item
{
	public FragmentSennanium()
	{
		this.setCreativeTab(ModCreativeTabs.tabSennaMod);
		this.setUnlocalizedName("FragmentOfSennanium");
		this.setTextureName("sennamod:fragment_sennanium");
		this.setMaxStackSize(64);
	}
}
