package SennaMod.block;

import java.util.Random;

import SennaMod.registry.ModCreativeTabs;
import SennaMod.registry.ModItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;


public class SennaBlock extends Block
{

	@SideOnly(Side.CLIENT)
	private IIcon TopIcon;

	@SideOnly(Side.CLIENT)
	private IIcon BottomIcon;

	public SennaBlock()
	{
		super(Material.iron);
		this.setCreativeTab(ModCreativeTabs.tabSennaMod);
		this.setBlockName("senna_block");
		this.setHardness(2.0f);
		this.setResistance(2.5f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(Block.soundTypeMetal);
		this.setLightOpacity(1);
		this.setLightLevel(0.4f);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	@Override
	public Item getItemDropped(int meta, Random random, int fortune)
	{
		return ModItem.fragmentSennanium;
	}

	@Override
	public int quantityDropped(Random random)
	{
		return  2 + random.nextInt(5);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.TopIcon = par1IconRegister.registerIcon("sennamod:sennablock_top");
		this.blockIcon = par1IconRegister.registerIcon("sennamod:sennablock_side");
		this.BottomIcon = par1IconRegister.registerIcon("sennamod:sennablock_bottom");
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		if(par1 == 0)
		{
			return BottomIcon;
		}
		else if(par1 == 1)
		{
			return TopIcon;
		}
		else
		{
			return blockIcon;
		}
	}
}

