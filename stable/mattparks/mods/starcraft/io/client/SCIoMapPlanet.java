package mattparks.mods.starcraft.io.client;

import micdoodle8.mods.galacticraft.api.world.ICelestialBodyRenderer;
import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import micdoodle8.mods.galacticraft.api.world.IMapObject;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;

public class SCIoMapPlanet implements IMapObject
{
	@Override
	public float getDistanceFromCenter() 
	{
		return 150.0F;
	}

	@Override
    public IGalaxy getParentGalaxy()
    {
        return GalacticraftCore.galaxyMilkyWay;
    }

	@Override
	public float getPhaseShift() 
	{
		return 2.8F;
	}

	@Override
	public float getPlanetSize() 
	{
		return 0.3F;
	}

    @Override
    public ICelestialBodyRenderer getSlotRenderer()
    {
        return new SCIoSlotRenderer();
    }

    @Override
	public float getStretchValue() 
	{
		return 0.3F;
	}
}
