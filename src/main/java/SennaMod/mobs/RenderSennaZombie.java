package SennaMod.mobs;

import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSennaZombie extends RenderZombie
{
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return new ResourceLocation("sennamod:textures/entity/senna_zombie.png");
	}
}