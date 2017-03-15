package SennaMod.items;

import SennaMod.registry.ModCreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class BlackSennaSword extends ItemSword
{
	public static ToolMaterial blackSennaSword = EnumHelper.addToolMaterial("BLACK_SENNA", 0, 4300, 3.0F, 26.0F, 30);

	public BlackSennaSword()
	{
		super(blackSennaSword);

		this.setCreativeTab(ModCreativeTabs.tabSennaMod);
		setUnlocalizedName("black_sennna_sword");
		this.setTextureName("sennamod:black_senna_sword");
		setFull3D();
		setMaxStackSize(1);
	}
}
