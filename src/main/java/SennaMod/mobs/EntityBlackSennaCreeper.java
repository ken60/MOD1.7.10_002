package SennaMod.mobs;

import SennaMod.registry.ModItem;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityBlackSennaCreeper extends EntityCreeper
{
	public EntityBlackSennaCreeper(World world)
	{
		super(world);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50d);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20d);
	}

	@Override
	public Item getDropItem()
	{
		return ModItem.sennaPowder;
	}

	@Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(2 + p_70628_2_);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.dropItem(Items.gunpowder, 6);
        }

        j = this.rand.nextInt(2 + p_70628_2_);

        for (k = 0; k < j; ++k)
        {
            this.dropItem(ModItem.sennaPowder, 2);
        }
    }
}