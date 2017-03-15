package SennaMod.block;

import SennaMod.registry.ModCreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockTNT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class SennaBomb extends BlockTNT
{

    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon BottomIcon;

    public SennaBomb()
    {
        this.setCreativeTab(ModCreativeTabs.tabSennaMod);
        this.setBlockName("senna_bomb");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("sennamod:senna_bomb_side");
        this.TopIcon = par1IconRegister.registerIcon("sennamod:senna_bomb_top");
        this.BottomIcon = par1IconRegister.registerIcon("sennamod:senna_bomb_bottom");
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
