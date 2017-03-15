package SennaMod.items;

import SennaMod.registry.ModCreativeTabs;
import SennaMod.registry.ModMaterial;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SennaArmor extends ItemArmor
{
	public SennaArmor(int type)
	{
		super(ModMaterial.sennaArmor_Mat, 0, type);
		this.setCreativeTab(ModCreativeTabs.tabSennaMod);
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type)
	{
		if (this.armorType == 2)
		{
			return "sennamod:textures/models/armor/senna_armor_layer_2.png";
		}
		return "sennamod:textures/models/armor/senna_armor_layer_1.png";
	}
}
