package SennaMod.mobs;

import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBlackSennaCreeper extends RenderCreeper
{
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return new ResourceLocation("sennamod:textures/entity/black_senna_creeper.png");

	}
}
