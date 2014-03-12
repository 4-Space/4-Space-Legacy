package mattparks.mods.starcraft.venus.blocks;

import mattparks.mods.starcraft.venus.items.VenusItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SCVenusVurnBerryBush extends BlockCrops
{
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;

    public SCVenusVurnBerryBush(int par1)
    {
        super(par1);
    }

    @Override
	protected int getCropItem()
    {
      return VenusItems.vurnBerry.itemID;
    }

    @Override
	@SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        if (par2 < 7)
        {
            if (par2 == 6)
            {
                par2 = 5;
            }

            return this.iconArray[par2 >> 1];
        }
        else
        {
            return this.iconArray[3];
        }
    }

    @Override
	protected int getSeedItem()
    {
        return VenusItems.vurnBerry.itemID;
    }

    @Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[4];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(this.getTextureName() + "_stage_" + i);
        }
    }
}
