package SennaMod.items;

import SennaMod.registry.ModCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DrySennaMeat extends ItemFood
{
	public DrySennaMeat()
	{
		super(15, 5, true);
		this.setCreativeTab(ModCreativeTabs.tabSennaMod);
		this.setUnlocalizedName("dry_senna_meat");
		this.setTextureName("sennamod:dry_senna_meat");
		this.setMaxStackSize(64);
		this.setAlwaysEdible();
	}

	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
	{
		p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 120, 1));
		p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 3600, 1));
		p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 6000, 1));
	}
}