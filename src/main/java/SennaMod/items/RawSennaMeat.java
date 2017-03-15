package SennaMod.items;

import SennaMod.registry.ModCreativeTabs;
import net.minecraft.item.ItemFood;

public class RawSennaMeat extends ItemFood
{
	public RawSennaMeat()
	{
		super(1, 0, false);
		this.setCreativeTab(ModCreativeTabs.tabSennaMod);
		this.setUnlocalizedName("raw_senna_meat");
		this.setTextureName("sennamod:raw_senna_meat");
		this.setMaxStackSize(64);
	}
}
