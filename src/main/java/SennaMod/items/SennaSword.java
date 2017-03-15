package SennaMod.items;

import SennaMod.registry.ModCreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class SennaSword extends ItemSword
{
	public static ToolMaterial sennaSword = EnumHelper.addToolMaterial("SENNA", 0, 3200, 3.0F, 16.0F, 30);

	public SennaSword()
	{
		super(sennaSword);

		this.setCreativeTab(ModCreativeTabs.tabSennaMod);
		setUnlocalizedName("sennna_sword");
		this.setTextureName("sennamod:senna_sword");
		setFull3D();
		setMaxStackSize(1);
	}
}
