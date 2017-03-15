package SennaMod.mobs;

import SennaMod.registry.ModItem;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntitySennaZombie extends EntityZombie
{
	public EntitySennaZombie(World world)
	{
		super(world);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200d);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(12d);
	}

	@Override
	public Item getDropItem()
	{
		return ModItem.sennanium;
	}

	@Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(2 + p_70628_2_);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.dropItem(Items.rotten_flesh, 1);
        }

        j = this.rand.nextInt(2 + p_70628_2_);

        for (k = 0; k < j; ++k)
        {
            this.dropItem(ModItem.rawSennaMeat, 3);
        }
    }

	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float damage)
	{
		if (source.isExplosion() || source.isProjectile() || source.isUnblockable() || source.isFireDamage())
		{
			return false;
		}
		else
		{
			return super.attackEntityFrom(source, damage);
		}
	}
}
